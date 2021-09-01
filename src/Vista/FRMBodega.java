/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.ControladorBodega;
import Modelo.Bodega;
import Modelo.Producto;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


/**
 *
 * @hp
 */
public class FRMBodega extends javax.swing.JInternalFrame {

   ControladorBodega bodegaController = new ControladorBodega();
    public FRMBodega() {
        initComponents();
        limpiarFormulario();
        llenarComboProducto();
        llenarTabla();
        TableColumn columna;
        columna= TBLBodega.getColumnModel().getColumn(3);
        columna.setPreferredWidth(90);
        columna.setMaxWidth(90);
        columna.setPreferredWidth(90);
        columna.setMinWidth(90);
        TBLBodega.setRowHeight(30);
    }

     
      
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CBOProducto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TXTCantidadBodega = new javax.swing.JFormattedTextField();
        TXTCodigoBodega = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TXTBuscarBodega = new javax.swing.JTextField();
        BTNBuscarBodega = new javax.swing.JButton();
        TXTIdBodega = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLBodega = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        BTNInsertar = new javax.swing.JButton();
        BTNModificar = new javax.swing.JButton();
        BTNEliminar = new javax.swing.JButton();
        BTNLimpiar = new javax.swing.JButton();
        BTNCerrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Formulario Bodega");
        setAutoscrolls(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Producto ");

        CBOProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOProductoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Cantidad");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Codigo Bodega ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Buscar");

