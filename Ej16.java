import java.util.Scanner;
public class Ej16{
	public static void main(String[] args){
	Scanner dato=new Scanner(System.in);
		String[][] tiendaropa= new String[3][3];
		System.out.println("Coloca 3 articulos");
		System.out.println("Camisa");
		System.out.println("Zapato");
		System.out.println("Pantalon");
		int id=0;
		do{
			System.out.printf("\nArticulo " + (id+1) + " : ");
			System.out.print(" Nombre : ");
			tiendaropa[id][0]=dato.nextLine();
			System.out.print(" Talla : ");
			tiendaropa[id][1]=dato.nextLine();
			System.out.print(" Color : ");
			tiendaropa[id][2]=dato.nextLine();
			id++;
		}while(id<3);
		System.out.printf("%-10s %-6s %-8s \n","Articulo", "Talla", "Color");
		for(int i=0;i<3;i++){
			System.out.printf("%-10s %-6s %-8s \n", tiendaropa[i][0], tiendaropa[i][1], tiendaropa[i][2]);
		}
	dato.close();
	}
}