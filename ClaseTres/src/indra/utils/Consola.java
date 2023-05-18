
	package indra.utils;

	import java.util.Scanner;

	public class Consola {
		
		public static boolean esNumerico(String numero){
	        //quiero que haga captura de excepciones
	        //y me devuelva si el string ingresado es numerico
	        try {
	            Double.parseDouble(numero);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }
		
		public static int readInt() {
			//lea un entero de la entrada estandar
			//si el usuario ingresa otra cosa que no sea un numero
			//se lo vuelve a preguntar
			System.out.println("ingrese un numero:");
			Scanner in = new Scanner(System.in);
			String entrada = in.nextLine();
			while(!esNumerico(entrada)) {
				System.out.println("No es un número. Ingrese un numero de nuevo:");
				entrada = in.nextLine();
			}
			return Integer.parseInt(entrada);
		}
		
//		public static int readInt(String prompt) {
//			
//			String numero = 
//			System.out.println("ingrese un numero:");
//			Scanner in = new Scanner(System.in);
//			String entrada = in.nextLine();
//			while(!esNumerico(entrada)) {
//				System.out.println("No es un número. Ingrese un numero de nuevo:");
//				entrada = in.nextLine();
//			}
//			return Integer.parseInt(entrada);
//		}
	}

