package fes.aragon.lista.t;


public class Pila<T>{
	TDAListaSimple<T> pilas = new TDAListaSimple<>();
	public Pila(){}

public void insertar(T dato){
	this.pilas.agregarCola(dato);
	
}
public T sacar(){
	return this.pilas.eliminarCola();
}
public boolean vacia(){
	return this.pilas.esVacia();
}
public T verArriba(){
	T dato=this.pilas.eliminarCola();
	return dato;
	
}


}

	
	

