/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas.producto;

//Para el boton buscar
import javax.swing.table.TableRowSorter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import modelo.CategoriaProducto;
import modelo.ProductoDTO;
import modeloDAO.CategoriaProductoDAO;
import modeloDAO.productoDAO;

public class BuscarProducto extends javax.swing.JInternalFrame {
    String nomCat;
    String codigo;
    private TableRowSorter trsfiltro;
    String filtro;
    
    //Declarar un objeto de la clase productoDAO
    productoDAO pd;
    ProductoDTO p;
    
    CategoriaProducto c;
    CategoriaProductoDAO cd = new CategoriaProductoDAO();
    ArrayList<CategoriaProducto> listaCategorias = new ArrayList<>();
   
    DefaultTableModel modelo = new DefaultTableModel();
    
    
    public BuscarProducto() {
        initComponents();
        setSize(777,550);
        establecerColumnas();
        mostrarCategoriaProducto();
        pnlBuscar.setVisible(false);
        pnlDatosProd.setVisible(false);        
    }
    
     private void establecerColumnas(){
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio Unit");
        modelo.addColumn("Stock");
        tblProductoTodos.setModel(modelo);
    }
     
    //Metodo que recorre la lista de categorias, obtiene su nombre y las agrega una por una
    //al cbxCategoria
    private void mostrarCategoriaProducto(){
        listaCategorias = cd.listarTodos();
        for(int i=0; i<listaCategorias.size(); i++){
            cbxCatBuscar.addItem(listaCategorias.get(i).getNombre());
        }
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductoTodos = new javax.swing.JTable();
        pnlDatosProd = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGuardarProducto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigProd = new javax.swing.JTextField();
        txtPrecioProd = new javax.swing.JTextField();
        txtDescripcione = new javax.swing.JTextField();
        pnlBuscar = new javax.swing.JPanel();
        txtDescripProd = new javax.swing.JTextField();
        cbxCatBuscar = new javax.swing.JComboBox<>();
        lblDescripcion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnModificarProducto = new javax.swing.JButton();
        rbtnCod = new javax.swing.JRadioButton();
        rtbnDescrip = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtCodProdu = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Buscar producto");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscar.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupita.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblProductoTodos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProductoTodos);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("Datos del producto");

        btnGuardarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGuardarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnGuardar.png"))); // NOI18N
        btnGuardarProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Guardar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_BOTTOM, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        btnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProductoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Codigo");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Precio unitario S/.");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Descripcion");

        txtCodigProd.setEditable(false);

