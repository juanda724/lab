package com.example.Navegacion_adelante_atras;

import java.util.ArrayDeque;
import java.util.Deque;

public class NavegadorSimulado {
    public static void main(String[] args) {
        NavegadorWeb navegador = new NavegadorWeb();
        
        System.out.println("NAVEGADOR WEB SIMPLIFICADO \n");
        
        System.out.println("1. Visitando páginas iniciales...");
        navegador.visitarPagina("https://www.google.com");
        navegador.visitarPagina("https://www.github.com");
        navegador.visitarPagina("https://www.stackoverflow.com");
        
        System.out.println("2. Navegando hacia atrás...");
        navegador.irAtras();
        navegador.irAtras();
        
        System.out.println("3. Navegando hacia adelante...");
        navegador.irAdelante();
        
        System.out.println("4. Visitando nueva página (debe limpiar pila adelante)...");
        navegador.visitarPagina("https://www.reddit.com");
        
        System.out.println("5. Intentando navegar más allá de los límites...");
        navegador.irAdelante(); // No debería funcionar
        navegador.irAtras();
        navegador.irAtras();
        navegador.irAtras(); // Último que debería funcionar
        navegador.irAtras(); // Este no debería funcionar
        
        System.out.println("6. Navegación final...");
        navegador.irAdelante();
        navegador.irAdelante();
        
        System.out.println("=== SIMULACIÓN COMPLETADA ===");
        
        // Mostrar resumen final
        System.out.println("\nRESUMEN FINAL:");
        System.out.println("Página actual: " + navegador.getPaginaActual());
        System.out.println("Total en historial atrás: " + navegador.getTotalAtras());
        System.out.println("Total en historial adelante: " + navegador.getTotalAdelante());
    }
}
