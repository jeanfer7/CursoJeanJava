package indra.talentCamp.interfaces;

public class Rectangulo extends Figura {

	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return this.base*this.altura;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return this.base*2 + this.altura*2;
	}

	
}
