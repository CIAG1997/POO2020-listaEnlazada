package listaEnlazada;

public class Main {

	public static void main(String[] args) {
		Lista lista1 = new Lista();
		
		lista1.agregar("hola");
		lista1.agregar("hola2");
		lista1.agregar("hola3");
		
		System.out.println(lista1.obteberNodo(0));
	}

}
