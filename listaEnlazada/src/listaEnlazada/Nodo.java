package listaEnlazada;

public class Nodo {
	private Object contenido;
	private Nodo siguiente;
	
	public  Nodo(Object pContenido) {
		this.contenido = pContenido;
		this.siguiente = null;
	}
	
	public void agregar(Nodo pNodo) {
		 this.siguiente = pNodo;
	}

	public Object getContenido() {
		return contenido;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}
}
