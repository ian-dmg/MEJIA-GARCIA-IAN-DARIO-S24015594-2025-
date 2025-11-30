import java.util.Scanner;
public class Ej1{
	public static void main(String args[]){
	Scanner dato=new Scanner(System.in);
		String nom1="",nom2="",nom3="",nom4="",nom5="",nom6="",nom7="",nom8="",nom9="",nom10="";
		int contador=0;
		while(contador<=10){
			if(contador==1){
				System.out.print("Nombre 1 ");
				nom1=dato.nextLine();
			}
			if(contador==2){
				System.out.print("Nombre 2 ");
				nom2=dato.nextLine();
			}
			if(contador==3){
				System.out.print("Nombre 3 ");
				nom3=dato.nextLine();
			}
			if(contador==4){
				System.out.print("Nombre 4 ");
				nom4=dato.nextLine();
			}
			if(contador==5){
				System.out.print("Nombre 5 ");
				nom5=dato.nextLine();
			}
			if(contador==6){
				System.out.print("Nombre 6 ");
				nom6=dato.nextLine();
			}
			if(contador==7){
				System.out.print("Nombre 7 ");
				nom7=dato.nextLine();
			}
			if(contador==8){
				System.out.print("Nombre 8 ");
				nom8=dato.nextLine();
			}
			if(contador==9){
				System.out.print("Nombre 9 ");
				nom9=dato.nextLine();
			}
			if(contador==10){
				System.out.print("Nombre 10 ");
				nom10=dato.nextLine();
			}
			contador++;
		}
		System.out.println("Los nombres introducidos fueron: ");
		System.out.println(nom1);
		System.out.println(nom2);
		System.out.println(nom3);
		System.out.println(nom4);
		System.out.println(nom5);
		System.out.println(nom6);
		System.out.println(nom7);
		System.out.println(nom8);
		System.out.println(nom9);
		System.out.println(nom10);
	}
}