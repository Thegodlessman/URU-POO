package pooCoches;

public class Moto {
	
	private int ruedas;
	private int largo; 
	private int ancho;
	private int motor;
	private int peso;
	
	public Moto() {
		
		ruedas = 2;
		largo = 1000;
		ancho = 150;
		motor = 800;
		peso = 275;
		
	}
	
	//Getter 
	public String getRuedas() {
		return "La moto tiene: "+ruedas+" Ruedas";  
	}
	public String getLargo(){
		return "La moto tiene un largo de: "+largo+" Unidades";
	}
	public String getAncho(){
		return "La moto tiene un ancho de: "+ancho+" Unidades";
	}
	public String getMotor(){
		return "La moto tiene un motor de: "+motor+" Unidades de potencia";
	}
	public String getPeso(){
		return "La moto tiene un peso de: "+peso+" Unidades";
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
