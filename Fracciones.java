package fracciones;

import java.util.Scanner;

public class Fracciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Numerador: ");  int numerador = sc.nextInt();
            System.out.print("Denominador: "); int denominador = sc.nextInt();

            int cociente = numerador / denominador;
            int residuo = numerador % denominador;

            System.out.println("Cociente: " + cociente);
            System.out.println("Residuo: " + residuo);
        } catch (ArithmeticException e) {
            System.out.println("Error: el denominador no puede ser igual a 0");
            System.out.println(e.getMessage());
        }

    }

}
