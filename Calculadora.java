package primerProyecto;

import java.util.Scanner; 

public class Calculadora {

	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		double a, b, c; 
		int opcion; 
		

		System.out.println("Bienvenido a THE CALCULATOR");
			
		System.out.println("\n1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Multiplicacion");
		System.out.println("4.Division");
			
		System.out.println(" -Que opcion desea utilizar:");
		opcion = entrada.nextInt();
			
		switch(opcion){
			case 1:
				System.out.println("Introduzca el valor de a: ");
				a = entrada.nextDouble();
				System.out.println("Introduzca el valor de b: ");
				b = entrada.nextDouble();
					
				c = a + b;
					
				System.out.println("El resultado de la SUMA es: "+ c);
				break;
				case 2:
				System.out.println("Introduzca el valor de a: ");
				a = entrada.nextDouble();		
				System.out.println("Introduzca el valor de b: ");
				b = entrada.nextDouble();
					
				c = a - b;
				
				System.out.println("El resultado de la RESTA es: "+ c);
				break;
			case 3: 
				System.out.println("Introduzca el valor de a: ");
				a = entrada.nextDouble();
				System.out.println("Introduzca el valor de b: ");
				b = entrada.nextDouble();
				
				c = a * b;
				
				System.out.println("El resultado de la MULTIPLICACION es: "+ c);
				break;
			case 4: 
				System.out.println("Introduzca el valor de a: ");
				a = entrada.nextDouble();
				System.out.println("Introduzca el valor de b: ");
				b = entrada.nextDouble();
				
				c = a / b;
				
				System.out.println("El resultado de la DIVISON es: "+ c);
				break;
			default: 
				System.out.println("La opcion que ha seleccionado no existe, intente de nuevo");
				break;
					
		}
	}
}