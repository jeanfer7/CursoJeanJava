package indra.talentCamp.interfaces;

public class Triangulo extends Figura {
	private double lado1;
	private double lado2;
	private double altura;
	private double base;
	
	
	public Triangulo(double lado1, double lado2, double altura, double base) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.altura = altura;
		this.base = base;
	}
	
	public double getLado1() {
		return lado1;
	}


	public double getLado2() {
		return lado2;
	}



	public double getAltura() {
		return altura;
	}


	public double getBase() {
		return base;
	}


	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return this.getBase()* this.getAltura() / 2;
	}
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return this.getLado1() + this.getLado2() + this.getBase();
	}
	
	
}
