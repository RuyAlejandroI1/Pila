package Clase1;

public class Nodo {

	private int Elemento;
	private Nodo Siguiente;

	public Nodo(int elemento, Nodo siguiente) {
		this.Elemento = elemento;
		this.Siguiente = siguiente;
	}

	public int getElemento() {
		return Elemento;
	}

	public void setElemento(int elemento) {
		this.Elemento = elemento;
	}

	public Nodo getSiguiente() {
		return Siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.Siguiente = siguiente;
	}

	@Override
	public String toString() {
		return "Nodo [Elemento=" + Elemento + ", Siguiente=" + Siguiente + "]";
	}
}
