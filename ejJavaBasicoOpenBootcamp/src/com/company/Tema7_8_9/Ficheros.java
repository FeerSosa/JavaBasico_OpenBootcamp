package com.company.Tema7_8_9;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Ficheros {

    public static void CopyFile(String fileIn, String fileOut) throws IOException {
        InputStream fichero = new FileInputStream(fileIn);
        byte[] datos = fichero.readAllBytes();
        fichero.close();
        PrintStream ficheroCopiado = new PrintStream(fileOut);
        ficheroCopiado.write(datos);
        ficheroCopiado.close();
    }
}
