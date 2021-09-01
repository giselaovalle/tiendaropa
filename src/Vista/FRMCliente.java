

package Vista;

import Controlador.ControladorCliente;
import Modelo.Cliente;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @hp
 */
public class FRMCliente extends javax.swing.JInternalFrame {

    ControladorCliente clienteController = new ControladorCliente();
    private Object txtcontraseña;
    private Object TXTusuario;
    
    
    public FRMCliente() { 
        initComponents();
        TXTIdCliente.setValue(0);
        TXTIdCliente.setVisible(false);
        limpiarFormulari();
           
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LBLNombre = new javax.swing.JLabel();
        LBLDocumento = new javax.swing.JLabel();
        LBLDireccion = new javax.swing.JLabel();
        LBLCelular = new javax.swing.JLabel();
        LBLBuscar = new javax.swing.JLabel();
        TXTNombreCliente = new javax.swing.JTextField();
        TXTDocumentoCliente = new javax.swing.JTextField();
        TXTDireccionCliente = new javax.swing.JTextField();
        TXTCelularCliente = new javax.swing.JTextField();
        TXTBuscarCliente = new javax.swing.JTextField();
        TXTIdCliente = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        BTNIsertar = new javax.swing.JButton();
        BTNModificar = new javax.swing.JButton();
        BTNEliminar = new javax.swing.JButton();
        BTNCerrar = new javax.swing.JButton();
        BTNLimpiar = new javax.swing.JButton();
        BTNBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLCliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Formulario De Clientes");
        setAutoscrolls(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("LLene los campos");

        LBLNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LBLNombre.setText("Nombre");

        LBLDocumento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LBLDocumento.setText("Documento");

        LBLDireccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LBLDireccion.setText("Direccion");

        LBLCelular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LBLCelular.setText("Celular");

        LBLBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LBLBuscar.setText("Buscar");

        TXTNombreCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        TXTDocumentoCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        TXTDireccionCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        TXTCelularCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        TXTBuscarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TXTBuscarCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTBuscarClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXTBuscarClienteFocusLost(evt);
            }
        });
        TXTBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTBuscarClienteActionPerformed(evt);
            }
        });

        TXTIdCliente.setText("0");

        BTNIsertar.setBackground(new java.awt.Color(255, 255, 255));
        BTNIsertar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNIsertar.setText("Guardar");
        BTNIsertar.setBorder(new javax.swing.border.MatteBorder(null));
        BTNIsertar.setBorderPainted(false);
        BTNIsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNIsertarActionPerformed(evt);
            }
        });

        BTNModificar.setBackground(new java.awt.Color(255, 255, 255));
        BTNModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNModificar.setText("Modificar");
        BTNModificar.setBorder(new javax.swing.border.MatteBorder(null));
        BTNModificar.setBorderPainted(false);
        BTNModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNModificarActionPerformed(evt);
            }
        });

        BTNEliminar.setBackground(new java.awt.Color(255, 255, 255));
        BTNEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNEliminar.setText("Eliminar");
        BTNEliminar.setBorder(new javax.swing.border.MatteBorder(null));
        BTNEliminar.setBorderPainted(false);
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });

        BTNCerrar.setBackground(new java.awt.Color(255, 255, 255));
        BTNCerrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNCerrar.setText("Cerrar");
        BTNCerrar.setBorder(new javax.swing.border.MatteBorder(null));
        BTNCerrar.setBorderPainted(false);
        BTNCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCerrarActionPerformed(evt);
            }
        });

        BTNLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        BTNLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNLimpiar.setText("Limpiar");
        BTNLimpiar.setBorder(new javax.swing.border.MatteBorder(null));
        BTNLimpiar.setBorderPainted(false);
        BTNLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTNIsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTNModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTNEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(BTNCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(BTNEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNIsertar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        BTNBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNBuscar.setText("Buscar");
        BTNBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLDocumento)
                    .addComponent(LBLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBLDireccion)
                    .addComponent(LBLCelular))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXTDocumentoCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TXTNombreCliente)
                    .addComponent(TXTCelularCliente)
                    .addComponent(TXTDireccionCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LBLBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXTBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNBuscar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLBuscar)
                    .addComponent(TXTBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LBLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TXTIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(TXTNombreCliente)))
                        .addGap(18, 18, 18)
                        .addComponent(TXTDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LBLDocumento)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLDireccion)
                    .addComponent(TXTDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLCelular)
                    .addComponent(TXTCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TBLCliente.setBackground(new java.awt.Color(204, 204, 255));
        TBLCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51)));
        TBLCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                " ID", "               Nombre", "              Documento", "              Direccion", "            Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBLCliente);
        if (TBLCliente.getColumnModel().getColumnCount() > 0) {
            TBLCliente.getColumnModel().getColumn(0).setMinWidth(30);
            TBLCliente.getColumnModel().getColumn(0).setPreferredWidth(30);
            TBLCliente.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        jLabel2.setText("Datos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTBuscarClienteActionPerformed

    private void BTNCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCerrarActionPerformed
        doDefaultCloseAction();
        limpiarFormulari();
    }//GEN-LAST:event_BTNCerrarActionPerformed

    private void BTNIsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNIsertarActionPerformed
       clienteController.controlarAccion(evt, obtenerCliente());
       
       System.out.println("llega hasta aqui al guardar osea al boton");
       limpiarFormulari();
       llenarTabla();
    }//GEN-LAST:event_BTNIsertarActionPerformed

    private void BTNModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNModificarActionPerformed
       clienteController.controlarAccion(evt, obtenerCliente());
       limpiarFormulari();
    }//GEN-LAST:event_BTNModificarActionPerformed

    private void BTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarActionPerformed
       clienteController.controlarAccion(evt, obtenerCliente());
       limpiarFormulari();
    }//GEN-LAST:event_BTNEliminarActionPerformed

    private void TBLClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLClienteMouseClicked
            if (evt.getClickCount()==1) {
                int fila = TBLCliente.rowAtPoint(evt.getPoint());
                if (fila>-1) {
                    TXTIdCliente.setValue((Integer)  TBLCliente.getValueAt(fila, 0));
                    TXTNombreCliente.setText((String)  TBLCliente.getValueAt(fila, 1));
                    TXTDocumentoCliente.setText((String)  TBLCliente.getValueAt(fila, 2));
                    TXTDireccionCliente.setText((String)  TBLCliente.getValueAt(fila, 3));
                    TXTCelularCliente.setText((String)  TBLCliente.getValueAt(fila, 4));
                    BTNEliminar.setEnabled(true);
                    BTNModificar.setEnabled(true);


                }

            }
        
    }//GEN-LAST:event_TBLClienteMouseClicked

    private void TXTBuscarClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTBuscarClienteFocusGained
        if (TXTBuscarCliente.getText().equals("Escriba texto a buscar")) {
            TXTBuscarCliente.setText("");
        }
    }//GEN-LAST:event_TXTBuscarClienteFocusGained

    private void TXTBuscarClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTBuscarClienteFocusLost
        if (TXTBuscarCliente.getText().isEmpty()) {
            TXTBuscarCliente.setText("Escriba texto a buscar");
        }
    }//GEN-LAST:event_TXTBuscarClienteFocusLost

    private void BTNBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBuscarActionPerformed
        llenarTablaConBusqueda(TXTBuscarCliente.getText());
    }//GEN-LAST:event_BTNBuscarActionPerformed

    private void BTNLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLimpiarActionPerformed
        limpiarFormulari();
    }//GEN-LAST:event_BTNLimpiarActionPerformed
     //LLENAR LA TABLA CON UNA BUSQUEDA
    
    private void llenarTablaConBusqueda(String busqueda)
    {
    Cliente unCliente = new Cliente();
    DefaultTableModel tabla = (DefaultTableModel ) TBLCliente.getModel();
    Iterator<Cliente> itClientes = unCliente.buscar(busqueda);
    Object[] filaCliente = new Object[TBLCliente.getColumnCount()];
    tabla.setRowCount(0);//limpiar la tabla
        while (itClientes.hasNext()) {            
            unCliente = itClientes.next();
            filaCliente[0] = unCliente.getId();
            filaCliente[1] = unCliente.getNombreCliente();
            filaCliente[2] = unCliente.getDocumentoCliente();
            filaCliente[3] = unCliente.getDireccionCliente();
            filaCliente[4] = unCliente.getCelularCliente();
            ((DefaultTableModel)TBLCliente.getModel()).addRow(filaCliente);
            
            
        }
    
    }
    //METODO PARA LIMPIAR EL FORMULARIO
    
    private void limpiarFormulari()
    {
    TXTIdCliente.setValue(0);
    TXTNombreCliente.setText("");
    TXTDocumentoCliente.setText("");
    TXTDireccionCliente.setText("");
    TXTCelularCliente.setText("");
    TXTBuscarCliente.setText("Escriba texto a buscar");
    BTNModificar.setEnabled(false);
    BTNEliminar.setEnabled(false);
    llenarTabla();
    }
     //LLENAR TABLA
     public  void llenarTabla()
     {
         Cliente unCliente = new Cliente();
         DefaultTableModel tabla = ( DefaultTableModel)TBLCliente.getModel();
         Iterator<Cliente> itCliente = unCliente.listar();//listado de clientes
         Object[] filaCliente = new Object[TBLCliente.getColumnCount()];//unafila
         tabla.setRowCount(0);
         while (itCliente.hasNext()) {             
             unCliente = itCliente.next();
             filaCliente[0]= unCliente.getId();
             filaCliente[1]= unCliente.getNombreCliente();
             filaCliente[2] = unCliente.getDocumentoCliente();
             filaCliente[3] = unCliente.getDireccionCliente();
             filaCliente[4] = unCliente.getCelularCliente();
             tabla.addRow(filaCliente);
         }
         
     }
    
    //obtener cliente
     
   private Cliente obtenerCliente()
    {
    
    Cliente elCliente = new Cliente();
    
    elCliente.setId((Integer)TXTIdCliente.getValue());
    elCliente.setNombreCliente(TXTNombreCliente.getText());
    elCliente.setDocumentoCliente(TXTDocumentoCliente.getText());
    elCliente.setDireccionCliente(TXTDireccionCliente.getText());
    elCliente.setCelularCliente(TXTCelularCliente.getText());
     
    return elCliente;  
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBuscar;
    private javax.swing.JButton BTNCerrar;
    private javax.swing.JButton BTNEliminar;
    public javax.swing.JButton BTNIsertar;
    private javax.swing.JButton BTNLimpiar;
    private javax.swing.JButton BTNModificar;
    private javax.swing.JLabel LBLBuscar;
    private javax.swing.JLabel LBLCelular;
    private javax.swing.JLabel LBLDireccion;
    private javax.swing.JLabel LBLDocumento;
    private javax.swing.JLabel LBLNombre;
    private javax.swing.JTable TBLCliente;
    private javax.swing.JTextField TXTBuscarCliente;
    private javax.swing.JTextField TXTCelularCliente;
    private javax.swing.JTextField TXTDireccionCliente;
    private javax.swing.JTextField TXTDocumentoCliente;
    private javax.swing.JFormattedTextField TXTIdCliente;
    private javax.swing.JTextField TXTNombreCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}