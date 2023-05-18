package indra.talentCamp.polimorfismo;

import java.util.ArrayList;
import java.util.List;

import indra.talentCamp.polimorfismo.models.Animal;
import indra.talentCamp.polimorfismo.models.Gato;
import indra.talentCamp.polimorfismo.models.Perro;
import indra.talentCamp.polimorfismo.models.Vaca;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal perro = new Perro();
		Animal gato = new Gato();
		Animal vaca = new Vaca();
		
		List<Animal> mamiferos =new ArrayList<Animal>();
		mamiferos.add(gato);
		mamiferos.add(perro);
		mamiferos.add(vaca);
		
		System.out.println("Estos animales hacen estos sonidos:");
		mamiferos.forEach(t -> System.out.println(t.getClass().getSimpleName()));
		mamiferos.forEach(t -> t.hacerSonido());
	}

}
