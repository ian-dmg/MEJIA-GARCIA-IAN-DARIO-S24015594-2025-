import java.util.Scanner;
public class Ej15{
	public static void main(String[] args){
	Scanner dato=new Scanner(System.in);
		String[] pais = new String[4];
		double[][] temp=new double[4][3];
		double[] media= new double[4];
		System.out.println("Introdue los paises");
		for(int i=0;i<4;i++){
			System.out.print("Pais "+(i+1) + " : ");
			pais[i]=dato.nextLine();
		}
		for(int i=0;i<4;i++){
			System.out.println("Temperaturas del trimestre para " + pais[i] + " : ");
			double suma=0;
			for(int j=0;j<3;j++){
				System.out.print(" Mes " + (j+1) + " : ");
				temp[i][j]=dato.nextDouble();
				suma+=temp[i][j];
			}
			media[i]=suma/3;
		}
		System.out.println("\nMedias Trimestrales");
		int mos=0;
		for(int i=0;i<4;i++){
			System.out.printf("%-15s->%.2f\n",pais[i],media[i]);
			if(media[i]>media[mos]) mos=i;
		}
	dato.close();
	}
}