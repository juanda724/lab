package com.example.RankDeportistas;

public class Deportista {
    private String apellido;
    private String nombre;
    private int puntaje;

    public Deportista(String nombre, String apellido, int puntaje) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puntaje = puntaje;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (" + puntaje + ")";
    }
}
