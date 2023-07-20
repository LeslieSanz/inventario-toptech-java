package Vistas.proceso;
import modelo.Entrada;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ProductoDTO;
import modeloDAO.procesoDAO;
import modeloDAO.productoDAO;
import java.util.Date;
import java.text.SimpleDateFormat;
import modelo.ProcesoDTO;


public class IFormEntrada extends javax.swing.JInternalFrame {
    int indice=-1;
    ProcesoDTO pt =new ProcesoDTO();
    DefaultTableModel modelo= new DefaultTableModel();
    //Declarar un objeto de la clase Entrada
    Entrada e;
    //Declarar un objeto de la clase productoDAO
    productoDAO pd;
    ArrayList<ProductoDTO> listaProductos = new ArrayList<>();
    ProductoDTO producto;
    //Declarar un objeto de proceso DAO para listar las entradas
    procesoDAO proceDAO;
    
    public IFormEntrada() {
        initComponents();
        setSize(777,550);
        establecerColumnas();
        pnlDatosEntrada.setVisible(false);
        //Para mantener los productos en la tabla si se cambia de frame
        mostrarTablaEntrada();
        
        
       // Establecer la fecha actual
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        Date fa = new Date();
        // Obtener la fecha actual
        String fechaActualFormateada = f.format(fa);
        // Asignar la fecha actual
        pt.setFecha(fechaActualFormateada);
        txtFechaEntrada.setText(fechaActualFormateada);
    }
    
    private void establecerColumnas(){
        modelo.addColumn("Fecha");
        modelo.addColumn("Código producto");
        modelo.addColumn("Descripción");
        modelo.addColumn("Cant.solicitada");
        modelo.addColumn("Cant.recibida");
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
        btnRegistrarEntrada = new javax.swing.JButton();

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

        btnRegistrarEntrada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrarEntrada.setText("Registrar");
        btnRegistrarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEntradaActionPerformed(evt);
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
                    .addComponent(btnRegistrarEntrada))
                .addGap(26, 26, 26)
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
                .addGroup(pnlDatosEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadRecibida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addComponent(btnRegistrarEntrada)
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
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblentradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblentradaKeyPressed

    }//GEN-LAST:event_tblentradaKeyPressed

    private void btnRegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEntradaActionPerformed
        //evita que se inserte valores vacios
        if (txtFechaEntrada.getText().isEmpty() || txtCantidadSolicitada.getText().isEmpty()|| txtCantidadRecibida.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Se necesita llenar todos los campos para registrar una entrada",
                "Campos vacíos", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        pd = new productoDAO(); 
        listaProductos = pd.listarTodos();
        //Instanciando un objeto de la clase Entrada
        e = new Entrada();
        //Declarando e instanciando un DAO de proceso para agregar la entrada a la tabla proceso
        proceDAO = new procesoDAO();

        //Obteniendo el producto encontrado en la lista segun el indice        
        producto = listaProductos.get(indice);
        String codigo = producto.getCod();

        //Pasando un producto del array listaProductos al objeto "e" de Entrada
        e.setProducto(producto);
        e.setFecha(txtFechaEntrada.getText()); 
        e.setCantidad_solicitada(Integer.parseInt(txtCantidadSolicitada.getText()));
        e.setCantidad_recibida(Integer.parseInt(txtCantidadRecibida.getText()));
        String estado=e.verificarEstado();
        e.setEstadoConfirmacion(estado);
        //listaEntrada.add(e);
        
        //Primera consulta sql: para insertar la entrada en la tabla proceso
        proceDAO.agregar(e, "E");
        
        //Segunda consulta sql: para listar un producto de la base de datos
        producto = pd.listarUno(codigo);
        
        //Tercera consulta: para modificar o actualizar el stock del producto listado
        int cantidad = e.getCantidad_recibida();  
        //Suma la cantidad al stock del producto, ver el metodo en la clase productoDTO
        producto.agregarEntrada(cantidad);       
        pd.actualizarStock(producto);
                     
        borrarInterfaz();
        pnlDatosEntrada.setVisible(false);
        mostrarTablaEntrada();
    }//GEN-LAST:event_btnRegistrarEntradaActionPerformed
    
    private void mostrarTablaEntrada(){
     modelo.setRowCount(0);
     proceDAO = new procesoDAO();
     ArrayList<ProcesoDTO> listaEntrada = proceDAO.listarTodos("E");
     for (ProcesoDTO proceso : listaEntrada) {
       if (proceso instanceof Entrada) {
            Entrada entrada = (Entrada) proceso;
            Object[] data = {
                entrada.getFecha(),
                entrada.getProducto().getCod(),
                entrada.getProducto().getDescripcion(),
                entrada.getCantidad_solicitada(),
                entrada.getCantidad_recibida(),
                entrada.getEstadoConfirmacion(),
            };
            modelo.addRow(data);
        } 
    }    
}
   
    public void eliminarElementosTabla(){
        for(int i=tblentrada.getRowCount()-1; i>=0; i--){
            modelo.removeRow(i);
        }
    }
        
    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        //Evita que se inserte valores vacios
        if (txtCodPro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "llenar el campo código de producto",
                "Campos vacíos", JOptionPane.ERROR_MESSAGE);
        return;
        }
        //Instanciando un DAO de producto
        pd = new productoDAO();
        //Obteniendo la lista de productos de la base de datos
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
    }//GEN-LAST:event_btnBuscarProductoActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnRegistrarEntrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
