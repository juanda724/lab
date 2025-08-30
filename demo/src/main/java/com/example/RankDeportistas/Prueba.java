package com.example.RankDeportistas;

import java.util.Comparator;
import java.util.TreeSet;

public class Prueba {
    public static void main(String[] args) {
        Comparator<Deportista> rankingComparator = Comparator
            .comparingInt(Deportista::getPuntaje).reversed()
            .thenComparing(Deportista::getApellido);

        TreeSet<Deportista> ranking = new TreeSet<>(rankingComparator);

        ranking.add(new Deportista("Juan", "Pérez", 90));
        ranking.add(new Deportista("Ana", "García", 95));
        ranking.add(new Deportista("Luis", "Pérez", 90));
        ranking.add(new Deportista("Carlos", "Alonso", 95));
        ranking.add(new Deportista("Marta", "Zamora", 80));
        ranking.add(new Deportista("Lucía", "García", 95));
        ranking.add(new Deportista("Pedro", "Pérez", 90));
        ranking.add(new Deportista("Sofía", "Alonso", 95));
        ranking.add(new Deportista("Elena", "Martínez", 85));
        ranking.add(new Deportista("Jorge", "Martínez", 85));
        ranking.add(new Deportista("Raúl", "García", 95));
        ranking.add(new Deportista("Mario", "Pérez", 90));

        System.out.println("Top 10 Deportistas:");
        int count = 0;
        for (Deportista d : ranking) {
            if (count++ == 10) break;
            System.out.println(d);
        }
    }
}
