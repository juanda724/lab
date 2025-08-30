package com.example.Navegacion_adelante_atras;

import java.util.ArrayDeque;
import java.util.Deque;

class NavegadorWeb {
    private Deque<String> pilaAtras;
    private Deque<String> pilaAdelante;
    private String paginaActual;
    
    public NavegadorWeb() {
        this.pilaAtras = new ArrayDeque<>();
        this.pilaAdelante = new ArrayDeque<>();
        this.paginaActual = null;
    }
    
    // Visitar una nueva página
    public void visitarPagina(String url) {
        System.out.println("Visitando: " + url);
        
        if (paginaActual != null) {
            // Guardar la página actual en el historial atrás
            pilaAtras.push(paginaActual);
        }
        
        // Limpiar la pila adelante (como hacen los navegadores reales)
        pilaAdelante.clear();
        
        paginaActual = url;
        mostrarEstado();
    }
    
    // Ir a la página anterior
    public void irAtras() {
        if (pilaAtras.isEmpty()) {
            System.out.println("No hay páginas anteriores");
            return;
        }
        
        System.out.println("Yendo hacia atrás...");
        
        // Guardar la página actual en adelante
        if (paginaActual != null) {
            pilaAdelante.push(paginaActual);
        }
        
        // Obtener la página anterior
        paginaActual = pilaAtras.pop();
        System.out.println("Página actual: " + paginaActual);
        mostrarEstado();
    }
    
    // Ir a la página siguiente
    public void irAdelante() {
        if (pilaAdelante.isEmpty()) {
            System.out.println("No hay páginas siguientes");
            return;
        }
        
        System.out.println("Yendo hacia adelante...");
        
        // Guardar la página actual en atrás
        if (paginaActual != null) {
            pilaAtras.push(paginaActual);
        }
        
        // Obtener la página siguiente
        paginaActual = pilaAdelante.pop();
        System.out.println("Página actual: " + paginaActual);
        mostrarEstado();
    }
    
    // Mostrar el estado actual del navegador
    public void mostrarEstado() {
        System.out.println("ESTADO:");
        System.out.println("Página actual: " + (paginaActual != null ? paginaActual : "Ninguna"));
        System.out.println("Historial atrás: " + pilaAtras);
        System.out.println("Historial adelante: " + pilaAdelante);
        System.out.println();
    }
    
    // Métodos para obtener información
    public String getPaginaActual() {
        return paginaActual;
    }
    
    public int getTotalAtras() {
        return pilaAtras.size();
    }
    
    public int getTotalAdelante() {
        return pilaAdelante.size();
    }
    
    // Limpiar todo el historial
    public void limpiarHistorial() {
        pilaAtras.clear();
        pilaAdelante.clear();
        paginaActual = null;
        System.out.println("Historial limpiado");
    }
}
