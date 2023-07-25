/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author lesly
 */
public class Usuario {
    //Atributos
    private int codigoUsuario; //Se ingresa
    private int telefono; //Supongo que estará ingresado en la bdd
    private String nombreUsuario; //Supongo que estará ingresado en la bdd
    private String contraseña; //Se ingresa
    private String rol; //Supongo que estará ingresado en la bdd

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getRol() {
        return rol;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
       
}