        TXTBuscarBodega.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTBuscarBodegaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXTBuscarBodegaFocusLost(evt);
            }
        });

        BTNBuscarBodega.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNBuscarBodega.setText("Buscar");
        BTNBuscarBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBuscarBodegaActionPerformed(evt);
            }
        });

        TXTIdBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTIdBodegaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXTBuscarBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNBuscarBodega, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TXTCantidadBodega, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(CBOProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TXTIdBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTCodigoBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TXTBuscarBodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNBuscarBodega))
                .addGap(35, 35, 35)
                .addComponent(TXTIdBodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTCodigoBodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBOProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTCantidadBodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles"));

        TBLBodega.setBackground(new java.awt.Color(204, 204, 255));
        TBLBodega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "  id", "    Código Bodega", "                                                Producto ", "        Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLBodega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLBodegaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBLBodega);
        if (TBLBodega.getColumnModel().getColumnCount() > 0) {
            TBLBodega.getColumnModel().getColumn(0).setMinWidth(90);
            TBLBodega.getColumnModel().getColumn(0).setPreferredWidth(90);
            TBLBodega.getColumnModel().getColumn(0).setMaxWidth(90);
            TBLBodega.getColumnModel().getColumn(1).setMinWidth(122);
            TBLBodega.getColumnModel().getColumn(1).setPreferredWidth(122);
            TBLBodega.getColumnModel().getColumn(1).setMaxWidth(122);
            TBLBodega.getColumnModel().getColumn(2).setPreferredWidth(99);
            TBLBodega.getColumnModel().getColumn(3).setMinWidth(133);
            TBLBodega.getColumnModel().getColumn(3).setPreferredWidth(133);
            TBLBodega.getColumnModel().getColumn(3).setMaxWidth(133);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        BTNInsertar.setBackground(new java.awt.Color(255, 255, 255));
        BTNInsertar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNInsertar.setText("Guardar");
        BTNInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNInsertarActionPerformed(evt);
            }
        });

        BTNModificar.setBackground(new java.awt.Color(255, 255, 255));
        BTNModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNModificar.setText("Modificar");
        BTNModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNModificarActionPerformed(evt);
            }
        });

        BTNEliminar.setBackground(new java.awt.Color(255, 255, 255));
        BTNEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNEliminar.setText("Eliminar");
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });

        BTNLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        BTNLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNLimpiar.setText("Limpiar");
        BTNLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLimpiarActionPerformed(evt);
            }
        });

        BTNCerrar.setBackground(new java.awt.Color(255, 255, 255));
        BTNCerrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNCerrar.setText("Cerrar");
        BTNCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTNInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(BTNEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTNCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNInsertar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNCerrar)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNInsertarActionPerformed
       bodegaController.controlarAccion(evt, obtenerCompraBodega());
       limpiarFormulario();
    }//GEN-LAST:event_BTNInsertarActionPerformed

    private void BTNModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNModificarActionPerformed
       bodegaController.controlarAccion(evt, obtenerCompraBodega());
       limpiarFormulario();
    }//GEN-LAST:event_BTNModificarActionPerformed

    private void BTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarActionPerformed
        bodegaController.controlarAccion(evt, obtenerCompraBodega());
       limpiarFormulario();
    }//GEN-LAST:event_BTNEliminarActionPerformed

    private void BTNLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLimpiarActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_BTNLimpiarActionPerformed

    private void BTNCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCerrarActionPerformed
       doDefaultCloseAction();
    }//GEN-LAST:event_BTNCerrarActionPerformed

    private void TXTBuscarBodegaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTBuscarBodegaFocusGained
        if (TXTBuscarBodega.getText().equals("Escriba texto a buscar")) {
           TXTBuscarBodega.setText("");
        
        }
    }//GEN-LAST:event_TXTBuscarBodegaFocusGained

    private void TXTBuscarBodegaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTBuscarBodegaFocusLost
        if (TXTBuscarBodega.getText().isEmpty()) {
           TXTBuscarBodega.setText("Escriba texto a buscar");
        
        }
    }//GEN-LAST:event_TXTBuscarBodegaFocusLost

    private void TBLBodegaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLBodegaMouseClicked
        if (evt.getClickCount()==1) {
            int fila = TBLBodega.rowAtPoint(evt.getPoint());
            if (fila>-1) {
                TXTIdBodega.setValue((Integer)  TBLBodega.getValueAt(fila, 0));
                TXTCodigoBodega.setText((String )TBLBodega.getValueAt(fila, 1));
                CBOProducto.setSelectedItem((Producto)TBLBodega.getValueAt(fila, 2));
                TXTCantidadBodega.setValue((Integer)TBLBodega.getValueAt(fila, 3));
                BTNEliminar.setEnabled(true);
                BTNModificar.setEnabled(true);
                 
                
            }
        }
    }//GEN-LAST:event_TBLBodegaMouseClicked

    private void BTNBuscarBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBuscarBodegaActionPerformed
        llenarTablaCoBusqueda(TXTBuscarBodega.getText());
    }//GEN-LAST:event_BTNBuscarBodegaActionPerformed

    private void CBOProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBOProductoActionPerformed

    private void TXTIdBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTIdBodegaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTIdBodegaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBuscarBodega;
    private javax.swing.JButton BTNCerrar;
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JButton BTNInsertar;
    private javax.swing.JButton BTNLimpiar;
    private javax.swing.JButton BTNModificar;
    private javax.swing.JComboBox<Producto> CBOProducto;
    private javax.swing.JTable TBLBodega;
    private javax.swing.JTextField TXTBuscarBodega;
    private javax.swing.JFormattedTextField TXTCantidadBodega;
    private javax.swing.JTextField TXTCodigoBodega;
    private javax.swing.JFormattedTextField TXTIdBodega;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void llenarComboProducto()
    {
    Producto unProducto = new Producto();
    Iterator<Producto> itProducto = unProducto.listar();
    CBOProducto.removeAllItems();
    Producto seleccionar = new Producto();
    seleccionar.setNombreProducto("Seleccione Producto");
    CBOProducto.addItem(seleccionar);
        while (itProducto.hasNext()) {            
            CBOProducto.addItem(itProducto.next());
        }
    }
    
       //LIMPIAR FORMULARIO
    
     private void limpiarFormulario()
      {
      TXTIdBodega.setValue(0);
       TXTIdBodega.setVisible(false);
      CBOProducto.setSelectedItem(CBOProducto);
      TXTCodigoBodega.setText("");
      TXTCantidadBodega.setValue(0);
      BTNEliminar.setEnabled(false);
      BTNModificar.setEnabled(false);
      llenarTabla();
      }
      
      //LLENAR TABLA
    public void llenarTabla()
    {
     Bodega unaBodega = new Bodega();
     DefaultTableModel tabla = ( DefaultTableModel)TBLBodega.getModel();
     Iterator<Bodega> itBodega = unaBodega.listar();
     Object[] filaBodega = new Object[TBLBodega.getColumnCount()];
     tabla.setRowCount(0);
        while (itBodega.hasNext()) {   
            unaBodega = itBodega.next();
            
             filaBodega[0] = unaBodega.getIdBodega();
            filaBodega[1] = unaBodega.getCodigoBodega();
            filaBodega[2] = new Producto().buscarPorId(unaBodega.getIdProductoBodega());
            filaBodega[3] = unaBodega.getCantidadBodega();
            tabla.addRow(filaBodega);
        }
    }
    
    
    //LLENAR TABLA CON BUSQUEDA
    
    private void llenarTablaCoBusqueda(String busqueda)
    {
     Bodega unaBodega = new Bodega();
     DefaultTableModel tabla = ( DefaultTableModel)TBLBodega.getModel();
     Iterator<Bodega> itBodega = unaBodega.buscar(busqueda);
     Object[] filaBodega = new Object[TBLBodega.getColumnCount()];
     tabla.setRowCount(0);
        while (itBodega.hasNext()) {   
            unaBodega = itBodega.next();
             filaBodega[0] = unaBodega.getIdBodega();
            filaBodega[1] = unaBodega.getCodigoBodega();
            filaBodega[2] = new Producto().buscarPorId(unaBodega.getIdProductoBodega());
            filaBodega[3] = unaBodega.getCantidadBodega();
             ((DefaultTableModel)TBLBodega.getModel()).addRow(filaBodega);
        }
    }
     //OBTENER BODEGA
    private Bodega obtenerCompraBodega()
    {
    Bodega laBodega = new Bodega();
    laBodega.setIdBodega((Integer)TXTIdBodega.getValue());
    laBodega.setCodigoBodega(TXTCodigoBodega.getText());
    laBodega.setIdProductoBodega(((Producto)CBOProducto.getSelectedItem()).getIdProducto());
    laBodega.setCantidadBodega((Integer)TXTCantidadBodega.getValue());   
    return laBodega;
    
    }
  
}
