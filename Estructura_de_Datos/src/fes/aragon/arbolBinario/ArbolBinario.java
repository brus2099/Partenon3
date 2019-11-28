package fes.aragon.arbolBinario;

import fes.aragon.cola.Cola;
import fes.aragon.pila.Pila;

/**
 * Clase que maneja un arbol binario, algunas maneras de mostrarlo y operaciones
 * fundamentales con el mismo
 * 
 * @author Cruz Gallardo Pablo Eduardo
 *
 * @param <T>
 */
public class ArbolBinario<T> {

	private Nodo<T> raiz;
	private String ecuacion = "";

	/**
	 * Constructor de la clase que inicializa la raiz del arbol como nula, diciendo
	 * que el arbol existe pero esta vacio
	 * 
	 */
	public ArbolBinario() {
		// TODO Auto-generated constructor stub
		super();
		this.raiz = null;
	}

	/**
	 * Metodo que inserta datos de tipo numerico en el arbol dependiendo de el valor
	 * de la raiz, en el caso que sean menores a la raiz estos seran enviados al
	 * lado izquierdo del subarbol izquierdo y si son menores a la parte derecha del
	 * subarbol del lado contrario
	 * 
	 * @param dato
	 */
	public void insertar(T dato) {
		Nodo<T> n = raiz;
		Nodo<T> previo = null;
		while (n != null) {
			previo = n;
			if (n.menor(dato)) {
				n = n.getHijoDer();
			} else {
				n = n.getHijoIzq();
			}
		}
		if (raiz == null) {
			raiz = new Nodo<T>(dato);
		} else {
			if (previo.menor(dato)) {
				previo.setHijoDer(new Nodo<T>(dato));
			} else {
				previo.setHijoIzq(new Nodo<T>(dato));
			}

		}
	}

	/**
	 * Metodo que muestra un nivel dado por el usuario
	 * 
	 * @param nivel
	 */
	public void mostrarNivel(int nivel) {
		int contador = 0;
		int inf = (int) Math.pow(2, nivel) - 1;
		int sup = (int) (inf + Math.pow(2, nivel));
		Nodo<T> n = raiz;
		Nodo<T> nu = new Nodo<T>(null);
		Cola<Nodo<T>> cola = new Cola<>();
		if (n != null) {

			cola.insertar(raiz);
			while (!cola.vacia() && contador < sup) {
				n = cola.sacar();
				if (contador >= inf && contador < sup) {
					System.out.println(n.getDato());
				}
				if (n.getHijoIzq() != null) {
					cola.insertar(n.getHijoIzq());
				} else {
					cola.insertar(nu);
				}

				if (n.getHijoDer() != null) {
					cola.insertar(n.getHijoDer());
				} else {
					cola.insertar(nu);
				}
				contador++;
			}
		}
	}

	/**
	 * Metodo que muestra todos los niveles del arbol por separado
	 */
	public void mostrarNiveles() {
		int cont = this.alturaN(this.raiz);

		for (int i = 0; i < cont + 1; i++) {
			this.mostrarNivel(i);
			System.out.println("--------------------------------------------------");
		}
	}

	/**
	 * Metodo que muestra los datos de todos los elementos del arbol de manera que
	 * muestra primero los niveles superiores y va bajando de nivel hasta que no
	 * queden elementos en el arbol
	 */
	public void recAmplitud() {
		Nodo<T> n = raiz;
		Cola<Nodo<T>> cola = new Cola<>();
		if (n != null) {
			cola.insertar(raiz);
			while (!cola.vacia()) {
				n = cola.sacar();
				System.out.println(n.getDato());
				if (n.getHijoIzq() != null) {
					cola.insertar(n.getHijoIzq());
				}
				if (n.getHijoDer() != null) {
					cola.insertar(n.getHijoDer());
				}
			}
		}
	}

	/**
	 * Metodo que crea a partir de los datos en el arbol una ecuacion en la forma
	 * prefija
	 * 
	 * @param n
	 */
	public void prefijaC(Nodo<T> n) {
		if (n != null) {
			// System.out.println(n.getDato());
			ecuacion += (String) n.getDato() + " ";
			prefijaC(n.getHijoIzq());
			prefijaC(n.getHijoDer());
		}
	}

