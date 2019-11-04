package fes.aragon.inicio;

public class Nodo {
	private Nodo siguiente;
	private float dato;
	
	public Nodo(float dato) {
		this.dato=dato;
		this.siguiente=null;
	}
	
	public void setSiguiente(Nodo siguiente) {
		this.siguiente=siguiente;
	}
	
	public Nodo getSiguiente() {
		return siguiente;
	}
	
	public float getDato() {
		return dato;
	}
	
	public void setDato(float dato) {
		this.dato=dato;
	}
	
	
	public String toString() {
		return this.dato+"";
	}
}
