package indra.talentCamp.polimorfismo;

import java.util.ArrayList;
import java.util.List;

import indra.talentCamp.polimorfismo.models.Guerrero;
import indra.talentCamp.polimorfismo.models.Jugador;
import indra.talentCamp.polimorfismo.models.Mago;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guerrero excalibur = new Guerrero("Excalibur");
		Guerrero batman = new Guerrero("Batman");
		Jugador thanos = new Mago("Thanos");
		
		List<Jugador> personajes = new ArrayList<Jugador>();
		personajes.add(excalibur);
		personajes.add(batman);
		personajes.add(thanos);
		
		
		//comienzo del turno
		System.out.println("Comienzo del turno");
		personajes.forEach(System.out::println);
		System.out.println("-------------------------");
		
		batman.accion(excalibur);
		thanos.accion(excalibur);
		
		personajes.forEach(p->p.finalizarTurno());
		//fin del turno
		System.out.println("fin del turno");
		//personajes.forEach(System.out::println);
		personajes.stream().filter(n -> n.estaVivo()).forEach(System.out::println);
		System.out.println("-------------------------");
		
		
		System.out.println("Estudiantes con nota mayor a 90: " + estudiantes.stream().mapToInt(n -> n.notasMayoresDe90()).getNombre());
	}	

	
}
