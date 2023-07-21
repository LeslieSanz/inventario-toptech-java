/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas.ventas;
//import static Vistas.FormMenu.actualizarInterfaz;
//import static Vistas.FormMenu.contenedor;
import Vistas.ventas.IFormVenta;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.CategoriaProducto;
import modelo.ProductoDTO;
import modeloDAO.CategoriaProductoDAO;
import modeloDAO.productoDAO;
/**
 *
 * @author esther
 */
public class IFormStockVenta extends javax.swing.JInternalFrame {
    String nomCat;
    productoDAO pd;
    
    
    CategoriaProducto c;
    CategoriaProductoDAO cd = new CategoriaProductoDAO();
    ArrayList<CategoriaProducto> listaCategorias = new ArrayList<>();
    ArrayList<ProductoDTO> listaProductos;
    DefaultTableModel modelo = new DefaultTableModel();
    public IFormStockVenta() {
        initComponents();
        establecerColumnas();
        mostrarTablaStock();
        mostrarCategoriaProducto();
        
    }
    private void establecerColumnas(){
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        tblStock.setModel(modelo);
    }
    
    private IFormVenta formularioVenta;

    public void setFormularioVenta(IFormVenta formularioVenta) {
    this.formularioVenta = formularioVenta;
    }

    //Metodo que recorre la lista de categorias, obtiene su nombre y las agrega una por una
    //al cbxCategoria
    private void mostrarCategoriaProducto(){
        listaCategorias = cd.listarTodos();
        for(int i=0; i<listaCategorias.size(); i++){
            cbxCatego.addItem(listaCategorias.get(i).getNombre());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStock = new javax.swing.JTable();
        cbxCatego = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Stock de productos");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setText("STOCK");

        tblStock.setModel(new javax.swing.table.DefaultTableModel(
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
        tblStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStockMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStock);

        cbxCatego.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxCatego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbxCatego.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCategoItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Listar por categoría");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbxCatego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 64, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbxCatego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStockMouseClicked
        int row = tblStock.getSelectedRow();
        IFormVenta v = new IFormVenta();
        try {
            // Verificar el stock
            int stock = Integer.parseInt(tblStock.getValueAt(row, 3).toString());
            if (stock == 0) {
                throw new IllegalArgumentException("Stock insuficiente. No se puede agregar el producto.");
            }
            // Si el stock es suficiente, continuar con el formulario "IFormVenta"
            if (formularioVenta != null && formularioVenta.x == 1) {
            formularioVenta.txtCodPro.setText(tblStock.getValueAt(row, 0).toString());
            formularioVenta.txtprecio.setText(tblStock.getValueAt(row, 2).toString());
            formularioVenta.txtStock.setText(tblStock.getValueAt(row, 3).toString());
            formularioVenta.txtcantidad.requestFocus();
            formularioVenta.x = 0;
            formularioVenta.pnlDatos.setVisible(true);
           
             dispose();}
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error de Stock", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tblStockMouseClicked

    private void cbxCategoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCategoItemStateChanged
        nomCat = cbxCatego.getSelectedItem().toString();
        nomCat.toLowerCase();
        if(cbxCatego.getSelectedItem().equals("Seleccionar")){
            mostrarTablaStock();
        }else{
            mostrarTablaProdxCat(nomCat);
        } 
    }//GEN-LAST:event_cbxCategoItemStateChanged

    private void mostrarTablaStock(){
        modelo.setRowCount(0);
         pd = new productoDAO();   
         listaProductos= new ArrayList<>();
         listaProductos = pd.listarTodos();
        //Mostrar productos en la tabla stock
        for(int i=0;i<listaProductos.size();i++){
            Object[] data={ 
                listaProductos.get(i).getCod(),
                listaProductos.get(i).getDescripcion(),
                listaProductos.get(i).getPrecioUnit(),
                listaProductos.get(i).getStock(),
            };
            modelo.addRow(data);
        }  
    }
    
    private void mostrarTablaProdxCat(String nomCat){      
         modelo.setRowCount(0);
         pd = new productoDAO();
         listaProductos= new ArrayList<>();
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
    
    public void eliminarElementosTabla(){
        for(int i=tblStock.getRowCount()-1;i>=0;i--){
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxCatego;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStock;
    // End of variables declaration//GEN-END:variables
}
