import java.util.*;
public class edad1 {
	public static void main(String args[]){	
	Scanner sc = new Scanner(System.in);
	int ed=0, a=0;
	System.out.println("Ingrese la edad del paciente");
	ed = sc.nextInt();
	a=(220-ed)/10;
	System.out.println("Las pulsaciones por cada 10 segundos de ejercicio de su paciente son: " +a);
}
}

