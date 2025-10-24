import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = leer.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        double absoluta = celsius + 273.15;

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Temperatura Absoluta : " + absoluta);
    }
}
