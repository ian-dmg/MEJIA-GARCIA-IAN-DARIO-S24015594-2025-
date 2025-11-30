import java.util.Scanner;
public class Ej7{
	public static void main(String[] args){
	Scanner dato=new Scanner(System.in);
		int num;
		System.out.println("TABLA DE MULTIPLICAR");
		System.out.print("Numero a multiplicar: ");
		num=dato.nextInt();
		System.out.print("");
		System.out.println("TABLA DEL "+ num);
		for(int i=1;i<=10;i++){
			System.out.println(num + "*" + i + "=" + num*i);
		}
	}
}