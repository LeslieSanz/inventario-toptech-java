/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas.ventas;

import java.util.List;
import javax.swing.JOptionPane;
import modeloDAO.VentaDAO;
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
    Venta v = new Venta();
    int grafico;
    /**
     * Creates new form IFormReporteVentas
     */
    public IFormReporteVentas() {
        initComponents();
        setSize(777,550);
        configurarSpinnerAnio();
    }
    
    private void configurarSpinnerAnio() {
        int an= java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        spnanio.setModel(new javax.swing.SpinnerNumberModel(an, 2000, 2023, 1));
    }
    
    
    
     private void tiporeporte() {
    String tipo = cbxtipo.getSelectedItem().toString();
    
    if (tipo.equals("ANUAL")) {
        int an = (int) spnanio.getValue();
        generarGraficoAnual(an);
    } else if (tipo.equals("MENSUAL")) {
        int an = (int) spnanio.getValue();
        int mes = cbxmes.getSelectedIndex() + 1; // Los meses se indexan desde 0 a 11, por eso se suma 1.
        generarGraficoMensual(an, mes);
    }
    }
     
    private void generarGraficoAnual(int an) {
        // Obtener las ventas anuales para el año seleccionado
    List<Venta> lis = vd.lisMes(an);

    DefaultPieDataset dsCircularAnual = new DefaultPieDataset();
    DefaultCategoryDataset dsBarraAnual = new DefaultCategoryDataset();
    XYSeries seriesAnual = new XYSeries("Datos");

    for (Venta v :vd.lisMes(an)) {
        dsCircularAnual.setValue("Mes " + v.getMes(), v.getTotal());
        dsBarraAnual.addValue(v.getTotal(), "Venta", "Mes " + v.getMes());
        seriesAnual.add(v.getMes(), v.getTotal());
    }

    switch (grafico) {
        case 1:
            //Graficar en memoria
            JFreeChart jsCircularAnual = ChartFactory.createPieChart(
                    "Ventas para el Año " + an, // Título del gráfico
                    dsCircularAnual // Datos
            );
            ChartPanel cpCircularAnual = new ChartPanel(jsCircularAnual);
            pnlReporte.removeAll(); //Limpiar el panel
            pnlReporte.setLayout(new java.awt.BorderLayout());
            pnlReporte.add(cpCircularAnual);
            pnlReporte.validate();
            break;
        case 2:
            //Graficar en memoria
            JFreeChart jsBarraAnual = ChartFactory.createBarChart(
                    "Ventas para el Año " + an, // Título del gráfico
                    "Meses", // Etiqueta del eje X
                    "Total", // Etiqueta del eje Y
                    dsBarraAnual // Datos
            );
            ChartPanel cpBarraAnual = new ChartPanel(jsBarraAnual);
            pnlReporte.removeAll(); //Limpiar el panel
            pnlReporte.setLayout(new java.awt.BorderLayout());
            pnlReporte.add(cpBarraAnual);
            pnlReporte.validate();
            break;
        case 3:
            XYSeriesCollection dataset = new XYSeriesCollection();
            dataset.addSeries(seriesAnual);
            // Graficar en memoria
            JFreeChart lineChart = ChartFactory.createXYLineChart(
                    "Gráfico Lineal de Ventas para el Año " + an,
                    "Meses", // Eje X
                    "Total Ventas", // Etiqueta del eje Y
                    dataset // Datos
            );
            ChartPanel cpLineal = new ChartPanel(lineChart);
            pnlReporte.removeAll();
            pnlReporte.setLayout(new java.awt.BorderLayout());
            pnlReporte.add(cpLineal);
            pnlReporte.validate();
            break;
        default:
            break;
    }
    }

    private void generarGraficoMensual(int an, int mes) {
        // Obtener las ventas mensuales para el año y mes seleccionados
    List<Venta> lis = vd.lisDia(mes, an);

    DefaultPieDataset dsCircularMensual = new DefaultPieDataset();
    DefaultCategoryDataset dsBarraMensual = new DefaultCategoryDataset();
    XYSeries seriesMensual = new XYSeries("Datos");

    for (Venta v : vd.lisDia(mes, an)) {
        dsCircularMensual.setValue("Día " + v.getDia(), v.getTotal());
        dsBarraMensual.addValue(v.getTotal(), "Venta", "Día " + v.getDia());
        seriesMensual.add(v.getDia(), v.getTotal());
    }

    switch (grafico) {
        case 1:
            //Graficar en memoria
            JFreeChart jsCircularMensual = ChartFactory.createPieChart(
                    "Ventas para " + v.Lmes() + " " + an, // Título del gráfico
                    dsCircularMensual // Datos
            );
            ChartPanel cpCircularMensual = new ChartPanel(jsCircularMensual);
            pnlReporte.removeAll(); //Limpiar el panel
            pnlReporte.setLayout(new java.awt.BorderLayout());
            pnlReporte.add(cpCircularMensual);
            pnlReporte.validate();
            break;
        case 2:
            //Graficar en memoria
            JFreeChart jsBarraMensual = ChartFactory.createBarChart(
                    "Ventas para " + v.Lmes() + " " + an, // Título del gráfico
                    "Día", // Etiqueta del eje X
                    "Total", // Etiqueta del eje Y
                    dsBarraMensual // Datos
            );
            ChartPanel cpBarraMensual = new ChartPanel(jsBarraMensual);
            pnlReporte.removeAll(); //Limpiar el panel
            pnlReporte.setLayout(new java.awt.BorderLayout());
            pnlReporte.add(cpBarraMensual);
            pnlReporte.validate();
            break;
        case 3:
            XYSeriesCollection dataset = new XYSeriesCollection();
            dataset.addSeries(seriesMensual);
            // Graficar en memoria
            JFreeChart lineChart = ChartFactory.createXYLineChart(
                    "Gráfico Lineal de Ventas para " + v.Lmes() + " " + an,
                    "Días", // Eje X
                    "Total Ventas", // Etiqueta del eje Y
                    dataset // Datos
            );
            ChartPanel cpLineal = new ChartPanel(lineChart);
            pnlReporte.removeAll();
            pnlReporte.setLayout(new java.awt.BorderLayout());
            pnlReporte.add(cpLineal);
            pnlReporte.validate();
            break;
        default:
            break;
    }
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
        jLabel1 = new javax.swing.JLabel();
        spnanio = new javax.swing.JSpinner();
        cbxmes = new javax.swing.JComboBox<>();
        cbxtipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/graf.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel2.setText("Reporte de ");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel4.setText("Ventas");

        pnlReporte.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlReporteLayout = new javax.swing.GroupLayout(pnlReporte);
        pnlReporte.setLayout(pnlReporteLayout);
        pnlReporteLayout.setHorizontalGroup(
            pnlReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlReporteLayout.setVerticalGroup(
            pnlReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
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
        jLabel1.setText("Mes:");

        spnanio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        cbxmes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        cbxtipo.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        cbxtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anual", "Mensual" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Año:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(spnanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(btnBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbxmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLineal, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(spnanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbxmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLineal)
                            .addComponent(btnBarra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCirculo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCirculoActionPerformed
    /*//Agregando excepciones
    if (txtAn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Se necesita llenar el año para mostrar el gráfico",
                "Campos vacíos", JOptionPane.ERROR_MESSAGE);
        return;
        }
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
        pnlReporte.validate();*/
    grafico=1;
    tiporeporte();
    }//GEN-LAST:event_btnCirculoActionPerformed

    private void btnBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarraActionPerformed
    /*//Agregando excepciones
    if (txtAn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Se necesita llenar el año para mostrar el gráfico",
                "Campos vacíos", JOptionPane.ERROR_MESSAGE);
        return;
        }
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
        pnlReporte.validate();*/
    grafico=2;
    tiporeporte();
    }//GEN-LAST:event_btnBarraActionPerformed

    private void btnLinealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinealActionPerformed
    /*//Agregando excepciones
    if (txtAn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Se necesita llenar el año para mostrar el gráfico",
                "Campos vacíos", JOptionPane.ERROR_MESSAGE);
        return;
        }
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
        pnlReporte.validate();*/
    grafico=3;
    tiporeporte();

    }//GEN-LAST:event_btnLinealActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBarra;
    private javax.swing.JButton btnCirculo;
    private javax.swing.JButton btnLineal;
    private javax.swing.JComboBox<String> cbxmes;
    private javax.swing.JComboBox<String> cbxtipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlReporte;
    private javax.swing.JSpinner spnanio;
    // End of variables declaration//GEN-END:variables
}
