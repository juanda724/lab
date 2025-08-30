package com.example.ProcesamientoLotes;

import java.util.Deque;
import java.util.ArrayDeque;


public class ProcesadorTareas {
    public static void main(String[] args) {
        Deque<Lote> cola = new ArrayDeque<>();

        // Añadimos lotes normales al final
        cola.addLast(new Lote("Lote 1"));
        cola.addLast(new Lote("Lote 2"));
        cola.addLast(new Lote("Lote 3"));

        // Inyectamos un lote urgente al inicio
        cola.addFirst(new Lote("Lote Urgente"));

        // Otro lote normal
        cola.addLast(new Lote("Lote 4"));

        System.out.println("Orden de ejecución de los lotes:");
        while (!cola.isEmpty()) {
            Lote lote = cola.removeFirst(); // siempre tomamos del inicio
            System.out.println("Ejecutando: " + lote.getNombre());
        }
    }
}