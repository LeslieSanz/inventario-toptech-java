/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author lesly
 * // Luis^2 y Esther
 */
public class Venta {
    //Atributos
    private String codigo;
    private String fecha;
    private double totalN; //se calcula
    private double impuestoIGV; //se calcula
    private double totalB; //se calcula
    
    private int cantidad;
    private double total;
    private int mes;
    public String Lmes(){
        String vec[]={"","Ene","Feb","Mar","Abr","May","Jun",
            "Jul","Ago","Set","Oct","Nov","Dic"};
        return vec[getMes()];
    }
    
    public void calcularTotalNeto(ArrayList<DetalleDTO> listaDetalle){
        totalN=0;
        for(int i=0; i<listaDetalle.size(); i++){
            totalN=totalN + listaDetalle.get(i).getImporte();
        }
    }
    public void calcularIGV(){
        impuestoIGV=Math.round((getTotalN()*18/118)*100)/100.0;  //calculando el 18% del totalN
    }
    
    public void cacularTotalBruto(){
        totalB=Math.round((totalN-impuestoIGV)*100)/100.0;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    

    public double getImpuestoIGV() {
        return impuestoIGV;
    }

    public void setImpuestoIGV(double impuestoIGV) {
        this.impuestoIGV = impuestoIGV;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the totalN
     */
    public double getTotalN() {
        return totalN;
    }

    /**
     * @param totalN the totalN to set
     */
    public void setTotalN(double totalN) {
        this.totalN = totalN;
    }

    /**
     * @return the totalB
     */
    public double getTotalB() {
        return totalB;
    }

    /**
     * @param totalB the totalB to set
     */
    public void setTotalB(double totalB) {
        this.totalB = totalB;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    
}