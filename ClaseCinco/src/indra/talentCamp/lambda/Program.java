package indra.talentCamp.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import indra.talentCamp.lambda.models.Persona;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String frase = "Que la fuerza" + " te acompañe";
//		String frase = "Que la fuerza";
//		frase += " te";
//		frase += "acompañe";
		
		//Este proceso es mucho más eficiente para concatenar strings y ahorrar memoria
//		StringBuilder builder = new StringBuilder();
//		builder.append("Que la fuerza");
//		builder.append(" te ");
//		builder.append("acompañe");
//		
//		System.out.println(builder.toString());
		
//		List <Persona> jedis = new ArrayList<Persona>();
//		
//		jedis.add(new Persona("Anakin", 178));
//		jedis.add(new Persona("Yoda", 80));
//		jedis.add(new Persona("Asoka", 165));
//		jedis.add(new Persona("Luke", 180));
		
		List <Persona> jedis = Arrays.asList(
				new Persona("Anakin", 178),
				new Persona("Yoda", 80),
				new Persona("Asoka", 165),
				new Persona("Luke", 180));
//		
//		System.out.println("la lista de Jedis:");
//		for (Persona jedi:jedis) {
//			System.out.println(jedi.getNombre());
//		}
		//jedis.forEach(jedi -> System.out.println(jedi.getNombre()));
		//Iterando con lambda de una manera particular
		
//		jedis.forEach(System.out::println);
		
//		List <Integer> numeros = Arrays.asList(4, 5, 656, 232, 54, 657, 865, 23, 433);
		//hacer codigo que calcule el más grande
//		int max=0;
//		for(Integer numero : numeros) {
//			if(numero > max) {
//				max=numero;
//			}
//		}
//		System.out.println("Número máximo: " + max);
//		int max = numeros.stream().max((a,b)->a.compareTo(b)).orElse(0);
//		System.out.println("Max:" + max);
//		Persona jediAlto = jedis.stream().max((a,b)->a.getCentimetrosAltura() - b.getCentimetrosAltura()).orElse(null);
//		System.out.println(jediAlto.getNombre());
		
		List <Integer> numeros = Arrays.asList(4, 5, 656, 232, 54, 657, 865, 23, 433);
		// Sumatoria tradicional de una lista de números
//		int total=0;
//		for(int numero : numeros) {
//			total +=numero;
//		}
//		System.out.println(total);
		
		System.out.println(numeros.stream().mapToInt(n->n).sum());
		System.out.println(jedis.stream().mapToInt(jedi->jedi.getCentimetrosAltura()).sum());
	}

}
