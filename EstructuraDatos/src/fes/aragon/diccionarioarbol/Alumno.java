package fes.aragon.diccionarioarbol;

public class Alumno {
	
	private String nombre;
	private String ap;
	private String am;
	private float prmedio;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAp() {
		return ap;
	}

	public void setAp(String ap) {
		this.ap = ap;
	}

	public String getAm() {
		return am;
	}

	public void setAm(String am) {
		this.am = am;
	}

	public float getPrmedio() {
		return prmedio;
	}

	public void setPrmedio(float prmedio) {
		this.prmedio = prmedio;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", ap=" + ap + ", am=" + am
				+ ", prmedio=" + prmedio + "]";
	}
	
	
	
}
