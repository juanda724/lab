package com.example.PlanificadorImpresora;

public class Trabajo implements Comparable<Trabajo> {
    private String nombre;
    private int paginas;
    private long timestamp; // Para antigüedad

    public Trabajo(String nombre, int paginas, long timestamp) {
        this.nombre = nombre;
        this.paginas = paginas;
        this.timestamp = timestamp;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPaginas() {
        return paginas;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public int compareTo(Trabajo otro) {
        if (this.paginas != otro.paginas) {
            return Integer.compare(this.paginas, otro.paginas); // Menor primero
        }
        return Long.compare(this.timestamp, otro.timestamp); // Más antiguo primero
    }

    @Override
    public String toString() {
        return "Trabajo{" +
                "nombre='" + nombre + '\'' +
                ", paginas=" + paginas +
                ", timestamp=" + timestamp +
                '}';
    }
}
