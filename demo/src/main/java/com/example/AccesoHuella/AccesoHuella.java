package com.example.AccesoHuella;

import java.util.HashSet;



public class AccesoHuella {
    
    private HashSet<String> huellas = new HashSet<>();

    public boolean registrarHuella(String id) {
        return huellas.add(id);
    }

    public int cantidadHuellasRegistradas() {
        return huellas.size();
    }


}
