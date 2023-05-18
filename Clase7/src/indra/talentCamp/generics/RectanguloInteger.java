package indra.talentCamp.generics;

public class RectanguloInteger extends FiguraGenerica<Integer>{

	private int base;
	private int altura;
	
	public RectanguloInteger(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public int getBase() {
		return base;
	}
	public int getAltura() {
		return altura;
	}
	
	public Integer calcularArea() {
		return this.base * this.altura;
	}
	public Integer calcularPerimetro() {
		return this.base*2+2*this.altura;
	}
	
}
