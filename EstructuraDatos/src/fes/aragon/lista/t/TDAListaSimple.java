package fes.aragon.lista.t;

/**
 * REPRESENTA TIPO DE DATO ABSTRACTO QUE ES UNA LISTA SIMPLEMENTE ENLAZADA
 * GENERICA
 * 
 * @author SAMUEL EDUARDO URIBE RAMIREZ
 * @version 27/08/2019
 * @param <T>
 */
public class TDAListaSimple<T> {
	private Nodo<T> cabeza;
	private Nodo<T> cola;
	private int longitud;

	public TDAListaSimple() {
		// TODO Auto-generated constructor stub
		cabeza = cola = null;
	}

	/**
	 * ESTE METODO SIRVE PARA AGREGAR UN NODO EN LA CABEZA
	 * 
	 * @param dato
	 */
	public void agregarCabeza(T dato) {
		if (cabeza == null) {
			this.cabeza = new Nodo<T>(dato);
			cola = cabeza;
		} else {
			Nodo<T> tmp = new Nodo<T>(dato);
			tmp.setSiguiente(cabeza);
			cabeza = tmp;
		}
		longitud++;
	}

	/**
	 * ESTE METODO SIRVE PARA AGREGAR UN NODO EN LA COLA
	 * 
	 * @param dato
	 */
	public void agregarCola(T dato) {
		if (cabeza == null) {
			this.cabeza = new Nodo<T>(dato);
			cola = cabeza;
		} else {
			Nodo<T> tmp = new Nodo<T>(dato);
			cola.setSiguiente(tmp);
			cola = tmp;
		}
		longitud++;
	}

	/**
	 * 
	 * @return
	 */
	public boolean esVacia() {
		return cabeza == null;
	}

	/**
 * 
 */
	public void mostrarDatos() {
		for (Nodo<T> tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
			System.out.println(tmp.toString());
		}
	}

	public T obtenerDato(int indice) {
		boolean error = false;
		if (indice < 0 || indice >= longitud) {
			error = true;
		}
		Nodo<T> tmp = null;
		if (!error) {
			int i = 0;
			for (tmp = cabeza; i != indice; tmp = tmp.getSiguiente(), i++)
				;
		}
		if (tmp != null) {
			return tmp.getDato();
		} else {
			return null;
		}
	}

	public void eliminarIndice(int indice) {
		boolean error = false;
		if (indice < 0 || indice >= longitud) {
			error = true;
		}
		if (!error) {
			if (indice == longitud - 1) {
				this.eliminarCola();
			} else if (indice == 0) {
				this.eliminarCabeza();
			} else {
				int i = 0;
				Nodo<T> tmp = cabeza.getSiguiente();
				Nodo<T> previo = cabeza;

				for (; tmp != null && i != indice - 1; previo = tmp, tmp = tmp
						.getSiguiente(), i++)
					;
				previo.setSiguiente(tmp.getSiguiente());
				tmp.setSiguiente(null);
				longitud--;
			}
		}
	}

	/**
	 * 
	 */
	public T eliminarCabeza() {
		Nodo<T> dato = null;
		if (this.cabeza == this.cola) {
			dato = cabeza;
			this.cabeza = this.cola = null;
		} else {
			dato = cabeza;
			Nodo<T> tmp = cabeza.getSiguiente();
			cabeza = tmp;
		}
		longitud--;
		return dato.getDato();
	}

	/**
	 * ESTE METODO ELIMINA EL
	 */
	public T eliminarCola() {
		Nodo<T> dato = null;
		if (this.cabeza == this.cola) {
			dato = cabeza;
			this.cabeza = this.cola = null;
		} else {
			Nodo<T> tmp = cabeza.getSiguiente();
			Nodo<T> previo = cabeza;
			for (; tmp.getSiguiente() != null; previo = tmp, tmp = tmp
					.getSiguiente())
				;
			this.cola = previo;
			dato = tmp;
			this.cola.setSiguiente(null);
		}
		longitud--;
		return dato.getDato();
	}

	/**
	 * 
	 * @return
	 */
	public int getLongitud() {
		return longitud;
	}

	public boolean eliminarDato(T dato) {
		boolean borrar = false;
		if (this.cabeza != null) {
			if ((this.cabeza == this.cola)
					&& (dato.equals(this.cabeza.getDato()))) {
				this.cabeza = this.cola = null;
				longitud--;
				borrar = true;

			} else if ((dato.equals(this.cabeza.getDato()))) {
				this.cabeza = cabeza.getSiguiente();
				longitud--;
				borrar = true;
			} else {
				Nodo<T> tmp = cabeza.getSiguiente();
				Nodo<T> previo = cabeza;
				for (; tmp != null && !(tmp.getDato().equals(dato)); previo = previo
						.getSiguiente(), tmp = tmp.getSiguiente())
					;
				if (tmp != null) {
					previo.setSiguiente(tmp.getSiguiente());
					if (tmp == this.cola) {
						this.cola = previo;
						cola.setSiguiente(null);
					}
					longitud--;
					borrar = true;

				}
			}

		}
		return borrar;
	}

	public Nodo<T> obtenerNodo(int indice) {
		boolean error = false;
		if (indice < 0 || indice >= longitud) {
			error = true;
		}
		Nodo<T> tmp = null;
		if (!error) {
			int i = 0;
			for (tmp = cabeza; i != indice; tmp = tmp.getSiguiente(), i++)
				;
		}
		if (tmp != null) {
			return tmp;
		} else {
			return null;
		}
	}

}
