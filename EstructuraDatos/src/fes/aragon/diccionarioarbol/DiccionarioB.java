package fes.aragon.diccionarioarbol;

import fes.aragon.diccionarioarbol.Nodo;;

public class DiccionarioB<T> {

	private Nodo<T> raiz;
	
	public DiccionarioB() {
		// TODO Auto-generated constructor stub
		super();
		this.raiz = null;
	}
	
	public void insertar(T clave, Alumno dato) {
		Nodo<T> n = raiz, previo = null;
		while (n != null) {
			previo = n;
			if (n.comparaMenor(dato)) {
				n = n.getHijoDer();
			} else {
				n = n.getHijoIzq();
			}
		}
		if (raiz == null) {
			raiz = new Nodo<T>(clave, dato);
		} else {
			if (previo.comparaMenor(dato)) {
				previo.setHijoDer(new Nodo<T>(clave, dato));
			} else {
				previo.setHijoIzq(new Nodo<T>(clave, dato));
			}
		}
	}
	
	public Alumno buscar (T clave) {
		Nodo<T> n = raiz, previo = null;
		Alumno info = null;
		while (n != null) {
			if (n.getClave().equals(clave)) {
				break;
			}
			if (n.comparaMenor(clave)) {
				n = n.getHijoDer();
			} else {
				n = n.getHijoIzq();
			}
		}
		info = n.getDato();
		return info;
	}
}