	/**
	 * Metodo que muestra en orden de izquierda a derecha los datos del arbol
	 * 
	 * @param n
	 */
	public void interfija(Nodo<T> n) {
		if (n != null) {
			interfija(n.getHijoIzq());
			System.out.println(n.getDato());
			interfija(n.getHijoDer());
		}
	}

	/**
	 * Metodo que muestra desde las partes mas bajas del arbol hacia arriba
	 * 
	 * @param n
	 */
	public void posfija(Nodo<T> n) {
		if (n != null) {
			posfija(n.getHijoIzq());
			posfija(n.getHijoDer());
			System.out.println(n.getDato());
		}
	}

	/**
	 * Metodo que muestra desde la raiz hacia abajo por la derecha los datos del
	 * arbol
	 * 
	 * @param n
	 */
	public void prefija(Nodo<T> n) {
		if (n != null) {
			System.out.println(n.getDato());
			prefija(n.getHijoIzq());
			prefija(n.getHijoDer());
		}
	}

	/**
	 * Metodo que inserta dentro de el arbol una ecuacion en forma prefija
	 * 
	 * @param cadena
	 */
	//@SuppressWarnings("unchecked")
	/*public void insertarPrefija(String cadena) {

		int indice = 0;

		String arreglo[] = cadena.split(" ");
		String simbolo = arreglo[indice];
		indice++;

		Boolean sigMov = true;

		raiz = (Nodo<T>) (new Nodo<String>(simbolo));

		Nodo<String> ultimoNodo = (Nodo<String>) raiz;

		Pila<Nodo<String>> pila = new Pila<>();

		pila.borrar();
		simbolo = arreglo[indice];

		while (indice < arreglo.length) {

			Nodo<String> nuevoNodo = new Nodo<String>(simbolo);

			if (sigMov) {
				ultimoNodo.setHijoIzq(nuevoNodo);
				pila.insertar(ultimoNodo);
			} else {
				ultimoNodo = pila.sacar();
				ultimoNodo.setHijoDer(nuevoNodo);

			}
			if (simbolo.equals("+") || simbolo.equals("-") || simbolo.equals("*") || simbolo.equals("/")
					|| simbolo.equals("^")) {
				sigMov = true;
			} else {
				sigMov = false;
			}
			indice++;
			if (indice < arreglo.length) {
				simbolo = arreglo[indice];
			} else {
				break;
			}
			ultimoNodo = nuevoNodo;
		}
		System.out.println("Termina Prefija");
	}*/
	
	/**
	 * Metodo que inserta dentro de el arbol una ecuacion en forma prefija
	 * 
	 * @param cadena
	 */
	@SuppressWarnings("unchecked")
	public void insertarPrefija(String cadena) {
		int indice = 0;
		String arreglo[] = cadena.split(" ");
		String simbolo = arreglo[indice];
		indice++;
		Boolean sigMov = true;
		raiz = (Nodo<T>) (new Nodo<String>(simbolo));
		Nodo<String> ultimoNodo = (Nodo<String>) raiz;
		Pila<Nodo<String>> pila = new Pila<>();
		pila.borrar();
		simbolo = arreglo[indice];
		while (indice < arreglo.length) {
			Nodo<String> nuevoNodo = new Nodo<String>(simbolo);
			if (sigMov) {
				ultimoNodo.setHijoIzq(nuevoNodo);
				pila.insertar(ultimoNodo);
			} else {
				ultimoNodo = pila.sacar();
				ultimoNodo.setHijoDer(nuevoNodo);
			}
			if (simbolo.equals("+") || simbolo.equals("-") || simbolo.equals("*") || simbolo.equals("/")
					|| simbolo.equals("^")) {
				sigMov = true;
			} else {
				sigMov = false;
			}
			indice++;
			if (indice < arreglo.length) {
				simbolo = arreglo[indice];
			} else {
				break;
			}
			ultimoNodo = nuevoNodo;
		}
	}


