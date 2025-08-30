package com.example.PlanificadorImpresora;

import java.util.PriorityQueue;

public class Prueba {
    public static void main(String[] args) throws InterruptedException {
        PriorityQueue<Trabajo> cola = new PriorityQueue<>();

        // Simular envío de trabajos con timestamps distintos
        cola.add(new Trabajo("Informe", 10, System.currentTimeMillis()));
        Thread.sleep(10);
        cola.add(new Trabajo("Factura", 5, System.currentTimeMillis()));
        Thread.sleep(10);
        cola.add(new Trabajo("Presentación", 5, System.currentTimeMillis()));
        Thread.sleep(10);
        cola.add(new Trabajo("Manual", 20, System.currentTimeMillis()));

        System.out.println("Atendiendo trabajos en orden óptimo:");
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}
