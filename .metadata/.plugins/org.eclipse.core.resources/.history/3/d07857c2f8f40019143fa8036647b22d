package fes.aragon.pila;

import fes.aragon.listasimplet.TDAListaSimple;

public class Pila<T> {

	private TDAListaSimple<T> pila;

	public boolean vacia() {
		return this.pila.esVacia();
	}
	
	public void insertar(T dato) {
		this.pila.insertarCola(dato);
	}
	
	public T sacar() {
		return this.pila.eliminarCabeza();
	}
	
	public T verArriba() {
		T dato = this.pila.eliminarCabeza();
		this.insertar(dato);
		return dato;
	}
}
