package com.alura.screenmatch.main;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.setDuracionEnMinutos(180);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Avatar", 2023);
        otraPelicula.setDuracionEnMinutos(200);
        otraPelicula.evalua(6);
        var peliculaRene = new Pelicula("El señor de los anillos", 2001);
        peliculaRene.setDuracionEnMinutos(180);
        peliculaRene.evalua(10);
        Serie lost = new Serie("Lost", 2000);

        // tanto series, como peliculas son tipo Titulo
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaRene);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                //Pelicula pelicula = (Pelicula) item;
                //if esta esta esta asignacion
                System.out.println(pelicula.getClasificacion());
            }
        }
        // otra forma de listar con forEach
        lista.forEach(item -> System.out.println(item.toString()));
        // tercera forma de imprimir con forEach
        // utilizando el recurso conocido como Method Reference
        //lista.forEach(System.out::println);
        // ORDENANDO LISTAS
        ArrayList<String> listaArtistas=new ArrayList<>();
        listaArtistas.add("Jeniffer Alison");
        listaArtistas.add("Tom Cruise");
        listaArtistas.add("Angelina Jolie");
        listaArtistas.add("Scarlet Johansson");
        listaArtistas.add("Penelope Cruz");
        listaArtistas.add("Natalie Portman");
        System.out.println("Lista desordenada ");
        for (String listaArtista : listaArtistas) {
            System.out.println(" -->"+listaArtista);
        }
        Collections.sort(listaArtistas);
        System.out.println("Lista ordenada "+listaArtistas);

        // ordenar objectos
        Collections.sort(lista);
        System.out.println("Lista de titulos ordenada ");
        for (Titulo item : lista) {
            System.out.println(item.toString());
        }
    }
}
