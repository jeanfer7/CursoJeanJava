package indra.talentCamp.relaciones.composite;

public class Suma extends OperacionBinaria{

	public Suma(Operacion operandoIzquierdo, Operacion operandoDerecho) {
		super(operandoIzquierdo, operandoDerecho);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcular(){
		return this.operandoDerecho.calcular() + this.operandoIzquierdo.calcular();
	}

}
