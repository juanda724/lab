package com.example.ConteoConcurrente;

import java.util.Hashtable;
import java.util.Map;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class ConteoConcurrente {
    private Hashtable<String, Integer> accessCounts = new Hashtable<>();

    // Incrementa el contador de accesos para un usuario de manera segura
    public void incrementarAcceso(String usuario) {
        accessCounts.compute(usuario, (k, v) -> (v == null) ? 1 : v + 1);
    }

    // Muestra el top 3 de usuarios con más accesos
    public List<Map.Entry<String, Integer>> obtenerTop3Usuarios() {
        return accessCounts.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .collect(Collectors.toList());
    }

    /*
     * Diferencia entre Hashtable y HashMap en concurrencia:
     * - Hashtable es sincronizado: todos sus métodos son thread-safe, permitiendo acceso concurrente seguro.
     * - HashMap NO es sincronizado: no es seguro para acceso concurrente sin sincronización externa.
     * Por eso, para escenarios concurrentes legados, Hashtable es preferido.
     */

    

}
