package fes.aragon.lista.t;

public class TDA_ListaSimpleT<T> {

	private Nodo<T> cabeza;
	private Nodo<T> cola;
	private int longitud;

	public TDA_ListaSimpleT() {
		cabeza = cola = null;
	}

	public int getLongitud() {
		return longitud;
	}

	public void agregarCabeza(T dato) {
		if (cabeza == null) {
			cabeza = new Nodo<T>(dato);
			cabeza = cola;
		} else {
			Nodo<T> temp = new Nodo<T>(dato);
			temp.setSiguiente(cabeza);
			cabeza = temp;
		}
		longitud++;
	}

	public void agregarCola(T dato) {

		if (cabeza == null) {
			cabeza = new Nodo<T>(dato);
			cola = cabeza;
		} else {
			Nodo<T> temp = new Nodo<T>(dato);
			cola.setSiguiente(temp);
			cola = temp;
		}
		longitud++;
	}

	public T borrarCabeza() {

		Nodo<T> dato = null;
		if (cabeza == cola) {
			dato = cabeza;
			cabeza = cola = null;
		} else {
			dato = cabeza;
			Nodo<T> temp = cabeza.getSiguiente();
			cabeza = temp;
		}
		longitud--;
		return dato.getDato();
	}

	public T borrarCola() {

		Nodo<T> dato = null;
		if (cabeza == cola) {
			dato = cabeza;
			cabeza = cola = null;
		} else {
			Nodo<T> temp = cabeza.getSiguiente();
			Nodo<T> previo = cabeza;

			for (; temp.getSiguiente() != null; previo = temp, temp = temp.getSiguiente())
				;

			this.cola = previo;
			dato = temp;
			this.cola.setSiguiente(null);
		}
		longitud--;
		return dato.getDato();
	}

	public boolean esVacia() {
		return cabeza == null;
	}

	public void mostrarInfo() {
		for (Nodo<T> temp = cabeza; temp != null; temp = temp.getSiguiente()) {
			System.out.println(temp.toString());
		}
	}

	public T obtenerDato(int indice) {
		boolean error = false;
		if (indice < 0 || indice > longitud) {
			error = true;
		}
		Nodo<T> tmp = null;
		if (!error) {
			int i = 0;
			tmp = cabeza;
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
				borrarCola();
			} else if (indice == 0) {
				borrarCabeza();
			} else {
				int i = 0;
				Nodo<T> temp = cabeza.getSiguiente();
				Nodo<T> previo = cabeza;
				for (; temp != null && i != indice - 1; previo = temp, temp = temp.getSiguiente(), i++)
					;

				previo.setSiguiente(temp.getSiguiente());
				temp.setSiguiente(null);
				longitud--;
			}
		}
	}

	public boolean eliminarDato(T dato) {
		boolean borrar = false;
		if (this.cabeza != null) {
			if ((this.cabeza == this.cola) && (dato.equals(this.cabeza.getDato()))) {
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
				for (; tmp != null
						&& !(tmp.getDato().equals(dato)); previo = previo.getSiguiente(), tmp = tmp.getSiguiente())
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

	public int obtenerIndice(T dato) {
		int indice = -1;
		if (this.cabeza != null) {
			if ((dato.equals(this.cabeza.getDato()))) {
				indice = 0;
			} else {
				Nodo<T> tmp = cabeza.getSiguiente();
				int i = 1;
				for (; tmp != null && !(tmp.getDato().equals(dato)); tmp = tmp.getSiguiente(), i++)
					;
				if (tmp != null) {
					indice = i;
				}
			}

		}
		return indice;
	}

	public Nodo<T> obtenerNodo(int indice) {
		boolean error = false;
		if (indice < 0 || indice > longitud) {
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

	public void cambiarIndice(int indice, T dato) {
		boolean error = false;
		if (indice < 0 || indice > longitud) {
			error = true;
		}
		Nodo<T> tmp = null;
		if (!error) {
			int i = 0;
			for (tmp = cabeza; i != indice; tmp = tmp.getSiguiente(), i++);
		}

		if (tmp != null) {
			tmp.setDato(dato);
		}

	}

	public void intercambiar(int ind1, int ind2) {
		T temp = this.obtenerDato(ind1);
		this.cambiarIndice(ind1, this.obtenerDato(ind2));
		this.cambiarIndice(ind2, temp);
	}

}
