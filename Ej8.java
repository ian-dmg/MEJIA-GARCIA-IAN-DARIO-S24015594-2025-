public class Ej8{
	public static void main(String[] args){
		int i;
		double mes=0;
		System.out.println("AHORRA 500 CADA MES ");
		System.out.println("Enero : $500");
		System.out.println("Febrero : $1000");
		System.out.println("Marzo : $1500");
		System.out.println("Abril : $2000");
		System.out.println("Mayo : $2500");
		System.out.println("Junio : $3000");
		System.out.println("Julio : $3500");
		System.out.println("Agosto : $4000");
		System.out.println("Septiembre : $4500");
		System.out.println("Octubre : $5000");
		System.out.println("Noviembre : $5500");
		System.out.println("Diciembre : $6000");
		for(i=0;i<=11;i++){
			mes+=500;
			mes=mes+(mes*0.09);
		}
		System.out.println("Con un 9% de interes el total es de $" + mes);
	}
}
		