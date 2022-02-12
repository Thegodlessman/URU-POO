package pooCoches;

public class Camioneta {
	private int ruedas;
	private int largo; 
	private int ancho;
	private int motor;
	private int peso;
	
	public Camioneta() {
		
		ruedas = 4;
		largo = 3000;
		ancho = 350;
		motor = 2150;
		peso = 800;
		
	}
	
	//Getter
	public String getRuedas() {
		return "La camioneta tiene: "+ruedas+" Ruedas";  
	}
	public String getLargo(){
		return "La camioneta tiene un largo de: "+largo+" Unidades";
	}
	public String getAncho(){
		return "La camioneta tiene un ancho de: "+ancho+" Unidades";
	}
	public String getMotor(){
		return "La camioneta tiene un motor de: "+motor+" Unidades de potencia";
	}
	public String getPeso(){
		return "La comioneta tiene un peso de: "+peso+" Unidades";
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
