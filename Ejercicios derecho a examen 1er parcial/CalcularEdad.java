import java.util.Scanner;
public class CalcularEdad {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa el año de nacimiento: ");
        int nacimiento = leer.nextInt();

        System.out.print("Ingresa el año actual: ");
        int actual = leer.nextInt();
        int edad = actual - nacimiento;

        System.out.println("Tienes: " + edad + " años");
    }
}
