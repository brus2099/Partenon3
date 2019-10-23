package fes.aragon.cola;

import fes.aragon.listasimplet.TDAListaSimple;

public class Cola<T> {
	TDAListaSimple<T> cola = new TDAListaSimple<>();
	/**
	 * 
	 */
	public Cola() {
		
	}
	/**
	 * 
	 */
	public void borrar() {
		cola= new TDAListaSimple<T>();
	}
	
	/**
	 * 
	 * @param dato
	 */
	public void Insertar (T dato) {
		this.cola.insertarCola(dato);
	}
	
	/**
	 * 
	 * @return
	 */
	public T sacar() {
		return this.cola.eliminarCabeza();
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean vacia() {
		return this.cola.esVacia();
	}
	
	/**
	 * 
	 * @return
	 */
	public T verArriba() {
		T dato = this.cola.eliminarCabeza();
		cola.insertarCabeza(dato);
		return dato;
	}
	/**
	 * 
	 * @param dato
	 * @return
	 */
	public void  prioridad(T dato) {
		this.cola.insertarCabeza(dato);
	
	}
	/**
	 * 
	 */
	public void verCola() {
		cola.mostrarDatos();
	}
}