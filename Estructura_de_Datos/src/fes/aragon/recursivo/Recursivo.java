package fes.aragon.recursivo;

import java.math.BigInteger;

import fes.aragon.lista.t.TDAListaSimple;

public class Recursivo {
	
	public static int suma(int n) {
		if (n == 1) {
			return 1;
		} else {
			return suma(n - 1) + n;
		}
	}

	public static int factorial(int n) {

		if (n == 0) {
			return 1;
		} else {
			return factorial(n - 1) * n;
		}
	}
	/**
	 * A partir de 12 factorial el metodo factorial comienza a fallar, por lo que se deben usar BigInteger,
	 * ya que estos pueden manejar valores mas grandes que sus semejantes primitivos
	 * @param n
	 * @return
	 */
	public static BigInteger bigFactorial(BigInteger n) {

		if (n.equals(new BigInteger("0"))) {
			return new BigInteger("1");
		} else {
			return bigFactorial(n.subtract(new BigInteger("1"))).multiply(n);
		}
	}

	public static int sumaNatural(int n) {
		if (n / 10 < 1) {
			return n % 10;
		} else {
			return sumaNatural((int) n / 10) + n % 10;
		}
	}

	public static int MCD(int n1, int n2) {
		if (n1 % n2 == 0 && n2 <= n1) {
			return n2;
		} else if (n2 > n1) {
			return MCD(n2, n1);
		} else {
			return MCD(n2, (int) n1 % n2);
		}
	}
	public static int BusqudaBinaria(TDAListaSimple<Integer> lista, int clave, int inferior, int superior) {
		if (inferior > superior) {
			return -1;
		} else {
			int central = ((int)((inferior + superior) / 2));
			if (lista.obtenerDato(central) == clave) {
				return central;
			} else {
				if (lista.obtenerDato(central) > clave) {
					return BusqudaBinaria(lista, clave, inferior, central - 1);
				} else {
					return BusqudaBinaria(lista, clave, central + 1, superior);
				}
			}
		}
	}

	public static void main(String[] args) {
		TDAListaSimple<Integer> lista = new TDAListaSimple<Integer>();
		//lista de numeros que va de r hasta (r + 50) en orden
		int r = 56;
		for (int i = 0; i < 50; i++) {
			lista.insertarCola(r);
			r++;
		}
		//System.out.println(BusqudaBinaria(lista, 55, 0, lista.getLongitud() - 1));
		//System.out.println(suma(100));
		
		//System.out.println(factorial(12));
	}
	
}
