package aplicheshon;

public class Cuatrimoto implements Vehiculoz, Gasolineriaaaaa {

    double velocidad = 0;
    int year;
    double gasolina;

    public Cuatrimoto(double velocidad, int year, double gasolina) {
        this.velocidad = velocidad;
        this.year = year;
        this.gasolina = gasolina;
    }

    public Cuatrimoto() {
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

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    @Override
    public double RecargarGasolina(double litros) {
        this.gasolina += litros;
        return this.gasolina;
    }

    @Override
    public double acelerar(double velocidad) {
        if(this.gasolina <= 0){
            System.out.println("Sin gasolina");
        }else{
           this.velocidad += velocidad; 
           this.gasolina -= 1;
        }
        
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
        System.out.println("Cuatrimoto");
        System.out.println("Anio: \t\t" + this.year);
        System.out.println("Gasolina: \t" + this.gasolina +"L");
        System.out.println("Velocidad: \t" + this.velocidad + "km/h");

    }
}
