import java.util.Scanner;
class Compras {
    public static void main(String[] args) {
        Scanner jl = new Scanner(System.in);
        double aa=0,a=0,b=0,bb=0;
	System.out.print("Numero total de compras: ");
	aa = jl.nextDouble();
        System.out.print("Elige un numero al azar ");
        a = jl.nextDouble();
        if (a <= 74) {
            b= (aa*15)/100;
		bb=aa-b;
	 System.out.println("El costo final de tu compra es" + bb);
        } else {
            b= (aa*20)/100;
		bb=aa-b;
        }
        System.out.println("El costo final de tu compra es" + bb);
    }
}







