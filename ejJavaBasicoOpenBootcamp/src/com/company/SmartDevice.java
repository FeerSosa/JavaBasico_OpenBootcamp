package com.company;

public abstract class SmartDevice {

    String color;
    String fabricante;
    String modelo;
    String sistOperativo;
    Double peso;
    int bateria;

    public abstract String toString();

    public SmartDevice(){};

    public SmartDevice(String color, String fabricante, String modelo, String sistOperativo, Double peso, int bateria) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.sistOperativo = sistOperativo;
        this.peso = peso;
        this.bateria = bateria;
    }
}
