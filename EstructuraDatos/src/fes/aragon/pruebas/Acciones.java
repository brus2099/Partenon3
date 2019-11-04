package fes.aragon.pruebas;

public class Acciones {
private float precioAcciones;
private int numAcciones;
private char tipoAccion;

public Acciones(float precioAcciones, float f, char tipoAccion) {
	super();
	this.precioAcciones = precioAcciones;
	this.numAcciones = numAcciones;
	this.tipoAccion = tipoAccion;
}

public Acciones(float precioAcciones, int numAcciones, char tipoAccion) {
	super();
	this.precioAcciones = precioAcciones;
	this.numAcciones = numAcciones;
	this.tipoAccion = tipoAccion;
}

public char getTipoAccion() {
	return tipoAccion;
}

public void setTipoAccion(char tipoAccion) {
	this.tipoAccion = tipoAccion;
}

public float getPrecioAcciones() {
	return precioAcciones;
}
public void setPrecioAcciones(int precioAcciones) {
	this.precioAcciones = precioAcciones;
}
public int getNumAcciones() {
	return numAcciones;
}
public void setNumAcciones(int numAcciones) {
	this.numAcciones = numAcciones;
}

@Override
public String toString() {
	return "Acciones [precioAcciones=" + precioAcciones + ", numAcciones="
			+ numAcciones + ", tipoAccion=" + tipoAccion + "]";
}

}
