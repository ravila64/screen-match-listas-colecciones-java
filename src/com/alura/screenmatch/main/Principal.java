package com.alura.screenmatch.main;

import com.alura.screenmatch.calculos.CalculadoraDeTiempo;
import com.alura.screenmatch.calculos.FiltroRecomendacion;
import com.alura.screenmatch.modelos.Episodio;
import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.setDuracionEnMinutos(180);
        //System.out.println("Duración de la película: " + miPelicula.getDuracionEnMinutos());

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8);
        miPelicula.evalua(5);
        miPelicula.evalua(10);
        //System.out.println("Total de evaluaciones: " + miPelicula.getTotalDeEvaluaciones());
        //System.out.println(miPelicula.calculaMediaEvaluaciones());


        Serie lost = new Serie("Lost", 2000);
        lost.muestraFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        //System.out.println("Duracion de la série: " + lost.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Avatar", 2023);
        otraPelicula.setDuracionEnMinutos(200);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluido(miPelicula);
        calculadora.incluido(otraPelicula);
        calculadora.incluido(lost);
        //System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtro = new FiltroRecomendacion();
        filtro.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizaciones(300);
        filtro.filtra(episodio);

        var peliculaRene = new Pelicula("El señor de los anillos", 2001);
        peliculaRene.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        listaPeliculas.add(peliculaRene);
        listaPeliculas.add(miPelicula);
        listaPeliculas.add(otraPelicula);
        System.out.println("Tamaño de la lista "+listaPeliculas.size());
        System.out.println("Primera pelicula "+listaPeliculas.get(0).getNombre());
        // lista todas las peliculas estando sobre escrito el metodo to string
        // lista direcciones memoria donde estan los objetos, sin estar el metodo toString()
        System.out.println(listaPeliculas.toString());
        // llamar al metodo toString de Pelciulas
        for (int i = 0; i < listaPeliculas.size(); i++) {
            System.out.println("metodo toString de "+listaPeliculas.get(i).toString());
        }
        // pasar un ArrayList a un Array, segun documentacion de java y LURI
        int elementosLista = listaPeliculas.size();
        Pelicula[] array = new Pelicula[elementosLista];
        array = listaPeliculas.toArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element "+(i+1)+" "+array[i].toString());
        }

        //clase Object
        Object obj = peliculaRene;
        System.out.println(obj.toString());

    }
}