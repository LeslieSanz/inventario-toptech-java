/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lesly
 */
public class FormMenu extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
   
    public FormMenu() {
        initComponents();
        establecerColumnas();
    }
    
    private void establecerColumnas(){
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Entradas");
        modelo.addColumn("Salidas");
        modelo.addColumn("Stock");
        tblSalidaStock.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondoBlanco = new javax.swing.JPanel();
        contenedor = new javax.swing.JDesktopPane();
        pnlnventario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalidaStock = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuProductos = new javax.swing.JMenu();
        jmiProducto = new javax.swing.JMenuItem();
        jMenuProveedores = new javax.swing.JMenu();
        jmiProveedores = new javax.swing.JMenuItem();
        jMenuProceso = new javax.swing.JMenu();
        jmiEntrada = new javax.swing.JMenuItem();
        jmiSalida = new javax.swing.JMenuItem();
        jMenuVenta = new javax.swing.JMenu();
        jmiVenta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlFondoBlanco.setBackground(new java.awt.Color(255, 255, 255));

        contenedor.setBackground(new java.awt.Color(204, 204, 204));
        contenedor.setPreferredSize(new java.awt.Dimension(777, 543));

        pnlnventario.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setText("Inventario de productos");

        tblSalidaStock.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblSalidaStock);

        javax.swing.GroupLayout pnlnventarioLayout = new javax.swing.GroupLayout(pnlnventario);
        pnlnventario.setLayout(pnlnventarioLayout);
        pnlnventarioLayout.setHorizontalGroup(
            pnlnventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlnventarioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlnventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        pnlnventarioLayout.setVerticalGroup(
            pnlnventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlnventarioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        contenedor.setLayer(pnlnventario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlnventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlnventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FraseMenu.png"))); // NOI18N

        javax.swing.GroupLayout pnlFondoBlancoLayout = new javax.swing.GroupLayout(pnlFondoBlanco);
        pnlFondoBlanco.setLayout(pnlFondoBlancoLayout);
        pnlFondoBlancoLayout.setHorizontalGroup(
            pnlFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoBlancoLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlFondoBlancoLayout.setVerticalGroup(
            pnlFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoBlancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenuProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productos.png"))); // NOI18N
        jMenuProductos.setText("Productos");
        jMenuProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProductosActionPerformed(evt);
            }
        });

        jmiProducto.setText("Abrir...");
        jmiProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductoActionPerformed(evt);
            }
        });
        jMenuProductos.add(jmiProducto);

        jMenuBar1.add(jMenuProductos);

        jMenuProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedores.png"))); // NOI18N
        jMenuProveedores.setText("Proveedores");

        jmiProveedores.setText(" Abrir...");
        jmiProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProveedoresActionPerformed(evt);
            }
        });
        jMenuProveedores.add(jmiProveedores);

        jMenuBar1.add(jMenuProveedores);

        jMenuProceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proceso.png"))); // NOI18N
        jMenuProceso.setText("Proceso");
        jMenuProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProcesoActionPerformed(evt);
            }
        });

        jmiEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entradita.png"))); // NOI18N
        jmiEntrada.setText(" Entrada");
        jmiEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEntradaActionPerformed(evt);
            }
        });
        jMenuProceso.add(jmiEntrada);

        jmiSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salidita.png"))); // NOI18N
        jmiSalida.setText(" Salida");
        jmiSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalidaActionPerformed(evt);
            }
        });
        jMenuProceso.add(jmiSalida);

        jMenuBar1.add(jMenuProceso);

        jMenuVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ventas.png"))); // NOI18N
        jMenuVenta.setText("Venta");
        jMenuVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVentaActionPerformed(evt);
            }
        });

        jmiVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/detalle.png"))); // NOI18N
        jmiVenta.setText("Generar venta");
        jmiVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVentaActionPerformed(evt);
            }
        });
        jMenuVenta.add(jmiVenta);

        jMenuBar1.add(jMenuVenta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondoBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProcesoActionPerformed
        
    }//GEN-LAST:event_jMenuProcesoActionPerformed

    private void jMenuProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProductosActionPerformed
       
    }//GEN-LAST:event_jMenuProductosActionPerformed

    private void jmiVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVentaActionPerformed
        actualizarInterfaz();
        IFormVenta v=new IFormVenta();
        contenedor.add(v);
        v.show();
    }//GEN-LAST:event_jmiVentaActionPerformed

    private void jmiEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEntradaActionPerformed
        actualizarInterfaz();
        IFormEntrada e = new IFormEntrada();
        contenedor.add(e);
        e.show();
    }//GEN-LAST:event_jmiEntradaActionPerformed

    private void jmiProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProductoActionPerformed
        actualizarInterfaz();
        IFormProducto pr=new IFormProducto();
        contenedor.add(pr);
        pr.setVisible(true);
    }//GEN-LAST:event_jmiProductoActionPerformed

    private void jmiProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProveedoresActionPerformed
        actualizarInterfaz();
        IFormProveedor pv=new IFormProveedor();
        contenedor.add(pv);
        pv.setVisible(true);
    }//GEN-LAST:event_jmiProveedoresActionPerformed

    private void jMenuVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVentaActionPerformed

    }//GEN-LAST:event_jMenuVentaActionPerformed

    private void jmiSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalidaActionPerformed
        actualizarInterfaz();
        IFormSalida s = new IFormSalida();
        contenedor.add(s);
        s.show();
    }//GEN-LAST:event_jmiSalidaActionPerformed

    //Para que no se sobrepongan los frames internos
    public void actualizarInterfaz(){
        contenedor.removeAll();
        contenedor.revalidate();
        contenedor.repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JMenu jMenuProceso;
    public static javax.swing.JMenu jMenuProductos;
    public static javax.swing.JMenu jMenuProveedores;
    public static javax.swing.JMenu jMenuVenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmiEntrada;
    private javax.swing.JMenuItem jmiProducto;
    private javax.swing.JMenuItem jmiProveedores;
    private javax.swing.JMenuItem jmiSalida;
    private javax.swing.JMenuItem jmiVenta;
    private javax.swing.JPanel pnlFondoBlanco;
    private javax.swing.JPanel pnlnventario;
    private javax.swing.JTable tblSalidaStock;
    // End of variables declaration//GEN-END:variables
}
