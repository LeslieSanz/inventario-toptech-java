package Vistas;
import modelo.Salida;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ProductoDTO;
import modeloDAO.procesoDAO;
import modeloDAO.productoDAO;


public class IFormSalida extends javax.swing.JInternalFrame {
    int indice=-1;
    DefaultTableModel modelo = new DefaultTableModel();
    //Declarar un objeto de la clase Salida
    Salida s;
    //Declarar un objeto de la clase productoDAO
    productoDAO pd;
    ArrayList<ProductoDTO> listaProductos = new ArrayList<>();
    ProductoDTO producto;
    public static ArrayList<Salida> listaSalidas = new ArrayList<>();
    
    public IFormSalida() {
        initComponents();
        establecerColumnas();
        pnlDatosSalida.setVisible(false);
        //Para mantener los productos en la tabla si se cambia de frame
        mostrarTablaSalida();
        setSize(777,550);
    }
    
     private void establecerColumnas() {
        modelo.addColumn("Código");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Fecha");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Confirmacion");
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
                    .addComponent(jLabel8)
                    .addGroup(pnlDatosSalidaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarSalida)
                            .addComponent(txtCantidadSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        pnlDatosSalidaLayout.setVerticalGroup(
            pnlDatosSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosSalidaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnlDatosSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtCantidadSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(btnRegistrarSalida))
                .addContainerGap(62, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlDatosSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)
                                .addGap(369, 369, 369)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel7)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDatosSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        procesoDAO proceDAO = new procesoDAO();
        
        //Obteniendo el producto encontrado en la lista segun el indice        
        producto = listaProductos.get(indice);
        String codigo = producto.getCod();
        
        //Pasando un producto del array listaProductos al objeto "s" de Salida
        s.setProducto(producto);
        s.setFecha(txtFechaSalida.getText()); 
        s.setCantidad_solicitada(Integer.parseInt(txtCantidadSalida.getText()));
        listaSalidas.add(s);
        
       //Primera consulta sql: para insertar la entrada en la tabla proceso
        proceDAO.agregar(s, "S");
        
        //Segunda consulta sql: para listar un producto de la base de datos
        producto = pd.listarUno(codigo);
        
        //Tercera consulta: para modificar o actualizar el stock del producto listado
        int cantidad = s.getCantidad_solicitada();  
        //Suma la cantidad al stock del producto, ver el metodo en la clase productoDTO
        producto.agregarSalida(cantidad);       
        pd.modificar(producto);
        
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
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    public void mostrarTablaSalida(){
        eliminarElementosTabla();
        for(int i=0; i<listaSalidas.size(); i++){
        Object[] data={
            listaSalidas.get(i).getProducto().getCod(),
            listaSalidas.get(i).getProducto().getDescripcion(),
            listaSalidas.get(i).getFecha(),
            listaSalidas.get(i).getCantidad_solicitada(), 
        };
        modelo.addRow(data);
       }
    }
    
    public void eliminarElementosTabla(){
        for(int i=tblsalida.getRowCount()-1; i>=0; i--){
            modelo.removeRow(i);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegistrarSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlDatosSalida;
    private javax.swing.JTable tblsalida;
    private javax.swing.JTextField txtCantidadSalida;
    private javax.swing.JTextField txtCantidadSolicitada;
    private javax.swing.JTextField txtCodPro;
    private javax.swing.JTextField txtFechaEntrada;
    private javax.swing.JTextField txtFechaSalida;
    // End of variables declaration//GEN-END:variables
}
