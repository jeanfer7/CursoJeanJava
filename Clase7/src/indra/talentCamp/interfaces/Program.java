package indra.talentCamp.interfaces;

import java.util.Arrays;
import java.util.List;

import indra.talentCamp.generics.CajaFuerte;
import indra.talentCamp.generics.Operacion;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <AreaCalculable> escenario = Arrays.asList(
				new Circulo(10),
				new Triangulo(3,4,5,6),
				new Rectangulo(10,10),
				new Planta());
		System.out.println("El área total de mi dibujo es...");
		//expresionLambda
		
		System.out.println("Areas: " + escenario.stream().mapToDouble(figura -> figura.calcularArea()).sum());
		
		//System.out.println("Perimetros: " + dibujo.stream().mapToDouble(figura -> figura.calcularPerimetro()).sum());
		
		//Bienvenidos al lado oscuro de JAVA; Casteos
		//casteo con expresion lambda
		double perimetroTotal= escenario.stream()
				.filter(Perimetro.class::isInstance)
				.map(Perimetro.class::cast).mapToDouble(p -> p.calcularPerimetro()).sum();
		
		System.out.println("perímetro total: " + perimetroTotal);
		
		//Ejemplo de uso de interfaz existente
		//List<Figura> figuras = escenario.stream()
		
		//EJemplo Interfaz Funcional
		Operacion<Integer> suma = (a,b)->(a+b);
		int res = suma.operacion(2,2);
		System.out.println("Sumar 2+2 es " + res);
		
		OperacionInteger sumaInt= (a,b)->(a+b);
		int resInt = sumaInt.operacion(2,2);
		System.out.println("Sumar 2+2 es " + resInt);
		
		//Ejemplo caja fuerte
		 
		CajaFuerte<String> claveTexto = new CajaFuerte<>("Abrete Sesamo");
		claveTexto.guardarValor("La clave del Home Banking");
		String claveOk=claveTexto.leerValor("Abrete Sesamo");
		System.out.println("la clave es: "+ claveOk);
		System.out.println("intentando acceder con una clave invalida");
		
		try {
			String claveNumMal = claveTexto.leerValor("asdsfwafra");
		}catch (Exception e){
			System.err.println(e.getMessage());
		}
		
	}

}