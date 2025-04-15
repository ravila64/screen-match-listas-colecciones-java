package com.alura.screenmatch.carritocompras;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var producto = new Producto();
        producto.setCodigo(1000);
        producto.setNombreProducto("Arroz");
        producto.setPrecio(3500);
        Carrito carro = new Carrito();
        carro.agregarProducto(producto);
        producto = new Producto(2000,"Chocolate",15000);
        carro.agregarProducto(producto);
        carro.listarProductos();
    }
}
