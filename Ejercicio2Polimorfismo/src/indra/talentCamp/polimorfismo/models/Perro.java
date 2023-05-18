package indra.talentCamp.polimorfismo.models;

public class Perro extends Animal {
	private String sonido="Guau";
	
	public String getSonido() {
		return sonido;
	}

	public void hacerSonido() {
		 System.out.println(this.sonido);
	}

}
