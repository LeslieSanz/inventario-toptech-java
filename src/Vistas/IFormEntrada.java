/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

package Vistas;
//Importando el ArrayList Lista productos del IFormProducto
import Clases.Entrada;
import static Vistas.IFormProducto.listaProductos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lesly
 */
public class IFormEntrada extends javax.swing.JInternalFrame {
    int indice=-1;
    DefaultTableModel modelo= new DefaultTableModel();
    Entrada e;
    ArrayList<Entrada> listaEntrada = new ArrayList<>();
    public IFormEntrada() {
        initComponents();
        establecerColumnas();
        pnlDatosEntrada.setVisible(false);
        //mostrarTablaEntrada();
    }
    
    private void establecerColumnas(){
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Fecha"); 
        modelo.addColumn("Cant.recibida");
        modelo.addColumn("Cant.solicitada");
        modelo.addColumn("Estado");
        tblsalida.setModel(modelo);
    }
    
    public void borrarInterfaz(){
        txtCodPro.setText(null);
        txtCantidadRecibida.setText(null);
        txtCantidadSolicitada.setText(null);
        txtFechaEntrada.setText(null);
        txtCodPro.requestFocus();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCodPro = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblsalida = new javax.swing.JTable();
        pnlDatosEntrada = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFechaEntrada = new javax.swing.JTextField();
        txtCantidadSolicitada = new javax.swing.JTextField();
        txtCantidadRecibida = new javax.swing.JTextField();
        btnEliminarEntrada = new javax.swing.JButton();
        btnIngresarProducto = new javax.swing.JButton();

        setClosable(true);
        setTitle("Entrada");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(775, 535));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel7.setText("Entrada de productos");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Código del producto");

        txtCodPro.setColumns(8);
        txtCodPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProActionPerformed(evt);
            }
        });

        btnBuscarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        tblsalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblsalida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblsalidaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblsalida);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Fecha de entrada");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Cantidad solicitada");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad recibida");

        txtCantidadSolicitada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadSolicitadaActionPerformed(evt);
            }
        });

        btnEliminarEntrada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminarEntrada.setText("Eliminar");

        btnIngresarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresarProducto.setText("Ingresar");
        btnIngresarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosEntradaLayout = new javax.swing.GroupLayout(pnlDatosEntrada);
        pnlDatosEntrada.setLayout(pnlDatosEntradaLayout);
        pnlDatosEntradaLayout.setHorizontalGroup(
            pnlDatosEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosEntradaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlDatosEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(btnIngresarProducto))
                .addGap(26, 26, 26)
                .addGroup(pnlDatosEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosEntradaLayout.createSequentialGroup()
                        .addComponent(txtFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(pnlDatosEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosEntradaLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(txtCantidadSolicitada, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDatosEntradaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCantidadRecibida, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(113, 113, 113))
                    .addGroup(pnlDatosEntradaLayout.createSequentialGroup()
                        .addComponent(btnEliminarEntrada)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlDatosEntradaLayout.setVerticalGroup(
            pnlDatosEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosEntradaLayout.createSequentialGroup()
                .addGroup(pnlDatosEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosEntradaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pnlDatosEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosEntradaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlDatosEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCantidadSolicitada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadRecibida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(4, 4, 4)
                .addGroup(pnlDatosEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresarProducto)
                    .addComponent(btnEliminarEntrada))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnBuscarProducto))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDatosEntrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProducto))
                .addGap(18, 18, 18)
                .addComponent(pnlDatosEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadSolicitadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadSolicitadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadSolicitadaActionPerformed

    private void txtCodProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProActionPerformed

    private void tblsalidaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblsalidaKeyPressed

    }//GEN-LAST:event_tblsalidaKeyPressed

    private void btnIngresarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarProductoActionPerformed
        e = new Entrada(listaProductos);
        e.setCodPro(listaProductos.get(indice).getCod());
        e.setDesPro(listaProductos.get(indice).getDescripcion());
        e.setCantidad_recibida(Integer.parseInt(txtCantidadRecibida.getText()));
        e.setCantidad_solicitada(Integer.parseInt(txtCantidadSolicitada.getText()));
        e.setFecha(txtFechaEntrada.getText());
        listaEntrada.add(e);
        borrarInterfaz();
        pnlDatosEntrada.setVisible(false);
        mostrarTablaEntrada();
    }//GEN-LAST:event_btnIngresarProductoActionPerformed
    
    private void mostrarTablaEntrada(){
    eliminarElementosTabla();
    
    for(int i=0; i<listaEntrada.size(); i++){
        Object[] data={
            listaEntrada.get(i).getCodPro(),
            listaEntrada.get(i).getDesPro(),
            listaEntrada.get(i).getFecha(),
            listaEntrada.get(i).getCantidad_recibida(),
            listaEntrada.get(i).getCantidad_solicitada(),
        };
        modelo.addRow(data);
    }    
}
   
    public void eliminarElementosTabla(){
        for(int i=tblsalida.getRowCount()-1; i>=0; i--){
            modelo.removeRow(i);
        }
    }
    
    public int buscarIndiceProd(){
        // Buscar producto por codigo
        String codigo;
        codigo = txtCodPro.getText();
        for(int i=0; i<listaProductos.size(); i++){
            if(codigo.equalsIgnoreCase(listaProductos.get(i).getCod())){
                indice= i;
            }    
        }
      return indice; 
    }
    
    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        // Buscar producto por codigo
        indice=buscarIndiceProd();
        if(indice==-1){
            JOptionPane.showMessageDialog(this, "No existe el producto");
        }
        else{
            pnlDatosEntrada.setVisible(true);
        }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnEliminarEntrada;
    private javax.swing.JButton btnIngresarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlDatosEntrada;
    private javax.swing.JTable tblsalida;
    private javax.swing.JTextField txtCantidadRecibida;
    private javax.swing.JTextField txtCantidadSolicitada;
    private javax.swing.JTextField txtCodPro;
    private javax.swing.JTextField txtFechaEntrada;
    // End of variables declaration//GEN-END:variables

}
