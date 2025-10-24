import java.util.Scanner;
public class Hospital {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa el presupuesto total del hospital: $");
        double presupuesto = leer.nextDouble();

        double ginecologia = presupuesto * 0.40;
        double traumatologia = presupuesto * 0.30;
        double pediatria = presupuesto * 0.30;

        System.out.println("Distribución del presupuesto:");
        System.out.println("Ginecología: $" + ginecologia);
        System.out.println("Traumatología: $" + traumatologia);
        System.out.println("Pediatría: $" + pediatria);
    }
}
