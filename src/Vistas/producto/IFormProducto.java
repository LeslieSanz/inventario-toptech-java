package Vistas.producto;




import static Vistas.FormMenu.actualizarInterfaz;
import static Vistas.FormMenu.contenedor;
import modelo.ProductoDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.CategoriaProducto;
import modelo.Proveedor;
import modeloDAO.CategoriaProductoDAO;
import modeloDAO.productoDAO;
import modeloDAO.proveedorDAO;


public final class IFormProducto extends javax.swing.JInternalFrame {
     String nomCat;
    CategoriaProducto c;
    CategoriaProductoDAO cd = new CategoriaProductoDAO();
    Proveedor prov;
    proveedorDAO provd = new proveedorDAO();
     
    ArrayList<CategoriaProducto> listaCategorias = new ArrayList<>();
    ArrayList<Proveedor> listaProvs = new ArrayList<>();
    
    //Declarar un objeto de la clase producto
    ProductoDTO p;
    //Declarar un objeto de la clase productoDAO
    productoDAO pd;
   
    DefaultTableModel modelo = new DefaultTableModel();
    
    
    public IFormProducto() {
        initComponents();
        setSize(777,550);
        establecerColumnas();
        mostrarCategoriaProducto();
        mostrarProveedores();
        mostrarTablaProductos();
        generaCodigoAutomatico();       
    }
    
    private void establecerColumnas(){
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripción");
        modelo.addColumn("Categoría");
        modelo.addColumn("Precio Unit");
        tblProducto.setModel(modelo);
    }
    
    //Metodo que recorre la lista de categorias, obtiene su nombre y las agrega una por una
    //al cbxCategoria
    private void mostrarCategoriaProducto(){
        listaCategorias = cd.listarTodos();
        for(int i=0; i<listaCategorias.size(); i++){
            cbxCategoria.addItem(listaCategorias.get(i).getNombre());
        }
    }
    
    //Metodo que recorre la lista de proveedores, obtiene su nombre y los agrega uno por uno
    //al cbxProveedor
     private void mostrarProveedores(){
        listaProvs = provd.listarTodos();
        for(int i=0; i<listaProvs.size(); i++){
            cbxProveedor.addItem(listaProvs.get(i).getNombreprov());
        }
    }
    
     
    private void generaCodigoAutomatico(){
        //Generar el codigo del producto a partir del ultimo en la base de datos
        String codProd = pd.generaCodProducto();
        //Seteando el valor obtenido en el txtCodEntrada
        txtCodPro.setText(codProd);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCodPro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtPrecioUnit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescrip = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        cbxProveedor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Productos");
        setPreferredSize(new java.awt.Dimension(777, 546));
        setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel4.setText("Registro de ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Código");

        txtCodPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Categoría");

        cbxCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Precio unitario  S/.");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Descripción");

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrarProdu.png"))); // NOI18N
        btnRegistrar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProducto);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Proveedor");

        cbxProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbxProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProveedorActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel7.setText("Productos");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cajita.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescrip)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecioUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(416, 416, 416))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(36, 36, 36))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(23, 23, 23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegistrar)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     //Metodo para mostrar el mensaje de error en las excepciones
     private void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
        }   
         
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        //Excepción para validar que todos los campos estén llenos
        if (txtCodPro.getText().isEmpty() || txtDescrip.getText().isEmpty() ||
            cbxCategoria.getSelectedIndex() == 0 ||cbxProveedor.getSelectedIndex()== 0 || txtPrecioUnit.getText().isEmpty()) {
        mostrarMensajeError("Se debe llenar todos los campos para registrar un producto.");
        return;
        }
        
        //Registrar Productos 
        p = new ProductoDTO();
        pd = new productoDAO();
        p.setCod(txtCodPro.getText());
        p.setDescripcion(txtDescrip.getText());
        
        //Excepción para validar el precio del producto
        try {
        double precioUnit = Double.parseDouble(txtPrecioUnit.getText());
        p.setPrecioUnit(precioUnit);
            } catch (NumberFormatException e) {
        mostrarMensajeError("El precio unitario debe ser un número válido.");
        return;
         }
        
        int indice_cat = cbxCategoria.getSelectedIndex();
        p.setCategoria(listaCategorias.get(indice_cat-1));
        int indice_prov = cbxProveedor.getSelectedIndex();
        p.setProveedor(listaProvs.get(indice_prov-1));
        pd.agregar(p);
        
        borrarInterfaz();
        mostrarTablaProductos();
        generaCodigoAutomatico();
      
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtCodProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProActionPerformed

    private void cbxProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxProveedorActionPerformed

    private void cbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriaActionPerformed
        
    }//GEN-LAST:event_cbxCategoriaActionPerformed
    
    //Limpia la tabla 
     public void eliminarElementosTablaProductos(){
        for(int i=tblProducto.getRowCount()-1;i>=0;i--){
            modelo.removeRow(i);
        }
    }

    //Borra el interfaz para una nueva inserción 
    public void borrarInterfaz(){
        txtCodPro.setText(null);
        txtDescrip.setText(null);
        cbxCategoria.setSelectedIndex(0);
        txtPrecioUnit.setText(null);
        txtCodPro.requestFocus();
        cbxProveedor.setSelectedIndex(0);
    }
    
    public void mostrarTablaProductos(){
        //eliminarElementosTablaProductos();
        //Mostrar productos en la tabla
        modelo.setRowCount(0);
        pd = new productoDAO();   
        ArrayList<ProductoDTO> listaProductos = new ArrayList<>();
        listaProductos = pd.listarTodos();
        for(int i=0; i<listaProductos.size(); i++){
            Object[] data = {
                listaProductos.get(i).getCod(), 
                listaProductos.get(i).getDescripcion(),
                listaProductos.get(i).getCategoria().getNombre(),
                listaProductos.get(i).getPrecioUnit(),
                };
            modelo.addRow(data);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JComboBox<String> cbxProveedor;
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
    private javax.swing.JTable tblProducto;
    private javax.swing.JTextField txtCodPro;
    private javax.swing.JTextField txtDescrip;
    private javax.swing.JTextField txtPrecioUnit;
    // End of variables declaration//GEN-END:variables
}
