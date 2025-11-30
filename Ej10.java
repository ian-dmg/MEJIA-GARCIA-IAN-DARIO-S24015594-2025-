import java.util.Scanner;
public class Ej10{
	public static void main(String[] args){
	Scanner dato=new Scanner(System.in);
		int numero[]=new int[10];
		int i=0;
		while(i<10){
			System.out.println("Escriba los numeros ");
			numero[i]=dato.nextInt();
			i++;
		}
		i=9;
		System.out.println("");
		System.out.println("Numeros al reves");
		System.out.println("");

		while (i>=0){
			System.out.println(numero[i]);
			i--;
		}
	}
}