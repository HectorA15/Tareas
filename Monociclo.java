package aplicheshon;

public class Monociclo implements Vehiculoz {

    double velocidad = 0;
    int year;

    public Monociclo(double velocidad, int year) {
        this.velocidad = velocidad;
        this.year = year;
    }

    public Monociclo() {
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    @Override
    public double acelerar(double velocidad) {
        this.velocidad += velocidad;
        return this.velocidad;
    }
    
    @Override
    public double frenar(double velocidad) {
        this.velocidad -= velocidad;
        return this.velocidad;
    }

    @Override
    public void monitor() {
        System.out.println("-----------------------------------------");
        System.out.println("Monociclo");
        System.out.println("Anio: \t\t" + this.year);
        System.out.println("Velocidad: \t" + this.velocidad + "km/h");

    }
}
