package com.example.CatalogoLibros;

import java.util.ArrayList;

public class PruebaLibros {
    public static void main(String[] args) {
        System.out.println("Bienvenido al catálogo de libros");

        AlmacenLibro almacen = new AlmacenLibro();

        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967, "978-3-16-148410-0");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605, "978-1-56619-909-4");
        Libro libro3 = new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", 2001, "978-0-7432-7356-5");
        Libro libro4 = new Libro("El Amor en los Tiempos del Cólera", "Gabriel García Márquez", 1985, "978-0-06-112241-5");
        Libro libro5 = new Libro("1984", "George Orwell", 1949, "978-0-452-28423-4");
        
    
        
        

        almacen.agregarLibro(libro1);
        almacen.agregarLibro(libro2);
        almacen.agregarLibro(libro3);
        almacen.agregarLibro(libro4);
        almacen.agregarLibro(libro5);

        System.out.println("Buscando libros por autor...");

        
        ArrayList<Libro> librosDeGabriel = almacen.buscarLibro("Gabriel García Márquez");
        
        System.out.println("Libros de Gabriel García Márquez:");  

        for (Libro libro : librosDeGabriel) {
        System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", Año: " + libro.getAnioPublicacion() + ", ISBN: " + libro.getIsbn());

        }

        System.out.println("Obteniendo libros más recientes...");

        almacen.obtenerLibrosAscendente();
        for(Libro libro : almacen.libros){
            System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", Año: " + libro.getAnioPublicacion() + ", ISBN: " + libro.getIsbn());
        }

        System.out.println("Los 5 libros más recientes son:");
        almacen.obtenerCincoRecientes();

        System.out.println("Eliminando libro por ISBN...");

        almacen.eliminarLibro("978-1-56619-909-4");

        System.out.println("Libros restantes en el catálogo:");
        for(Libro libro : almacen.libros){
            System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", Año: " + libro.getAnioPublicacion() + ", ISBN: " + libro.getIsbn());
        }

        
    }

}
