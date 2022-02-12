package pooCoches;

import java.util.Scanner;

public class UsoCoches {
	
	
	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		Moto Bucatti = new Moto();
		Coche Renault = new Coche();
		Camioneta Bronco = new Camioneta();
		
		int exit = 0;
		int opcion;
		
		do {
			System.out.println("Bienvenido a La Fabrica");
		
			System.out.println("\n1. Mostrar informacion de los coches");
			System.out.println("2. Modificar informacion de un coche");
			System.out.println("3. Salir");
			
			System.out.println("  ¿Que opcion desea elegir?");
			opcion = entrada.nextInt();
		
			switch(opcion) {
				case 1: 
					System.out.println("\nLa Fabrica: Lista de coches");
					
					System.out.println("\n1. Auto - Renault");
					System.out.println("2. Moto - Bucatti");
					System.out.println("3. Camioneta - Bronco");
					
					System.out.println("  ¿Que opcion desea elegir?");
					opcion = entrada.nextInt();
					
					switch(opcion) {
					case 1:
						System.out.println("\nEspecificaciones de: Renault");
						
						System.out.println(Renault.getRuedas());
						System.out.println(Renault.getLargo());
						System.out.println(Renault.getAncho());
						System.out.println(Renault.getMotor());
						System.out.println(Renault.getPeso());
						
						System.out.println("\n\n");
						break;
					case 2:
						System.out.println("\nEspecificaciones de: Bucatti");
						
						System.out.println(Bucatti.getRuedas());
						System.out.println(Bucatti.getLargo());
						System.out.println(Bucatti.getAncho());
						System.out.println(Bucatti.getMotor());
						System.out.println(Bucatti.getPeso());
						
						System.out.println("\n\n");
						break;
					case 3:
						System.out.println("\nEspecificaciones de: Bronco");
						
						System.out.println(Bronco.getRuedas());
						System.out.println(Bronco.getLargo());
						System.out.println(Bronco.getAncho());
						System.out.println(Bronco.getMotor());
						System.out.println(Bronco.getPeso());
						
						System.out.println("\n\n");
						break;
					default: 
					
						System.out.println("\n La opcion que ha seleccionado no esta disponible... Intente de nuevo\n\n");
						
						break;
					}
					
					break;
				case 2:
					System.out.println("\nLa Fabrica: Modificar Informacion");
					
					System.out.println("\n1. Modificar: Auto - Renault");
					System.out.println("2. Modificar: Moto - Bucatti");
					System.out.println("3. Modificar: Camioneta - Bronco");
					
					System.out.println("  ¿Que opcion desea elegir?");
					opcion = entrada.nextInt();
					
					switch(opcion) {
						case 1:
							System.out.println("\nModificar: Renault");
							
							System.out.println("\nIngrese el nuevo valor de Ruedas");
							Renault.setRuedas(entrada.nextInt());
							System.out.println("Ingrese el nuevo valor de Largo");
							Renault.setLargo(entrada.nextInt());
							System.out.println("Ingrese el nuevo valor de Ancho");
							Renault.setAncho(entrada.nextInt());
							System.out.println("Ingrese el nuevo valor de Motor");
							Renault.setMotor(entrada.nextInt());
							System.out.println("Ingrese el nuevo valor de Peso");
							Renault.setPeso(entrada.nextInt());
							
							System.out.println("\n\n");
							break;
						case 2:
							System.out.println("\nModificar: Bucatti");
							
							System.out.println("\nIngrese el nuevo valor de Ruedas");
							Bucatti.setRuedas(entrada.nextInt());
							System.out.println("Ingrese el nuevo valor de Largo");
							Bucatti.setLargo(entrada.nextInt());
							System.out.println("Ingrese el nuevo valor de Ancho");
							Bucatti.setAncho(entrada.nextInt());
							System.out.println("Ingrese el nuevo valor de Motor");
							Bucatti.setMotor(entrada.nextInt());
							System.out.println("Ingrese el nuevo valor de Peso");
							Bucatti.setPeso(entrada.nextInt());
							
							System.out.println("\n\n");
							break;
						case 3:
							System.out.println("\nModificar: Bronco");
							
							System.out.println("\nIngrese el nuevo valor de Ruedas");
							Bronco.setRuedas(entrada.nextInt());
							System.out.println("Ingrese el nuevo valor de Largo");
							Bronco.setLargo(entrada.nextInt());
							System.out.println("Ingrese el nuevo valor de Ancho");
							Bronco.setAncho(entrada.nextInt());
							System.out.println("Ingrese el nuevo valor de Motor");
							Bronco.setMotor(entrada.nextInt());
							System.out.println("Ingrese el nuevo valor de Peso");
							Bronco.setPeso(entrada.nextInt());
							
							System.out.println("\n\n");
						default: 
							System.out.println("\n La opcion que ha seleccionado no esta disponible... Intente de nuevo\n\n");
							
							break;
					}
					break;
				case 3:
					System.out.println("Se ha detenido el programa, usted ha salido.");
					exit = 1; 
					
					break;
				default:
			
					System.out.println("\n La opcion que selecciono no esta disponible... Intente de nuevo\n\n");
					
					break;
			}
		
			
		}while(exit!=1);
	}
}
