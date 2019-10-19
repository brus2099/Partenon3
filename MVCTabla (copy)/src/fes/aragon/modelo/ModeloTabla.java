package fes.aragon.modelo;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.table.AbstractTableModel;

public class ModeloTabla extends AbstractTableModel implements PropertyChangeListener{
	
	private Dato dato= new Dato();

	public int getColumnCount() {
		// TODO Auto-generated method stub
		return dato.getDatos()[0].length;
	}

	public int getRowCount() {
		// TODO Auto-generated method stub
		return dato.getDatos().length;
	}

	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return dato.getDatos()[arg0][arg1];
	}

	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return dato.getNombres()[column];
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		boolean editar = false;
		if(columnIndex >= 2){
			editar = false;
		} else {
			editar = true;
		}
		return editar;
	}
	
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		String info = (String)aValue;
		dato.getDatos()[rowIndex][columnIndex] = Float.parseFloat(info);
	}

	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		if (evt.getPropertyName().equals("modifica.matriz")) {
			this.dato=(Dato)evt.getNewValue();
			System.out.println("evento");
			this.fireTableDataChanged();
		}
		
	}
	
	public void oyenteDato(Datos dato){
		dato.setMatriz(this.dato.getDatos());
	}
	

}
