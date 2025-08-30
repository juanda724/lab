package com.example.InventarioCodigo;

public class Prueba {
    public static void main(String[] args) {
        Ferreteria ferreteria = new Ferreteria();

        ferreteria.agregarProducto(new Producto("A01", "Martillo", 120.0, 10));
        ferreteria.agregarProducto(new Producto("B02", "Destornillador", 50.0, 0));
        ferreteria.agregarProducto(new Producto("C03", "Clavos", 10.0, 100));

        System.out.println("Precio de Martillo: " + ferreteria.consultarPrecio("A01"));

        ferreteria.actualizarStock("A01", 5);

        System.out.println("Productos faltantes:");
        for (Producto p : ferreteria.listarFaltantes()) {
            System.out.println(p);
        }
    }
}
