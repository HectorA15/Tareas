
package aplicheshon;

public class Aplicheshon {

    public static void main(String[] args) {
        
        
        Cuatrimoto cuat = new Cuatrimoto();
        Monociclo mono = new Monociclo();
        
        
        cuat.setYear(2006);
        cuat.RecargarGasolina(50);
        cuat.acelerar(80);
        cuat.monitor();
        cuat.acelerar(50);
        cuat.monitor();
        cuat.frenar(30);
        cuat.monitor();
        
        System.out.println();
        
        mono.setYear(2020);
        mono.acelerar(30);
        mono.monitor();
        mono.frenar(2);
        mono.monitor();
        
    }
    
}
