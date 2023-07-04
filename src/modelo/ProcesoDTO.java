/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class ProcesoDTO {
    //Atributos
    protected String fecha; 
    protected int cantidad_solicitada; 
    protected String estadoConfirmacion; //Estado para la clase Entrada: se aprueba si la cantidad
    //solicitada es igual a la cantidad recibida y Confirmacion para la clase Salida
    protected ProductoDTO producto; //Para acceder al codigo y descripcion de producto
    
    //Getters y setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad_solicitada() {
        return cantidad_solicitada;
    }

    public void setCantidad_solicitada(int cantidad_solicitada) {
        this.cantidad_solicitada = cantidad_solicitada;
    }

    public String getEstadoConfirmacion() {
        return estadoConfirmacion;
    }

    public void setEstadoConfirmacion(String estadoConfirmacion) {
        this.estadoConfirmacion = estadoConfirmacion;
    }

    public ProductoDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDTO producto) {
        this.producto = producto;
    }   
}
