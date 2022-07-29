package com.company;

public class Tema3Main {

    public static void main(String[] args) {
        String[] textos = {"Hola", "Javier", "Como", "Estas", "Vos", "?"};
        concatenar(textos);

    }

    public static void concatenar(String[] textos) {
        String conc = "";
        for (String text : textos){
            conc = conc+ " " + text;
        }
        System.out.println(conc);
    }
}
