/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorUsuario;
import Modelo.Usuario;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class FRMActualizarDatos extends javax.swing.JInternalFrame {

    /**
     * Creates new form FRMActualizarDatos
     */
    ControladorUsuario usuarioController = new ControladorUsuario();

    public FRMActualizarDatos() {
        initComponents();
        TXTIdUsuario.setValue(0);
        TXTIdUsuario.setVisible(false);
        BTNEliminar.setEnabled(false);
        BTNModificar.setEnabled(false);
       
    }

    private void limpiarFormulario() {
        TXTNombreUsuario.setText("");
        TXTCedulaUsuario.setText("");
        TXTCorreoUsuario.setText("");
        TXTTelefonoUsuario.setText("");
        TXTContrasenaUsuario.setText("");
        BTNEliminar.setEnabled(false);
        BTNModificar.setEnabled(false);
        

    }
//    public void llenarTabla()
//    {
//    Usuario unUsuario= new Usuario();
//     DefaultTableModel tabla = (DefaultTableModel)TBLUsuario.getModel();
//     Iterator<Usuario> itUsuario = unUsuario.listar();
//     Object[] filaUsuario= new Object[TBLUsuario.getColumnCount()];
//     tabla.setRowCount(0);//limpiar la tabla
//     while (itUsuario.hasNext()) {   
//             unUsuario = itUsuario.next();
//            filaUsuario[0] = unUsuario.getIdUsuario();
//            filaUsuario[1] = unUsuario.getNombreUsuario();
//            filaUsuario[2] = unUsuario.getCedulaUsuario();
//            filaUsuario[3] = unUsuario.getCorreoUsuario();
//            filaUsuario[4] = unUsuario.getTelefonoUsuario();
//            filaUsuario[5] = unUsuario.getContrasenaUsuario();
//           
//            tabla.addRow(filaUsuario);
//     }
    
     private void llenarTablaConBusqueda(String busqueda)
     {
     Usuario unUsuario= new Usuario();
     DefaultTableModel tabla = (DefaultTableModel)TBLUsuario.getModel();
     Iterator<Usuario> itUsuario = unUsuario.buscar(busqueda);
     Object[] filaUsuario = new Object[TBLUsuario.getColumnCount()];
     tabla.setRowCount(0);//limpiar la tabla
     while (itUsuario.hasNext()) {   
             unUsuario = itUsuario.next();
            filaUsuario[0] = unUsuario.getIdUsuario();
            filaUsuario[1] = unUsuario.getNombreUsuario();
            filaUsuario[2] = unUsuario.getCedulaUsuario();
            filaUsuario[3] = unUsuario.getCorreoUsuario();
            filaUsuario[4] = unUsuario.getTelefonoUsuario();
            filaUsuario[5] = unUsuario.getContrasenaUsuario();
           ((DefaultTableModel)TBLUsuario.getModel()).addRow(filaUsuario);
            
     }
     }
     private Usuario obtenerUsuario()
     {
       Usuario elUsuario = new Usuario();
       elUsuario.setIdUsuario((Integer)TXTIdUsuario.getValue());
       elUsuario.setNombreUsuario(TXTNombreUsuario.getText());
       elUsuario.setCedulaUsuario(TXTCedulaUsuario.getText());
       elUsuario.setCorreoUsuario(TXTCorreoUsuario.getText());
       elUsuario.setTelefonoUsuario(TXTTelefonoUsuario.getText());
       elUsuario.setContrasenaUsuario( TXTContrasenaUsuario.getText());
       
       
       return elUsuario;
     }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        BTNEliminar = new javax.swing.JButton();
        BTNLimpiar = new javax.swing.JButton();
        BTNCerrar = new javax.swing.JButton();
        BTNModificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TXTBuscarUsuario = new javax.swing.JTextField();
        BTNBuscarUsuario = new javax.swing.JButton();
        TXTTelefonoUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TXTContrasenaUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TXTIdUsuario = new javax.swing.JFormattedTextField();
        TXTNombreUsuario = new javax.swing.JTextField();
        TXTCedulaUsuario = new javax.swing.JTextField();
        TXTCorreoUsuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLUsuario = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 153, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Actualizar Datos");
        setAutoscrolls(true);
        setName("Actualizar Datos"); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 11))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        BTNEliminar.setBackground(new java.awt.Color(255, 255, 255));
        BTNEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNEliminar.setText("Eliminar");
        BTNEliminar.setBorder(null);
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });

        BTNLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        BTNLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNLimpiar.setText("Limpiar");
        BTNLimpiar.setBorder(null);
        BTNLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLimpiarActionPerformed(evt);
            }
        });

        BTNCerrar.setBackground(new java.awt.Color(255, 255, 255));
        BTNCerrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNCerrar.setText("CERRAR");
        BTNCerrar.setBorder(null);
        BTNCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCerrarActionPerformed(evt);
            }
        });

        BTNModificar.setBackground(new java.awt.Color(255, 255, 255));
        BTNModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNModificar.setText("Modificar");
        BTNModificar.setBorder(null);
        BTNModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BTNLimpiar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                    .addComponent(BTNCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(BTNModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Buscar:");

        TXTBuscarUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTBuscarUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXTBuscarUsuarioFocusLost(evt);
            }
        });

        BTNBuscarUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNBuscarUsuario.setText("Buscar");
        BTNBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBuscarUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Cedula:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Correo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Telefono:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Contraseña:");

        TXTNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTNombreUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TXTContrasenaUsuario))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TXTNombreUsuario)
                                        .addComponent(TXTCedulaUsuario)
                                        .addComponent(TXTCorreoUsuario)
                                        .addComponent(TXTTelefonoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(34, 34, 34)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(TXTBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TXTBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNBuscarUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TXTIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TXTCedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TXTCorreoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TXTTelefonoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TXTContrasenaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        TBLUsuario.setBackground(new java.awt.Color(204, 204, 255));
        TBLUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                " IdUsuario", "         Nombre", "         Cédula", "         Correo", "         Telefono", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBLUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNModificarActionPerformed
        usuarioController.controlarAccion(evt, obtenerUsuario());
        limpiarFormulario();
    }//GEN-LAST:event_BTNModificarActionPerformed

    private void BTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarActionPerformed
        usuarioController.controlarAccion(evt, obtenerUsuario());
        limpiarFormulario();
    }//GEN-LAST:event_BTNEliminarActionPerformed

    private void BTNLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLimpiarActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_BTNLimpiarActionPerformed

    private void BTNCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCerrarActionPerformed
        doDefaultCloseAction();
    }//GEN-LAST:event_BTNCerrarActionPerformed

    private void TXTBuscarUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTBuscarUsuarioFocusGained
        if (TXTBuscarUsuario.getText().equals("Escriba texto a buscar")) {
            TXTBuscarUsuario.setText("");
        }
    }//GEN-LAST:event_TXTBuscarUsuarioFocusGained

    private void TXTBuscarUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTBuscarUsuarioFocusLost
        if (TXTBuscarUsuario.getText().isEmpty()) {
            TXTBuscarUsuario.setText("Escriba texto a buscar");
        }
    }//GEN-LAST:event_TXTBuscarUsuarioFocusLost

    private void BTNBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBuscarUsuarioActionPerformed
        llenarTablaConBusqueda(TXTBuscarUsuario.getText());
    }//GEN-LAST:event_BTNBuscarUsuarioActionPerformed

    private void TBLUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLUsuarioMouseClicked
        if (evt.getClickCount() == 1) {
            int fila = TBLUsuario.rowAtPoint(evt.getPoint());
            if (fila > -1) {

                TXTIdUsuario.setValue((Integer) TBLUsuario.getValueAt(fila, 0));
                TXTNombreUsuario.setText((String) TBLUsuario.getValueAt(fila, 1));
                TXTCedulaUsuario.setText((String) TBLUsuario.getValueAt(fila, 2));
                TXTCorreoUsuario.setText((String) TBLUsuario.getValueAt(fila, 3));
                TXTTelefonoUsuario.setText((String) TBLUsuario.getValueAt(fila, 4));
                TXTContrasenaUsuario.setText((String)TBLUsuario.getValueAt(fila, 5));
                BTNEliminar.setEnabled(true);
                BTNModificar.setEnabled(true);

            }
        }
    }//GEN-LAST:event_TBLUsuarioMouseClicked

    private void TXTNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTNombreUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBuscarUsuario;
    private javax.swing.JButton BTNCerrar;
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JButton BTNLimpiar;
    private javax.swing.JButton BTNModificar;
    private javax.swing.JTable TBLUsuario;
    private javax.swing.JTextField TXTBuscarUsuario;
    private javax.swing.JTextField TXTCedulaUsuario;
    private javax.swing.JTextField TXTContrasenaUsuario;
    private javax.swing.JTextField TXTCorreoUsuario;
    private javax.swing.JFormattedTextField TXTIdUsuario;
    private javax.swing.JTextField TXTNombreUsuario;
    private javax.swing.JTextField TXTTelefonoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
