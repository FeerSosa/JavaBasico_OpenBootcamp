package com.company;

public class Tema4Main {

    public static void main(String[] args) {
        // SmartPhone
        SmartPhone smartPhone1 = new SmartPhone("Gris","Samsung", "Galaxy S22", "Android", 168.0, 3700, "50MP");
        SmartPhone smartPhone2 = new SmartPhone();
        smartPhone2.color = "Rojo";
        smartPhone2.fabricante = "Samsung";
        smartPhone2.modelo = "Galaxy A30";
        smartPhone2.sistOperativo = "Android";
        smartPhone2.peso = 153.5;
        smartPhone2.bateria = 3500;
        smartPhone2.camara = "16MP";

        // SmartWatch
        SmartWatch smartWatch1 = new SmartWatch("Negro", "Xiaomi", "ZL02D", "Android", 24.0, 3000, true);
        SmartWatch smartWatch2 = new SmartWatch();
        smartWatch2.color = "Rojo";
        smartWatch2.fabricante = "Apple";
        smartWatch2.modelo = "302M";
        smartWatch2.sistOperativo = "IOS";
        smartWatch2.peso = 26.2;
        smartWatch2.bateria = 2300;
        smartWatch2.appSalud = false;

        System.out.println("Celular 1");
        System.out.println(smartPhone1.toString());
        System.out.println("Celular 2");
        System.out.println(smartPhone2.toString());
        System.out.println("Reloj 1");
        System.out.println(smartWatch1.toString());
        System.out.println("Reloj 2");
        System.out.println(smartWatch2.toString());
    }
}
