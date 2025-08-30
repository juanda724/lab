package com.example.TarifaTramos;

import java.math.BigDecimal;

public class Prueba {
    public static void main(String[] args) {
        Peaje peaje = new Peaje();
        peaje.agregarTramo(0, new BigDecimal("100.00"));     // hasta 999kg
        peaje.agregarTramo(1000, new BigDecimal("150.00"));  // 1000kg a 1999kg
        peaje.agregarTramo(2000, new BigDecimal("200.00"));  // 2000kg a 2999kg
        peaje.agregarTramo(3000, new BigDecimal("300.00"));  // 3000kg o más

        int[] pesos = {800, 1500, 2500, 3500};
        for (int peso : pesos) {
            System.out.println("Peso: " + peso + "kg - Tarifa: $" + peaje.obtenerTarifa(peso));
        }
    }
}
