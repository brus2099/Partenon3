package fes.aragon.ordenamiento;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import fes.aragon.lista.t.TDAListaSimple;

@SuppressWarnings("hiding")
public class MetodosDeOrdenamiento<T> implements Runnable {

	private PropertyChangeSupport soporte = new PropertyChangeSupport(this);
	private TDAListaSimple<T> lista;
	private int metodo;

/**
Con el retraso se modula la velocidad con la que se ordenan
**/
	private int retraso = 10;

	private float retInicio = 0;
	private boolean bandera;

	public MetodosDeOrdenamiento(TDAListaSimple<T> lista, int met, boolean bandera) {
		this.lista = (TDAListaSimple<T>) lista;
		this.metodo = met;
		this.bandera = bandera;
	}

	public <T> void burbuja(TDAListaSimple<T> lista, int ini, int med) {
		for (int i = ini; i < med - 1; i++) {
			for (int j = med - 1; j > i; j--) {
				if (lista.obtenerNodo(j).menor(lista.obtenerNodo(j - 1).getDato())) {
					T tmp = lista.obtenerNodo(j).getDato();
					lista.obtenerNodo(j).setDato(lista.obtenerNodo((j - 1)).getDato());
					lista.obtenerNodo(j - 1).setDato(tmp);
					espera("burbuja");
				}
			}
		}
	}

	public <T> void burbujaS(TDAListaSimple<T> lista, int ini, int med, String otro) {
		for (int i = ini; i < med - 1; i++) {
			for (int j = med - 1; j > i; j--) {
				if (lista.obtenerNodo(j).menor(lista.obtenerNodo(j - 1).getDato())) {
					T tmp = lista.obtenerNodo(j).getDato();
					lista.obtenerNodo(j).setDato(lista.obtenerNodo((j - 1)).getDato());
					lista.obtenerNodo(j - 1).setDato(tmp);

					espera(otro);
				}
			}
		}
	}

	public <T> void seleccionDirecta(TDAListaSimple<T> lista, int ini, int med) {
		for (int i = ini; i < med - 1; i++) {

			T menor = lista.obtenerDato(i);
			int k = i;

			for (int j = i + 1; j < med; j++) {
				if (lista.obtenerNodo(j).menor(menor)) {
					menor = lista.obtenerDato(j);
					k = j;
				}
			}
			lista.obtenerNodo(k).setDato(lista.obtenerNodo((i)).getDato());
			lista.obtenerNodo(i).setDato(menor);
			espera("seleccion");
		}
	}

	public <T> void seleccionDirectaS(TDAListaSimple<T> lista, int ini, int med, String metodo) {
		for (int i = ini; i < med - 1; i++) {

			T menor = lista.obtenerDato(i);
			int k = i;

			for (int j = i + 1; j < med; j++) {
				if (lista.obtenerNodo(j).menor(menor)) {
					menor = lista.obtenerDato(j);
					k = j;
				}
			}
			lista.obtenerNodo(k).setDato(lista.obtenerNodo((i)).getDato());
			lista.obtenerNodo(i).setDato(menor);
			espera(metodo);
		}
	}

	public <T> void insercion(TDAListaSimple<T> lista, int ini, int med) {
		for (int j = ini + 1; j < med; j++) {
			T clave = lista.obtenerDato(j);
			int i = j - 1;
			while (i > -1 && !lista.obtenerNodo(i).menor(clave)) {
				lista.obtenerNodo(i + 1).setDato(lista.obtenerNodo((i)).getDato());
				i = i - 1;
			}
			lista.obtenerNodo(i + 1).setDato(clave);
			espera("insercion");
		}
	}

