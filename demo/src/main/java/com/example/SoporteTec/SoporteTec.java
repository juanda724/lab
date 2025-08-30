package com.example.SoporteTec;

import java.time.LocalDateTime;
import java.util.PriorityQueue;

// Enum para representar severidad con un nivel asociado
enum Severidad {
    CRITICA(4),
    ALTA(3),
    MEDIA(2),
    BAJA(1);

    private final int nivel;

    Severidad(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }
}

class Ticket implements Comparable<Ticket> {
    private String descripcion;
    private Severidad severidad;
    private LocalDateTime fechaCreacion;

    public Ticket(String descripcion, Severidad severidad, LocalDateTime fechaCreacion) {
        this.descripcion = descripcion;
        this.severidad = severidad;
        this.fechaCreacion = fechaCreacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Severidad getSeveridad() {
        return severidad;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    @Override
    public int compareTo(Ticket otro) {
        int cmp = Integer.compare(otro.severidad.getNivel(), this.severidad.getNivel());
        if (cmp != 0) return cmp;

        return this.fechaCreacion.compareTo(otro.fechaCreacion);
    }

    @Override
    public String toString() {
        return "[" + severidad + "] " + descripcion + " (creado: " + fechaCreacion + ")";
    }
}
