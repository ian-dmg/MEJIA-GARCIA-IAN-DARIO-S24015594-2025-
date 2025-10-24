import java.util.Scanner;
public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = leer.nextInt();

        if (numero <= 1) {
            System.out.println("El número " + numero + " NO es primo.");
        } else {
            boolean esPrimo = true;

            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println("El número " + numero + " SÍ es primo.");
            } else {
                System.out.println("El número " + numero + " NO es primo.");
            }
        }
    }
}
