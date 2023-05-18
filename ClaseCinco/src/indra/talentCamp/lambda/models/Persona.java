package indra.talentCamp.lambda.models;

public class Persona {

	private String nombre;
	private int centimetrosAltura;

	
	public Persona(String nombre, int centimetrosAltura) {
		super();
		this.nombre = nombre;
		this.setCentimetrosAltura(centimetrosAltura);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public int getCentimetrosAltura() {
		return centimetrosAltura;
	}
	public void setCentimetrosAltura(int centimetrosAltura) {
		
		if (centimetrosAltura > 300) throw new Error ("No se puede medir más de 300 cm");
		if (centimetrosAltura < 0) throw new Error ("No se puede medir menos que 0");
		this.centimetrosAltura = centimetrosAltura;
	}

	
}
