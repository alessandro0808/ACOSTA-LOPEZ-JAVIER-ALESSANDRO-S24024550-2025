import java.util.*;
public class descuento {
	public static void main(String args[]){	
	Scanner sc = new Scanner(System.in);
	double c=0, pf=0, pd=0;
	System.out.println("Ingrese el monto total de la compra");
	c= sc.nextDouble();
	pd=c*0.15;
	pf=c-pd;
	System.out.println("El monto final a pagar es: " +pf);

}
}