
package modelo;

public class Usuario {
    //comentario de prueba para ver si funciona el commit desde una rama local
    private int codigoUsuario; //Se ingresa
    private int telefono; //Supongo que estará ingresado en la bdd
    private String nombreUsuario; //Supongo que estará ingresado en la bdd
    private String contraseña; //Se ingresa
    private String rol; //Supongo que estará ingresado en la bdd
    public String Nombres; //Se ingresa

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

    public  String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }
       
}
