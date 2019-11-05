package fes.aragon.diccionarioarbol;

public class Pruebas {

	public static <T> void main(String[] args) {
		Alumno al1 = new Alumno();
		
		DiccionarioB<Integer> dicc = new DiccionarioB<>();
		dicc.insertar(20, al1);
		dicc.buscar(20).setNombre("Brus");
		System.out.println(dicc.buscar(20).toString());
	}
	
	
	
	
	/*Qu es recursividad = definicion
	Procedimientos para crrear la recursividad
	Incluir el codigo y explicacion de cada metodo que se creo en clase
	
	*Que es lo que hace cada metodo: factorial
	*Identificar los casos base
	*torres de hanoi para recursividad
	*
	*2do trabajo
	*se divide en dos: arboles binarios
	*que es un arbol a grandes razgos, y luego arbol binario
	*especificar metodos y describirlos
	*recorridos del arbol, evaluacion, pos, in, inter
	*eliminar 
	*altura, minimo, maximo, forfundidad, niveles
	*    ¡Jueves 14! 
	*    */
}
