package actividad2;

import java.util.Scanner;

public class usoVehiculo {
	
	enum tipoVehiculo{
		
		MOTOCICLETA("VHCL-0001"), AUTOMOVIL("VHCL-0002"), CAMIONETA("VHCL-0003"), CAMION("VHCL-0004");
		
		private String codigoVehiculo;
		
		// CONSTRUCTOR
		
		private tipoVehiculo(String codigo){
			
			codigoVehiculo = codigo;
			
		}
		
		// GET
		
		public String getCodigo() {
			
			return codigoVehiculo;
			
		}
		
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String EntradaTipoVehiculo;
		tipoVehiculo tipoVehiculo;
		
		System.out.println("------------------------------------");
		
		System.out.println("\nBienvenido a LA FABRICA");
		
		System.out.println("\n¿Que Vehiculo desea crear?");
		
		System.out.println("\n-Motocicleta");
		System.out.println("-Automovil");
		System.out.println("-Camioneta");
		System.out.println("-Camion");

		System.out.println("\n-Escriba su respuesta: \n");
		
		EntradaTipoVehiculo = entrada.next().toUpperCase();
		
		tipoVehiculo = Enum.valueOf(tipoVehiculo.class, EntradaTipoVehiculo);
		
		System.out.println("\nEl vehiculo que selecciono es: "+ tipoVehiculo+" El codigo de fabricación es: "+ tipoVehiculo.getCodigo());
		
		System.out.println("\n------------------------------------");
	}
}