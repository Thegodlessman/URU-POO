	package pooCoches;

public class Coche {
	
	private String ruedas;
	private String  largo;
	private String  ancho;
	private String  motor; 
	private String  peso;
	
	private String color; 
	private boolean climatizador = true , asientosCuero = false; 
	
	
	//METODO CONSTRUCTOR -- Le da condiciones iniciales 
	
	public Coche() {
		
		color = "gris";
		ruedas = "4"; 
		largo = "2000";
		ancho = "300";
		motor = "1600";
		peso = "550";
		
		
	}
	
	//Getter
	public String getRuedas() {
		return "El Coche tiene: "+ruedas+" Ruedas";  
	}
	public String getLargo(){
		return "El Coche tiene un largo de: "+largo+" Unidades";
	}
	public String getAncho(){
		return "El Coche tiene un ancho de: "+ancho+" Unidades";
	}
	public String getMotor(){
		return "El Coche tiene un motor de: "+motor+" Unidades de potencia";
	}
	public String getPeso(){
		return "El Coche tiene un peso de: "+peso+" Unidades";
	}
	public String getColor() {
		return "El color del coche es: "+color;
	}
	
	public String getAsientos() { 
		if(asientosCuero == true) {
			return "El coche tiene asientos de cuero"; 
		}else {
			return "El coche tiene asientos de serie";
		}
	}
	
	public String getClimatizador() { 
		if(climatizador == false) {
			return "El coche NO tiene climatizador"; 
		}else {
			return "El coche SI tiene climatizador";
		}
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
	public void setColor(String nuevo_color) {
		this.color = nuevo_color; 
	}
	
	public void setAsientos(String asientos) {
		if(asientos.equalsIgnoreCase("si")) {
			this.asientosCuero = true; 
		}else {
			this.asientosCuero = false; 
		}
	}
	public void setClimatizador(String asientos) {
		if(asientos.equalsIgnoreCase("no")) {
			this.climatizador = false; 
		}else {
			this.climatizador = true; 
		}
	}
}
