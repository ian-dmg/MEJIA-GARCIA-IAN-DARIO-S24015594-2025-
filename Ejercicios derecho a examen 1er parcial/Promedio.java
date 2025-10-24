import java.util.Scanner;
public class Promedio{	
	public static void main(String[]args){
	Scanner leer = new Scanner(System.in);
	
		System.out.print("Ingresa la calificación de la materia 1: ");
		double m1 = leer.nextDouble();
		
		System.out.print("Ingresa la calificación de la materia 2: ");
		double m2 = leer.nextDouble();
		
		System.out.print("Ingresa la calificación de la materia 3: ");
		double m3 = leer.nextDouble();
			double promedio = (m1 + m2 + m3) / 3;
		System.out.println("El promedio general es: " + promedio);

	}
}