package Recursividad;

import fes.aragon.lista.t.TDAListaSimple;

public class Recursivo {

	public static int busquedaBinaria(TDAListaSimple<Integer> lista, int clave,
			int inf, int sup) {
		if (inf > sup) {
			return -1;
		}

		int central = (inf + sup) / 2;
		if (lista.obtenerDato(central) == clave) {
			return central;
		} else {
			if (clave < lista.obtenerDato(central)) {
				return busquedaBinaria(lista, clave, inf, central - 1);
			} else {
				if (clave > lista.obtenerDato(central)) {
					return busquedaBinaria(lista, clave, central + 1, sup);
				}
			}
		}

		return 1;

	}

	// * public static void main(String[] args) {
	// TDAListaSimple<Integer> lista = new TDAListaSimple<>();
	// lista.agregarCola(1);
	// System.out.println("El indice de la clave está en la posición: "+Recursivo.busquedaBinaria(lista,
	// 7, 0, lista.getLongitud()-1));

	// }
	public static void main(String[] args) {
		Recursivo juego = new Recursivo();
		juego.torreHanoi(3, 1, 2, 3);

	}

	public static int torreHanoi(int numDiscos, int tOrigen1, int tDestino3,
			int tAuxiliar2) {
		if (numDiscos == 1) {
			System.out.println("Mover disco de torre " + tOrigen1 + " a torre "
					+ tDestino3);
		} else {
			torreHanoi(numDiscos - 1, tOrigen1, tDestino3, tAuxiliar2);
			System.out.println("Mover disco de torre " + tOrigen1 + " a torre "
					+ tDestino3);
			torreHanoi(-1, tAuxiliar2, tOrigen1, tDestino3);

		}
		return 0;

	}

}