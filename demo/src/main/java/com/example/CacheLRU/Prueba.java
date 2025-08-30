package com.example.CacheLRU;

public class Prueba {
    public static void main(String[] args) {
            CacheLRU<Integer, String> lruCache = new CacheLRU<>(3);

            lruCache.put(1, "A");
            lruCache.put(2, "B");
            lruCache.put(3, "C");

            System.out.println("Cache inicial: " + lruCache.cache);

            lruCache.get(1); // Accede a la clave 1 para marcarla como recientemente usada
            lruCache.put(4, "D"); // Esto debería eliminar la clave 2

            System.out.println("Cache después de acceder a 1 y agregar 4: " + lruCache.cache);

            System.out.println("¿Contiene la clave 2? " + lruCache.containsKey(2));
            System.out.println("¿Contiene la clave 3? " + lruCache.containsKey(3));
            System.out.println("Tamaño del cache: " + lruCache.size());
        }
}
