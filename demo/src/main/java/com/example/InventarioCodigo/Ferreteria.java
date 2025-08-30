package com.example.InventarioCodigo;

import java.util.*;

public class Ferreteria {
    private HashMap<String, Producto> productos = new HashMap<>();

    // Agregar producto
    public void agregarProducto(Producto producto) {
        productos.put(producto.getCodigo(), producto);
    }

    // Actualizar stock por código
    public void actualizarStock(String codigo, int nuevoStock) {
        Producto p = productos.get(codigo);
        if (p != null) {
            p.setStock(nuevoStock);
        }
    }

    // Consultar precio por código
    public Double consultarPrecio(String codigo) {
        Producto p = productos.get(codigo);
        return (p != null) ? p.getPrecio() : null;
    }

    // Listar productos faltantes (stock = 0)
    public List<Producto> listarFaltantes() {
        List<Producto> faltantes = new ArrayList<>();
        for (Producto p : productos.values()) {
            if (p.getStock() == 0) {
                faltantes.add(p);
            }
        }
        return faltantes;
    }
}
