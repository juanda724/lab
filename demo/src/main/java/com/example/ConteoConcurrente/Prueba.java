package com.example.ConteoConcurrente;

import java.util.List;
import java.util.Map;

public class Prueba {
    public static void main(String[] args) {
        ConteoConcurrente conteo = new ConteoConcurrente();

        // Simular accesos de usuarios
        conteo.incrementarAcceso("juan");
        conteo.incrementarAcceso("ana");
        conteo.incrementarAcceso("juan");
        conteo.incrementarAcceso("maria");
        conteo.incrementarAcceso("ana");
        conteo.incrementarAcceso("juan");
        conteo.incrementarAcceso("pedro");
        conteo.incrementarAcceso("ana");

        // Mostrar el top 3 de usuarios con más accesos
        List<Map.Entry<String, Integer>> topUsuarios = conteo.obtenerTop3Usuarios();
        System.out.println("Top 3 usuarios con más accesos:");
        for (Map.Entry<String, Integer> entry : topUsuarios) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
