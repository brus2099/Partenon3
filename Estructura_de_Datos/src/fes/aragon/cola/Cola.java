package fes.aragon.cola;

import fes.aragon.lista.t.TDAListaSimple;

public class Cola<T> {

	TDAListaSimple<T> cola = new TDAListaSimple<>();

	public Cola() {
		// TODO Auto-generated constructor stub
	}

	public void borrar() {
		cola = new TDAListaSimple<>();
	}

	public void insertar(T dato) {
		this.cola.insertarCola(dato);
	}

	public void prioridad(T dato) {
		this.cola.insertarCabeza(dato);
	}

	public T sacar() {
		return this.cola.borrarCabeza();
	}

	public boolean vacia() {
		return this.cola.esVacia();
	}

	public T verArriba() {
		T dato = this.cola.borrarCabeza();
		this.cola.insertarCabeza(dato);
		return dato;
	}

	public void mostrar() {
		cola.mostrar();
	}
}