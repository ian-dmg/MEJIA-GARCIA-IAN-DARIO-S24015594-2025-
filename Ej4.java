import java.util.Scanner;
public class Ej4{
	public static void main(String[] args){
	Scanner dato=new Scanner(System.in);
		double saldo=5000;
		char repetir='s';
		System.out.println("CAJERO");
		
		do{
			System.out.println("Saldo actual -> $" + saldo);
			System.out.print("Saldo a retirar: $");
			double monto=dato.nextDouble();
			if(monto>saldo)
			{
				System.out.println("Saldo insuficiente");
			}
			if(monto<=saldo){
			System.out.println("Retiro una cantidad de $ " + monto);
			saldo=saldo-monto;
			System.out.println("Le queda $" + saldo );
			}
			System.out.println("Quiere realizar otro retiro");
			repetir=dato.next().charAt(0);
		} while (repetir=='S'||repetir=='s');
		System.out.println("Gracias por retirar dinero en este cajero");
	}
} 
			