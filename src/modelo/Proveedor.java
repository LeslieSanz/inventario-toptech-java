
package modelo;

public class Proveedor {
    private String codigoprov;
    private int telefono;
    private String nombreprov;
    private String direccion;

     public String getCodigoprov() {
        return codigoprov;
    }

    public void setCodigoprov(String codigoprov) {
        this.codigoprov = codigoprov;
    }
    
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombreprov() {
        return nombreprov;
    }

    public void setNombreprov(String nombreprov) {
        this.nombreprov = nombreprov;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }      
}
