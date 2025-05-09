package appfiguras;

public class Trapecio extends Figuras {

    double b1;
    double b2;
    double h;
    double L;

    public Trapecio(double b1, double b2, double h, double L) {
        this.b1 = b1;
        this.b2 = b2;
        this.h = h;
        this.L = L;
    }

    public Trapecio() {
    }

    public double getB1() {
        return b1;
    }

    public void setB1(double b1) {
        this.b1 = b1;
    }

    public double getB2() {
        return b2;
    }

    public void setB2(double b2) {
        this.b2 = b2;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getL() {
        return L;
    }

    public void setL(double L) {
        this.L = L;
    }
    
    
    
    
    @Override
    public double area() {
        return ((b1 * b2) / 2) * h;
    }

    public double area(double b1, double b2, double h) {
        return ((b1 * b2) / 2) * h;
    }

    @Override
    public double perimetro() {
        return (b1 + b2 + L + L);
    }

    public double perimetro(double b1, double b2, double L) {
        return (b1 + b2 + L + L);
    }

}
