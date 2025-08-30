package com.example.FacturaEscaneo;

import java.util.LinkedHashMap;

public class FacturaEscaneo {

private LinkedHashMap<String, Producto> productos;
private static final double IVA = 0.19;
       
public FacturaEscaneo() {
    productos = new LinkedHashMap<>();
}

public void agregarProducto(Producto producto) {  
    productos.put(producto.nombre(), producto);
}

public void mostrarFactura() {
    productos.values().forEach(producto -> System.out.println(producto.nombre() + ": $" + producto.precio())); 
}

public double calcularSubTotal() {
    return productos.values().stream().mapToDouble(Producto::precio).sum();
}

public double calcularTotal(){
    return calcularSubTotal() * (1 + IVA);
}
}