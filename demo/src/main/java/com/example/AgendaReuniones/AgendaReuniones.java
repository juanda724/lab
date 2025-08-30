package com.example.AgendaReuniones;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.NavigableSet;
import java.util.TreeSet;

public class AgendaReuniones {
    private TreeSet<Reunion> reuniones = new TreeSet<>();

    public void agregarReunion(Reunion reunion) {
        reuniones.add(reunion);
    }

    public Reunion primeraReunion() {
        return reuniones.first();
    }

    public Reunion ultimaReunion() {
        return reuniones.last();
    }

    public NavigableSet<Reunion> reunionesEntreHoyYFinDeMes() {
        LocalDate hoy = LocalDate.now();
        LocalDate finMes = hoy.withDayOfMonth(hoy.lengthOfMonth());
        Reunion desde = new Reunion(LocalDateTime.of(hoy, LocalTime.MIN), "");
        Reunion hasta = new Reunion(LocalDateTime.of(finMes, LocalTime.MAX), "");
        return reuniones.subSet(desde, true, hasta, true);
    }

    
}
