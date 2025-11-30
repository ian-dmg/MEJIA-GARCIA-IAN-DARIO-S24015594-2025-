import java.util.Scanner;
public class Ej14{
	public static void main(String[] args){
	Scanner dato= new Scanner(System.in);
		String nombres[]= new String[4];
		int sueldos[][]= new int[4][3];
		int totales[]= new int [4];
		int totpormes[]=new int[3];
		int i=0,mes=0, totalgeneral=0, idMax=0, estudiante=1;

		while(i<4){
			System.out.println("Nombre empleado" + (i+1) + " :  ");
			nombres[i]=dato.nextLine();
			i++;
		}

		i=0;
		int estudiantes=1;
		while(estudiante<=4){
			System.out.println("Registro de 3 meses para " + nombres[i] + " : ");
			mes=0;
			while(mes<3){
				System.out.println("   Mes  " + (mes+1) + " :  ");
				sueldos[i][mes]=dato.nextInt();
				totales[i]+= sueldos[i][mes];
				totpormes[mes]+=sueldos[i][mes];
				mes++;
			}
			estudiante++;
			i++;
		}
		for(int j=0;j<4;j++){
			System.out.println(nombres[j] + "  -> " + totales[j]);
			totalgeneral+=totales[j];
			if(totales[j]>totales[idMax]) idMax=j;
		}
		System.out.println("EMPLEADO                Mes1  Mes2  Mes3 Total");
		for(int j=0;j<4;j++){
			System.out.println(nombres[j] + "                     " + sueldos[j][0] + "     " + sueldos[j][1] + "     " + sueldos[j][2] + "     " + totales[j]);
		}
		System.out.println("");
		System.out.println("Total " + totpormes[0]+totpormes[1]+totpormes[2]+totalgeneral);
	dato.close();
	}
}
		