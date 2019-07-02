/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList; 
import java.util.List;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import persistencia.BD;
import vista.CatalogoProveedores;

/**
 *
 * @author vikto
 */
public class Proveedores {
    int idProveedor;
    String nombre;
    String domicilio;
    String tel;
    String contacto;
    String correo;
    ResultSet rs;
    ResultSetMetaData rsm;
    DefaultTableModel dtm; 

    public int getIdProveedor() {
        return idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getTel() {
        return tel;
    }

    public String getContacto() {
        return contacto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public boolean RegistraProveedor(){
        String sql = "insert into proveedores (nombre,domicilio,tel,contacto,correo) "
                + "values ('"+this.nombre+"', '"+this.domicilio+"','"+this.tel+"', '"+this.contacto+"', "
                + "'"+this.correo+"');";
        System.out.println("Registro de proveedor: "+sql);
        if (BD.ejecutarSQL(sql)) {
            return true;
        }else{
            return false;
        }
    }
    
    public void TablaConsultaProveedores(){
        try {
            if (BD.conectarBD()) {
                String sql = "select * from proveedores";
                rs = BD.ejecutarSQLSelect(sql);
                rsm = rs.getMetaData();
                List<Object[]> datos = new ArrayList<Object[]>();
                while (rs.next()) {                
                    Object[] filas = new Object[rsm.getColumnCount()];
                    for (int i = 0; i < filas.length; i++) {
                        filas[i] = rs.getObject(i+1);
                    }
                    datos.add(filas);
                }
                dtm = (DefaultTableModel)CatalogoProveedores.jTableProveedores.getModel();
                for (int i = 0; i < datos.size(); i++) {
                    dtm.addRow(datos.get(i));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos plantasbd",
                        "Error de conexión",JOptionPane.ERROR_MESSAGE);
                BD.cerrarConexion();
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al mostrar lo datos en la tabla proveedores: "+e, 
                    "Error",JOptionPane.ERROR_MESSAGE);
            BD.cerrarConexion();
        }
    }
    
    public void ApuntaProveedor(){
        try {
            BD.conectarBD();
            int fila = CatalogoProveedores.jTableProveedores.getSelectedRow();
            String sql = "select nombre,domicilio,tel,contacto,correo"
                    + " from proveedores where idProveedor = "+CatalogoProveedores.jTableProveedores.getValueAt(fila, 0);
            rs = BD.ejecutarSQLSelect(sql);
            rsm = rs.getMetaData();
            while (rs.next()) {                
                this.nombre = rs.getString(1);
                this.domicilio = rs.getString(2);
                this.tel = rs.getString(3);
                this.contacto = rs.getString(4);
                this.correo = rs.getString(5);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se pudo mostrar este proveedor, vuelve a intentarlo: "+e, 
                    "Aviso",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public boolean ActualizarProveedor(JTable tabla){
        int fila = tabla.getSelectedRow();
        String sql = "update proveedores set nombre = '"+this.nombre+"', domicilio = '"+this.domicilio+"',"
                + " contacto='"+this.contacto+"', tel='"+this.tel+"',correo='"+this.correo+"' "
                + "where idProveedor = "+tabla.getValueAt(fila, 0);
        System.out.println("consulta: "+sql);
        if (BD.ejecutarSQL(sql)) {            
            return true;
        } else {
            return false;
        }
    }
    
    public boolean EliminaProveedor(JTable tabla){
        int fila = tabla.getSelectedRow();
        String sql = "delete from proveedores where IdProveedor = '"+tabla.getValueAt(fila, 0)+"'";
        if (BD.ejecutarSQL(sql)) {            
            return true;
        } else {
            return false;
        }
    }
}
