package com.alura.screenmatch.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        //Creando un objeto de la clase HashMap que implementa la interface Map
        Map<String, Integer> usandoHashMap = new HashMap<>();

        // Agregando pares clave-valor
        usandoHashMap.put("Gatos", 10);
        usandoHashMap.put("Perros", 20);
        usandoHashMap.put("Ratones", 30);

        // Accediendo un valor usando una clave
        int valor = usandoHashMap.get("Ratones");
        System.out.println("Valor de la clave Ratones: " + valor);

        // Eliminando un par clave-valor
        usandoHashMap.remove("Ratones");
        // inserto otro
        usandoHashMap.put("Arañas",40);

        // Iterando sobre las claves
        for (String clave : usandoHashMap.keySet()) {
            System.out.println("Clave: " + clave);
            System.out.println("Valor: " + usandoHashMap.get(clave));
        }
        // inserto otro
        usandoHashMap.put("Serpientes",50);
        System.out.println("Map "+usandoHashMap);
    }
}
