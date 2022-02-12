package pooCoches;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class UsoCoches {
	
	
	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		Moto Bucatti = new Moto();
		Coche Renault = new Coche();
		Camioneta Bronco = new Camioneta();
		
		String op; 
		int exit = 0;
		int opcion;
		
		do {
			System.out.println("Bienvenido a La Fabrica");
		
			System.out.println("\n1. Mostrar informacion de los coches");
			System.out.println("2. Modificar informacion de un coche");
			System.out.println("3. Salir");
			
			op = JOptionPane.showInputDialog("Que opción desea seleccionar");
			opcion = Integer.parseInt(op);
		
			switch(opcion) {
				case 1: 
					System.out.println("\nLa Fabrica: Lista de coches");
					
					System.out.println("\n1. Auto - Renault");
					System.out.println("2. Moto - Bucatti");
					System.out.println("3. Camioneta - Bronco");
					
					op = JOptionPane.showInputDialog("Que opción desea seleccionar");
					opcion = Integer.parseInt(op);
					
					switch(opcion) {
					case 1:
						System.out.println("\nEspecificaciones de: Renault\n");
						
						System.out.println(Renault.getRuedas());
						System.out.println(Renault.getLargo());
						System.out.println(Renault.getAncho());
						System.out.println(Renault.getMotor());
						System.out.println(Renault.getPeso());
						
						System.out.println("\nPresiona una cualquier tecla para continuar...");
						new java.util.Scanner(System.in).nextLine();
						
						break;
					case 2:
						System.out.println("\nEspecificaciones de: Bucatti\n");
						
						System.out.println(Bucatti.getRuedas());
						System.out.println(Bucatti.getLargo());
						System.out.println(Bucatti.getAncho());
						System.out.println(Bucatti.getMotor());
						System.out.println(Bucatti.getPeso());
						
						System.out.println("\nPresiona una cualquier tecla para continuar...");
						new java.util.Scanner(System.in).nextLine();
						
						break;
					case 3:
						System.out.println("\nEspecificaciones de: Bronco\n");
						
						System.out.println(Bronco.getRuedas());
						System.out.println(Bronco.getLargo());
						System.out.println(Bronco.getAncho());
						System.out.println(Bronco.getMotor());
						System.out.println(Bronco.getPeso());
						
						System.out.println("\nPresiona una cualquier tecla para continuar...");
						new java.util.Scanner(System.in).nextLine();
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
					
					op = JOptionPane.showInputDialog("Que opción desea seleccionar");
					opcion = Integer.parseInt(op);
					
					switch(opcion) {
						case 1:
							System.out.println("\nModificando Renault...");
							
							Renault.setRuedas(JOptionPane.showInputDialog("\nIngrese el nuevo valor para las ruedas"));
							Renault.setLargo(JOptionPane.showInputDialog("Ingrese el nuevo valor para el largo"));
							Renault.setAncho(JOptionPane.showInputDialog("Ingrese el nuevo valor para el ancho"));
							Renault.setMotor(JOptionPane.showInputDialog("Ingrese el nuevo valor para la potencia del motor"));
							Renault.setPeso(JOptionPane.showInputDialog("Ingrese el nuevo valor para del peso"));
							
							System.out.println("\nSe ha modidicado los datos de Renault, presione cualquier tecla para continuar...");
							new java.util.Scanner(System.in).nextLine();
							
							System.out.println("\n\n");
							break;
						case 2:
							System.out.println("\nModificando Bucatti...");
							
							Bucatti.setRuedas(JOptionPane.showInputDialog("\nIngrese el nuevo valor para las ruedas"));
							Bucatti.setLargo(JOptionPane.showInputDialog("Ingrese el nuevo valor para el largo"));
							Bucatti.setAncho(JOptionPane.showInputDialog("Ingrese el nuevo valor para el ancho"));
							Bucatti.setMotor(JOptionPane.showInputDialog("Ingrese el nuevo valor para la potencia del motor"));
							Bucatti.setPeso(JOptionPane.showInputDialog("Ingrese el nuevo valor para del peso"));
							
							System.out.println("\nSe ha modidicado los datos de Bucatti, presione cualquier tecla para continuar...");
							new java.util.Scanner(System.in).nextLine();
							System.out.println("\n\n");
							break;
						case 3:
							System.out.println("\nModificando Bronco...");
							
							Bronco.setRuedas(JOptionPane.showInputDialog("\nIngrese el nuevo valor para las ruedas"));
							Bronco.setLargo(JOptionPane.showInputDialog("Ingrese el nuevo valor para el largo"));
							Bronco.setAncho(JOptionPane.showInputDialog("Ingrese el nuevo valor para el ancho"));
							Bronco.setMotor(JOptionPane.showInputDialog("Ingrese el nuevo valor para la potencia del motor"));
							Bronco.setPeso(JOptionPane.showInputDialog("Ingrese el nuevo valor para del peso"));
							
							System.out.println("\nSe ha modidicado los datos de Bronco, presione cualquier tecla para continuar...");
							new java.util.Scanner(System.in).nextLine();
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
