import java.util.Scanner;
public class Ej11{
	public static void main(String[] args){
	Scanner dato=new Scanner(System.in);
		int i, buscar;
		int numero[]= new int[9];
		System.out.println("Coloca 8 numeros");
		for(i=0;i<=7;i++){
			System.out.print((i) + ": ");
			numero[i]=dato.nextInt();
		}
		System.out.println ("Busca tu numero");
		buscar=dato.nextInt();
		if (buscar==numero[i])
			System.out.println("Si esta tu numero");
		else
			System.out.println("No esta tu numero");
	}
}