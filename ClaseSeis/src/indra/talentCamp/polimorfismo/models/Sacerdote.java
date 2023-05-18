package indra.talentCamp.polimorfismo.models;

public class Sacerdote extends Jugador{

	public Sacerdote(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	//
	@Override
	public void accion(Jugador enemigo) {
		System.out.format("%s lanza un hechizo a %s y modifica sus stats",
				this.getNombre(),
				enemigo.getNombre()
				);
		enemigo.setHp(enemigo.getHp() + this.getDestreza());
	}
	
}
