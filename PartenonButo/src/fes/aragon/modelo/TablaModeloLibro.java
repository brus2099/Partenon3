/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.modelo;

import fes.aragon.partenon.Libro;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Maikeshopukosky
 swokowski*/
public class TablaModeloLibro extends AbstractTableModel{
    private ArrayList<Libro> datos= new ArrayList<>();
    private String[] columnasNombre={"Nombre","Fecha","Genero","Autor","Editorial"};
    
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return columnasNombre.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
       String tmp="";
        if(column==0){
            tmp=datos.get(row).getTitulo();
        }else if(column==1){
            SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
            String fecha=formato.format(this.datos.get(row).getAnno());
            tmp=fecha;
        }else if(column==2){
            tmp=datos.get(row).getGenero().getNombre();
        }else if(column==3){
            if(!datos.get(row).getAutores().isEmpty()){
                tmp=datos.get(row).getAutores().get(0).getNombre();
            }else{tmp="";}
        }else if(column==4){
            tmp=datos.get(row).getEditorial().getNombre();
        }
        return tmp;
    }

    @Override
    public String getColumnName(int column) {
        return columnasNombre[column];
    }

    public ArrayList<Libro> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Libro> datos) {
        this.datos = datos;
    }

    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged();
    }
}
