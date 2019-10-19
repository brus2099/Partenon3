package fes.aragon.recursivo;

import java.math.BigInteger;

public class Recursivo {
	public static int suma(int n) {
		if (n ==1) {
			return 1;
		}else {
			return suma(n - 1) + n;
		}
	}
	public static BigInteger factorial(BigInteger n) {
		
		if (n.equals(new BigInteger("0"))) {
			return new BigInteger("1");
		}
		else {
			return factorial(n.subtract(new BigInteger("1"))).multiply(n);
		}
	}
	public static int sumaNatural(int n) {
		if (n/10 < 1) {;
			return n%10;
		}else {
			return sumaNatural((int)n/10) + n%10;
		}
	}
	public static int MCD(int n1, int n2) {
		if (n1%n2 == 0 && n2 <= n1) {
			return n2;
		}else if (n2 > n1) {
			return MCD(n2,n1);
		}else{
			return MCD(n2, (int)n1%n2);
		}
	}

	public static int BusquedaBinaria(TDA_ListaSimpleT<Integer> lista, int clave, int inferior, int superior) {
		if(inferior>superior) {
			return 1;
		} else {
			if (clave<lista.obtenerDato(central)) {
				return BusquedaBinaria(lista, clave, inf, central-1);
			} else {
				return BusquedaBinaria(lista, clave, central+1, superior);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(factorial(new BigInteger("15")));
		System.out.println(MCD(150, 55));
		System.out.println(sumaNatural(1111111110));
		TDA_ListaSimpleT<Integer> lista = new TDAListaSimple<>();
		
	}
}
