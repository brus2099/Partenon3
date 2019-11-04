package fes.aragon.inicio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import fes.aragon.archivos.CRUD;
import fes.aragon.partenon.Libro;

public class Inicio2 {

	public static void main(String[] args) {
		try {
			CRUD archivo = new CRUD("Partenon.txt");
			ArrayList<Object> libro = new ArrayList<>();
			libro = archivo.read();
			for(Object obj : libro){
				Libro lib = (Libro) obj;
				System.out.println(lib.toString());
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
