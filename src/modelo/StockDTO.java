package modelo;


public class StockDTO {
    private Producto producto;
    private Entrada entrada;
    private Salida salida;
    private int stock;
    
    public int calcularStock(){
        setStock(entrada.getCantidad_recibida()-salida.getCantidad_solicitada());
        return getStock();
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    public Salida getSalida() {
        return salida;
    }

    public void setSalida(Salida salida) {
        this.salida = salida;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
