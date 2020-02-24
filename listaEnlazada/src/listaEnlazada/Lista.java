package listaEnlazada;

public class Lista {
	private Nodo cabeza;
	private int tamano;
	
	public Lista() {
		cabeza = null;
		tamano = 0;
	}
	
	public Object obteberNodo(int indice) {
		int cont = 0;
		Nodo temp = cabeza;
		while(cont < indice) {
			temp = temp.getSiguiente();
			cont++;
		}
		return temp.getContenido();
	}
	
	public void  agregar(Object agregado) {
		if(cabeza == null) {
			cabeza = new Nodo(agregado);
		}else {
			Nodo temp = cabeza;
			Nodo nuevo = new Nodo(agregado);
			nuevo.agregar(temp);
			cabeza = nuevo; 
		}
		tamano++;
	}
	
	public int getTamano() {
		return tamano;
	}

	public boolean vacia() {
		return (cabeza == null)?true:false;
	}
	
	

}
