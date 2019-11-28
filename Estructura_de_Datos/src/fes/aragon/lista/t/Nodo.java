package fes.aragon.lista.t;


public class Nodo<T> {
	private T dato;
	private Nodo<T> siguiente;
	
	public Nodo (T dato)
	{
		super();
		this.dato = dato;
		this.siguiente = null;		
	}
	
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}


	public Nodo<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}


	public String toString() {
		
		return this.dato + "";
	}
	
	public boolean menor(Object obj){
		boolean resultado=false;
		if (dato instanceof Integer) {
			Integer dat1=(Integer)dato;
			Integer dat2=(Integer)obj;
			resultado = dat1 < dat2;
		}
		else if (dato instanceof Float) {
			Float dat1=(Float)dato;
			Float dat2=(Float)obj;
			resultado = dat1 < dat2;
		}
		else if (dato instanceof Double){
			Double dat1=(Double)dato;
			Double dat2=(Double)obj;
			resultado = dat1 < dat2;
		}
		return resultado;
		
	}
	public boolean mayor(Object obj){
		boolean resultado=false;
		if (dato instanceof Integer) {
			Integer dat1=(Integer)dato;
			Integer dat2=(Integer)obj;
			resultado = dat1 > dat2;
		}
		else if (dato instanceof Float) {
			Float dat1=(Float)dato;
			Float dat2=(Float)obj;
			resultado = dat1 > dat2;
		}
		else if (dato instanceof Double){
			Double dat1=(Double)dato;
			Double dat2=(Double)obj;
			resultado = dat1 > dat2;
		}
		return resultado;
		
	}

}
