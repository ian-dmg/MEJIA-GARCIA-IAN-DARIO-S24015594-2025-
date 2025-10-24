import java.util.Scanner;
public class Ecuacion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa el valor de A: ");
        double A = leer.nextDouble();

        System.out.print("Ingresa el valor de B: ");
        double B = leer.nextDouble();

        System.out.print("Ingresa el valor de C: ");
        double C = leer.nextDouble();

        if (A == 0) {
            System.out.println("Error: No es una ecuación cuadrática (A no puede ser 0).");
        } else {
            double valor = Math.pow(B, 2) - (4 * A * C);

            if (valor < 0) {
                System.out.println("Error: Las raíces son imaginarias.");
            } else {
                double x1 = (-B + Math.sqrt(valor)) / (2 * A);
                double x2 = (-B - Math.sqrt(valor)) / (2 * A);

                System.out.println("Las raíces reales son:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
