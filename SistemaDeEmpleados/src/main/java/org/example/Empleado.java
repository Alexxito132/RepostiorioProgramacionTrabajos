package org.example;
public abstract class Empleado {
    private String id;
    private String nombre;
    private double salarioBase;

   public Empleado(String id, String nombre, double salarioBase){
       this.id = id;
       this.nombre = nombre;
       this.salarioBase = salarioBase;
   }
   public abstract double cacularSalario();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
}
