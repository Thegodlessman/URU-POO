package pooCoches;

public class Moto {
	
	private String ruedas;
	private String largo; 
	private String ancho;
	private String motor;
	private String peso;
	
	private String color; 
	private boolean asientosCuero = false; 
	
	public Moto() {
		
		color="negro";
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
	public String getColor() {
		return "El color de la moto es: "+color;
	}
	
	public String getAsientos() { 
		if(asientosCuero == true) {
			return "La moto tiene asientos de cuero"; 
		}else {
			return "La moto tiene asientos de serie";
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
}
