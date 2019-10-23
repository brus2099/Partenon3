package fes.aragon.arbol;

import fes.aragon.cola.Cola;
import fes.aragon.nodo.Nodo;
import fes.aragon.pila.Pila;

public class ArbolBinario<T> {
	private Nodo<T> raiz;

	public ArbolBinario() {
		super();
		this.raiz = null;
	}

	public void insertar(T dato) {
		Nodo<T> n = raiz, prev = null;
		while (n != null) {
			prev = n;
			if (n.compararMenor(dato)) {
				n = n.getHijoDer();
			} else {
				n = n.getHijoIzq();
			}
		}
		if (raiz == null) {
			raiz = new Nodo<T>(dato);
		} else {
			if (prev.compararMenor(dato)) {
				prev.setHijoDer(new Nodo<T>(dato));
			} else {
				prev.setHijoIzq(new Nodo<T>(dato));
			}
		}
	}

	public void recAmplitud() {
		Nodo<T> n = raiz;
		Cola<Nodo<T>> cola = new Cola<>();
		if (n != null) {
			cola.Insertar(raiz);
			while (!cola.vacia()) {
				/*public class Cola {

				}*/

				n = cola.sacar();
				System.out.println(n.getDato());
				if (n.getHijoIzq() != null) {
					cola.Insertar(n.getHijoIzq());
				}
				if (n.getHijoDer() != null) {
					cola.Insertar(n.getHijoDer());
				}
			}
		}
	}

	public void posfija (Nodo n) {
		if(n!=null) {
			posfija(n.getHijoIzq());
			posfija(n.getHijoDer());
			System.out.println(n.getDato());
		}
	}
	
	public Nodo<T> getRaiz() {
		return raiz;
	}
	
	public void insertarPsofija(String[] cadena) { 
		int indice = 0;
		String simbolo = cadena[indice];
		indice++;
		Nodo<String> ultimoNodo = new Nodo<String>(simbolo);
		raiz = (Nodo<T>) ultimoNodo;
		boolean sigMovimiento = true;
		Pila<Nodo<String>> pila = new Pila<>();
		simbolo = cadena[indice];
		while(indice<cadena.length) {
			Nodo<String> nuevoNodo = new Nodo(simbolo);
			if (sigMovimiento) {
				ultimoNodo.setHijoIzq(nuevoNodo);
				pila.insertar(ultimoNodo);
				ultimoNodo = nuevoNodo;
			}
		}
	}
	
	
	
	
	
	
	
}