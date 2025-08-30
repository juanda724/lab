package com.example.DeshacerImg;

import java.util.Stack;

// Interfaz común para todas las operaciones
interface Operacion {
    void aplicar();
    void deshacer();
    String getNombre();
}

// Operación de rotar
class OperacionRotar implements Operacion {
    private String direccion;
    private int grados;
    
    public OperacionRotar(String direccion, int grados) {
        this.direccion = direccion;
        this.grados = grados;
    }
    
    @Override
    public void aplicar() {
        System.out.println("Aplicando rotación: " + direccion + " " + grados + "°");
    }
    
    @Override
    public void deshacer() {
        System.out.println("Deshaciendo rotación: " + direccion + " " + grados + "°");
    }
    
    @Override
    public String getNombre() {
        return "Rotar " + direccion + " " + grados + "°";
    }
}

// Operación de recortar
class OperacionRecortar implements Operacion {
    private int x, y, ancho, alto;
    
    public OperacionRecortar(int x, int y, int ancho, int alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }
    
    @Override
    public void aplicar() {
        System.out.println("Aplicando recorte: (" + x + "," + y + ") " + ancho + "x" + alto);
    }
    
    @Override
    public void deshacer() {
        System.out.println("Deshaciendo recorte: (" + x + "," + y + ") " + ancho + "x" + alto);
    }
    
    @Override
    public String getNombre() {
        return "Recortar (" + x + "," + y + ") " + ancho + "x" + alto;
    }
}

// Operación de brillo
class OperacionBrillo implements Operacion {
    private int nivel;
    
    public OperacionBrillo(int nivel) {
        this.nivel = nivel;
    }
    
    @Override
    public void aplicar() {
        System.out.println("Aplicando brillo: " + nivel + "%");
    }
    
    @Override
    public void deshacer() {
        System.out.println("Deshaciendo brillo: " + nivel + "%");
    }
    
    @Override
    public String getNombre() {
        return "Brillo " + nivel + "%";
    }
}

// Operación de contraste
class OperacionContraste implements Operacion {
    private int nivel;
    
    public OperacionContraste(int nivel) {
        this.nivel = nivel;
    }
    
    @Override
    public void aplicar() {
        System.out.println("Aplicando contraste: " + nivel + "%");
    }
    
    @Override
    public void deshacer() {
        System.out.println("Deshaciendo contraste: " + nivel + "%");
    }
    
    @Override
    public String getNombre() {
        return "Contraste " + nivel + "%";
    }
}

// Clase principal que maneja el historial
class EditorImagen {
    private Stack<Operacion> historial;
    
    public EditorImagen() {
        this.historial = new Stack<>();
    }
    
    // Aplicar una nueva operación
    public void aplicarOperacion(Operacion operacion) {
        operacion.aplicar();
        historial.push(operacion);
        System.out.println("✓ Operación agregada al historial: " + operacion.getNombre());
    }
    
    // Deshacer la última operación
    public void deshacer() {
        if (!historial.isEmpty()) {
            Operacion ultimaOperacion = historial.pop();
            ultimaOperacion.deshacer();
            System.out.println("✓ Operación deshecha: " + ultimaOperacion.getNombre());
        } else {
            System.out.println("✗ No hay operaciones para deshacer");
        }
    }
    
    // Mostrar el historial actual
    public void mostrarHistorial() {
        System.out.println("\n--- HISTORIAL ACTUAL (" + historial.size() + " operaciones) ---");
        if (historial.isEmpty()) {
            System.out.println("El historial está vacío");
        } else {
            for (int i = historial.size() - 1; i >= 0; i--) {
                System.out.println((historial.size() - i) + ". " + historial.get(i).getNombre());
            }
        }
        System.out.println("----------------------------------------\n");
    }
    
    // Obtener el tamaño del historial
    public int getTamañoHistorial() {
        return historial.size();
    }
}



