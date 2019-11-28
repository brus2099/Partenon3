package fes.aragon.priebas.arboles;

import fes.aragon.arbolBinario.ArbolBinario;

public class Pruebas_1 {
	
	
	
public static void main(String[] args) {

	ArbolBinario<String> arbol = new ArbolBinario<String>();
	//arbol.insertarPrefija("+ * 1 2 / 3 4");
	//arbol.insertarPrefija("+ + + 1 2 3 4");
	//System.out.println(arbol.getEcuacion());
	//System.out.println(arbol.evaluacionPrefija());
	
	/*arbol.insertar(25);
	arbol.insertar(13);
	arbol.insertar(28);
	arbol.insertar(11);
	arbol.insertar(15);
	arbol.insertar(26);
	arbol.insertar(30);
	arbol.insertar(10);
	arbol.insertar(14);
	arbol.insertar(16);
	arbol.insertar(33);
	arbol.insertar(29);
	arbol.insertar(12);
	arbol.insertar(9);
	arbol.insertar(8);*/
	/*arbol.recAmplitud();
	System.out.println("---");
	System.out.println("Altura: "+arbol.altura(14));
	System.out.println("Profundidad: "+arbol.profundidad(8));*/
	
	//arbol.eliminar(30);
	//arbol.recAmplitud();
	//arbol.recAmplitud();
	//System.out.println(arbol.profundidad(12));
	//arbol.altura(33);
	//arbol.mostrarNiveles();
	
	//arbol.recAmplitud();
	/*System.out.println("------------------");
	System.out.print("Minimo: ");
	arbol.min();
	System.out.print("Maximo: ");
	arbol.max();*/
	//arbol.mostrarNivel(3);
	//System.out.println("------------------");
	//arbol.min();
	//arbol.max();
	//arbol.altura(125);
	
	
	
	String cad = "^ / * + 8 4 3 2 4";
	arbol.insertarPrefija("^ / * + 8 4 3 2 4");
	arbol.recAmplitud();
	/*System.out.print("Evaluacion: ");
	arbol.evaluacion();*/
	//arbol.mostrarNiveles();
	//arbol.mostrarNivel(2);
	/*System.out.println("-------------");
	arbol.mostrarNivel(3);
	System.out.println("-------------");
	arbol.mostrarNivel(4);
	System.out.println("-------------");*/
	
	//arbol.insertarPrefija(cad);
	//arbol.evaluacionPrefija();
	//System.out.println("---------------------------------");
	//String temp = arbol.posfijaCad(arbol.getRaiz(),cad);
	//System.out.println(temp);
	
	
}
}
