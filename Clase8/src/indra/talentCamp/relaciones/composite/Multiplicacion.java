package indra.talentCamp.relaciones.composite;

public class Multiplicacion  extends OperacionBinaria{
	
    public Multiplicacion(Operacion operandoIzquierdo, Operacion operandoDerecho) {
        super(operandoIzquierdo, operandoDerecho);
    }
    @Override
    public double calcular() {
        return this.operandoDerecho.calcular() * this.operandoIzquierdo.calcular();
    }
}
