package com.example.TarifaTramos;

import java.math.BigDecimal;
import java.util.TreeMap;
import java.util.Map;

public class Peaje {
    private TreeMap<Integer, BigDecimal> tarifas = new TreeMap<>();

    // Agrega un tramo de peso y su tarifa
    public void agregarTramo(int pesoMinimo, BigDecimal tarifa) {
        tarifas.put(pesoMinimo, tarifa);
    }

    // Devuelve la tarifa aplicable para un peso dado
    public BigDecimal obtenerTarifa(int pesoVehiculo) {
        Map.Entry<Integer, BigDecimal> entry = tarifas.floorEntry(pesoVehiculo);
        if (entry != null) {
            return entry.getValue();
        }
        return null;
    }
}
