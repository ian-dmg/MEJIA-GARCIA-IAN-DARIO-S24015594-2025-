import java.util.Scanner;
public class Comisiones {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double totalComision = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Ingresa el valor de la venta " + i + ":$");
            double venta = leer.nextDouble();
            double comision;

            if (venta <= 10000000) {
                comision = venta * 0.02;
            } else if (venta < 15000000) {
                comision = venta * 0.04;
            } else {
                comision = venta * 0.10;
            }

            totalComision += comision;
            System.out.println("Comisión por esta venta: $" + comision);
        }
        System.out.println("Comisión total del vendedor: $" + totalComision);
    }
}
