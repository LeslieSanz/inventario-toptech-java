/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author lesly
 */
public class Proceso {
    //Atributos
    protected String fecha; //Ingresar
    protected int cantidad_solicitada; //Ingresar
    protected String estadoConfirmacion; //Estado para la clase Entrada: se aprueba si la cantidad
    //solicitada es igual a la cantidad recibida y Confirmacion para la clase Salida
    protected ArrayList<Producto> listaProductos; //Almacena objetos de la clase productos
    private String codPro; //Almacena el codigo del producto
    private String desPro; //Almacena la descripcion del producto
    
   
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
    
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    public String getCodPro() {
        return codPro;
    }

    public void setCodPro(String codPro) {
        this.codPro = codPro;
    }

    public String getDesPro() {
        return desPro;
    }

    public void setDesPro(String desPro) {
        this.desPro = desPro;
    }
    
    
}
