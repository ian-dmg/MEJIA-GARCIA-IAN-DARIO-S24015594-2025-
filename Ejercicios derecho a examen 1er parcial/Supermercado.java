import java.util.Scanner;
public class Supermercado {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa el total de la compra: $");
        double totalCompra = leer.nextDouble();

        System.out.print("Ingresa el número obtenido (0 a 100): ");
        int numero = leer.nextInt();
        double descuento;

        if (numero < 74) {
            descuento = totalCompra * 0.15;
        } else {
            descuento = totalCompra * 0.20;
        }

        double totalFinal = totalCompra - descuento;

        System.out.println("Número ingresado: " + numero);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);
    }
}
