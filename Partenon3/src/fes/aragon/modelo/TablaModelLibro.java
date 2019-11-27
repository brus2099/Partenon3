/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.modelo;

import fes.aragon.partenon.Autor;
import fes.aragon.ventanas.Libro;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author itzee
 */
public class TablaModelLibro extends AbstractTableModel {

    private ArrayList<fes.aragon.partenon.Libro> datos = new ArrayList<>();
    private String[] columnasNombre = {"Título", "Fecha", "Genero", "Autor", "Editorial"};

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return columnasNombre.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        String tmp = "";
        if (columnIndex == 0) {
            tmp = datos.get(rowIndex).getTitulo();
        } else if (columnIndex == 1) {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fecha = formato.format(this.datos.get(rowIndex).getAnio());
            tmp = fecha;
        } else if (columnIndex == 2) {
            tmp = datos.get(rowIndex).getGenero().getNombre();
        } else if (columnIndex == 3) {
            if (!datos.get(rowIndex).getAutores().isEmpty()) {
                tmp = datos.get(rowIndex).getAutores().get(0).getNombre();
            } else {
                tmp = "";
            }
        } else if (columnIndex == 4) {
            tmp = datos.get(rowIndex).getEditorial().getNombre();
        }
        return tmp;
    }

    @Override
    public String getColumnName(int column) {
        return columnasNombre[column];

    }

    public ArrayList<fes.aragon.partenon.Libro> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<fes.aragon.partenon.Libro> datos) {
        this.datos = datos;
    }

    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged(); //To change body of generated methods, choose Tools | Templates.
    }

}
