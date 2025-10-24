import java.util.*;
public class Circulo {
	public static void main(String args[]){	
	Scanner sc = new Scanner(System.in);
	double a=3.1416, b=0, c=0, ar=0;
	System.out.println("Introduzca el radio de su circulo para calcular la circunferencia y area");
	b = sc.nextDouble();
	ar=a*(b*b);
	c=2*a*b;
	System.out.println("El área total de circulo es; " +ar+  "\n Y su circunferencia es igual a: " +c );
}
}
	
