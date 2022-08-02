package com.company;

public class SmartPhone extends SmartDevice {
    String camara;

    public SmartPhone() {

    }

    public SmartPhone(String color, String fabricante, String modelo,
                      String sistOperativo, Double peso, int bateria, String camara) {
        super(color, fabricante, modelo, sistOperativo, peso, bateria);
        this.camara = camara;
    }


    @Override
    public String toString() {
        return "SmartPhone{" +
                "camara='" + camara + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistOperativo='" + sistOperativo + '\'' +
                ", peso=" + peso +
                ", bateria=" + bateria +
                '}';
    }
}
