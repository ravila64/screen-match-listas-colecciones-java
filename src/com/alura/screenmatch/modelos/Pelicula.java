package com.alura.screenmatch.modelos;

import com.alura.screenmatch.calculos.Clasificable;

public class Pelicula extends Titulo implements Clasificable {
    private String director;

    // llama al constructor de la clase madre o padre
    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    @Override
    public int getClasificacion() {
        return (int) calculaMediaEvaluaciones() / 2;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "Nombre='" + getNombre() + '\'' +
                ", FechaDeLanzamiento=" + getFechaDeLanzamiento() +
                ", DuracionEnMinutos=" + getDuracionEnMinutos() +
                '}';
    }

}


