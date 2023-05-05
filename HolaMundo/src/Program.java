public class Program {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		
		//Tipos de datos primitivos
		int numero = 20;
		System.out.println(numero + "20");
		
		
		double medio = 0.5; 
		System.out.println(medio);
		
		boolean verdadero = true;
		System.out.println(verdadero);
		//tipos de dato objeto (hay que pedir memoria con new)
		String nombre = "Jean"; //como es tan comun se omite new
		//String nombre = new String("Hola")
		System.out.println(nombre);
		
		
		@SuppressWarnings("removal")
		Integer num = new Integer(2); // me da error
		System.out.println(num);
		
		//conversion de tipos
		//numero = medio; no compila, asignacion invalida (Type missmatch)
		medio = numero; // conversión implícita
		System.out.println(medio);
		
		String enLetras = Integer.toString(numero); //conversión explicita de numero a string
		System.out.println("el numero en String es: " + enLetras);
		
		enLetras="22";
		numero=Integer.parseInt(enLetras); //conversion explicita de String a número
		System.out.println(enLetras);
		
		//Captura de excepciones
		try {
			enLetras = "22dos";
			numero = Integer.parseInt(enLetras);
		}catch (NumberFormatException ex) {
			System.out.println("no se pudo hacer la conversión de " + enLetras + " a int");
		}catch (Exception ex) {
			System.out.println("Ocurrió un error inesperado");
		}
		
		
		//Convierto un string a un número decimal en una variable float
		
		enLetras = "2.6";
		float enNum= Float.parseFloat(enLetras);
		System.out.println(enNum);
		
		enLetras = "22.2";
        double doubleLetras = Double.valueOf(enLetras);
        System.out.println(doubleLetras);
		
		
	}
	

}

