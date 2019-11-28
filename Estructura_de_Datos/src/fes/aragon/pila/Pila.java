package fes.aragon.pila;

import fes.aragon.lista.t.TDAListaSimple;

public class Pila<T> {
	TDAListaSimple<T> pila = new TDAListaSimple<>();
	/**
	 * Este constructor me va a permitir inizializar la clase
	 */
	public Pila() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * El método insertar me va a permitir ingresar un dato, pero como 
	 * estamos utilizando un LIFO, se va a insertar en la “cola” de nuestra lista.
	 * (Cambia dependiendo en que sentido vayas, adelante[cabeza] o atras[cola]) 
	 * @param dato - valor ingresado por el usuario
	 */
	
	public void borrar() {
		this.pila = new TDAListaSimple<T>();
	}
	
	public void insertar(T dato){
		this.pila.insertarCola(dato);
	}
	/**
	 * El método sacar, lo que va a hacer es que el ultimo dato que entro en nuestra lista
	 * Va a borrarlo y hacer lo  que tiene nuestro método borrarCola.
	 * @return - Va a retornar un metodo.
	 */
	public T sacar(){
		return this.pila.borrarCola();
	}
	/**
	 * El método vacía va a verificar si nuestra pila(lista)
	 * tiene alguna dato dentro del arreglo.
	 * @return - Va a retornar un metodo
	 */
	public boolean vacia(){
		return this.pila.esVacia();
	}
	/**
	 * El método consulta nos va a permitir visualizar el ultimo dato ingresado en nuestra lista
  	 * lo que hace es que dentro de una variable “dato” de tipo T(genérico) va almacenar
	 * el último dato borrado (llamamos el método borrarCola), 
	 * después va a insertar el mismo dato en la cola y va a retornar el dato borrado.
	 * @return - Va a retornar el tipo de dato
	 */
	public T consultar(){
		T dato = this.pila.borrarCola();
		this.insertar(dato);
		return dato;
	}
	public int tamano() {
		return pila.getLongitud();
	}
	public void mostrar() {
		pila.mostrar();
	}
}