package evaluacionFabricaDeVehiculosAereos;

import javax.swing.JOptionPane;

public class avionCarga {
	
	private String nombre;
	private String ruedas; 
	private String motores; 
	private String envergadura; 
	private String altura;
	private String peso;
	private String velocidad;
	private String capacidad; 
	private String tripulacion; 
	private String pasajeros; 
	
	private double precio;
	private double cap, tri, pas, mot;
	
	private double nMotor, nTrip, nPas, nCap;
	
	private boolean cAce , cDes , cEle , cDec, cGir ; 
	
	// CONSTRUCTOR
	
	public avionCarga() {
		
		nombre = "Antonov";
		ruedas = "32";
		motores = "6";
		envergadura = "88.4m";
		altura = "18.1m"; 
		peso= "285000 Kg"; 
		velocidad= "800km/h"; 
		capacidad= "1300"; 
		tripulacion = "6"; 
		pasajeros="0";
		cAce = true;
		cDes = true;
		cEle = true; 
		cDec = true; 
		cGir  = true;
		
	}
	
	//GETTER
	
	public String getDatos() {
		
		cap = Integer.parseInt(this.capacidad);
		tri = Integer.parseInt(this.tripulacion);
		pas = Integer.parseInt(this.pasajeros);
		mot = Integer.parseInt(this.motores);
		
		precio = ((cap + pas) * tri * mot)/1000;
		
		return "\nEl Vehiculo aereo conocido como '"+nombre+"' posee las siguientes caracteristicas:"
				+"\n\nRuedas: "+ruedas
				+"\nNúmero de Motores: "+motores
				+"\nEnvergadura de: "+envergadura
				+"\nAltura de: "+altura
				+"\nPeso sin carga de: "+peso
				+"\nVelocidad Crucero de: "+velocidad
				+"\nCapacidad de: "+capacidad+"m3"
				+"\nCapacidad de miembros de la tripulacion: "+tripulacion
				+"\nCapacidad de pasajeros: "+pasajeros
				+"\n\nEl precio del Vehiculo es: "+precio+" Millones de Dolares"
				+"\n\nCaracteristicas del Vehiculo:"
				+"\n\nCapacidad para Acelerar: "+cAce
				+"\nCapacidad para Desacelerar: "+cDes
				+"\nCapaciadad para Girar: "+cGir
				+"\nCapacidad para Elevarse: "+ cEle
				+"\nCapacidad para Decender: "+ cDec;
		
	}
	
	public String getEvaluacion() {
		if(cAce == true && cDes == true && cGir == true && cDec == true && cEle == true) {
			return "\nEL VEHICULO HA APROBADO LA PRUEBA DE CARACTERISTICAS";
		}else {
			return "\nEL VEHICULO NO HA APROBADO LA PRUEBA DE CARACTERISTICAS";
		}
		
	}
	//SETTER 
	
	public void setNombre(String nuevo_nombre) {
		this.nombre = nuevo_nombre; 
	}
	
	public void setMotor(String nuevo_motor) {
		nMotor = Integer.parseInt(nuevo_motor);
		do {
			
			if(nMotor < 6 || nMotor > 10) {
				setMotor(JOptionPane.showInputDialog("El modelo que selecciono solo puede tener de 6 a 10 motores, intente de nuevo"));
			}else {
				this.motores = nuevo_motor;
			}
			
		}while(nMotor < 6 || nMotor > 10);
	}
	
	public void setTrip(String nueva_trip) {
		nTrip = Integer.parseInt(nueva_trip);
		do {
			if(nTrip < 6) {
				setTrip(JOptionPane.showInputDialog("El avion es demasiado grande para una tripulacion de menos de 6 personas, intente de nuevo"));
			}else {
				this.tripulacion = nueva_trip;
			}
		}while(nTrip < 6);
	}
	
	public void setPas(String nuevo_pas) {
		nPas = Integer.parseInt(nuevo_pas);
		do {
			
			if(nPas < 0 || nPas > 5) {
				setPas(JOptionPane.showInputDialog("Numero de pasajeros no valido (Entre 0 y 5), intente de nuevo"));
			}else {
				this.pasajeros = nuevo_pas;
			}
			
		}while(nPas < 0 || nPas > 5);
	}
	
	public void setCap(String nuevo_cap) {
		nCap = Integer.parseInt(nuevo_cap);
		do {
			
			if(nCap < 1000 || nCap > 2000) {
				setCap(JOptionPane.showInputDialog("La capacidad ingresado no esta dentro del limite del diseño (entre 1000m3 y 2000m3), intente de nuevo"));
			}else {
				this.capacidad = nuevo_cap;
			}
			
		}while(nCap < 1000 || nCap > 2000);
	}
	
	public void setCAce(String ace) {
		if(ace.equalsIgnoreCase("si")) {
			this.cAce = true; 
		}else {
			this.cAce = false; 
		}
	}
	
	public void setCDes(String des) {
		if(des.equalsIgnoreCase("si")) {
			this.cDes = true; 
		}else {
			this.cDes = false; 
		}
	}
	
	public void setCGir(String gir) {
		if(gir.equalsIgnoreCase("si")) {
			this.cGir = true; 
		}else {
			this.cGir = false; 
		}
	}
	
	public void setCDec(String dec) {
		if(dec.equalsIgnoreCase("si")) {
			this.cDec = true; 
		}else {
			this.cDec = false; 
		}
	}
	
	public void setCEle(String ele) {
		if(ele.equalsIgnoreCase("si")) {
			this.cEle = true; 
		}else {
			this.cEle = false; 
		}
	}
}
