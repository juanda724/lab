package com.example.IndiceInvertido;

import java.util.HashMap;
import java.util.TreeSet;
import java.util.Set;



public class IndiceInvertido {
    
    private HashMap<String, TreeSet<Integer>> indice = new HashMap<>();

    public void agregarOcurrencia(String palabra, int pagina) {
        indice.computeIfAbsent(palabra, k -> new TreeSet<>()).add(pagina);
    }

    public Set<Integer> consultarPaginas(String palabra) {
        return indice.getOrDefault(palabra, new TreeSet<>());
    }

    
}
