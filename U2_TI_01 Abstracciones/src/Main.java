import java.awt.*;

import Figuras.TrianguloEquilatero;
import Figuras.TrianguloEscaleno;
import Figuras.TrianguloIsoceles;
import Figuras.TrianguloRectangulo;
import FigureAbs.FigureAbs;
public class Main {
    public static void main(String[] args) {
        FigureAbs ti = new TrianguloIsoceles(5, 8, 12, 8 );
        FigureAbs te = new TrianguloEscaleno(5, 10, 8, 5, 6);
        FigureAbs teq = new TrianguloEquilatero(6, 10, 6);
        FigureAbs tr = new TrianguloRectangulo(8, 12, 16);
        FigureAbs[] figuras = {ti, te, teq, tr};

        for(FigureAbs FigureAbs: figuras){
            System.out.println("La clase es: " + FigureAbs.getClass().getSimpleName());
            System.out.println("El area es: " + FigureAbs.getArea());
            System.out.println("El perimetro es: " + FigureAbs.getPerimetro());
            System.out.println("------------------------------------------------");

        }
        System.out.println("Jaime Alejandro Rodriguez reyes" +
                "");
    }
}