package com.example.AgendaAcademica;


import java.time.LocalDate;
import java.util.*;



public class AgendaAcademica {

    private TreeMap<LocalDate, List<Actividad>> agenda = new TreeMap<>();

    // Agregar actividad en una fecha
    public void agregarActividad(LocalDate fecha, Actividad actividad) {
        agenda.computeIfAbsent(fecha, f -> new ArrayList<>()).add(actividad);
    }

    // Obtener la actividad más próxima a hoy
    public Map.Entry<LocalDate, List<Actividad>> proximaActividad() {
        LocalDate hoy = LocalDate.now();
        return agenda.ceilingEntry(hoy); // primera clave >= hoy
    }

    // Reporte entre dos fechas (inclusive)
    public SortedMap<LocalDate, List<Actividad>> reporte(LocalDate inicio, LocalDate fin) {
        return agenda.subMap(inicio, true, fin, true);
    }    
}
