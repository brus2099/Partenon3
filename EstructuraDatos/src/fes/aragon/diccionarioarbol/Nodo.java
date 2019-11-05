package fes.aragon.diccionarioarbol;

public class Nodo <T> {
	private T clave;
	private Nodo<T> hijoIzq;
	private Nodo<T> hijoDer;
	private Alumno dato;
	
	
	public Nodo(T clave, Alumno dato) {
		super();
		this.clave = clave;
		this.dato = dato;
	}
	
	public T getClave() {
		return clave;
	}

	public void setClave(T clave) {
		this.clave = clave;
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
	public boolean comparaMenor(Object obj){
		boolean resultado = false;
		if (clave instanceof Integer){
			Integer dat1 = (Integer) clave;
			Integer dat2 = (Integer) obj;
			resultado = dat1<=dat2;
		}else if (clave instanceof Float){
			Float dat1 = (Float) clave;
			Float dat2 = (Float) obj;
			resultado = dat1<=dat2;
		}	else if (clave instanceof Double){
			Double dat1 = (Double) clave;
			Double dat2 = (Double) obj;
			resultado = dat1<=dat2;
		}
		return resultado;
	}
	public void setDato(Alumno dato) {
		this.dato = dato;
	}

	public Alumno getDato() {
		return dato;
	}
	
	
	
	
	
}
