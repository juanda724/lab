package com.example.AccesoHuella;

public class Prueba {
    public static void main(String[] args) {
        AccesoHuella acceso = new AccesoHuella();
        System.out.println(acceso.registrarHuella("ID123")); 
        System.out.println(acceso.registrarHuella("ID123")); 
        System.out.println(acceso.registrarHuella("ID456")); 
        System.out.println("Cantidad de huellas registradas: " + acceso.cantidadHuellasRegistradas());
    }
}
