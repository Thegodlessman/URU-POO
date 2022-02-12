package pooCoches;

public class Coche {
	
	private int ruedas;
	private int  largo;
	private int  ancho;
	private int  motor; 
	private int  peso;
	
	//METODO CONSTRUCTOR -- Le da condiciones iniciales 
	
	public Coche() {
		
		ruedas = 4; 
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso = 550;
		
	}
	
	//Getter
	public String getRuedas() {
		return "El numero de ruedas es: " + ruedas;
	}
	public String getLargo() {
		return "El largo del coche es: " + largo;
	}
	public String getAncho() {
		return "El largo del coche es: " + ancho;
	}
	public String getMotor() {
		return "El largo del coche es: " + motor;
	}
	public String getPeso() {
		return "El largo del coche es: " + peso;
	}
	
	//Setter
	public void setRuedas(int nuevo_ruedas) {
		this.ruedas = nuevo_ruedas;
	}
	public void setLargo(int nuevo_largo) {
		this.largo = nuevo_largo;
	}
	public void setAncho(int nuevo_ancho) {
		this.ancho = nuevo_ancho;
	}
	public void setMotor(int nuevo_motor) {
		this.motor = nuevo_motor;
	}
	public void setPeso(int nuevo_peso) {
		this.peso = nuevo_peso;
	}
}
