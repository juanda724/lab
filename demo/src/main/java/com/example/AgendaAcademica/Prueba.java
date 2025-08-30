package com.example.AgendaAcademica;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

public class Prueba {

    public static void main(String[] args) {
        AgendaAcademica agenda = new AgendaAcademica();

        // Agregar actividades
        agenda.agregarActividad(LocalDate.of(2025, 9, 1), new Actividad("Examen", "Matemáticas"));
        agenda.agregarActividad(LocalDate.of(2025, 9, 5), new Actividad("Taller", "Programación en Java"));
        agenda.agregarActividad(LocalDate.of(2025, 9, 10), new Actividad("Presentación", "Proyecto de Física"));

        // Mostrar la próxima actividad
        Map.Entry<LocalDate, List<Actividad>> proxima = agenda.proximaActividad();
        if (proxima != null) {
            System.out.println("Próxima actividad (" + proxima.getKey() + "): " + proxima.getValue());
        } else {
            System.out.println("No hay actividades próximas.");
        }

        // Generar reporte entre fechas
        System.out.println("\nReporte entre 2025-09-01 y 2025-09-07:");
        SortedMap<LocalDate, List<Actividad>> reporte = agenda.reporte(
                LocalDate.of(2025, 9, 1), LocalDate.of(2025, 9, 7));
        reporte.forEach((fecha, actividades) -> 
            System.out.println(fecha + " -> " + actividades));
    }
    
}
