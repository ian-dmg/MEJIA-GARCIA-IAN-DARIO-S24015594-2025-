import java.util.*;
public class Ej3{
	public static void main(String args[]){
	Scanner dato=new Scanner(System.in);
		char elegir='d';
		char continuar='S';
		do{
			System.out.println("Cajero automatico");
			System.out.println("a)Consulta");
			System.out.println("b)Pago del mes");
			System.out.println("c)Pago del adeudo");
			System.out.println("d)Salir");
			
			elegir=dato.next().charAt(0);
			
			switch(elegir){
				case 'a':
				case 'A':
					System.out.println();
					System.out.println("Tiene un adeudo de $1000");
				break;
				
				case  'b':
				case 'B':
					System.out.println("Debe pagar un total de $1000");
					System.out.println("Coloque la cantidad a pagar este mes");
					double pagar=dato.nextDouble();
					if (pagar>=1000)
						System.out.println("Pago realizado con exito");
					else 
						System.out.println("No se ha podido realizar el pago");
				break;
				
				case 'c':
				case 'C':
					System.out.println("Pago de adeudo");
					System.out.println ("Debe 1000");
					System.out.println("Deposite la cantidad");
					pagar=dato.nextDouble();
					System.out.println("Transaccion completada");
				break;
				
				case 'd':
				case 'D':
					System.out.println("Gracias por usar este cajero");
					continuar='n';
				break;
				default:
					System.out.println("Esa opcion no se encuentra");
				break;
			}
			if(elegir!='d'||elegir!='D'){
				System.out.println("Desea continuar con otro servicio?");
				continuar=dato.next().charAt(0);
			}
		}while(continuar=='n'||continuar=='N');
		System.out.println("Hasta luego");
		
	}
}	