        javax.swing.GroupLayout pnlDatosProdLayout = new javax.swing.GroupLayout(pnlDatosProd);
        pnlDatosProd.setLayout(pnlDatosProdLayout);
        pnlDatosProdLayout.setHorizontalGroup(
            pnlDatosProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosProdLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnlDatosProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosProdLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDatosProdLayout.createSequentialGroup()
                        .addGroup(pnlDatosProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlDatosProdLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecioProd, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDatosProdLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDescripcione, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDatosProdLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodigProd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        pnlDatosProdLayout.setVerticalGroup(
            pnlDatosProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosProdLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pnlDatosProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosProdLayout.createSequentialGroup()
                        .addGroup(pnlDatosProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlDatosProdLayout.createSequentialGroup()
                                .addGroup(pnlDatosProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtCodigProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addComponent(txtPrecioProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDescripcione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosProdLayout.createSequentialGroup()
                        .addComponent(btnGuardarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        txtDescripProd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDescripProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripProdKeyTyped(evt);
            }
        });

        cbxCatBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxCatBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbxCatBuscar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCatBuscarItemStateChanged(evt);
            }
        });

        lblDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDescripcion.setText("Descripción");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Categoría");

        btnModificarProducto.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnModificarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnModificar.png"))); // NOI18N
        btnModificarProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 14))); // NOI18N
        btnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnCod);
        rbtnCod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtnCod.setText("Código");
        rbtnCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCodActionPerformed(evt);
            }
        });

        buttonGroup1.add(rtbnDescrip);
        rtbnDescrip.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rtbnDescrip.setText("Descripción");
        rtbnDescrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtbnDescripActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Buscar por");

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodigo.setText("Código");

        txtCodProdu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodProduKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlBuscarLayout = new javax.swing.GroupLayout(pnlBuscar);
        pnlBuscar.setLayout(pnlBuscarLayout);
        pnlBuscarLayout.setHorizontalGroup(
            pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addComponent(lblDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDescripProd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBuscarLayout.createSequentialGroup()
                        .addComponent(rbtnCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rtbnDescrip)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlBuscarLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(42, 42, 42)
                            .addComponent(cbxCatBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3))
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCodProdu, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBuscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        pnlBuscarLayout.setVerticalGroup(
            pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBuscarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxCatBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnCod)
                    .addComponent(rtbnDescrip))
                .addGap(18, 18, 18)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodProdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion)
                    .addComponent(txtDescripProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnModificarProducto)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addComponent(pnlBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                    .addComponent(pnlDatosProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlDatosProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        pnlBuscar.setVisible(true);
        ocultarLabels();                  
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtDescripProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripProdKeyTyped

    }//GEN-LAST:event_txtDescripProdKeyTyped

    private void cbxCatBuscarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCatBuscarItemStateChanged
        nomCat = cbxCatBuscar.getSelectedItem().toString();
        nomCat.toLowerCase();
        mostrarTablaProductosxCat(nomCat);        
    }//GEN-LAST:event_cbxCatBuscarItemStateChanged

    private void btnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductoActionPerformed
       int fila = tblProductoTodos.getSelectedRow();
       if (fila==-1){
            // Mostrar un mensaje de error para notificar al usuario que debe seleccionar una fila.
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una categoría de la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            pnlDatosProd.setVisible(true);
            codigo = tblProductoTodos.getValueAt(fila, 0).toString();
            pd = new productoDAO();
            p = pd.listarUno(codigo);
            txtCodigProd.setText(p.getCod());
            txtPrecioProd.setText(p.getPrecioUnit()+"");
            txtDescripcione.setText(p.getDescripcion());            
    }
    }//GEN-LAST:event_btnModificarProductoActionPerformed

    private void rbtnCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCodActionPerformed
        lblDescripcion.setVisible(false);
        txtDescripProd.setVisible(false);
        lblCodigo.setVisible(true);
        txtCodProdu.setVisible(true);
        txtCodProdu.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(final KeyEvent e){
                    String cadena=txtCodProdu.getText();
                    txtCodProdu.setText(cadena);
                    repaint();
                    filtro1();
                    }
            }); 
    }//GEN-LAST:event_rbtnCodActionPerformed

    private void rtbnDescripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtbnDescripActionPerformed
        lblCodigo.setVisible(false);
        txtCodProdu.setVisible(false);
        lblDescripcion.setVisible(true);
        txtDescripProd.setVisible(true);
        txtDescripProd.addKeyListener(new KeyAdapter(){
                @Override
                public void keyReleased(final KeyEvent e){
                String cadena=txtDescripProd.getText();
                txtDescripProd.setText(cadena);
                repaint();
                filtro2();
                   }
            });
    }//GEN-LAST:event_rtbnDescripActionPerformed

    private void txtCodProduKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProduKeyTyped

    }//GEN-LAST:event_txtCodProduKeyTyped

    private void btnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductoActionPerformed

        p.setPrecioUnit(Double.parseDouble(txtPrecioProd.getText()));
        p.setDescripcion(txtDescripcione.getText());       
        pd.modificar(p);
        
        mostrarTablaProductosxCat(nomCat);
    }//GEN-LAST:event_btnGuardarProductoActionPerformed
    
    
    public void filtro1(){
        filtro=txtCodProdu.getText();
        trsfiltro = new TableRowSorter(tblProductoTodos.getModel()); 
        trsfiltro.setRowFilter(RowFilter.regexFilter(txtCodProdu.getText(), 0));
        tblProductoTodos.setRowSorter(trsfiltro);
    }
    
    public void filtro2(){
        filtro=txtDescripProd.getText();
        trsfiltro = new TableRowSorter(tblProductoTodos.getModel()); 
        trsfiltro.setRowFilter(RowFilter.regexFilter(txtDescripProd.getText(), 1));
        tblProductoTodos.setRowSorter(trsfiltro);
    }
    
    public void ocultarLabels(){
        lblCodigo.setVisible(false);
        lblDescripcion.setVisible(false);
        txtCodProdu.setVisible(false);
        txtDescripProd.setVisible(false);
    }
    
    

    public void mostrarTablaProductosxCat(String nomCat){
        //Mostrar productos en la tabla
        modelo.setRowCount(0);
        pd = new productoDAO();   
        ArrayList<ProductoDTO> listaProductos = new ArrayList<>();
        listaProductos = pd.listaProdxCat(nomCat);
        
         for (int i=0;i<listaProductos.size();i++) {
             Object v[]={
                listaProductos.get(i).getCod(),
                listaProductos.get(i).getDescripcion(),
                listaProductos.get(i).getPrecioUnit(),
                listaProductos.get(i).getStock(),
             };
             modelo.addRow(v);
         }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardarProducto;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxCatBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JPanel pnlBuscar;
    private javax.swing.JPanel pnlDatosProd;
    private javax.swing.JRadioButton rbtnCod;
    private javax.swing.JRadioButton rtbnDescrip;
    private javax.swing.JTable tblProductoTodos;
    private javax.swing.JTextField txtCodProdu;
    private javax.swing.JTextField txtCodigProd;
    private javax.swing.JTextField txtDescripProd;
    private javax.swing.JTextField txtDescripcione;
    private javax.swing.JTextField txtPrecioProd;
    // End of variables declaration//GEN-END:variables
}
