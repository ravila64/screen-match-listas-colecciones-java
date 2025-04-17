package com.alura.screenmatch.referencias;

public class Main {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Avatar",2021);
        System.out.println(pelicula.toString());
        Pelicula otraPel = pelicula;
        otraPel.setFechaDeLanzamiento(2020);
        System.out.println("otraPel "+otraPel.toString());
        System.out.println("pelicula "+pelicula.toString());
    }
}
