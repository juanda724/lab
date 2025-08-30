package com.example.ListaReproduccion;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReproductorMusica {
    private LinkedList<Cancion> lista = new LinkedList<>();
    private ListIterator<Cancion> cursor = lista.listIterator();
    private int posicion = 0;

    public void agregarCancion(Cancion c) {
        lista.add(c);
        // Si es la primera canción, reiniciar el cursor
        if (lista.size() == 1) {
            cursor = lista.listIterator();
            posicion = 0;
        }
    }

    public String siguiente() {
    if (lista.isEmpty()) {
        return "No hay canciones en la lista.";
    }
    if (posicion < lista.size() - 1) {
        posicion++;
    }
    return lista.get(posicion).toString();
}

    public String anterior() {
        if (lista.isEmpty()) {
            return "No hay canciones en la lista.";
        }
        if (posicion > 0) {
            posicion--;
        }
        return lista.get(posicion).toString();
    }

    public void moverCancion(int desde, int hasta) {
        if (desde < 0 || desde >= lista.size() || hasta < 0 || hasta >= lista.size() || desde == hasta) return;
        Cancion c = lista.remove(desde);
        lista.add(hasta, c);
        // Reiniciar cursor para mantener la navegación consistente
        cursor = lista.listIterator(posicion);
    }

    public Cancion actual() {
        if (posicion >= 0 && posicion < lista.size()) {
            return lista.get(posicion);
        }
        return null;
    }

    public void mostrarLista() {
        int i = 0;
        for (Cancion c : lista) {
            System.out.println((i++) + ": " + c);
        }
    }
}
