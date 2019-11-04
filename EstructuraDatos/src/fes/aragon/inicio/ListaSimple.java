
package fes.aragon.inicio;


public class ListaSimple {
	private Nodo cabecera;
	private Nodo cola;
	private int longitud;

	public ListaSimple() {
		cabecera = cola = null;
	}

	public void agregarCabeza(float dato) {
		if (cabecera == null) {
			this.cabecera = new Nodo(dato);
			cola = cabecera;
		} else {
			Nodo tmp = new Nodo(dato);
			tmp.setSiguiente(cabecera);
			cabecera = tmp;
		}
		longitud++;
	}

	public void agregarCola(float dato) {
		if (cabecera == null) {
			this.cabecera = new Nodo(dato);
			cola = cabecera;
		} else {
			Nodo tmp = new Nodo(dato);
			cola.setSiguiente(tmp);
			cola = tmp;
		}
		longitud++;
	}

	public boolean esVacia() {
		return cabecera == null;
	}

	public void mostrarDatos() {
		for (Nodo tmp = cabecera; tmp != null; tmp = tmp.getSiguiente()) {
			System.out.println(tmp.toString());
		}
	}

	public float obtenerDato(int indice) {
		boolean error = false;
		if (indice < 0 || indice >= longitud) {
			error = true;
		}
		Nodo tmp = null;
		if (!error) {
			int i = 0;
			for (tmp = cabecera; i != indice; tmp = tmp.getSiguiente(), i++)
				;
		}
		if (tmp != null) {
			return tmp.getDato();
		} else {
			return -1;
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
				Nodo tmp = cabecera.getSiguiente();
				Nodo previo = cabecera;

				for (; tmp != null && i != indice - 1; previo = tmp, tmp = tmp.getSiguiente(), i++)
					;
				previo.setSiguiente(tmp.getSiguiente());
				tmp.setSiguiente(null);
				longitud--;
			}
		}
	}

	public void eliminarCabeza() {
		if (this.cabecera == this.cola) {
			this.cabecera = this.cola = null;
		} else {
			Nodo tmp = cabecera.getSiguiente();
			cabecera = tmp;
		}
		longitud--;
	}

	public void eliminarCola() {
		if (this.cabecera == this.cola) {
			this.cabecera = this.cola = null;
		} else {
			Nodo tmp = cabecera.getSiguiente();
			Nodo previo = cabecera;
			for (; tmp.getSiguiente() != null; previo = tmp, tmp = tmp.getSiguiente())
				;
			this.cola = previo;
			this.cola.setSiguiente(null);
		}
	}

	public int getLongitud() {
		return longitud;
	}
}

