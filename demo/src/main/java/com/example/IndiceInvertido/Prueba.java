package com.example.IndiceInvertido;

public class Prueba {
    public static void main(String[] args) {
        IndiceInvertido indice = new IndiceInvertido();

        indice.agregarOcurrencia("java", 1);
        indice.agregarOcurrencia("java", 3);
        indice.agregarOcurrencia("codigo", 2);
        indice.agregarOcurrencia("java", 2);
        indice.agregarOcurrencia("codigo", 5);

        System.out.println("Páginas para 'java': " + indice.consultarPaginas("java"));
        System.out.println("Páginas para 'codigo': " + indice.consultarPaginas("codigo"));
        System.out.println("Páginas para 'python': " + indice.consultarPaginas("python"));
    }
}
