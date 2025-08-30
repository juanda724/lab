package com.example.AgendaReuniones;

import java.time.LocalDateTime;

public class Prueba {
    
    public static void main(String[] args) {
        AgendaReuniones agenda = new AgendaReuniones();

        // Agregar reuniones de prueba
        agenda.agregarReunion(new Reunion(LocalDateTime.now().plusDays(1).withHour(10), "Reunión de equipo"));
        agenda.agregarReunion(new Reunion(LocalDateTime.now().plusDays(3).withHour(15), "Revisión de proyecto"));
        agenda.agregarReunion(new Reunion(LocalDateTime.now().withHour(9), "Daily standup"));
        agenda.agregarReunion(new Reunion(LocalDateTime.now().plusMonths(1).withHour(11), "Planificación mensual"));

        // Mostrar la primera reunión
        Reunion primera = agenda.primeraReunion();
        System.out.println("Primera reunión: " + (primera != null ? primera : "No hay reuniones"));

        // Mostrar la última reunión
        Reunion ultima = agenda.ultimaReunion();
        System.out.println("Última reunión: " + (ultima != null ? ultima : "No hay reuniones"));

        // Mostrar reuniones entre hoy y fin de mes
        System.out.println("Reuniones entre hoy y fin de mes:");
        for (Reunion r : agenda.reunionesEntreHoyYFinDeMes()) {
            System.out.println(r);
        }
    }
}
