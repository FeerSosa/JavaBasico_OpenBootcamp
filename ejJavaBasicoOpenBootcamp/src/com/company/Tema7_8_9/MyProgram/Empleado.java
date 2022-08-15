package com.company.Tema7_8_9.MyProgram;

public class Empleado {

    public String nombre;
    public int dni;
    public short edad;
    public String genero;
    public String profesion;

    public double salario;

    public Empleado(){};

    public Empleado(String nombre, int dni, short edad, String genero, String profesion, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.genero = genero;
        this.profesion = profesion;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Informacion{ " +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", profesion='" + profesion + '\'' +
                ", salario=" + salario +
                '}';
    }
}
