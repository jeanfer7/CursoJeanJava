package indra.talentCamp.encapsulamiento;

import java.util.Scanner;

import indra.talentCamp.encasulamiento.models.Student;
import indra.talentCamp.utils.Console;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		try {
			//Student padawan = new Student();
			System.out.println("Bienvenidos al TalentCamp de Java");
			
			//System.out.println("Cómo es su nombre?");
			//String nombre = in.nextLine();
			//padawan.name = in.nextLine();
			//padawan.setName(in.nextLine());
			//padawan.setName(Console.readString("Cómo es su nombre?"));
			
			//System.out.println("Cómo es su documento?");
			//int documento = Integer.parseInt(in.nextLine());
			//padawan.document = Integer.parseInt(in.nextLine());
			//padawan.setDocument(Integer.parseInt(in.nextLine()));
			//padawan.setDocument(Integer.parseInt(Console.readString("Introduce tu documento")));
			
			//System.out.println("Cuál es su dirección?");
			//String direccion = in.nextLine();
			//padawan.address = in.nextLine();
			//padawan.setAddress(in.nextLine());
			//padawan.setAddress(Console.readString("Introduce tu dirección"));
			
			//System.out.println("Te gusta el front? (S/N)");
			//String respuesta = Console.readString("Te gusta el front?");
			//boolean prefiereFront = (respuesta.equalsIgnoreCase("S"));
			//padawan.prefersFrontEnd = (respuesta.equalsIgnoreCase("S"));
			//padawan.setPrefersFrontEnd(respuesta.equalsIgnoreCase("S"));
			
			
			// ahora estoy obligado a usar mi nuevo constructor
			Teacher jedi = new Teacher(
					Console.readString("Cómo es su nombre?"),
					Console.readInt("Cuál es su documento?"),
					Console.readString("Cuál es su dirección")
					);
			Student padawan = new Student(
				Console.readString("Cómo es su nombre?"),
				Console.readInt("Cuál es su documento?"),
				Console.readString("Cuál es su dirección")
				);
				
			String respuesta = Console.readString("Te gusta el front?");
			padawan.setPrefersFrontEnd(respuesta.equalsIgnoreCase("S"));
			
//			System.out.println("Bienvenido " + padawan.getName() + "al TalentCamp de Java");
//			System.out.println("Su documento es " + padawan.getDocument() + "y vive en " + padawan.getAddress());
//			if(padawan.getPrefersFrontEnd()) {
//				System.out.println("Esperemos que se le asigne un programa de front");
//			}else {
//				System.out.println("Esperemos que se le asigne un programa de back");
//			}
			System.out.println(padawan);
		}finally{
			in.close();
		}
	}

}
