package com.example.FacturaEscaneo;

public class Main{
    public static void main(String[] args) {
        var producto = new Producto("Detergente", 1200.00);
        var producto1 = new Producto("Arroz", 2500.00);
        var producto2 = new Producto("Maiz", 3000.00);

        FacturaEscaneo factura = new FacturaEscaneo();
        factura.agregarProducto(producto);
        factura.agregarProducto(producto1);
        factura.agregarProducto(producto2);
        factura.mostrarFactura();
        System.out.println("Subtotal: $" + factura.calcularSubTotal());
        System.out.println("Total: $" + factura.calcularTotal());




}

}