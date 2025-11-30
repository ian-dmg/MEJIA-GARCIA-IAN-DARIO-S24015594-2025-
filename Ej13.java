import java.util.Scanner;
public class Ej13{
	public static void main(String[] args){
	Scanner dato=new Scanner(System.in);
		int alumno[][];
		alumno=new int[3][4];
		int j=1,nivel, idioma;
		System.out.println("Niveles");
		System.out.println("0.-Basico");
		System.out.println("1.-Intermedio");
		System.out.println("2.-Perfeccionamiento");
		System.out.println("Idiomas");
		System.out.println("0.-Ingles");
		System.out.println("1.-Frances");
		System.out.println("2.-Aleman");
		System.out.println("3.-Ruso");
		
		do{
			System.out.println("Nivel del estudiante " + j + " : ");
			nivel=dato.nextInt();
			System.out.println("Idioma");
			idioma=dato.nextInt();
			alumno[nivel][idioma]++;
			j++;
		}while (j<=12);
		System.out.println("Resultados finales (filas=niveles y columnas=idiomas)");
		for (int k=0;k<3;k++){
			for(int o=0;o<4;o++){
				System.out.print(alumno[k][o] + "  ");
			}
			System.out.println();
		}
	}
}