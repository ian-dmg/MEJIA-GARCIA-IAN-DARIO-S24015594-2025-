import java.util.Scanner;
public class Pulsaciones {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = leer.nextInt();
        double pulsaciones = (220 - edad) / 10.0;
        System.out.println("Número de pulsaciones por cada 10 segundos: " + pulsaciones);
    }
}
