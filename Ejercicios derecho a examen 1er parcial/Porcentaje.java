import java.util.*;
public class Porcentaje {
	public static void main(String args[]){	
	Scanner sc = new Scanner(System.in);
	double h=0, m=0, ph=0, pm=0, t=0;
	System.out.println("Ingrese el numero de hombres que hay en su salon");
	h= sc.nextInt();
	System.out.println("Ingrese el numero de mujeres que hay en su salon");
	m= sc.nextDouble();
	t=m+h;
	ph=(h/t)*100;
	pm=(m/t)*100;
	System.out.println("El porcentaje de hombres es: " +ph+ "\nY el porcentaje de mujeres es: " +pm);
}
}