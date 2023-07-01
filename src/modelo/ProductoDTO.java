package modelo;

public class ProductoDTO {
    private String cod;
    private String categoria;
    private String descripcion;
    private double precioUnit;
    private Ubicacion ubicacion;
    private String proveedor;

    public double getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public void setProveedor(String proveedor) {
     this.proveedor = proveedor;
    }


    public Object getProveedor() {
      return proveedor;    
    }

}
    

    
