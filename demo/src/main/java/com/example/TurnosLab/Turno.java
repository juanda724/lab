package com.example.TurnosLab;

import java.util.LinkedList;



public class Turno {
    private LinkedList<String> cola = new LinkedList<>();

    public void agregarTurno(String nombre) {
        cola.addLast(nombre);
    }

    public void agregarTurnoPreferencial(String nombre) {
        cola.addFirst(nombre);
    }

    public String siguienteTurno() {
        return cola.pollFirst();
    }

    public boolean hayTurnos() {
        return !cola.isEmpty();
    }

    public int cantidadTurnos() {
        return cola.size();
    }

    


}
