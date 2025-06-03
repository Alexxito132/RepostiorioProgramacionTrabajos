package Figuras;

import FigureAbs.FigureAbs;

public class TrianguloRectangulo extends FigureAbs {
    private double base;
    private double altura;
    private double hipotenusa;

    public TrianguloRectangulo(double base, double altura, double hipotenusa){
        this.base = base;
        this.altura = altura;
        this.hipotenusa = hipotenusa;
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

    public double getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    @Override
    public double getArea(){
        return (base*altura)/2;
    }
    @Override
    public double getPerimetro(){
        return base + altura + hipotenusa;
    }
}
