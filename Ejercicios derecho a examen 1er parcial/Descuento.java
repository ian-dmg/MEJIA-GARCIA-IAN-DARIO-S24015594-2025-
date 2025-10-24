import java.util.Scanner;
public class Descuento {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa el total de la compra: $");
        double totalCompra = leer.nextDouble();
        double descuento = totalCompra * 0.15;
        double totalFinal = totalCompra - descuento;

        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Total a pagar: $" + totalFinal);
    }
}
