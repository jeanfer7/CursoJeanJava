package indra.talentCamp.polimorfismo.models;

public class Vaca extends Animal{
	private String sonido="muu";
	
	public void hacerSonido() {
		System.out.println(this.sonido);
	}
}
