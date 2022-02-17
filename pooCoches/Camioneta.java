package pooCoches;

public class Camioneta {
	private String ruedas;
	private String largo; 
	private String ancho;
	private String motor;
	private String peso;
	
	private String color; 
	private boolean climatizador = true , asientosCuero = false; 
	
	public Camioneta() {
		
		color="blanco";
		ruedas = "4";
		largo = "3000";
		ancho = "350";
		motor = "2150";
		peso = "800";
		
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
	public String getColor() {
		return "El coor de la camioneta es: "+color;
	}
	
	public String getAsientos() { 
		if(asientosCuero == true) {
			return "La camioneta tiene asientos de cuero"; 
		}else {
			return "La camioneta tiene asientos de serie";
		}
	}
	
	public String getClimatizador() { 
		if(climatizador == false) {
			return "La camioneta NO tiene climatizador"; 
		}else {
			return "La camioneta SI tiene climatizador";
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
