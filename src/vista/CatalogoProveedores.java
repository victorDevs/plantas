/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Proveedores;
import persistencia.BD;

/**
 *
 * @author vikto
 */
public class CatalogoProveedores extends javax.swing.JInternalFrame {

    Proveedores prov = new Proveedores();
    /**
     * Creates new form CatalogoMateriales
     */
    public CatalogoProveedores() {
        initComponents();
        btnElimianr.setEnabled(false);
        btnModifyProveedor.setEnabled(false);
        LimpiaTablaProveedores();
        prov.TablaConsultaProveedores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtNombreProveedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProveedores = new javax.swing.JTable();
        btnAddProveedor = new javax.swing.JButton();
        btnElimianr = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jTxtTel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtDomicilio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtContacto = new javax.swing.JTextField();
        jTxtCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnModifyProveedor = new javax.swing.JButton();

        setClosable(true);
        setTitle("Catálogo de Materiales");
        setAutoscrolls(true);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Teléfono:");

        jTableProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Nombre de Proveedor", "Contacto", "Teléfono", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProveedores);
        if (jTableProveedores.getColumnModel().getColumnCount() > 0) {
            jTableProveedores.getColumnModel().getColumn(0).setMinWidth(10);
        }

        btnAddProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar16.png"))); // NOI18N
        btnAddProveedor.setText("Agregar");
        btnAddProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProveedorActionPerformed(evt);
            }
        });

        btnElimianr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/basura.png"))); // NOI18N
        btnElimianr.setText("Eliminar");
        btnElimianr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimianrActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar16.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel3.setText("Domicilio");

        jLabel4.setText("Contacto");

        jTxtContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtContactoActionPerformed(evt);
            }
        });

        jLabel5.setText("Correo:");

        btnModifyProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/girar.png"))); // NOI18N
        btnModifyProveedor.setText("Modificar");
        btnModifyProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnAddProveedor)
                .addGap(42, 42, 42)
                .addComponent(btnModifyProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnElimianr)
                .addGap(53, 53, 53)
                .addComponent(btnLimpiar)
                .addGap(173, 173, 173))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnElimianr)
                    .addComponent(btnLimpiar)
                    .addComponent(btnModifyProveedor)
                    .addComponent(btnAddProveedor))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtContactoActionPerformed

    private void btnAddProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProveedorActionPerformed
        // TODO add your handling code here:
        if (jTxtNombreProveedor.getText().equals("") || jTxtDomicilio.getText().equals("")
                || jTxtContacto.getText().equals("") || jTxtTel.getText().equals("") || jTxtCorreo.equals("")) {
            JOptionPane.showMessageDialog(null, "Llena todos los campos obligatorios",
                                "Aviso",JOptionPane.WARNING_MESSAGE);
        } else {
                if(BD.conectarBD()){
                    prov.setNombre(jTxtNombreProveedor.getText());
                    prov.setDomicilio(jTxtDomicilio.getText());
                    prov.setTel(jTxtTel.getText());
                    prov.setContacto(jTxtContacto.getText());
                    prov.setCorreo(jTxtCorreo.getText());
                    try {
                        prov.RegistraProveedor();
//                        ope.buscaUsuario();
                        JOptionPane.showMessageDialog(rootPane, "Registro exitoso",
                            "Aviso",JOptionPane.INFORMATION_MESSAGE);
                        LimpiaCampos();
                        LimpiaTablaProveedores();
                        prov.TablaConsultaProveedores();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(rootPane, "No se registro el operador",
                            "Error",JOptionPane.ERROR_MESSAGE);
                        System.out.println("Error al regiatrar un operador: "+e);
                        BD.cerrarConexion();
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Error de conexión",
                            "Error",JOptionPane.ERROR_MESSAGE);
                    BD.cerrarConexion();
                }
        }
    }//GEN-LAST:event_btnAddProveedorActionPerformed

    private void jTableProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProveedoresMouseClicked
        // TODO add your handling code here:
        btnAddProveedor.setEnabled(false);
        btnElimianr.setEnabled(true);
        btnModifyProveedor.setEnabled(true);
        btnLimpiar.setEnabled(true);
        
        if (evt.getClickCount() == 1) {
            prov.ApuntaProveedor();
            Date date = null;
            jTxtNombreProveedor.setText(prov.getNombre());
            jTxtDomicilio.setText(prov.getDomicilio());
            jTxtTel.setText(prov.getTel());
            jTxtContacto.setText(prov.getContacto());
            jTxtCorreo.setText(prov.getCorreo());
            
        }
    }//GEN-LAST:event_jTableProveedoresMouseClicked

    private void btnModifyProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyProveedorActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(rootPane, "Se modificará el proveedor, ¿Desea continuar?",
            "Aviso", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){ 
            btnModifyProveedor.setEnabled(false);
            btnElimianr.setEnabled(false);
            btnAddProveedor.setEnabled(true);
            if (jTxtNombreProveedor.getText().equals("") || jTxtDomicilio.getText().equals("")
                    || jTxtContacto.getText().equals("") || jTxtTel.getText().equals("") || jTxtCorreo.equals("")) {
                JOptionPane.showMessageDialog(null, "Llena todos los campos obligatorios",
                                    "Aviso",JOptionPane.WARNING_MESSAGE);
            } else {
                if(BD.conectarBD()){
                    prov.setNombre(jTxtNombreProveedor.getText());
                    prov.setDomicilio(jTxtDomicilio.getText());
                    prov.setTel(jTxtTel.getText());
                    prov.setContacto(jTxtContacto.getText());
                    prov.setCorreo(jTxtCorreo.getText());                              
                    try {
                        prov.ActualizarProveedor(jTableProveedores);
                        JOptionPane.showMessageDialog(rootPane, "Actualización exitosa",
                            "Aviso",JOptionPane.INFORMATION_MESSAGE);
                        LimpiaCampos();
                        LimpiaTablaProveedores();
                        prov.TablaConsultaProveedores();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(rootPane, "No se actualizó el proveedor: "+e,
                            "Error",JOptionPane.ERROR_MESSAGE);
                        BD.cerrarConexion();
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Error de conexión",
                            "Error",JOptionPane.ERROR_MESSAGE);
                    BD.cerrarConexion();
                }
            }
        }
    }//GEN-LAST:event_btnModifyProveedorActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        LimpiaCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnElimianrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimianrActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(rootPane, "Se eliminará el proveedor, ¿Desea continuar?",
            "Aviso", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){    
            if(BD.conectarBD()){
                try {
                    prov.EliminaProveedor(jTableProveedores);
                    JOptionPane.showMessageDialog(rootPane, "El proveedor se eliminó con éxito",
                        "Aviso",JOptionPane.INFORMATION_MESSAGE);
                    LimpiaCampos();
                    LimpiaTablaProveedores();
                    prov.TablaConsultaProveedores();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "No se eliminó el proveedor: "+e,
                        "Aviso",JOptionPane.WARNING_MESSAGE);
                    BD.cerrarConexion();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error de conexión",
                        "Error",JOptionPane.ERROR_MESSAGE);
                BD.cerrarConexion();
            }
        }
    }//GEN-LAST:event_btnElimianrActionPerformed

    public void LimpiaTablaProveedores(){
        try {
            DefaultTableModel modelo = (DefaultTableModel)jTableProveedores.getModel();
            int filas = jTableProveedores.getRowCount();
            for (int i = 0; filas > i; i++) {
                modelo.removeRow(0);
            }
            System.out.println("Limpieza exitosa!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error al intentar limpiar la tabla Proveedores: "+e,
                    "Tabla Proveedores",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void LimpiaCampos(){
        jTxtNombreProveedor.setText(null);
        jTxtDomicilio.setText(null);
        jTxtTel.setText(null);
        jTxtContacto.setText(null);
        jTxtCorreo.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProveedor;
    private javax.swing.JButton btnElimianr;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModifyProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableProveedores;
    private javax.swing.JTextField jTxtContacto;
    private javax.swing.JTextField jTxtCorreo;
    private javax.swing.JTextField jTxtDomicilio;
    private javax.swing.JTextField jTxtNombreProveedor;
    private javax.swing.JTextField jTxtTel;
    // End of variables declaration//GEN-END:variables
}
