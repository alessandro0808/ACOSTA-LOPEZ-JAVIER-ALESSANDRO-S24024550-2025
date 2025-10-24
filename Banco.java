import java.util.*;
public class Banco {
	public static void main(String args[]){	
	Scanner sc = new Scanner(System.in);
	double i=0, g=0, gn;
	System.out.println("Ingrese el monto total que ingreso");
	i= sc.nextDouble();
	g=i*1.02;
	gn=i*0.02;
	System.out.println("Su monto total al mes será: " +g+ " y su ganancia será de: " +gn);
}
}