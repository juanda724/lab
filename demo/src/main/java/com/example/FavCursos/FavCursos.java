package com.example.FavCursos;

import java.util.LinkedHashSet;

public class FavCursos {
    public static void main(String[] args) {
        LinkedHashSet<Curso> favoritos = new LinkedHashSet<>();

        // Agregar cursos
        favoritos.add(new Curso("Matemáticas"));
        favoritos.add(new Curso("Historia"));
        favoritos.add(new Curso("Programación"));
        favoritos.add(new Curso("Física"));

        System.out.println("Favoritos iniciales:");
        for (Curso c : favoritos) {
            System.out.println(c);
        }

        // Intentar agregar duplicado
        favoritos.add(new Curso("Historia"));

        // Eliminar y volver a agregar
        favoritos.remove(new Curso("Matemáticas"));
        favoritos.add(new Curso("Matemáticas"));

        System.out.println("\nFavoritos tras eliminar y volver a agregar 'Matemáticas':");
        for (Curso c : favoritos) {
            System.out.println(c);
        }
    }
}
