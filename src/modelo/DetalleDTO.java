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
public class DetalleDTO {
    private ProductoDTO producto; //object 
    // atributos cod_pro , descripcion, precioUnit ↑↑↑
    private String codigoVenta;
    private double importe;//cantidad*precio unitario
    private int cantidad;
    //super f
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    /**
     * @return the producto
     */
    private ProductoDTO getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    private void setProducto(ProductoDTO producto) {
        this.producto = producto;
    }

    public String getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
}
