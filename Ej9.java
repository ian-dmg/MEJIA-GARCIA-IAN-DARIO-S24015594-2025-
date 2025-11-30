import java.util.Scanner;
public class Ej9{
	public static void main(String[] args){
	Scanner dato=new Scanner(System.in);
		float calificacion[]=new float[6];
		float suma=0;
		int i=0, j=0;
		System.out.println("CAPTURAR CALIFICACIONES");
		while(i<6){
			System.out.println("Alumno " + (i+1));
			System.out.print("Calificacion: ");
			calificacion[i]=dato.nextFloat();
			suma+=calificacion[i];
			i++;
		}
		float promedio=suma/6;
		System.out.println("");
		System.out.println("PROMEDIO");
		System.out.println("Promedio = " + promedio);
		System.out.println("CALIFICACIONES INDIVIDUALES");
		while(j<6){
			System.out.println("Estudiante " + (j+1));
			System.out.println(calificacion[j]);
			j++;
		}
	}
}