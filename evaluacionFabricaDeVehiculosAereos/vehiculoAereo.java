package evaluacionFabricaDeVehiculosAereos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class vehiculoAereo {
	
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		avionCarga Carguero = new avionCarga();
		avionComercial Comercial = new avionComercial();
		helicoptero Heli = new helicoptero();
		
		int exit = 0, opcion, atras = 0;
		String op;
		
	
		do {
			exit = 0;
			System.out.println("------------------------------------");
			
			System.out.println("\nBienvenido a La Factoria");
			
			System.out.println("\n¿Que Vehiculo Aereo desea crear?");
			
			System.out.println("\n1. Avión de Carga");
			System.out.println("2. Avión Comercial");
			System.out.println("3. Helicoptero");
			System.out.println("4. Salir\n");
			
			System.out.println("------------------------------------");
			
			op = JOptionPane.showInputDialog("¿Que opción desea seleccionar?");
			opcion = Integer.parseInt(op);
			
			switch(opcion) {
				case 1: {
					
					do {
						atras = 0;
						System.out.println("------------------------------------");
						
						System.out.println("\nUsted ha seleccionado un avion de carga.");
						System.out.println("\nEl modelo base será un: Antonov 225 Mriya");
						
						System.out.println("\n\n1. Diseñar uno nuevo");
						System.out.println("2. Ver caracteristicas del diseño actual y su precio");
						System.out.println("3. Atras\n"); 
						
						System.out.println("------------------------------------");
						
						op = JOptionPane.showInputDialog("¿Que opción desea seleccionar?");
						opcion = Integer.parseInt(op);
						
						switch(opcion) {
							case 1: {
								
								Carguero.setMotor(JOptionPane.showInputDialog("¿Cuantos motores desea implementar? (de 6 a 10)"));
								Carguero.setTrip(JOptionPane.showInputDialog("¿Cual es la capacidad de tripulacion que desea implementar? (Minimo 6)"));
								Carguero.setPas(JOptionPane.showInputDialog("¿Cual es la capacidad de pasajeros que desea implementar? (Maximo 5)"));
								Carguero.setCap(JOptionPane.showInputDialog("¿Cuanta capacidad desea implementar? (Entre 1000m3 y 2000m3)"));
								
								Carguero.setCAce(JOptionPane.showInputDialog("¿Desea que tenga la capacidad de Acelerar? (SI o no)"));
								Carguero.setCDes(JOptionPane.showInputDialog("¿Desea que tenga la capacidad de Desacelerar? (SI o no)"));
								Carguero.setCGir(JOptionPane.showInputDialog("¿Desea que tenga la capacidad de Girar? (SI o no)"));
								Carguero.setCEle(JOptionPane.showInputDialog("¿Desea que tenga la capacidad de Elevarse? (SI o no)"));
								Carguero.setCDec(JOptionPane.showInputDialog("¿Desea que tenga la capacidad de Descender? (SI o no)"));
								
								Carguero.setNombre(JOptionPane.showInputDialog("Ingrese un nombre para el nuevo modelo creado"));
								
								System.out.println("LOS DATOS SE HAN APLICADO CORRECTAMENTE");
								
								break;
							}
							case 2:{
								System.out.println("------------------------------------");
								System.out.println(Carguero.getDatos());
								System.out.println(Carguero.getEvaluacion());
								
								System.out.println("\nPresiona una cualquier tecla para continuar...\n");
								
								System.out.println("------------------------------------");
								new java.util.Scanner(System.in).nextLine();
								
								break;
							}
							case 3:{
								atras = 1;
								
								break;
							}
							default: {
								
								System.out.println("\n--- La opcion que usted ingreso no esta disponible, intentelo de nuevo ---\n");
							
								break;
							}
						}
					}while(atras != 1);
					
					
					break;
				}
				case 2: {
					do {
						atras = 0;
						System.out.println("------------------------------------");
						
						System.out.println("\nUsted ha seleccionado un avion comercial.");
						System.out.println("\nEl modelo base será un: Boeing 747");
						
						System.out.println("\n\n1. Diseñar uno nuevo");
						System.out.println("2. Ver caracteristicas del diseño actual y su precio");
						System.out.println("3. Atras\n"); 
						
						System.out.println("------------------------------------");
						
						op = JOptionPane.showInputDialog("¿Que opción desea seleccionar?");
						opcion = Integer.parseInt(op);
						
						switch(opcion) {
						case 1: {
							
							Comercial.setMotor(JOptionPane.showInputDialog("¿Cuantos motores desea implementar? (de 4 a 8)"));
							Comercial.setTrip(JOptionPane.showInputDialog("¿Cual es la capacidad de tripulacion que desea implementar? (Minimo 3)"));
							Comercial.setPas(JOptionPane.showInputDialog("¿Cual es la capacidad de pasajeros que desea implementar? (Maximo 660)"));
							Comercial.setCap(JOptionPane.showInputDialog("¿Cuanta capacidad desea implementar? (Entre 500m3 y 1000m3)"));
							
							Comercial.setCAce(JOptionPane.showInputDialog("¿Desea que tenga la capacidad de Acelerar? (SI o no)"));
							Comercial.setCDes(JOptionPane.showInputDialog("¿Desea que tenga la capacidad de Desacelerar? (SI o no)"));
							Comercial.setCGir(JOptionPane.showInputDialog("¿Desea que tenga la capacidad de Girar? (SI o no)"));
							Comercial.setCEle(JOptionPane.showInputDialog("¿Desea que tenga la capacidad de Elevarse? (SI o no)"));
							Comercial.setCDec(JOptionPane.showInputDialog("¿Desea que tenga la capacidad de Descender? (SI o no)"));
							
							Comercial.setNombre(JOptionPane.showInputDialog("Ingrese un nombre para el nuevo modelo creado"));
							
							System.out.println("LOS DATOS SE HAN APLICADO CORRECTAMENTE");
							
							break;
						}
						case 2:{
							System.out.println("------------------------------------");
							System.out.println(Comercial.getDatos());
							System.out.println(Comercial.getEvaluacion());
							
							System.out.println("\nPresiona una cualquier tecla para continuar...\n");
							
							System.out.println("------------------------------------");
							new java.util.Scanner(System.in).nextLine();
							
							break;
						}
						case 3:{
							atras = 1;
							
							break;
						}
						default: {
							
							System.out.println("\n--- La opcion que usted ingreso no esta disponible, intentelo de nuevo ---\n");
						
							break;
						}
					}
						
					}while(atras !=1);
					break;
				}
				case 3: {
					do {
						atras = 0;
						System.out.println("------------------------------------");
						
						System.out.println("\nUsted ha seleccionado un avion comercial.");
						System.out.println("\nEl modelo base será un: AS-532UL Cougar");
						
						System.out.println("\n\n1. Diseñar uno nuevo");
						System.out.println("2. Ver caracteristicas del diseño actual y su precio");
						System.out.println("3. Atras\n"); 
						
						System.out.println("------------------------------------");
						
						op = JOptionPane.showInputDialog("¿Que opción desea seleccionar?");
						opcion = Integer.parseInt(op);
						
						switch(opcion) {
						case 1: {
							
							Heli.setMotor(JOptionPane.showInputDialog("¿Cuantos motores desea implementar? (2 o 3)"));
							Heli.setTrip(JOptionPane.showInputDialog("¿Cual es la capacidad de tripulacion que desea implementar? (2 o 3)"));
							Heli.setPas(JOptionPane.showInputDialog("¿Cual es la capacidad de pasajeros que desea implementar? (Maximo 25)"));
							Heli.setCap(JOptionPane.showInputDialog("¿Cuanta capacidad desea implementar? (Entre 2m3 y 3m3)"));
							
							Heli.setCAce(JOptionPane.showInputDialog("¿Desea que tenga la capacidad de Acelerar? (SI o no)"));
							Heli.setCDes(JOptionPane.showInputDialog("¿Desea que tenga la capacidad de Desacelerar? (SI o no)"));
							Heli.setCGir(JOptionPane.showInputDialog("¿Desea que tenga la capacidad de Girar? (SI o no)"));
							Heli.setCEle(JOptionPane.showInputDialog("¿Desea que tenga la capacidad de Elevarse? (SI o no)"));
							Heli.setCDec(JOptionPane.showInputDialog("¿Desea que tenga la capacidad de Descender? (SI o no)"));
							
							Heli.setNombre(JOptionPane.showInputDialog("Ingrese un nombre para el nuevo modelo creado"));
							
							System.out.println("LOS DATOS SE HAN APLICADO CORRECTAMENTE");
							
							break;
						}
						case 2:{
							System.out.println("------------------------------------");
							System.out.println(Heli.getDatos());
							System.out.println(Heli.getEvaluacion());
							
							System.out.println("\nPresiona una cualquier tecla para continuar...\n");
							
							System.out.println("------------------------------------");
							new java.util.Scanner(System.in).nextLine();
							
							break;
						}
						case 3:{
							atras = 1;
							
							break;
						}
						default: {
							
							System.out.println("\n--- La opcion que usted ingreso no esta disponible, intentelo de nuevo ---\n");
						
							break;
						}
					}
						
					}while(atras !=1);
					break;
				}
				case 4: {
					exit = 1;
					
					System.out.println("\nEL PROGRAMA ESTA CERRADO\n");
					
					break;
				}
			
				default: {
					System.out.println("\nLa opcion que usted ingreso no esta disponible, intentelo de nuevo");
					
					break;
				}
			}
			
			
		}while(exit != 1);
		
	}
}