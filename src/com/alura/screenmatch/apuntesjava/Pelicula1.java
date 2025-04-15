package com.alura.screenmatch.apuntesjava;

public class Pelicula1 extends Titulo1 {
    private String director;

    public Pelicula1(String nombre, int anio, String director) {
        super(nombre, anio); // Llamada al constructor de Titulo
        this.director = director;
    }

    // Getters y setters (si los necesitas)
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


}