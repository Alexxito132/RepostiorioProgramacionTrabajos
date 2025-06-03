package Figuras;

import FigureAbs.FigureAbs;

public class TrianguloIsoceles extends FigureAbs {
    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;

    public TrianguloIsoceles (double base, double altura, double ladoA, double ladoB){
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    @Override
    public double getArea(){
        return (base * altura)/2;
    }

    @Override
    public double getPerimetro(){
        return (ladoA*2) + ladoB;
    }
}
