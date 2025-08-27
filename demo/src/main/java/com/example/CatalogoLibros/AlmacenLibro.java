package com.example.CatalogoLibros;

import java.util.ArrayList;
import java.util.Collections;

public class AlmacenLibro {

    public ArrayList<Libro> libros;

    public AlmacenLibro() {
        this.libros = new ArrayList<>();
    }
    

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(String isbn) {
        
        for (int i = libros.size() - 1 ; i >= 0 ; i--) {
            if (libros.get(i).getIsbn().equals(isbn)) {
                libros.remove(i);
                break;
            }
        }
    }

    public ArrayList<Libro> buscarLibro(String autor) {
        ArrayList<Libro> encontrados = new ArrayList<>();
        for(int i = libros.size() - 1 ; i >= 0 ; i--) {
            if (libros.get(i).getAutor().equals(autor)) {
                encontrados.add(libros.get(i));
            }
        }
        return encontrados;
    }     

    public void obtenerLibrosAscendente(){
       Collections.sort(this.libros);

        
    }

     public ArrayList<Libro> obtenerCincoRecientes() {
        obtenerLibrosAscendente();
        ArrayList<Libro> recientes = new ArrayList<>();
        int total = this.libros.size();
        for (int i = total - 1; i >= Math.max(0, total - 5); i--) {
            Libro libro = this.libros.get(i);
            recientes.add(libro);
            System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", Año: " + libro.getAnioPublicacion() + ", ISBN: " + libro.getIsbn());
        }
        return recientes;
    }


}
