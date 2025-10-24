import java.util.Scanner;
public Class MayorMenor{
	public static void main(String[]args){
	Scanner leer = new Scanner(System.in);
	
	System.out.print("Ingresa el primer número: ");
	double n1 = leer.nextDouble;
	
	System.out.print("Ingresa el segundo número: ");
	double n2 = leer.nextDouble;
	
	System.out.print("Ingresa el tercer número: ");
	double n3 = leer.nextDouble;
	double mayor, menor;
	
	if (n1 >= n2 && n1 >= n3){
		mayor = n1;
	} else if (n2 >= n1 && n2 >= n3) {
		mayor = n2;
	} else {
		mayor =n3;
	}
	
	if (n1 <= n2 && n1 <= n3) {
		menor =n1;
	} else if (n2 <= n1 && n2 <= n3){
		menor = n2;
	} else{
		menor= n3;
	}
	
	double promdeio = (n1 + n2 +n3) / 3;
	System.out.println("Mayor: " + mayor);
	System.out.println("Menor: " + menor);
	System.out.println("Promedio: " + promedio);
	}
}
	