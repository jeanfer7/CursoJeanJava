package indra.talentCamp.generics;

@FunctionalInterface
public interface Operacion<T>{
	//Si o si tiene que tener un solo metodo porque es una interfaz funcional
	T operacion(T a, T b);

}
