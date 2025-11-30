import java.util.Scanner;

class Ej17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidad = 4;

        String[] nombres = new String[cantidad];
        String[] apellidos = new String[cantidad];
        String[] pruebas = new String[cantidad];
        double[] tiempos = new double[cantidad];

        System.out.println("Registro de Atletas");

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nAtleta " + (i + 1));
            System.out.print("Nombre: ");
            nombres[i] = sc.next();
            System.out.print("Apellido: ");
            apellidos[i] = sc.next();
            System.out.print("Prueba: ");
            pruebas[i] = sc.next();
            System.out.print("Tiempo: ");
            tiempos[i] = sc.nextDouble();
        }
        System.out.println("\n--- Datos Registrados ---");

        int mejor = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nAtleta #" + (i + 1));
            System.out.println("Nombre: " + nombres[i]);
            System.out.println("Apellido: " + apellidos[i]);
            System.out.println("Prueba: " + pruebas[i]);
            System.out.println("Tiempo: " + tiempos[i]);

            if (tiempos[i] < tiempos[mejor]) {
                mejor = i;
            }
        }

        System.out.println("\nEl mejor tiempo es de:");
        System.out.println(nombres[mejor] + " " + apellidos[mejor] + " con " + tiempos[mejor]);

        sc.close();
    }
}

