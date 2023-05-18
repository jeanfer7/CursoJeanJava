package indra.talentCamp.polimorfismo.models;

public abstract class Jugador {

	private String Nombre;
	private int hp;
	private int fuerza;
	private int destreza;
	private int modFuerza;
	//temporal, lo borraremos en breves
//	private int tipoJugador = 1; //1-Guerrero 2-Sacerdote 3-Mago
	
	
	public Jugador(String nombre) {
		super();
		Nombre = nombre;
		this.hp = 50;
		this.fuerza = 50;
		this.destreza = 50;
		this.modFuerza = 0;
//		this.tipoJugador = tipoJugador;
	}
	
	public boolean estaVivo() {
		return (this.hp>0);
	}
	
	public int getHp() {
		return hp;
	}

	protected void setHp(int hp) {
		this.hp = hp;
	}

	public int getFuerza() {
		return fuerza;
	}

	protected void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getDestreza() {
		return destreza;
	}

	protected void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public String getNombre() {
		return Nombre;
	}

	public abstract void accion (Jugador enemigo);
//		if(tipoJugador == 1) {//guerrero
//			enemigo.setHp(enemigo.hp - this.getFuerza());
//		}else if (tipoJugador == 2) { //sacerdote
//			enemigo.setHp(enemigo.hp + this.destreza);
//		}else if(tipoJugador == 3) {
//			enemigo.setFuerza(enemigo.fuerza - this.destreza);
//		}
	
	@Override
	public String toString() {
		return String.format("El personaje %s es de tipo %s tiene una fuerza de: (%d), una vida de: (%d) y una destreza de: (%d)", 
                this.getNombre(),
                this.getClass().getSimpleName(),
                this.getFuerza(),
                this.getHp(),
                this.getDestreza());
	}

	public void finalizarTurno() {
		this.modFuerza=0;
	}
	
}
