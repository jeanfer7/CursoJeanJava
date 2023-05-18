package indra.talentCamp.polimorfismo.models;

public class Mago extends Jugador {

	private int poderMagico;
	private int mana;
	private int modFuerza;
	
	public void setModFuerza(int modFuerza) {
		this.modFuerza = modFuerza;
	}

	public Mago(String nombre) {
		super(nombre);
		this.poderMagico = 10;
		this.mana = 100;
	}
	
	@Override
	public void accion(Jugador enemigo) {
		if(mana>=poderMagico) {
			enemigo.setModFuerza(- this.poderMagico);
			this.mana -= poderMagico;
			System.out.format("%s lanza un hechizo a %s y modifica sus stats",
					this.getNombre(),
					enemigo.getNombre()
					);
		}else {
			System.out.println("no hay mana suficiente");
		}

	}
	
	public void finalizarTurno() {
		super.finalizarTurno();
		this.mana=+1;
	}
}
