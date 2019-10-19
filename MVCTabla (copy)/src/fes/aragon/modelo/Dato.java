package fes.aragon.modelo;

public class Dato {
	private boolean editar = true;
	private float[][] datos = new float[20][6];
	private String[] nombres = { "Num1", "Num3", "*", "/", "+", "-" };

	public boolean isEditar() {
		return editar;
	}

	public void setEditar(boolean editar) {
		this.editar = editar;
	}

	public float[][] getDatos() {
		return datos;
	}

	public void setDatos(float[][] datos) {
		this.datos = datos;
	}

	public String[] getNombres() {
		return nombres;
	}

	public void setNombres(String[] nombres) {
		this.nombres = nombres;
	}

}
