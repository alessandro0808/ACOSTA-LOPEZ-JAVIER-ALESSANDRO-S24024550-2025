import java.util.*;
public class Met {
   	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	double m=0, pies=0.3048, l=0.0254, tn=0, pi=0;
	System.out.println("Introduzca los metros a convertir a pies y pulgadas");
	m = sc.nextDouble();
	tn=m*pies;
	pi=m*l;
	System.out.println("Los metros son iguales a " +tn+  " pies\n Y en pulgadas son iguales " +pi+ " pulgadas");
}
}
