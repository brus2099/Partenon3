/**
 * AUTOR: SAMUEL EDUARDO URIBE RAMIREZ
 */
package fes.aragon.ordenamiento;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import fes.aragon.lista.t.*;

public class MetodosDeOrdenamiento<T> implements Runnable {
	private PropertyChangeSupport soporte = new PropertyChangeSupport(this);
	private TDAListaSimple<T> lista;
	private int metodo;

	public MetodosDeOrdenamiento(TDAListaSimple<T> lista, int metodo) {
		super();
		this.lista = lista;
		this.metodo = metodo;
	}

	/**
	 * METODO DE ORDENAMIENTO BURBUJA SIRVE PARA ORDENAR DATOS NO MAYORES A 1000
	 * ELEMENTOS. (PUEDE QUE NO SEA EFICIENTE PUES CONSUME MUCHOS RECURSOS Y
	 * SUELE SER TARDADO)
	 * 
	 * @param lista
	 */

	public <T> void burbuja(TDAListaSimple<T> lista) {
		for (int i = 0; i < lista.getLongitud() - 1; i++) {
			for (int j = lista.getLongitud() - 1; j > i; j--) {
				if (lista.obtenerNodo(j).comparaMenor(
						lista.obtenerNodo(j - 1).getDato())) {

					T tmp = lista.obtenerNodo(j).getDato();
					lista.obtenerNodo(j).setDato(
							lista.obtenerNodo(j - 1).getDato());
					lista.obtenerNodo(j - 1).setDato(tmp);
					this.soporte.firePropertyChange("ordenar1", null, lista);
					try {
						Thread.sleep(2); //
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}
		}

	}

	/**
	 * METODO PARA ORDENAR DATOS MAYORES A 1000 DATOS (ES BASTANTE EFICIENTE)
	 * 
	 * @param lista
	 */
	public <T> void seleccionDirecta(TDAListaSimple<T> lista) {
		for (int i = 0; i < lista.getLongitud() - 1; i++) {
			T menor = lista.obtenerDato(i);
			int k = i;
			for (int j = i + 1; j < lista.getLongitud(); j++) {
				if (lista.obtenerNodo(j).comparaMenor(menor)) {
					menor = lista.obtenerDato(j);
					k = j;

				}

			}
			lista.obtenerNodo(k).setDato(lista.obtenerNodo(i).getDato());
			lista.obtenerNodo(i).setDato(menor);
			this.soporte.firePropertyChange("ordenar2", null, lista);
			try {
				Thread.sleep(6); //
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public <T> void Insercion(TDAListaSimple<T> lista) {

		for (int i = 0; i < lista.getLongitud(); i++) {
			T aux = lista.obtenerNodo(i).getDato();
			int k = i - 1;
			while (k > -1 && !lista.obtenerNodo(k).comparaMenor(aux)) {

				lista.obtenerNodo(k + 1)
						.setDato(lista.obtenerNodo(k).getDato());
				k = k - 1;

			}
			lista.obtenerNodo(k + 1).setDato(aux);

		}

	}

	public <T> void mezcla(TDAListaSimple<T> lista, int li, int ls) {

		for (int i = li; i < ls; i++) {
			T aux = lista.obtenerNodo(i).getDato();
			int k = i - 1;
			while (k > li - 1 && !lista.obtenerNodo(k).comparaMenor(aux)) {

				lista.obtenerNodo(k + 1)
						.setDato(lista.obtenerNodo(k).getDato());
				k = k - 1;

			}
			lista.obtenerNodo(k + 1).setDato(aux);

		}

	}

	public void agregarOyentes(PropertyChangeListener oyentes) {
		soporte.addPropertyChangeListener(oyentes);
	}


	public <T> void Rapido(TDAListaSimple<T> lista, int li, int ls){
	    if(li >= ls){
		    return;
	    }
	   T pivote = lista.obtenerNodo(li).getDato();
	   int izq = li+1;
	   int der = ls ;
	   while(izq <= der){
		   while(izq <= ls && lista.obtenerNodo(izq).comparaMenor(pivote)){
			   izq++;
		   }
		   while(der > li && !lista.obtenerNodo(der).comparaMenor(pivote)){
			   der--;
		   }
		   if (izq < der){
			   T temp = lista.obtenerNodo(izq).getDato();
			   lista.obtenerNodo(izq).setDato(lista.obtenerNodo(der).getDato());
			   lista.obtenerNodo(der).setDato(temp);
		   }
		   if(der > li){
			   T temp = lista.obtenerNodo(li).getDato();
			   lista.obtenerNodo(li).setDato(lista.obtenerNodo(der).getDato());
			   lista.obtenerNodo(der).setDato(temp);
			   
		   }
		   
		   Rapido(lista, li, der-1);
		   Rapido(lista, der+1, ls);
		   this.soporte.firePropertyChange("ordenar6", null,this.lista);
		   try {
			Thread.sleep(60);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	   }
	   
	  
	}
	public void quickSort(TDAListaSimple<T> lista, int li, int ls) {
		if (li >= ls) {
			return;
		}
		T pivote = lista.obtenerNodo(li).getDato();
		int izq = li + 1;
		int der = ls;
		while (izq <= der) {
			while (izq <= ls && lista.obtenerNodo(izq).comparaMenor(pivote)) {
				izq++;
			}
			while (der > li && !lista.obtenerNodo(der).comparaMenor(pivote)) {
				der--;
			}
			if (izq < der) {
				T temp = lista.obtenerNodo(izq).getDato();
				lista.obtenerNodo(izq).setDato(lista.obtenerNodo(der).getDato());
				lista.obtenerNodo(der).setDato(temp);
			}

		}
		if (der > li) {
			T temp = lista.obtenerNodo(li).getDato();
			lista.obtenerNodo(li).setDato(lista.obtenerNodo(der).getDato());
			lista.obtenerNodo(der).setDato(temp);

		}

		quickSort(lista, li, der - 1);
		quickSort(lista, der + 1, ls);
		this.soporte.firePropertyChange("ordenar5", null, this.lista);
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (this.metodo == 1) {
			this.burbuja(lista);

		}
		if (this.metodo == 2) {
			this.quickSort(lista, 0, lista.getLongitud()-1);

		}

	}

}