	public <T> void mezcla(TDAListaSimple<T> lista, int ini, int med) {

		TDAListaSimple<T> listaI = new TDAListaSimple<>();
		TDAListaSimple<T> listaD = new TDAListaSimple<>();

		burbujaS(lista, ini, med, "mezcla");
		burbujaS(lista, med, lista.getLongitud(), "mezcla");

		for (int i = ini; i < med; i++) {
			listaI.insertarCola(lista.obtenerDato(i));
		}
		for (int i = med; i < lista.getLongitud(); i++) {
			listaD.insertarCola(lista.obtenerDato(i));
		}

		for (int i = 0; i < lista.getLongitud(); i++) {
			if (!listaI.esVacia() && !listaD.esVacia()) {
				if (listaI.obtenerNodo(0).menor(listaD.obtenerNodo(0).getDato())) {
					lista.obtenerNodo(i).setDato(listaI.obtenerDato(0));
					listaI.borrarCabeza();
				} else {
					lista.obtenerNodo(i).setDato(listaD.obtenerDato(0));
					listaD.borrarCabeza();
				}

			} else if (listaD.esVacia() && !listaI.esVacia()) {
				lista.obtenerNodo(i).setDato(listaI.obtenerDato(0));
				listaI.borrarCabeza();
			}

			else if (listaI.esVacia() && !listaD.esVacia()) {
				lista.obtenerNodo(i).setDato(listaD.obtenerDato(0));
				listaD.borrarCabeza();
			}
			espera("mezcla");
		}
	}

	public <T> void shell(TDAListaSimple<T> lista, int ini, int med) {
		int base = med / 4;
		int j = 0;
		int cambios = 0;
		while (base > 0) {
			for (int k = ini; k < base; k++) {
				for (int i = k; i < med; i = i + base) {
					j = i + base;
					if (j < med && i >= 0) {
						if (lista.obtenerNodo(j).menor(lista.obtenerNodo(i).getDato())) {
							T tmp = lista.obtenerNodo(j).getDato();
							lista.obtenerNodo(j).setDato(lista.obtenerNodo((i)).getDato());
							lista.obtenerNodo(i).setDato(tmp);
							if (i != 0) {
								i = i - (base * 2);
							} else {
								i = i - base;

							}
							cambios++;
							espera("shell");
						} else {
							i = i + (base * cambios);
							cambios = 0;
						}
					}

				}
			}

			base--;
		}
	}

	public <T> void quick(TDAListaSimple<T> lista, int izq, int der) {
		int indice = particion(lista, izq, der);

		if (izq < indice - 1) {
			quick(lista, izq, indice - 1);
		}
		if (indice < der) {
			quick(lista, indice, der);
		}
	}

	private <T> int particion(TDAListaSimple<T> lista, int izq, int der) {
		T pivote = lista.obtenerDato((int) (izq + der) / 2);
		while (izq <= der) {
			while (lista.obtenerNodo(izq).menor(pivote)) {
				izq++;
			}
			while (lista.obtenerNodo(der).mayor(pivote)) {
				der--;
			}
			if (izq <= der) {
				lista.intercambiar(izq, der);
				espera("quick");
				izq++;
				der--;
			}
		}
		return izq;
	}

	public void espera(String metodo) {
		this.soporte.firePropertyChange(metodo, null, lista);
		try {
			if (bandera) {
				Thread.sleep(retraso);
				retInicio += retraso;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public float getRetInicio() {
		return retInicio;
	}

	public void agregarOyentes(PropertyChangeListener oyentes) {
		soporte.addPropertyChangeListener(oyentes);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (this.metodo == 1) {
			this.burbuja(lista, 0, lista.getLongitud());
		}
		if (this.metodo == 2) {
			this.seleccionDirecta(lista, 0, lista.getLongitud());
		}
		if (this.metodo == 3) {
			this.insercion(lista, 0, lista.getLongitud());
		}
		if (this.metodo == 4) {
			this.mezcla(lista, 0, lista.getLongitud() / 2);
		}
		if (this.metodo == 5) {
			this.shell(lista, 0, lista.getLongitud());
		}
		if (this.metodo == 6) {
			this.quick(lista, 0, lista.getLongitud() - 1);
		}
	}

}
