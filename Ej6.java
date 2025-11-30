import java.util.Scanner;
public class Ej6{
	public static void main(String[] args){
	Scanner dato=new Scanner(System.in);
		int i,repro=0,apro=0;
		float calificacion, promedio=0;
		System.out.println("Ingresa la calificacion de los estudiantes");
		for (i=0;i<=4;i++){
			System.out.print((i+1) +" : ");
			calificacion=dato.nextFloat();
			promedio+= calificacion;
			if(calificacion<6)
				repro+=1;
			else
				apro+=1;
		}
		promedio/=5;
		System.out.println("Aprobados: " + apro );
		System.out.println("Reprobados: " + repro);
		System.out.println("Promedio: " + promedio);
	}
}