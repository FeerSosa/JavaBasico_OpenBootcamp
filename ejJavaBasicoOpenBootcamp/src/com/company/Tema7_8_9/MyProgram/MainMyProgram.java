package com.company.Tema7_8_9.MyProgram;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainMyProgram {

    public static void main(String[] args) {
        Map<Integer, Empleado> empleados1 = new HashMap<>();
        Map<Integer, Empleado> empleados2 = new HashMap<>();
        ArrayList<Celulares> empresasCelulares = new ArrayList<Celulares>();
        Celulares apple = new Celulares(
                "Apple",
                "Nuestros dispositivos tienen el sistema operativo IOS",
                2,
                empleados1
        );
        Celulares samsung = new Celulares(
                "Samsung",
                "Nuestros dispositivos tienen el sistema operativo Android",
                3,
                empleados2
        );

        empleados1 = cargarEmpleados(apple, empleados1);

        empleados2 = cargarEmpleados(samsung, empleados2);

        empresasCelulares.add(apple);
        empresasCelulares.add(samsung);
        try{
            PrintStream out = new PrintStream("RegistroEmpresas.txt");
            for (Celulares empre : empresasCelulares) {
                out.print(empre);
            }
        } catch(FileNotFoundException e){
            System.out.println("Error con el archivo: " + e.getMessage());
        }

    }
    public static Map<Integer, Empleado> cargarEmpleados(Celulares empresaCelulares, Map<Integer, Empleado> empleados) {
        empresaCelulares.cargarEmp(empresaCelulares.cantEmpleados, empleados);
        return empleados;
    }
}
