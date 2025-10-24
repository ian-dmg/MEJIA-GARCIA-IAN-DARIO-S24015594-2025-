import java.util.Scanner;
public class NumeroParNon {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = leer.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es PAR.");
        } else {
            System.out.println("El número " + numero + " es NON (Impar).");
        }
    }
}
