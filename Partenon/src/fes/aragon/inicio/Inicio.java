package fes.aragon.inicio;

import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import fes.aragon.clases.Autor;
import fes.aragon.clases.Editorial;
import fes.aragon.clases.Genero;
import fes.aragon.clases.Libro;
import fes.aragon.clases.Ubicacion;

public class Inicio {

	public static void main(String[] args) {
		
		Ubicacion ub1 = new Ubicacion();
		ub1.setEstantes("A1");
		ub1.setFilas(1);
		Ubicacion ub2 = new Ubicacion();
		ub2.setEstantes("A3");
		ub2.setFilas(3);
		
		Genero gen = new Genero();
		gen.setNombre("Ingrenieria");
		gen.setNumeroGenero(1);
		gen.getUbicacion().add(ub1);
		Genero gen2 = new Genero();
		gen2.setNombre("Fisica");
		gen2.setNumeroGenero(2);
		gen2.getUbicacion().add(ub2);
		
		Editorial edit1 = new Editorial();
		edit1.setNombre("Alfa Omega");
		edit1.setDireccion("Av Independencia");
		edit1.setCorreo("contacto@alfaomega.com");
		edit1.setSucursal("Guadalajara");
		edit1.setTelefono("33 5548 4623");
		
		Autor au1 = new Autor();
		au1.setNombre("M1");
		au1.setCorreo("au1@alfaomega.com");
		
		ArrayList<Libro> libros = new ArrayList<>();
		
		GregorianCalendar fecha = new GregorianCalendar();
		for ( int i = 0; i < 10; i++) {
			Libro libro = new Libro();
			libro.setTitulo("Fundamentos de Ingenieria"+i);
			libro.getAutores().add(au1);
			//libro.getAutores().add(au2);
			libro.setEdicion("Primera");
			libro.setIsbn(i);
			libro.setPais("Mexico");
			libro.setAnio(fecha.getTime());
			libro.setPrecio(298.00f);
			libro.setExistencia(i);
			libro.setEbook(true);
			libro.setPasta("Dura");
			libro.setLenguaje("Español");
			libro.setEditorial(edit1);
			libros.add(libro);
			
		}
		
		for ( Libro libro : libros) {
			System.out.println(libro.toString());
			System.out.println("----------------");
		}
		
	}
}
