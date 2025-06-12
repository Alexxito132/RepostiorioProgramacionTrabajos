package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado TiempoCompleto = new EmpleadoTiempoCompeto("A123","Alex", 34, "Seguro");
        Empleado EmpleadoPorHoras = new EmpleadoPorHoras("B123","Victor",100, 8);
        System.out.println("El salario de "+ TiempoCompleto.getNombre() + " es de: " + TiempoCompleto.cacularSalario());
        System.out.println("El salario de "+ EmpleadoPorHoras.getNombre() + " es de: " + EmpleadoPorHoras.cacularSalario());
    }

}