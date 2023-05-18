package indra.talentCamp.relaciones;

import indra.talentCamp.relaciones.composite.Multiplicacion;
import indra.talentCamp.relaciones.composite.Operacion;
import indra.talentCamp.relaciones.composite.Suma;
import indra.talentCamp.relaciones.composite.Valor;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VAmos a realizar el siguiente calculo: 2+2*3
		
		Operacion calculo = new Suma(
				new Valor(2),
				new Multiplicacion(new Valor(2),new Valor(3))
				);
		
		System.out.println("2+2*3 = " + calculo.calcular());
		
		Operacion calculo2 = new Suma(
				new Multiplicacion(new Valor(6), new Valor(5)),
				new Multiplicacion(new Valor(6), new Valor(5)));
		System.out.println("6*5+6*5 = " + calculo2.calcular());
		
		//5+3*8+4*3b fdts'
		Operacion calculo3 = new Suma(
				new Multiplicacion(3.0, 8.0),
				new Multiplicacion(4, 3));
		Operacion calculo4 = new Suma(
				new Valor(5),
				calculo3;
		System.out.println("5+3*8+4*3 = " + calculo3.calcular());
	}

}
