package fes.aragon.modelo;

public class Dato {
	private boolean editar=true;
	private Racional [][]datos= new Racional[5][3];
	private String[]nombres={"RacionalUno","RacionalDos","Resultado"};
	
	Dato(){
	
	}
	public boolean isEditar() {
		return editar;
	}
	public void setEditar(boolean editar) {
		this.editar = editar;
	}
	public Racional[][] getDatos() {
		return datos;
	}
	public void setDatos(Racional[][] datos) {
		this.datos = datos;
	}
	public String[] getNombres() {
		return nombres;
	}
	public void setNombres(String[] nombres) {
		this.nombres = nombres;
	}
	
	
}
