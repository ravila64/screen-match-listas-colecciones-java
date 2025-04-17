package com.alura.screenmatch.claseheredada;

public class Alumno extends Persona{
    private int matricula;
    private String curso;

    public Alumno(String nombre, int edad) {
        super(nombre, edad);
    }

    public Alumno(String nombre, int edad, int matricula, String curso) {
        super(nombre,edad);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Alumno {" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", matricula "+getMatricula()+
                ", curso "+getCurso()+
                '}';
    }
}
