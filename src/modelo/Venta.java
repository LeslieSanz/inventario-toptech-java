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
    
    private String codigo;
    private String fecha;
    private double totalN; //se calcula
    private double impuestoIGV; //se calcula
    private double totalB; //se calcula
    
    public void calcularTotalBruto(ArrayList<DetalleDTO> listaDetalle){
        totalB=0;
        for(int i=0; i<listaDetalle.size(); i++){
            totalB=totalB + listaDetalle.get(i).getImporte();
        }
    }
    
    public void calcularIGV(){
        impuestoIGV=getTotalB()*0.18;
    }
    
    public void cacularTtotalNeto(){
        totalN=totalB-impuestoIGV;
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

    
}