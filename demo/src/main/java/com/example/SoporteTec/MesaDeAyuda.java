package com.example.SoporteTec;

import java.time.LocalDateTime;
import java.util.PriorityQueue;


public class MesaDeAyuda {
    public static void main(String[] args) {
        PriorityQueue<Ticket> cola = new PriorityQueue<>();

        cola.add(new Ticket("Servidor caído", Severidad.CRITICA, LocalDateTime.now().minusHours(5)));
        cola.add(new Ticket("Error en login", Severidad.ALTA, LocalDateTime.now().minusHours(3)));
        cola.add(new Ticket("Consulta de usuario", Severidad.BAJA, LocalDateTime.now().minusDays(1)));
        cola.add(new Ticket("Fallo en reporte", Severidad.ALTA, LocalDateTime.now().minusHours(10)));
        cola.add(new Ticket("Notificación duplicada", Severidad.MEDIA, LocalDateTime.now().minusHours(2)));

        System.out.println("Orden de atención de tickets:");
        while (!cola.isEmpty()) {
            System.out.println("Atendiendo: " + cola.poll());
        }
    }
}