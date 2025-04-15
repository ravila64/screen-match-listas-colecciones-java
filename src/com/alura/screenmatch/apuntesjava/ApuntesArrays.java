package com.alura.screenmatch.apuntesjava;

//import com.alura.screenmatch.modelos.Pelicula;

public class ApuntesArrays {
    public static void main(String[] args) {
        // definicion de variables ocn java
        var num = 10;  // int
        var cad = "Cadena";  // String
        var pi = 3.1416; // double
        var esta = true; // boolean

        // definicion de arrays
        int[] numeros = new int[5];  // arreglo de 5 numeros enteros
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            System.out.println(numeros[i]);
        }

        Pelicula1[] peliculas= new Pelicula1[2];

        var pelicula1 = new Pelicula1("Avatar",2009, "Juan");
        var pelicula2 = new Pelicula1("El señor de los anillos", 2001, "Maria");
        peliculas[0] = pelicula1;
        peliculas[1] = pelicula2;
        System.out.println("Pelicula[0] "+peliculas[0].getNombre()+" Año "+peliculas[0].getAnio()+" Director "+peliculas[0].getDirector());
        System.out.println("Pelicula[1] "+peliculas[1].getNombre()+" Año "+peliculas[1].getAnio()+" Director "+peliculas[1].getDirector());
    }

}
