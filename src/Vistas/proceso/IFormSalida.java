package Vistas.proceso;
import modelo.Salida;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ProductoDTO;
import modeloDAO.procesoDAO;
import modeloDAO.productoDAO;
import java.util.Date;
import java.text.SimpleDateFormat;
import modelo.DetalleDTO;
import modelo.ProcesoDTO;
import modeloDAO.DetalleDAO;

public class IFormSalida extends javax.swing.JInternalFrame {
    int indice=-1;
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    //Declarar un objeto de la clase Salida
    Salida s;
    //Declarar un objeto de la clase productoDAO
    productoDAO pd;
    ArrayList<ProductoDTO> listaProductos = new ArrayList<>();
    ProductoDTO producto;
     //Declarar un objeto de proceso DAO para listar las salidas
    procesoDAO proceDAO;
    
    public IFormSalida() {
        initComponents();
        establecerColumnas();
        establecerColumnas2();
        pnlDatosSalida.setVisible(false);
        //Para mantener los productos en la tabla si se cambia de frame
        mostrarTablaSalida();       
    }
    
    private void establecerColumnas2() {
        modelo2.addColumn("Cod_pro");
        modelo2.addColumn("Cantidad");
        tblFactura.setModel(modelo2);
    }
    
     private void establecerColumnas() {
        modelo.addColumn("Fecha");
        modelo.addColumn("Código producto");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Cantidad");
        tblsalida.setModel(modelo);
    }
    public void borrarInterfaz(){
        txtCodPro.setText(null);
        txtFechaSalida.setText(null);
        txtCantidadSalida.setText(null);
        txtCodPro.requestFocus();
        
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFechaEntrada = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCantidadSolicitada = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtCodPro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnlDatosSalida = new javax.swing.JPanel();
        btnRegistrarSalida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFechaSalida = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCantidadSalida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsalida = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoFactura = new javax.swing.JTextField();
        btnMostrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFactura = new javax.swing.JTable();

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Fecha de entrada");

        jLabel5.setText("DD/MM/YYYY");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Cantidad solicitada");

        setClosable(true);
        setTitle("Salida");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtCodPro.setColumns(10);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Código del producto");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel7.setText("Salida de productos");

        btnRegistrarSalida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrarSalida.setText("Registrar");
        btnRegistrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarSalidaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Fecha de salida");

        txtFechaSalida.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Cantidad");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("DD/MM/AA");

        javax.swing.GroupLayout pnlDatosSalidaLayout = new javax.swing.GroupLayout(pnlDatosSalida);
        pnlDatosSalida.setLayout(pnlDatosSalidaLayout);
        pnlDatosSalidaLayout.setHorizontalGroup(
            pnlDatosSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosSalidaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnlDatosSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosSalidaLayout.createSequentialGroup()
                        .addGroup(pnlDatosSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDatosSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCantidadSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(txtFechaSalida))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlDatosSalidaLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                        .addComponent(btnRegistrarSalida)
                        .addGap(37, 37, 37))))
        );
        pnlDatosSalidaLayout.setVerticalGroup(
            pnlDatosSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosSalidaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlDatosSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCantidadSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(btnRegistrarSalida))
                .addContainerGap(34, Short.MAX_VALUE))
        );

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
        jScrollPane1.setViewportView(tblsalida);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Código de Factura");

        btnMostrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        tblFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane2.setViewportView(tblFactura);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCodigoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar)
                            .addComponent(btnMostrar)))
                    .addComponent(pnlDatosSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCodigoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrar))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGap(41, 41, 41)
                        .addComponent(pnlDatosSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 360, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSalidaActionPerformed
        //evita que se inserte valores vacios
        if (txtFechaSalida.getText().isEmpty() || txtCantidadSalida.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Se necesita llenar todos los campos para registrar una entrada",
                "Campos vacíos", JOptionPane.ERROR_MESSAGE);
        return;
        }
        pd = new productoDAO(); 
        listaProductos = pd.listarTodos();
        //Instanciando un objeto de la clase Salida
        s = new Salida();
        //Declarando e instanciando un DAO de proceso para agregar la salida a la tabla proceso
        proceDAO = new procesoDAO();
        
        //Obteniendo el producto encontrado en la lista segun el indice        
        producto = listaProductos.get(indice);
        String codigo = producto.getCod();
        
        //Pasando un producto del array listaProductos al objeto "s" de Salida
        s.setProducto(producto);
        s.setFecha(txtFechaSalida.getText()); 
        s.setCantidad_solicitada(Integer.parseInt(txtCantidadSalida.getText()));
        
       //Primera consulta sql: para insertar la entrada en la tabla proceso
        proceDAO.agregar(s, "S");
        
        //Segunda consulta sql: para listar un producto de la base de datos
        producto = pd.listarUno(codigo);
        
        //Tercera consulta: para modificar o actualizar el stock del producto listado
        int cantidad = s.getCantidad_solicitada();  
        //Suma la cantidad al stock del producto, ver el metodo en la clase productoDTO
        producto.agregarSalida(cantidad);       
        pd.actualizarStock(producto);
        
        borrarInterfaz();
        pnlDatosSalida.setVisible(false);
        mostrarTablaSalida();
    }//GEN-LAST:event_btnRegistrarSalidaActionPerformed
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //evita que se inserte valores vacios
        if (txtCodPro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "llenar el campo código de producto",
                "Campos vacíos", JOptionPane.ERROR_MESSAGE);
        return;
        }
        pd = new productoDAO();
        listaProductos = pd.listarTodos();     
        // Buscar producto por codigo
        String codigo;
        codigo = txtCodPro.getText();
        for(int i=0; i<listaProductos.size(); i++){
            if(codigo.equalsIgnoreCase(listaProductos.get(i).getCod())){
                indice = i;
            }     
        }
        if(indice==-1){
            JOptionPane.showMessageDialog(this, "No existe el producto");
        }
        else{
            pnlDatosSalida.setVisible(true);
            // Establecer la fecha actual
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            Date fa = new Date();
            String fechaActualFormateada = f.format(fa);
            txtFechaSalida.setText(fechaActualFormateada);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        
        String codven=txtCodigoFactura.getText();
        DetalleDAO dd =new DetalleDAO();
        DetalleDTO dt= new DetalleDTO();
        
        ArrayList<DetalleDTO> listaProductoDetalle = new ArrayList<>();
        listaProductoDetalle = dd.lisFactura(codven);
        modelo2.setRowCount(0);
         for (int i=0;i<listaProductoDetalle.size();i++) {
             Object f[]={
                listaProductoDetalle.get(i).getCodigoVenta(),
                listaProductoDetalle.get(i).getCantidad(),
             };
             modelo2.addRow(f);
         }
        
        
    }//GEN-LAST:event_btnMostrarActionPerformed
        
    public void mostrarTablaSalida(){
    modelo.setRowCount(0);
    proceDAO = new procesoDAO();
    ArrayList<ProcesoDTO> listaEntrada = proceDAO.listarTodos("S");
    for (ProcesoDTO proceso : listaEntrada) {
       if (proceso instanceof Salida) {
            Salida salida = (Salida) proceso;
            Object[] data = {
                salida.getFecha(),
                salida.getProducto().getCod(),
                salida.getProducto().getDescripcion(),
                salida.getCantidad_solicitada(),
            };
            modelo.addRow(data);
        } 
    }
    }
    
    public void eliminarElementosTabla(){
        for(int i=tblsalida.getRowCount()-1; i>=0; i--){
            modelo.removeRow(i);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegistrarSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlDatosSalida;
    private javax.swing.JTable tblFactura;
    private javax.swing.JTable tblsalida;
    private javax.swing.JTextField txtCantidadSalida;
    private javax.swing.JTextField txtCantidadSolicitada;
    private javax.swing.JTextField txtCodPro;
    private javax.swing.JTextField txtCodigoFactura;
    private javax.swing.JTextField txtFechaEntrada;
    private javax.swing.JTextField txtFechaSalida;
    // End of variables declaration//GEN-END:variables
}
