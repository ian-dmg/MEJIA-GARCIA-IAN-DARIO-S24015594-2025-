import java.util.Scanner;
public class Pago {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa la categoría del empleado (1 a 4): ");
        int categoria = leer.nextInt();

        System.out.print("Ingresa las horas trabajadas en el mes: ");
        int horas = leer.nextInt();
        int valorHora = 0;

        switch (categoria) {
            case 1:
                valorHora = 20000;
                break;
            case 2:
                valorHora = 15000;
                break;
            case 3:
                valorHora = 10000;
                break;
            case 4:
                valorHora = 7500;
                break;
            default:
                System.out.println("Categoría inválida.");
                return;
        }

        int salarioBruto = valorHora * horas;
        double descuentoSalud = salarioBruto * 0.072;
        double salarioConDescuento = salarioBruto - descuentoSalud;

        if (salarioBruto < 1000000) {
            double subsidio = salarioBruto * 0.15;
            salarioConDescuento += subsidio;
        }

        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Descuento de salud: $" + descuentoSalud);
        System.out.println("Salario final a pagar: $" + salarioConDescuento);
    }
}
