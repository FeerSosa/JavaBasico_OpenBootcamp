package com.company.Tema7_8_9.MyProgram;

import java.util.Map;

public interface Empresa {

    Map<Integer, Empleado> cargarEmp(int cantContratar, Map<Integer, Empleado> empleados);

    Map<Integer, Empleado> eliminarEmp(int dniDespedido, Map<Integer, Empleado> empleados);
}
