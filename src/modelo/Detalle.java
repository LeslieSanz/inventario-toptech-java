/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author lesly
 * // Luis^2 y Esther
 */
public class Detalle {
    private Producto producto; //object
    private int cantidad;
    private double subtotal;
    //super f , cod.pro, descripcion, precio, cant , importe, String codventa
    
    public void calcularSubtotal(){
        subtotal=cantidad*producto.getPrecioUnit();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the producto
     */
    private Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    private void setProducto(Producto producto) {
        this.producto = producto;
    }
    
}
