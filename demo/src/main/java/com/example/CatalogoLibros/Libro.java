package com.example.CatalogoLibros;
import java.util.Comparator;

public class Libro implements Comparable<Libro> {
    
    public String titulo;
    public String autor;
    public int anioPublicacion;
    public String isbn;

    public Libro(String titulo, String autor, int anioPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public int compareTo(Libro o) {
        Libro otroLibro = (Libro) o;
        return this.anioPublicacion - otroLibro.anioPublicacion;
    }


}
