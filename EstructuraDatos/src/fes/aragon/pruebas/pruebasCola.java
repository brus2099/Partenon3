package fes.aragon.pruebas;

import fes.aragon.cola.Cola;

public class pruebasCola {
	public static void main(String[] args) {
		Cola<Acciones> cola = new Cola<>();
		cola.insertar(new Acciones(20, 100, 'c'));
		cola.insertar(new Acciones(24, 20, 'c'));
		cola.insertar(new Acciones(36, 200, 'c'));
		int acciones = 150;
		int precio = 30;
		float ganancia=0;
		while (!cola.vacia()) {

			Acciones datos = cola.sacar();
			acciones = acciones - datos.getNumAcciones();
			ganancia = precio - datos.getPrecioAcciones();
			if (acciones < 0) {

			}
			System.out.println(cola.sacar().toString());	
			System.out.println(ganancia);

		}
	}
}
