/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas.ventas;

import modeloDAO.VentaDAO;

/*import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;*/
import modelo.*;
import org.jfree.chart.*;
import org.jfree.data.general.DefaultPieDataset; //Para circular
import org.jfree.data.category.DefaultCategoryDataset; //Para barras
import org.jfree.data.xy.XYSeries; //Para el grafico lineal
import org.jfree.data.xy.XYSeriesCollection; //Para el grafico lineal


/**
 *
 * @author lesly
 */
public class IFormReporteVentas extends javax.swing.JInternalFrame {
    VentaDAO vd= new VentaDAO();
    /**
     * Creates new form IFormReporteVentas
     */
    public IFormReporteVentas() {
        initComponents();
        setSize(777,550);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlReporte = new javax.swing.JPanel();
        btnCirculo = new javax.swing.JButton();
        btnBarra = new javax.swing.JButton();
        btnLineal = new javax.swing.JButton();
        txtAn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/graf.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel2.setText("Reporte de ");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel4.setText("Ventas");

        javax.swing.GroupLayout pnlReporteLayout = new javax.swing.GroupLayout(pnlReporte);
        pnlReporte.setLayout(pnlReporteLayout);
        pnlReporteLayout.setHorizontalGroup(
            pnlReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );
        pnlReporteLayout.setVerticalGroup(
            pnlReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );

        btnCirculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circul.png"))); // NOI18N
        btnCirculo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Circular", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N
        btnCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCirculoActionPerformed(evt);
            }
        });

        btnBarra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barra.png"))); // NOI18N
        btnBarra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Barra", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N
        btnBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarraActionPerformed(evt);
            }
        });

        btnLineal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lineal.png"))); // NOI18N
        btnLineal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lineal", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N
        btnLineal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinealActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Ingrese año:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLineal)
                            .addComponent(jLabel1))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBarra)
                                .addGap(28, 28, 28)
                                .addComponent(btnCirculo)))
                        .addGap(63, 63, 63))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(btnBarra)
                            .addComponent(btnLineal)
                            .addComponent(btnCirculo))))
                .addGap(18, 18, 18)
                .addComponent(pnlReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
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

    private void btnCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCirculoActionPerformed
        int an=Integer.parseInt(txtAn.getText());
        DefaultPieDataset ds = new DefaultPieDataset();
        for(Venta v:vd.lisMes(an)){
            ds.setValue(v.Lmes(), v.getTotal());
        }
        //Graficar en memoria
        JFreeChart js = ChartFactory.createPieChart("año"+an, ds);
        ChartPanel cp=new ChartPanel(js);
        pnlReporte.removeAll(); //Limpiar el panel
        pnlReporte.setLayout(new java.awt.BorderLayout());
        pnlReporte.add(cp);
        pnlReporte.validate();
    }//GEN-LAST:event_btnCirculoActionPerformed

    private void btnBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarraActionPerformed
        int an=Integer.parseInt(txtAn.getText());
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        for(Venta v:vd.lisMes(an)){
            ds.setValue(v.getTotal(), "Venta",v.Lmes());
        }
        //Graficar en memoria
        JFreeChart js = ChartFactory.createBarChart("año"+an, "mes","Total",ds);
        ChartPanel cp=new ChartPanel(js);
        pnlReporte.removeAll(); //Limpiar el panel
        pnlReporte.setLayout(new java.awt.BorderLayout());
        pnlReporte.add(cp);
        pnlReporte.validate();
    }//GEN-LAST:event_btnBarraActionPerformed

    private void btnLinealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinealActionPerformed
        int an=Integer.parseInt(txtAn.getText());
        XYSeries series = new XYSeries("Datos");
        for(Venta v:vd.lisMes(an)){
            //double mes = (double) x.getMes();
            series.addOrUpdate(v.getMes(), v.getTotal()); //addOrUpdate acepta como parametros valores de tipo numeric
            //no importa que sean int o double, a diferencia de add que solo acepta double.
        }
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        // Graficar en memoria
        JFreeChart lineChart = ChartFactory.createXYLineChart(
            "Gráfico Lineal de Ventas para el Año " + an,
            "Meses", // Eje X
            "Total Ventas", // Etiqueta del eje Y
            dataset // Datos
        );
        ChartPanel cp = new ChartPanel(lineChart);
        pnlReporte.removeAll();
        pnlReporte.setLayout(new java.awt.BorderLayout());
        pnlReporte.add(cp);
        pnlReporte.validate();

    }//GEN-LAST:event_btnLinealActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBarra;
    private javax.swing.JButton btnCirculo;
    private javax.swing.JButton btnLineal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlReporte;
    private javax.swing.JTextField txtAn;
    // End of variables declaration//GEN-END:variables
}
