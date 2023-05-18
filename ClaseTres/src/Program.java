import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;
import indra.utils.Consola;

public class Program {

	public static void ejemploBufferedReaderConThrows() throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
				System.out.println("Ingrese su nombre:");
				String name= reader.readLine();
				System.out.println("hola " + name);
				System.out.println("Ingrese su edad:");
				String age= reader.readLine();
				int ageNum= Integer.parseInt(age); //para repasar
				System.out.println("La edad de " + name+  " es "+ ageNum);
		}finally {
			System.out.println("Cerrando el BufferedReader");
			reader.close();
		}
	}
	
	
	public static void ejemploBufferedReaderSinThrows(){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			try {
				System.out.println("Ingrese su nombre:");
				String name= reader.readLine();
				System.out.println("hola " + name);
				System.out.println("Ingrese su edad:");
				String age= reader.readLine();
				int ageNum= Integer.parseInt(age); //para repasar
				System.out.println("La edad de " + name+  " es "+ ageNum);
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}finally {
			System.out.println("Cerrando el BufferedReader");
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
		}
	}
	
	static final int CANTIDAD_OPORTUNIDADES = 5;
	static final int MAX_VALUE = 100;

	public static void juegoAdivinanza() {
		Random r = new Random();
		int secreto = r.nextInt(1,100);
		boolean adivino = false;
		int turnoActual=1; 
		
		System.out.println("Bienvenidos al juego");
		
		while((!adivino) && (turnoActual<=CANTIDAD_OPORTUNIDADES)) {
			int adivinanza = Consola.readInt();
			
			if(adivinanza < secreto) {
				System.out.println("El numero ingresado es menor al secreto");
			}else if (adivinanza > secreto) {
				System.out.println("El numero ingresado es mayor al secreto");
			}else {
				System.out.println("Felicidades has adivinado");
				adivino = true;
			}
			turnoActual++;
		}
		if (!adivino) {
			System.out.println("Lo siento no has adivinado, el numero era: " + secreto );
		}
		
		
		//Intento fallido
//		Random num = new Random();
//		int numRandom= num.nextInt(101);
//		int intento = 0;
//		int numEnter;
//		do {
//			System.out.println("Intenta adivinar el número que estoy pensando");
//			numEnter = Consola.readInt();
//			intento ++;
//		}while(numRandom != numEnter && intento<5){
//			if(numEnter > numRandom) {
//				System.out.println("tu número es mayor que el que intnetas adivinar");
//			}else {
//				System.out.println("tu número es mayor que el que intnetas adivinar");
//			}
//			System.out.println("Te quedan" + (5-intento) +  "intentos");
//		}
	}
	
	public static void main(String[] args) {

		//el operador para el resto de una division es %
		// este hacerlo con un for
		//dado un numero que me diga si es primo o no
		 int numero = Consola.readInt();
	     boolean esPrimo = true;
	     for (int i=2; i<numero/2; i++) {
	        if ((numero % i)==0) {
               esPrimo = false;
               break; //EL lado oscuro de la programacion!
	        }
	     }
	     if (esPrimo) {
	    	 System.out.println("El numero es Primo");
	     }else {
	         System.out.println("El numero no es primo");
	     }
	}
}
