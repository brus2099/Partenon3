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
		this.cola.agregarCola(dato);

	}

	public T sacar() {
		return this.cola.eliminarCabeza();
	}

	public boolean vacia() {
		return this.cola.esVacia();
	}

	public T verArriba() {
		T dato = this.cola.eliminarCola();
		cola.agregarCabeza(dato);
		return dato;
	}

	public void mostrar() {
		cola.mostrarDatos();
	}
	public void prioridad (T dato){
		this.cola.agregarCabeza(dato);
	}
}
