package com.example.ListaReproduccion;

public class Prueba {
    public static void main(String[] args) {
        ReproductorMusica rep = new ReproductorMusica();
        rep.agregarCancion(new Cancion("Imagine", "John Lennon"));
        rep.agregarCancion(new Cancion("Bohemian Rhapsody", "Queen"));
        rep.agregarCancion(new Cancion("Billie Jean", "Michael Jackson"));
        rep.agregarCancion(new Cancion("Hey Jude", "The Beatles"));

        System.out.println("Lista inicial:");
        rep.mostrarLista();

        System.out.println("\nReproduciendo siguiente: " + rep.siguiente());
        System.out.println("Reproduciendo siguiente: " + rep.siguiente());
        System.out.println("Reproduciendo anterior: " + rep.anterior());

        System.out.println("\nMover 'Hey Jude' (índice 3) a posición 1:");
        rep.moverCancion(3, 1);
        rep.mostrarLista();
    }




}
