package com.example.AgendaAcademica;

public class Actividad {

    private String nombre;
    private String descripcion;

    public Actividad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return nombre + " - " + descripcion;
    }
    
}
