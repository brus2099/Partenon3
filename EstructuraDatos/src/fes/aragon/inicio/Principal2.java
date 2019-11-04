package fes.aragon.inicio;

import fes.aragon.lista.t.TDAListaSimple;

public class Principal2 {
public static void main(String[] args){
	
	TDAListaSimple<Float> lista=new TDAListaSimple<>();
	lista.agregarCola(3.4f);
	lista.agregarCola(4.5f);
	lista.agregarCola(6.3f);
	TDAListaSimple<Integer> lista2=new TDAListaSimple<>();
	lista2.agregarCola(3);
	lista2.agregarCola(8);
	lista2.agregarCola(6);
	TDAListaSimple<String> lista3=new TDAListaSimple<>();
	lista3.agregarCola("SOLO CON EL CORAZON");
	lista3.agregarCola("SE PUEDE VER BIEN");
	lista3.agregarCola("LO ESCENCIAL ES INVISIBLE PARA LOS OJOS");
	lista.mostrarDatos();
	lista2.mostrarDatos();
	lista3.mostrarDatos();
	
}
	
	
}
