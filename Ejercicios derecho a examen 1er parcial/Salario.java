import java.util.*;
public class Aumento {
	public static void main(String args[]){	
	Scanner sc = new Scanner(System.in);
	double i=0, a=0;
	System.out.println("Ingrese su salario anterior");
	i= sc.nextDouble();
	a=i*1.25;
	System.out.println("Su nuevo salario sera:" +a);
}
}