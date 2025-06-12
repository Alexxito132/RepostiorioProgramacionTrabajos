package org.example;

public class EmpleadoTiempoCompeto extends Empleado{
    private String beneficios;
    public EmpleadoTiempoCompeto(String id, String nombre, double salarioBase, String beneficios) {
        super(id, nombre, salarioBase);
        this.beneficios=beneficios;
    }

    @Override
    public double cacularSalario() {
        return getSalarioBase();
    }
}
