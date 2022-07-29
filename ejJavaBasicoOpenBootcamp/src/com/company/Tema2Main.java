package com.company;

public class Tema2Main {

    public static void main(String[] args) {
        double precio = 14.33;
        System.out.println("Precio: " + precioTotal(precio));
    }

    public static double precioTotal(double precio){
        double iva = 0.21;
        double precioIva = precio * iva;
        return precioIva + precio;
    }
}
