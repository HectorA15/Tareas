package formulageneral;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FormulaGeneral {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int A = 0;
            int B = 0;
            int C = 0;

            System.out.println("----------------------Calculador de la Formula General----------------------");

            System.out.print("Ingresa el valor de A:\t");
            A = sc.nextInt();

            System.out.print("Ingresa el valor de B:\t");
            B = sc.nextInt();

            System.out.print("Ingresa el valor de C:\t");
            C = sc.nextInt();

            System.out.println();

            Formula FGen = new Formula(A, B, C);

            FGen.solucion();
        } catch (InputMismatchException e) {
            System.out.println("Solo se aceptan numeros enteros");
            System.out.println(e.getMessage());
        }

    }
}
