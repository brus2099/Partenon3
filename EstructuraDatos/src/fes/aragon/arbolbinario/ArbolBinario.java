package fes.aragon.arbolbinario;

import fes.aragon.cola.Cola;
import fes.aragon.lista.t.Pila;

public class ArbolBinario<T> {
	private Nodo<T> raiz;

	public ArbolBinario() {
		super();
		this.raiz = null;
	}

	public void insertar(T dato) {
		Nodo n = raiz, previo = null;
		while (n != null) {
			previo = n;
			if (n.comparaMenor(dato)) {
				n = n.getHijoDer();
			} else {
				n = n.getHijoIzq();
			}
		}
		if (raiz == null) {
			raiz = new Nodo(dato);
		} else {
			if (previo.comparaMenor(dato)) {
				previo.setHijoDer(new Nodo<T>(dato));
			} else {
				previo.setHijoIzq(new Nodo(dato));
			}
		}
	}

	public void recAmplitud() {
		Nodo n = raiz;
		Cola<Nodo> cola = new Cola<>();
		if (n != null) {
			cola.insertar(raiz);
			while (!cola.vacia()) {
				n = cola.sacar();
				System.out.print(n.getDato()+" ");
				if (n.getHijoIzq() != null) {
					cola.insertar(n.getHijoIzq());
				}
				if (n.getHijoDer() != null) {
					cola.insertar(n.getHijoDer());
				}
			}
		}
	}

	public void prefija(Nodo n) {
		if (n != null) {
			System.out.print(n.getDato()+" ");
			prefija(n.getHijoIzq());
			prefija(n.getHijoDer());
		}

	}

	public void posfija(Nodo n) {
		if (n != null) {
			posfija(n.getHijoIzq());
			posfija(n.getHijoDer());
			System.out.print(n.getDato()+" ");
		}
	}

	public void interfija(Nodo n) {
		if (n != null) {
			interfija(n.getHijoIzq());
			System.out.print(n.getDato()+" ");
			interfija(n.getHijoDer());
		}
	}

	public void posfijaCad(Nodo n, String cad) {
		if (n != null) {
			posfijaCad(n.getHijoIzq(), cad);
			posfijaCad(n.getHijoDer(), cad);
			cad = cad + n.getDato();
		}
	}
	
	public Nodo<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo<T> raiz) {
		this.raiz = raiz;
	}

	public void insertarPosfija(String[] cadena) {
		int indice = 0;
		String simbolo = cadena[indice];
		indice++;
		Nodo<String> ultimoNodo = new Nodo<String>(simbolo);
		raiz = (Nodo<T>) ultimoNodo;
		boolean sigMovimiento = true;
		Pila<Nodo<String>> pila = new Pila<>();
		simbolo = cadena[indice];
		while (indice < cadena.length) {
			Nodo<String> nuevoNodo = new Nodo(simbolo);
			if (sigMovimiento = true) {
				ultimoNodo.setHijoIzq(nuevoNodo);
				pila.insertar(ultimoNodo);
			} else {
				ultimoNodo = pila.sacar();
				ultimoNodo.setHijoDer(nuevoNodo);
			}
			if (simbolo.equals("+") || simbolo.equals("-")
					|| simbolo.equals("*") || simbolo.equals("/")
					|| simbolo.equals("^")) {
				sigMovimiento = true;
			} else {
				sigMovimiento = false;
			}
			ultimoNodo = nuevoNodo;
			indice++;
			if (indice < cadena.length) {

				simbolo = cadena[indice];
			}

		}
	}

	public void eliminar(T dato) {
		Nodo<T> tmp, nodo, previo = null, n = raiz;
		while (n != null && n.getDato() != dato) {
			previo = n;
			if (n.comparaMenor(dato)) {
				n = n.getHijoDer();
			} else {
				n = n.getHijoIzq();
			}
		}
		nodo = n;
		if (n != null && n.getDato() == dato) {
			if (nodo.getHijoDer() == null) {
				nodo = nodo.getHijoIzq();
			} else if (nodo.getHijoIzq() == null) {
				nodo = nodo.getHijoDer();
			} else {
				tmp = nodo.getHijoIzq();
				while (tmp.getHijoDer() != null) {
					tmp = tmp.getHijoDer();
				}
				tmp.setHijoDer(nodo.getHijoDer());
				nodo = nodo.getHijoIzq();
			}
			if (n == raiz) {
				raiz = nodo;
			} else if (previo.getHijoIzq() == n) {
				previo.setHijoIzq(nodo);
			} else {
				previo.setHijoDer(nodo);
			}
		} else if (raiz != null) {
			System.out.println("No existe el dato");
		} else {
			System.out.println("Arbol vacio");
		}
	}
}
