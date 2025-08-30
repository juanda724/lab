package com.example.DepuracionCorreos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class DepuracionCorreos {

    public static void main(String[] args) {
        Set<String> correos = new HashSet<>();
        correos.add("juan@gmail.com");
        correos.add("ana@vetado.com");
        correos.add("luis@hotmail.com");
        correos.add("maria@vetado.com");
        correos.add("carlos@yahoo.com");

        Set<String> dominiosVetados = new HashSet<>();
        dominiosVetados.add("vetado.com");

        System.out.println("Tamaño antes: " + correos.size());

        Iterator<String> it = correos.iterator();
        while (it.hasNext()) {
            String correo = it.next();
            String dominio = correo.substring(correo.indexOf('@') + 1);
            if (dominiosVetados.contains(dominio)) {
                it.remove();
            }
        }

        System.out.println("Tamaño después: " + correos.size());
        System.out.println("Correos restantes: " + correos);
    }
}
