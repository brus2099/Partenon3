package fes.aragon.inicio;


public class Principal {
	public static void main(String[] args){
		ListaSimple lista=new ListaSimple();
		lista.agregarCola(0.6f);
		lista.agregarCola(10f);
		lista.agregarCola(10f);
		lista.agregarCola(10f);
		lista.agregarCola(10f);
		lista.agregarCola(5.5f);
		lista.agregarCola(10f);
		lista.agregarCola(10f);
		lista.agregarCola(32.3f);
		lista.agregarCola(534f);
		lista.mostrarDatos();
		
		//COPIA
		ListaSimple listaCopia=new ListaSimple();
		
		for (int i = 0; i < lista.getLongitud(); i++) {
			listaCopia.agregarCola(lista.obtenerDato(i));
		}
		
		
		//PROMEDIO
		float suma=0.0f;
		for (int i = 0; i < lista.getLongitud(); i++) {
			suma+=lista.obtenerDato(i);
		}
		System.out.println(lista.getLongitud());
		System.out.println("El promedio es: "+suma/lista.getLongitud());
		
		
		//MODA
		
		ListaSimple repetidos=new ListaSimple();
		ListaSimple numeros=new ListaSimple();
		System.out.println(!lista.esVacia());
		float tmp=0.0f;
		int conteo=0;
		
		while (!lista.esVacia()) {
			conteo=1;
			tmp=lista.obtenerDato(0);
			numeros.agregarCola(tmp);
			for (int j = 1; j < lista.getLongitud(); j++) {
				if (lista.obtenerDato(0)==lista.obtenerDato(j)) {
					conteo++;
					lista.eliminarIndice(j);
					j=0;
				}
			}
			repetidos.agregarCola(conteo);
			lista.eliminarIndice(0);
		}
		
		System.out.println("__________________+_____________");
		repetidos.mostrarDatos();
		System.out.println("__________________+_____________");
		numeros.mostrarDatos();
	}
}
