package Colas;

public class Nodo {

	private int elemento;
	private Nodo siguiente;
	private Nodo anterior;

	public Nodo(int elemento, Nodo siguiente, Nodo anterior) {
		this.elemento = elemento;
		this.siguiente = siguiente;
		this.anterior = anterior;
	}

	public int getElemento() {
		return elemento;
	}

	public void setElemento(int elemento) {
		this.elemento = elemento;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public Nodo getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}

	@Override
	public String toString() {
		return "\nNodo [elemento=" + elemento + ", siguiente=" + siguiente + ", anterior=" + anterior + "]";
	}
	
}