package modelo;

import java.util.ArrayList;


public class StockDTO {
    private ProductoDTO producto;
    private ArrayList<Entrada> entradas;
    private ArrayList<Salida> salidas;
    private int stock;

    public StockDTO(ProductoDTO producto) {
        this.producto = producto;
        this.entradas = new ArrayList<>();
        this.salidas = new ArrayList<>();
        this.stock = 0;
    }
    
    public void agregarEntrada(Entrada entrada) {
    entradas.add(entrada);
    }

    public void agregarSalida(Salida salida) {
    salidas.add(salida);
    }
    
    public int calcularStock() {
        int totalEntradas = 0;
        for (int i = 0; i < entradas.size(); i++) {
            Entrada entrada = entradas.get(i);
            totalEntradas = totalEntradas + entrada.getCantidad_recibida();
        }
        
        int totalSalidas = 0;
        for (int i = 0; i < salidas.size(); i++) {
            Salida salida = salidas.get(i);
            totalEntradas = totalEntradas - salida.getCantidad_solicitada();
        }
        //Calculo del stock de un producto
        stock = totalEntradas - totalSalidas;
        return stock;
    }
    
    
    //Getters y setters
    public ProductoDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDTO producto) {
        this.producto = producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(ArrayList<Entrada> entradas) {
        this.entradas = entradas;
    }

    public ArrayList<Salida> getSalidas() {
        return salidas;
    }

    public void setSalidas(ArrayList<Salida> salidas) {
        this.salidas = salidas;
    }  
}