	/**
	 * Metodo que a partir de los elementos en el arbol, evalua la operacion en el
	 * mismo, solo si no hay valores no definidos
	 * 
	 * @return
	 */
	public float evaluacionPrefija() {
		this.prefijaC(raiz);
		String[] cadena = ecuacion.split(" ");
		Pila<Float> pila = new Pila<>();
		Pila<String> pilaS = new Pila<>();
		for (int i = 0; i < cadena.length; i++) {
			if (cadena[i].equals("+") || cadena[i].equals("-") || cadena[i].equals("/") || cadena[i].equals("^")
					|| cadena[i].equals("*")) {
				pilaS.insertar(cadena[i]);
			} else {
				pila.insertar(Float.parseFloat(cadena[i]));
				if (pila.tamano() > 1) {
					String simbolo = pilaS.sacar();
					float operDos = pila.sacar();
					float operUno = pila.sacar();
					float valor;
					if (simbolo.equals("+")) {
						valor = operUno + operDos;
					} else if (simbolo.equals("-")) {
						valor = operUno - operDos;
					} else if (simbolo.equals("*")) {
						valor = operUno * operDos;
					} else if (simbolo.equals("/")) {
						valor = operUno / operDos;
					} else if (simbolo.equals("~")) {
						valor = (float) Math.pow(operDos, operUno);
					} else {
						valor = 0;
						System.err.println("Hay un error!");
					}
					pila.insertar(valor);
				}
			}
		}
		if (!pila.vacia()) {
			return pila.sacar();
		}
		return -1;
	}
	
	/**
	 * Metodo que a partir de los elementos en el arbol, evalua la operacion en el
	 * mismo, solo si no hay valores no definidos
	 * 
	 * Recorre una cadena que contiene la ecuacion y comienza un recorrido con cada
	 * uno de los elementos de la ecuacion, si encuentra un valor numerico, lo
	 * inserta en una pila, en caso de encontrar un operador, saca dos elementos de
	 * la pila y procede a realizar la operacion asignada, al terminar la operacion,
	 * guarda el resultado en la pila, finalmente imprime el ultimo valor en la pila
	 * y devuelve el mismo
	 * 
	 * @return valor
	 */
	
	public float evaluacion() {
		String[] cadena = this.getEcuacion().split(" ");
		Pila<Float> pila = new Pila<>();
		for (int i = 0; i < cadena.length; i++) {
			if (!cadena[i].equals("+") && !cadena[i].equals("-") && !cadena[i].equals("/") && !cadena[i].equals("^")
					&& !cadena[i].equals("*")) {
				pila.insertar(Float.parseFloat(cadena[i]));
			} else {
				float operDos = pila.sacar();
				float operUno = pila.sacar();
				float valor;
				if (cadena[i].equals("+")) {
					valor = operUno + operDos;
				} else if (cadena[i].equals("-")) {
					valor = operUno - operDos;
				} else if (cadena[i].equals("*")) {
					valor = operUno * operDos;
				} else if (cadena[i].equals("/")) {
					valor = operUno / operDos;
				} else if (cadena[i].equals("^")) {
					valor = (float) Math.pow(operUno, operDos);
				} else {
					valor = 0;
					System.out.println("Hay un error! ");
				}
				pila.insertar(valor);
			}
		}
		if (!pila.vacia()) {
			Float valor = pila.sacar();
			System.out.println(valor);
			return valor;
		}
		return -1;
	}

	/**
	 * Metodo que elimina un dato y reconfigura el arbol para que no se pierdan los
	 * datos que tenia como hijos
	 * 
	 * @param dato
	 */
	public void eliminar(T dato) {
		Nodo<T> nodo;
		Nodo<T> tmp;
		Nodo<T> n = raiz;
		Nodo<T> previo = null;
		while (n != null && !n.getDato().equals(dato)) {
			previo = n;
			if (n.menor(dato)) {
				n = n.getHijoDer();
			} else {
				n = n.getHijoIzq();
			}
		}
		nodo = n;
		if (n != null && n.getDato().equals(dato)) {
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
			System.out.println("Arbol");
		}
	}

	/**
	 * Metodo que devuelve el nodo raiz
	 * 
	 * @return
	 */
	public Nodo<T> getRaiz() {
		return raiz;
	}

	/**
	 * Metodo que devuelve la ecuacion que estaba en el arbol
	 * 
	 * @return
	 */
	public String getEcuacion2() {
		this.prefijaC(raiz);
		return ecuacion;
	}
	
	private void posfijaCad(Nodo<T> n) {
		if (n != null) {
			posfijaCad(n.getHijoIzq());
			posfijaCad(n.getHijoDer());
			ecuacion += (String) n.getDato() + " ";
		}

	}
	
