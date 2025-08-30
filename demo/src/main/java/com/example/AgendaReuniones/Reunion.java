package com.example.AgendaReuniones;

import java.time.LocalDateTime;

public class Reunion implements Comparable<Reunion> {
    private LocalDateTime fechaHora;
    private String asunto;

    public Reunion(LocalDateTime fechaHora, String asunto) {
        this.fechaHora = fechaHora;
        this.asunto = asunto;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public String getAsunto() {
        return asunto;
    }

    @Override
    public int compareTo(Reunion otra) {
        return this.fechaHora.compareTo(otra.fechaHora);
    }

    @Override
    public String toString() {
        return "Reunion{" +
                "fechaHora=" + fechaHora +
                ", asunto='" + asunto + '\'' +
                '}';
    }
}
