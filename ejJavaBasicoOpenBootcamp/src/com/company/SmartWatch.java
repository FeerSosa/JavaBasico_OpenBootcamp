package com.company;

public class SmartWatch extends SmartDevice{
    boolean appSalud;

    public SmartWatch() {

    }
    public SmartWatch(String color, String fabricante, String modelo,
                      String sistOperativo, Double peso, int bateria, boolean appSalud) {
        super(color, fabricante, modelo, sistOperativo, peso, bateria);
        this.appSalud = appSalud;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "appSalud=" + appSalud +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistOperativo='" + sistOperativo + '\'' +
                ", peso=" + peso +
                ", bateria=" + bateria +
                '}';
    }
}
