package com.company.Tema7_8_9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main7_8_9 {

    public static void main(String[] args) {
        System.out.println("----Funcion Reverse----");
        String word = "by Fernando Sosa";
        System.out.println(reverse(word));

        System.out.println("----Array de Strings----");
        String[] arrStrings = {"Esto", "Es", "Un", "array", "de", "Strings"};
        for (String str : arrStrings) {
            System.out.println(str);
        }

        System.out.println("----Array Bidimensional De Enteros----");
        int[][] arrNums =
                {
                {52,27,86,54},
                {20,13,100,12,24}
                };
        for (int i = 0; i < arrNums.length; i++) {
            for (int j = 0; j < arrNums[i].length; j++) {
                System.out.println("Posicion: (" + i + "," + j + ")" + " Valor: " + arrNums[i][j]);
            }
        }
        /*
        * 4. El problema que generaria tener un vector con la capacidad por default es que si queremos
        * agregar 1000 elementos cada vez que sobrepasemos la capacidad por defecto se va a estar creando
        * un vector nuevo y copiando cada uno de los elementos del vector original al nuevo vector con
        * mayor capacidad y eliminando el anterior, tambien hay que tener en cuenta que en el momento
        * de la copia de un vector a otro la memoria contiene 2 vectores con elementos duplicados,
        * esto se va a repetir cada vez que pasemos la capacidad.
        * Esas acciones son muy costosas y peor aun teniendo muchos elementos.
        */
        System.out.println("----Vector de Strings----");
        Vector<String> vecStrings = new Vector<String>(5);
        vecStrings.add("Esto");
        vecStrings.add("Es");
        vecStrings.add("Un");
        vecStrings.add("Vector");
        vecStrings.add("Strings");
        // Remover el segundo y el tercer elemento es relativo, ya que en este caso tengo en cuenta
        // que la posicion con la que comienza es 0 asique eliminar el segundo elemento va a eliminar
        // al tercero y eliminar al tercero va a eliminar al cuarto
        vecStrings.remove(2);
        vecStrings.remove(3);
        System.out.println(vecStrings.toString());

        System.out.println("----ArrayList y LinkedList----");
        ArrayList<String> arrListStrings = new ArrayList<String>();
        arrListStrings.add("Esto");
        arrListStrings.add("Es");
        arrListStrings.add("Un");
        arrListStrings.add("ArrayList y LinkedList");

        LinkedList<String> linkListStrings = new LinkedList<String>(arrListStrings);

        for (String str : linkListStrings) {
            System.out.println(str);
        }
        for (String str : arrListStrings) {
            System.out.println(str);
        }

        System.out.println("----ArrayList de Enteros----");
        ArrayList<Integer> arrListNums = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            arrListNums.add(i, i+1);
        }
        System.out.println(arrListNums);

        for (int i = 0; i < arrListNums.size(); i++) {
            if (!(arrListNums.get(i) % 2 == 0)) {
                System.out.println(arrListNums.get(i));
            } else{
                arrListNums.remove(i);
                i--;
            }
        }
        try{
            dividePorCero(5);
        }catch(ArithmeticException e){
            System.out.println("Esto no puede hacerce");
        }finally {
            System.out.println("Demo del codigo");
        }

        try {
            copyFile("/etc/passwd", "destino.txt");
        } catch (IOException e) {
            System.out.println("Error en el archivo: " + e.getMessage());
        }



    }

    public static String reverse(String cadena) {

        String reverso = "";

        for (int i = cadena.length() - 1; i >= 0 ; i--) {
            reverso += String.valueOf(cadena.charAt(i));
        }
        return reverso;
    }

    public static void dividePorCero(int num) throws ArithmeticException {
        int divideCero;
        divideCero = num / 0;
        if (divideCero == num / 0) {
            throw new ArithmeticException ("Se esta dividiendo por cero");
        }
    }

    public static void copyFile(String fileIn, String fileOut) throws IOException {
        InputStream fichero = new FileInputStream(fileIn);
        byte[] datos = fichero.readAllBytes();
        fichero.close();
        PrintStream ficheroCopiado = new PrintStream(fileOut);
        ficheroCopiado.write(datos);
        ficheroCopiado.close();
    }
}


