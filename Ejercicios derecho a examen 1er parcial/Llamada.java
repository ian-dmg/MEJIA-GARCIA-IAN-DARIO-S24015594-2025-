import java.util.Scanner;
public class Llamada {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa la duración de la llamada en minutos: ");
        int minutos = leer.nextInt();
        double costo;

        if (minutos <= 3) {
            costo = 10.0;
        } else {
            costo = 10.0 + (minutos - 3) * 1.0;
        }
        System.out.println("El costo total de la llamada es: $" + costo);
    }
}
