package com.alura.screenmatch.compareto;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cuenta> cuentas= new ArrayList<>();
        cuentas.add(new Cuenta("Ana",125000));
        cuentas.add(new Cuenta ("Hector",10000));
        cuentas.add(new Cuenta("Beatriz", 385000));
        cuentas.add(new Cuenta("Luis",185000));
        cuentas.add(new Cuenta("Rene",400000));
        //cuentas.sort(Comparator.comparing(Cuenta::getSaldo));
        cuentas.sort(Comparator.comparing(Cuenta::getSaldo).reversed());
        System.out.println("lista cuentas descendente por Saldo ");
        //System.out.println(cuentas.toString());
        System.out.println("numero de cuentas :"+cuentas.size());
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta.getTitular() + ": " + cuenta.getSaldo());
        }
    }
}
