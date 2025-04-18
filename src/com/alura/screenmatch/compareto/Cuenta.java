package com.alura.screenmatch.compareto;

public class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //getters y setters omitidos
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta "+getTitular()+" ,Saldo "+getSaldo()+"\n";
    }

   // @Override
    public int compareTo(Cuenta otra) {
        if (this.saldo < otra.saldo) {
            return 1;
        } else if (this.saldo > otra.saldo) {
            return -1;
        } else {
            return 0;
        }
    }
}
