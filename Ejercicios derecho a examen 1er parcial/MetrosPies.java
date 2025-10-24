import java.util.Scanner;

public class MetrosPies {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa la cantidad en metros: ");
        double metros = leer.nextDouble();
        double pies = metros * 3.28084;

        System.out.println("Conversión:");
        System.out.println("Pies: " + pies);
    }
}
