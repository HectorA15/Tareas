package formulageneral;

import java.util.InputMismatchException;

public class Formula {

    double a;
    double b;
    double c;

    public Formula() {

    }

    public Formula(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void solucion() {

        double d = (b * b) - 4 * a * c;

        if (d > 0) {

            double X1 = (-b + Math.sqrt(d)) / (2 * a);
            double X2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Las soluciones son:");
            System.out.println("X1 = " + X1 + "\t X2 = " + X2);
        } else if (d == 0) {
            double X = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Solo hay una solucion: " + X);
        } else {
            System.out.println("No existen soluciones reales");
        }

    }

}
