/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author lesly
 */
public class Venta {
    private String fecha;
    private double total; //se calcula
    private double impuestoIGV; //se calcula
    private double descuento; //se calcula

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double importeTotal) {
        this.total = importeTotal;
    }

    public double getImpuestoIGV() {
        return impuestoIGV;
    }

    public void setImpuestoIGV(double impuestoIGV) {
        this.impuestoIGV = impuestoIGV;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}