/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.modelo;

import fes.aragon.partenon.Ubicacion;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author itzee
 */
public class TablaModelUbicacion extends AbstractTableModel{

    private ArrayList <Ubicacion> datos= new ArrayList<>();
    private String [] columnasNombre= {"Estantes","Filas"};
    
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return columnasNombre.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ubicacion tmp = datos.get(rowIndex);
        String info="";
        if(columnIndex==0){
            info=tmp.getEstantes();
        }else if(columnIndex==1){
            info=String.valueOf(tmp.getFilas());
        }
        return info;
    }

    @Override
    public String getColumnName(int column) {
        return columnasNombre[column];
    }

    public ArrayList<Ubicacion> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Ubicacion> datos) {
        this.datos = datos;
    }
    
}
