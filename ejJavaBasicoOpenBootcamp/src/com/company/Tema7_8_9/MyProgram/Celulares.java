package com.company.Tema7_8_9.MyProgram;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Celulares implements Empresa{
    public String nombre;

    public String descripcion;

    public int cantEmpleados;

    public Map<Integer, Empleado> empleados;

    private Scanner scanner = new Scanner(System.in);

    public Celulares() {}

    public Celulares(String nombre, String descripcion, int cantEmpleados, Map<Integer, Empleado> empleados) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantEmpleados = cantEmpleados;
        this.empleados = empleados;
    }

    @Override
    public Map<Integer, Empleado> cargarEmp(int cantContratar, Map<Integer, Empleado> empleados) {

        for (int i = 0; i < cantContratar; i++) {

            Empleado empleado = new Empleado();

            System.out.println("=====EMPLEADOS=====");
            try {
                System.out.println("Nombre del empleado: ");
                empleado.nombre = scanner.nextLine();

                System.out.println("DNI del empleado: ");
                empleado.dni = scanner.nextInt();

                System.out.println("Edad del empleado: ");
                empleado.edad = scanner.nextShort();
                scanner.nextLine();// por el salto de linea que deja el scanner de un numero

                System.out.println("Genero del empleado: ");
                empleado.genero = scanner.nextLine();

                System.out.println("Profesion del empleado: ");
                empleado.profesion = scanner.nextLine();

                System.out.println("Salario del empleado: ");
                empleado.salario = scanner.nextDouble();
                scanner.nextLine();// por el salto de linea que deja el scanner de un numero
            }catch(InputMismatchException e) {
                System.out.println("Error al ingresar valor a un campo");
                scanner.nextLine();
            }
            empleados.put(empleado.dni, empleado);
        }
        return empleados;
    }

    @Override
    public Map<Integer, Empleado> eliminarEmp(int dniDespedido, Map<Integer, Empleado> empleados) {
        empleados.remove(dniDespedido);
        return empleados;
    }

    @Override
    public String toString() {
        return "--------------\nEmpresa " + nombre + "\n" +
                "  Descripcion: '" + descripcion + '\'' + "\n" +
                "  Cantidad de Empleados: " + cantEmpleados + "\n" +
                "  Lista de Empleados:" + mostrarEmpleados(empleados) +
                '}' + "--------------\n";
    }

    public String mostrarEmpleados(Map<Integer, Empleado> empleados) {
        String mostrar = "";
        for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
            mostrar = mostrar+ "\n" + entry.getKey() + ": " + entry.getValue();
        }
        return mostrar;
    }
}
