package fes.aragon.oyentes;

import java.awt.Graphics;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JPanel;

import fes.aragon.lista.t.TDAListaSimple;

public class Oyente<T> extends JPanel implements PropertyChangeListener {
	private TDAListaSimple<T> datos = new TDAListaSimple<>();
	private String oyente= "";


	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		if (evt.getPropertyName().equals(this.oyente)) {
			TDAListaSimple<T> lista = (TDAListaSimple<T>) evt.getNewValue();
			this.datos = lista;
			this.repaint();
		}

	}
	public Oyente(String oyente){
		super();
		this.oyente = oyente;
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		int x = 0;
		int y = 100;
		for (int i=0; i<this.datos.getLongitud(); i++){
			Integer dato = (Integer) this.datos.obtenerDato(i);
			int width=5;
			int height = dato;
			g.drawRect(x, y-height, width, height);
			g.drawRect(x, y, width, height);
			x +=5;
		}
	}

	public TDAListaSimple<T> getDatos() {
		return datos;
	}

	public void setDatos(TDAListaSimple<T> datos) {
		this.datos = datos;
	}

	
}
