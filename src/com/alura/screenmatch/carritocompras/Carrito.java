package com.alura.screenmatch.carritocompras;
// import java.util.ArrayList;

import java.util.ArrayList;

public class Carrito {
    ArrayList<Producto> productos = new ArrayList<>();
    public void agregarProducto(Producto producto) {
        if (productos.size() < 10) {
            productos.add(producto);
        } else {
            System.out.println("Carrito lleno!");
        }
    }

    public void listarProductos(){
        for (int i = 0; i < productos.size(); i++) {
            System.out.println("Items "+productos.get(i).toString());
        }
    }
}
