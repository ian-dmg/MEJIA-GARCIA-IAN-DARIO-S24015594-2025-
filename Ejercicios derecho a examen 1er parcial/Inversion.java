import java.util.Scanner;
public class Inversion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa el capital a invertir: $");
        double capital = leer.nextDouble();
        double ganancia = capital * 0.02;
        double totalFinal = capital + ganancia;

        System.out.println("Ganancia después de un mes: $" + ganancia);
        System.out.println("Total después de un mes: $" + totalFinal);
    }
}
