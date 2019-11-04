package fes.aragon.lista.t;

public class Principal {
public static void main(String[] args) {
	
	Pila<Integer> pila = new Pila<>();

	//PROMEDIO DE CALIFICACIONES
	pila.insertar(10);
	pila.insertar(6);
	pila.insertar(8);
	System.out.println(pila.verArriba());
	}
}

