package com.alura.screenmatch.carritocompras;

public class Producto {
    private int codigo;
    private String nombreProducto;
    private double precio;

    // constructor

    public Producto() {
    }

    public Producto(int codigo, String nombreProducto, double precio) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precio=" + precio +
                '}';
    }
}
