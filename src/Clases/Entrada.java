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
public class Entrada extends Proceso{
    
     private int cantidad_recibida;
     

    public Entrada(ArrayList<Producto> listaProductos) {
        this.listaProductos= listaProductos;
    }
   
    public int getCantidad_recibida() {
        return cantidad_recibida;
    }

    public void setCantidad_recibida(int cantidad_recibida) {
        this.cantidad_recibida = cantidad_recibida;
    }
    
    public String verificarEstado(){
        String estado;
        if (cantidad_solicitada<cantidad_recibida){
               estado="Exceso";
        }else if (cantidad_recibida==cantidad_solicitada ){
               estado="Conforme";
        }else{
               estado="Revisar";
        }
        return estado;
        //aplicar excepcion en el formulario !!!!!!!!!!!!!!!
        //else if(cantidad_recibida==0){
        //estado="No Llega";
    }
}
        
   


   

