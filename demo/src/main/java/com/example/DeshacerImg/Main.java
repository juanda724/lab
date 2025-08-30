package com.example.DeshacerImg;

public class Main {
    public static void main(String[] args) {
        EditorImagen editor = new EditorImagen();
        
        System.out.println("=== SIMULACIÓN DE EDITOR DE IMAGEN ===\n");
        
        // Aplicar una secuencia de operaciones
        System.out.println("Aplicando operaciones...");
        editor.aplicarOperacion(new OperacionRotar("derecha", 90));
        editor.aplicarOperacion(new OperacionBrillo(20));
        editor.aplicarOperacion(new OperacionRecortar(10, 10, 200, 200));
        editor.aplicarOperacion(new OperacionContraste(15));
        editor.aplicarOperacion(new OperacionRotar("izquierda", 45));
        
        System.out.println("\nEstado inicial:");
        editor.mostrarHistorial();
        
        System.out.println("Realizando 3 operaciones UNDO...\n");
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("UNDO #" + i + ":");
            editor.deshacer();
            System.out.println("Operaciones restantes: " + editor.getTamañoHistorial());
            System.out.println();
        }
        
        System.out.println("Estado final después de 3 UNDO:");
        editor.mostrarHistorial();
        
        System.out.println("=== SIMULACIÓN COMPLETADA ===");
    }
}
