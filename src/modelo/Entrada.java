/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Random;


/**
 *
 * @author lesly
 */
public class Entrada extends ProcesoDTO{
    //Atributo
     private int cantidad_recibida;
     
    public int getCantidad_recibida() {
        return cantidad_recibida;
    }

    public void setCantidad_recibida(int cantidad_recibida) {
        this.cantidad_recibida = cantidad_recibida;
    }
    
    public String verificarEstado(){
        String estado;
        if (getCantidad_solicitada()<cantidad_recibida){
               estado="Exceso";
        }else if (cantidad_recibida==getCantidad_solicitada() ){
               estado="Conforme";
        }else{
               estado="Revisar";
        }
        return estado;
        
    } 
}
        
   


   

