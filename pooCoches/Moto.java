package pooCoches;

public class Moto {
	
	private String ruedas;
	private String largo; 
	private String ancho;
	private String motor;
	private String peso;
	
	public Moto() {
		
		ruedas = "2";
		largo = "1000";
		ancho = "150";
		motor = "800";
		peso = "275";
		
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
	public void setRuedas(String nuevo_ruedas) {
		this.ruedas = nuevo_ruedas;
	}
	public void setLargo(String nuevo_largo) {
		this.largo = nuevo_largo;
	}
	public void setAncho(String nuevo_ancho) {
		this.ancho = nuevo_ancho;
	}
	public void setMotor(String nuevo_motor) {
		this.motor = nuevo_motor;
	}
	public void setPeso(String nuevo_peso) {
		this.peso = nuevo_peso;
	}
}
