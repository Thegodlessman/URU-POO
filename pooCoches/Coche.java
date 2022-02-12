package pooCoches;

public class Coche {
	
	private String ruedas;
	private String  largo;
	private String  ancho;
	private String  motor; 
	private String  peso;
	
	
	//METODO CONSTRUCTOR -- Le da condiciones iniciales 
	
	public Coche() {
		
		ruedas = "4"; 
		largo = "2000";
		ancho = "300";
		motor = "1600";
		peso = "550";
		
		
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
