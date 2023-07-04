/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leslie,luis^2 y esther
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
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuProductos = new javax.swing.JMenu();
        jmiProducto = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuProveedores = new javax.swing.JMenu();
        jmiProveedores = new javax.swing.JMenuItem();
        jMenuProceso = new javax.swing.JMenu();
        jmiEntrada = new javax.swing.JMenuItem();
        jmiSalida = new javax.swing.JMenuItem();
        jMenuVenta = new javax.swing.JMenu();
        jmiVenta = new javax.swing.JMenuItem();
        jMenuInventario = new javax.swing.JMenu();
        jmiInventario = new javax.swing.JMenuItem();
        jMenuRegistro = new javax.swing.JMenu();
        jMiRegistrar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlFondoBlanco.setBackground(new java.awt.Color(255, 255, 255));

        contenedor.setBackground(new java.awt.Color(204, 204, 204));
        contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contenedor.setPreferredSize(new java.awt.Dimension(777, 543));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/frase_motivadora_menu.png"))); // NOI18N

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

        jmiProducto.setText("Registrar Producto");
        jmiProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductoActionPerformed(evt);
            }
        });
        jMenuProductos.add(jmiProducto);

        jMenuItem1.setText("Registrar Categoria");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuProductos.add(jMenuItem1);

        jMenuBar1.add(jMenuProductos);

        jMenuProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CAMIÓN 1 (1).png"))); // NOI18N
        jMenuProveedores.setText("Proveedores");

        jmiProveedores.setText("Registrar");
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

        jMenuInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inventario.png"))); // NOI18N
        jMenuInventario.setText("Inventario");
        jMenuInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInventarioActionPerformed(evt);
            }
        });

        jmiInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/stock.png"))); // NOI18N
        jmiInventario.setText(" Ver stock");
        jmiInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInventarioActionPerformed(evt);
            }
        });
        jMenuInventario.add(jmiInventario);

        jMenuBar1.add(jMenuInventario);

        jMenuRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedores.png"))); // NOI18N
        jMenuRegistro.setText("Registro");
        jMenuRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegistroActionPerformed(evt);
            }
        });

        jMiRegistrar.setText("Registrar usuarios");
        jMiRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMiRegistrarActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMiRegistrar);

        jMenuBar1.add(jMenuRegistro);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo cerrar 1 (5).png"))); // NOI18N

        jMCerrarSesion.setText("Cerrar Sesión");
        jMCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(jMCerrarSesion);

        jMenuBar1.add(jMenu1);

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

    private void jMenuInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInventarioActionPerformed

    }//GEN-LAST:event_jMenuInventarioActionPerformed

    private void jmiInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInventarioActionPerformed
        actualizarInterfaz();
        IFormInventario i = new IFormInventario();
        contenedor.add(i);
        i.show();
    }//GEN-LAST:event_jmiInventarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        actualizarInterfaz();
        IFormCategoría i = new IFormCategoría();
        contenedor.add(i);
        i.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCerrarSesionActionPerformed
     
        // Cerrar el formMenú
        dispose();

        // Abrir el formulario FormLoginUsuario
        FormLoginUsuario loginForm = new FormLoginUsuario();
        loginForm.setVisible(true);
        
    }//GEN-LAST:event_jMCerrarSesionActionPerformed

    private void jMenuRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegistroActionPerformed
        
    }//GEN-LAST:event_jMenuRegistroActionPerformed

    private void jMiRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMiRegistrarActionPerformed
        actualizarInterfaz();
        IFormRegistroUsuarios i = new IFormRegistroUsuarios();
        contenedor.add(i);
        i.show();
    }//GEN-LAST:event_jMiRegistrarActionPerformed

    //Para que no se sobrepongan los frames internos
    public static void actualizarInterfaz(){
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
    public static javax.swing.JDesktopPane contenedor;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMCerrarSesion;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JMenu jMenuInventario;
    private javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JMenu jMenuProceso;
    public static javax.swing.JMenu jMenuProductos;
    public static javax.swing.JMenu jMenuProveedores;
    private javax.swing.JMenu jMenuRegistro;
    public static javax.swing.JMenu jMenuVenta;
    private javax.swing.JMenuItem jMiRegistrar;
    private javax.swing.JMenuItem jmiEntrada;
    private javax.swing.JMenuItem jmiInventario;
    private javax.swing.JMenuItem jmiProducto;
    private javax.swing.JMenuItem jmiProveedores;
    private javax.swing.JMenuItem jmiSalida;
    private javax.swing.JMenuItem jmiVenta;
    private javax.swing.JPanel pnlFondoBlanco;
    // End of variables declaration//GEN-END:variables
}
