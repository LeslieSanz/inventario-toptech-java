package Vistas;
//Importando el ArrayList Lista productos del IFormProducto
import static Vistas.IFormProducto.listaProductos;
import modelo.Entrada;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ProductoDTO;
import modeloDAO.procesoDAO;
import modeloDAO.productoDAO;


public class IFormEntrada extends javax.swing.JInternalFrame {
    int indice=-1;
    //int a;
    DefaultTableModel modelo= new DefaultTableModel();
    //Declarar un objeto de la clase Entrada
    Entrada e;
    //Declarar un objeto de la clase productoDAO
    productoDAO pd;
    //Genera un nuevo Array List llamado listaEntrada
    public static ArrayList<Entrada> listaEntrada = new ArrayList<>();
    public IFormEntrada() {
        initComponents();
        establecerColumnas();
        pnlDatosEntrada.setVisible(false);
        //Para mantener los productos en la tabla si se cambia de frame
        mostrarTablaEntrada();
    }
    
    private void establecerColumnas(){
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Cant.solicitada");
        modelo.addColumn("Cant.recibida");
        modelo.addColumn("Fecha");
        modelo.addColumn("Estado");
        tblentrada.setModel(modelo);
    }
    //Borra el interfaz para una nueva inserción
    public void borrarInterfaz(){
        txtCodPro.setText(null);
        txtCantidadRecibida.setText(null);
        txtCantidadSolicitada.setText(null);
        txtFechaEntrada.setText(null);
        txtCodPro.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCodPro = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblentrada = new javax.swing.JTable();
        pnlDatosEntrada = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFechaEntrada = new javax.swing.JTextField();
        txtCantidadSolicitada = new javax.swing.JTextField();
        txtCantidadRecibida = new javax.swing.JTextField();
        btnEliminarEntrada = new javax.swing.JButton();
        btnRegistrarEntrada = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Entrada");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(775, 535));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel7.setText("Entrada de productos");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Código del producto");

        txtCodPro.setColumns(8);

        btnBuscarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        tblentrada.setModel(new javax.swing.table.DefaultTableModel(
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
        tblentrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblentradaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblentrada);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Fecha de entrada");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Cantidad solicitada");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad recibida");

        btnEliminarEntrada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminarEntrada.setText("Eliminar");

        btnRegistrarEntrada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrarEntrada.setText("Registrar");
        btnRegistrarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEntradaActionPerformed(evt);
            }
        });

        jLabel5.setText("DD-MM-YYYY");

        javax.swing.GroupLayout pnlDatosEntradaLayout = new javax.swing.GroupLayout(pnlDatosEntrada);
        pnlDatosEntrada.setLayout(pnlDatosEntradaLayout);
        pnlDatosEntradaLayout.setHorizontalGroup(
            pnlDatosEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosEntradaLayout.createSequentialGroup()
                .addGroup(pnlDatosEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosEntradaLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnlDatosEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(btnRegistrarEntrada)))
                    .addGroup(pnlDatosEntradaLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCantidadRecibida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(pnlDatosEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarEntrada)
                    .addComponent(btnEliminarEntrada))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnBuscarProducto))
                    .addComponent(pnlDatosEntrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
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
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblentradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblentradaKeyPressed

    }//GEN-LAST:event_tblentradaKeyPressed

    private void btnRegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEntradaActionPerformed
        //Instanciando un objeto de la clase Entrada
        e = new Entrada();
        procesoDAO pd = new procesoDAO();
        ProductoDTO producto = listaProductos.get(indice);

        //Pasando un producto del array listaProductos al objeto "e" de Entrada
        e.setProducto(producto);
        e.setFecha(txtFechaEntrada.getText()); 
        //e.setCantidad_solicitada(a);   !!!
        e.setCantidad_solicitada(Integer.parseInt(txtCantidadSolicitada.getText()));
        e.setCantidad_recibida(Integer.parseInt(txtCantidadRecibida.getText()));
        String estado=e.verificarEstado();
        e.setEstadoConfirmacion(estado);
        listaEntrada.add(e);
        
        pd.agregar(e, "E");
        
        int cantidad = e.getCantidad_recibida();        
        //Suma la cantidad al stock del producto, ver el metodo en la clase productoDTO
        producto.agregarEntrada(cantidad); 
        
        borrarInterfaz();
        pnlDatosEntrada.setVisible(false);
        mostrarTablaEntrada();
    }//GEN-LAST:event_btnRegistrarEntradaActionPerformed
    
    private void mostrarTablaEntrada(){
    eliminarElementosTabla();
    
    for(int i=0; i<listaEntrada.size(); i++){
        Object[] data={
            listaEntrada.get(i).getProducto().getCod(),
            listaEntrada.get(i).getProducto().getDescripcion(),
            listaEntrada.get(i).getCantidad_solicitada(),
            listaEntrada.get(i).getCantidad_recibida(),
            listaEntrada.get(i).getFecha(),
            listaEntrada.get(i).getEstadoConfirmacion()
        };
        modelo.addRow(data);
    }    
}
   
    public void eliminarElementosTabla(){
        for(int i=tblentrada.getRowCount()-1; i>=0; i--){
            modelo.removeRow(i);
        }
    }
        
    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        pd = new productoDAO();
        listaProductos = pd.listarTodos();
        // Buscar producto por codigo
        String codigo;
        codigo = txtCodPro.getText();
        for(int i=0; i<listaProductos.size(); i++){
            if(codigo.equalsIgnoreCase(listaProductos.get(i).getCod())){
                indice= i;
            }    
        }
        if(indice==-1){
            JOptionPane.showMessageDialog(this, "No existe el producto");
        }
        else{
            pnlDatosEntrada.setVisible(true);
        }
        //Revisar !!!!!!!!!!!!!!!!!!! "cantidad solicitada random y visible en el form"
        //e.setCantidad_solicitada(a);
        //txtCantidadSolicitada.setText(a);
    }//GEN-LAST:event_btnBuscarProductoActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnEliminarEntrada;
    private javax.swing.JButton btnRegistrarEntrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlDatosEntrada;
    private javax.swing.JTable tblentrada;
    private javax.swing.JTextField txtCantidadRecibida;
    private javax.swing.JTextField txtCantidadSolicitada;
    private javax.swing.JTextField txtCodPro;
    private javax.swing.JTextField txtFechaEntrada;
    // End of variables declaration//GEN-END:variables

}
