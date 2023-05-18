package indra.talentCamp.polimorfismo.models;

public class Gato extends Animal{
	private String sonido="miau";
	
	public void hacerSonido() {
		System.out.println(this.sonido);
	}

}