	public String getEcuacion() {
		this.posfijaCad(raiz);
		return ecuacion;
	}


	/**
	 * Metodo que imprime el valor minimo en el arbol, solo si el arbol esta
	 * compuesto de datos numericos como enteros, flotantes o doubles y lo va
	 * buscando viendo si hay nodos a la izquierda del nodo
	 */
	public void min() {
		if (raiz != null) {
			Nodo<T> tmp = raiz;
			while (tmp.getHijoIzq() != null) {
				tmp = tmp.getHijoIzq();
			}
			System.out.println(tmp.getDato());
		}
	}

	/**
	 * Metodo que imprime el valor maximo en el arbol, solo si el arbol esta
	 * compuesto de datos numericos como enteros, flotantes o doubles y lo va
	 * buscando viendo si hay nodos a la derecha del nodo
	 */
	public void max() {
		if (raiz != null) {
			Nodo<T> tmp = raiz;
			while (tmp.getHijoDer() != null) {
				tmp = tmp.getHijoDer();
			}
			System.out.println(tmp.getDato());
		}
	}

	/**
	 * Metodo que busca que tan lejos de la raiz se encuentra un dato dado por el
	 * usuario
	 * 
	 * @param dato
	 * @return
	 */
	public int profundidad(T dato) {
		Nodo<T> n = raiz;
		while (n != null && !n.getDato().equals(dato)) {
			if (n.menor(dato)) {
				n = n.getHijoDer();
			} else {
				n = n.getHijoIzq();
			}
		}
		int prof = 0;
		Nodo<T> nodo = raiz;
		if (n == raiz) {
			return 0;
		} else {
			while (nodo != n) {
				if (nodo.getHijoIzq() != null && nodo.mayor(n.getDato())) {
					nodo = nodo.getHijoIzq();
					prof++;
				}
				if (nodo.getHijoDer() != null && nodo.menor(n.getDato())) {
					nodo = nodo.getHijoDer();
					prof++;
				}
			}
		}
		return prof;
	}

	/**
	 * Metodo que devuelve la distancia de un nodo dado hasta la hoja o nodo sin
	 * hijos mas profundo
	 * 
	 * @param n
	 * @return
	 */
	public int alturaN(Nodo<T> n) {
		return this.altura(n.getDato());
	}

	/**
	 * Metodo que busca el nodo con el dato dado por el usuario y devuelve la
	 * distancia entre el mismo y la hoja o nodo sin hijos mas profundo
	 * 
	 * @param dato
	 * @return
	 */
	public int altura(T dato) {
		int contador = 0;
		int previo = 0;
		Nodo<T> auxiliar = raiz;
		Nodo<T> refe = null;
		Nodo<T> anterior = null;
		Cola<Nodo<T>> cola = new Cola<>();
		Cola<Nodo<T>> hoja = new Cola<>();
		if (auxiliar != null) {
			cola.insertar(raiz);
			while (!cola.vacia()) {
				auxiliar = cola.sacar();
				if (auxiliar.getHijoDer() == null && auxiliar.getHijoIzq() == null) {
					hoja.insertar(auxiliar);
				}
				if (auxiliar.getDato() == dato) {
					anterior = auxiliar;
				}
				if (auxiliar.getHijoIzq() != null) {
					cola.insertar(auxiliar.getHijoIzq());
				}
				if (auxiliar.getHijoDer() != null) {
					cola.insertar(auxiliar.getHijoDer());
				}
			}
		}

		auxiliar = null;
		if (anterior != null) {
			while (!hoja.vacia()) {
				auxiliar = anterior;
				refe = hoja.sacar();
				while (auxiliar != null && auxiliar.getDato() != refe) {

					if (refe.menor(auxiliar.getDato())) {
						if (auxiliar.getHijoIzq() != null) {
							auxiliar = auxiliar.getHijoIzq();
						} else {
							auxiliar = null;
						}
					} else {
						if (auxiliar.getHijoDer() != null) {
							auxiliar = auxiliar.getHijoDer();
						} else {
							auxiliar = null;
						}
					}
					if (auxiliar != null) {
						contador++;
					}
				}

				if (contador > previo) {
					previo = contador;
				}
				contador = 0;
			}
			return previo;
		} else {
			return -1;
		}
	}
	
	
}
