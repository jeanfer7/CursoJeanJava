package course.java.talentCamp;

import java.util.ArrayList;
import java.util.List;

public class Program {

	
	public static void cambiarValor(int n) {
		n=20;
	}
	
	public static void cambiarRectangulo(Rectangulo rec) {
		rec.base=30;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenidos a la clase 2");
		
		int number = 10;
		int b = 20;
		
		number=b;
	
		System.out.println(number);
		Rectangulo r = new Rectangulo();
		r.base=10;
		r.altura=20;
		System.out.println(r.base);
		
		Rectangulo r2 = null;
		//System.out.println(r2.altura); NullPointerException
		r2 = new Rectangulo();
		r2.base = 100;
		r2.altura = 40;
		System.out.println(r2.altura);
		
		//ATENCIÓN
		r=r2; //r apunta al mismo sitio que r2
		r2.base= 444;
		System.out.println(r.base); //por eso aqui imprime 444
		
		int a =555; 
		cambiarValor(a);
		System.out.println(a);
		
		r.base = 888;
		cambiarRectangulo(r);
		System.out.println(r.base);
		
		//Ctrl+Shift+O sirve para autocompletar los import si el IDE no los sugiere
		List<String> jedisDeJava = new ArrayList<String>();
		jedisDeJava.add("Marcos");
		jedisDeJava.add("Javier");
		jedisDeJava.add("Borja");
		jedisDeJava.add("Angello");
		jedisDeJava.add("Jean");
		
		//ojo, no es el que se usa
		String jediActual=null;
		System.out.println("Bienvenidos a la academia de Talent Camp jóvenes Padawan:");
		for(int i=0; i<jedisDeJava.size(); i++) {
			jediActual = jedisDeJava.get(i);
			System.out.println(jediActual);
			
		}
	}

}
