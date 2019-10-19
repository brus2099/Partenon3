package fes.aragon.modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Datos {
	private PropertyChangeSupport soporte = new PropertyChangeSupport(this);
	private Dato dato = new Dato();
 
	public Datos() {
		soporte.firePropertyChange("modifica.matriz", null, this.dato);
	}

	public void setMatriz(float[][] modifica) {
		this.dato.setDatos(modifica);
		//soporte.firePropertyChange("modifica.matriz", null, this.dato);
	}

	public void setVista(boolean vista) {
		this.dato.setEditar(vista);
		soporte.firePropertyChange("modifica.boolean", null, this.dato);
	}
	
	public void calculos(){
		for(int i = 0; i<dato.getDatos().length; i++){
			float a = dato.getDatos()[i][0];
			float b = dato.getDatos()[i][1];
			
			dato.getDatos()[i][2] = a*b;
			dato.getDatos()[i][3] = a/b;
			dato.getDatos()[i][4] = a+b;
			dato.getDatos()[i][5] = a-b;
		}
		soporte.firePropertyChange("modifica.matrix", null, this.dato);
	}

	public void agregarOyentes(PropertyChangeListener oyentes) {
		soporte.addPropertyChangeListener(oyentes);
	}

}
