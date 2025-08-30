package com.example.TurnosLab;

public class Prueba {
    public static void main(String[] args) {
        Turno turnos = new Turno();

        // Agregar turnos normales
        turnos.agregarTurno("Juan");
        turnos.agregarTurno("Ana");

        // Agregar turnos preferenciales
        turnos.agregarTurnoPreferencial("Carlos");
        turnos.agregarTurnoPreferencial("Maria");

        System.out.println("Cantidad de turnos: " + turnos.cantidadTurnos());

        while (turnos.hayTurnos()) {
            System.out.println("Siguiente turno: " + turnos.siguienteTurno());
        }

        System.out.println("¿Hay turnos? " + turnos.hayTurnos());
    }
}
