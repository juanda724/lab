package com.example.CatalogoLibros;

public class PruebaLibros {
    public static void main(String[] args) {
        System.out.println("Bienvenido al catálogo de libros");

        AlmacenLibro almacen = new AlmacenLibro();

        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967, "978-3-16-148410-0");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605, "978-1-56619-909-4");
        Libro libro3 = new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", 2001, "978-0-7432-7356-5");

        almacen.agregarLibro(libro1);
        almacen.agregarLibro(libro2);
        almacen.agregarLibro(libro3);

        almacen.eliminarLibro("978-1-56619-909-4");

    for (Libro libro : almacen.libros) {
        System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", Año: " + libro.getAnioPublicacion() + ", ISBN: " + libro.getIsbn());
    }

    }
    
}
