package fes.aragon.nodo;

public class Nodo<T> {
	
	private T dato; 
	private Nodo<T> hijoIzq;
	private Nodo<T> hijoDer;
	private Nodo<T> siguiente;
	
	public Nodo(T dato) {
		super();
		this.dato = dato;
		this.hijoIzq = null;
		this.hijoDer = null;
	}
	public T getDato() {
		return dato;
	}
	public void setDato(T dato) {
		this.dato = dato;
	}
	public Nodo<T> getHijoIzq() {
		return hijoIzq;
	}
	public void setHijoIzq(Nodo<T> hijoIzq) {
		this.hijoIzq = hijoIzq;
	}
	public Nodo<T> getHijoDer() {
		return hijoDer;
	}
	public void setHijoDer(Nodo<T> hijoDer) {
		this.hijoDer = hijoDer;
	}
	public boolean compararMenor(Object obj) {
		boolean resultado = false;
		if (dato instanceof Integer) {
			Integer dat1 = (Integer) dato;
			Integer dat2 = (Integer) obj;
			resultado = dat1 <= dat2;
		} else if (dato instanceof Float) {
			Float dat1 = (Float) dato;
			Float dat2 = (Float) obj;
			resultado = dat1 <= dat2;
		} else if (dato instanceof Double) {
			Double datl = (Double) dato;
			Double dat2 = (Double) obj;
			resultado = datl <= dat2;
		}
		return resultado;
	}
	public Nodo<T> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}
	
}