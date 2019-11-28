package fes.aragon.oyentes;

import java.awt.Color;
import java.awt.Graphics;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JPanel;

import fes.aragon.lista.t.TDAListaSimple;

@SuppressWarnings({"serial","unchecked"})
public class Oyente<T> extends JPanel implements PropertyChangeListener {
	
	private TDAListaSimple<T> datos = new TDAListaSimple<>();

	String oyente = "";

	public Oyente(String oyente) {
		super();
		this.oyente = oyente;
	}

	public void propertyChange(PropertyChangeEvent arg0) {
		if (arg0.getPropertyName().equals(this.oyente)) {
			TDAListaSimple<T> lista = (TDAListaSimple<T>) arg0.getNewValue();
			this.datos = lista;
			this.repaint();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		int x = 10;
		int y = 200;
		for (int i = 0; i < this.datos.getLongitud(); i++) {
			Integer dato = (Integer) this.datos.obtenerDato(i);
			int width = 2;
			int height = dato;
			g.setColor(Color.blue);
			g.drawRect(x, y - height, width, height);
			g.drawRect(x, y, width, height);
			x += width;

		}
	}

	public TDAListaSimple<T> getDatos() {
		return datos;
	}

	public void setDatos(TDAListaSimple<T> datos) {
		this.datos = datos;
	}

}
