package fes.aragon.partenon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Libro implements Serializable {

	private String titulo;
	//private String autor;
	private ArrayList<Autor> autores = new ArrayList<>();
	private String edicion;
	private Editorial editorial= new Editorial();
	private int isbn;
	private String pais;
	private String anio;
	private float precio;
	private int existencia;
	private Genero genero= new Genero();
	private boolean ebook;
	private String pasta;
	private String lenguaje;
	
	public Libro() {
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public ArrayList<Autor> getAutores() {
		return autores;
	}

	public void setAutores(ArrayList<Autor> autores) {
		this.autores = autores;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public boolean isEbook() {
		return ebook;
	}

	public void setEbook(boolean ebook) {
		this.ebook = ebook;
	}

	public String getPasta() {
		return pasta;
	}

	public void setPasta(String pasta) {
		this.pasta = pasta;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autores=" + autores + ", edicion=" + edicion + ", editorial=" + editorial
				+ ", isbn=" + isbn + ", pais=" + pais + ", anio=" + anio + ", precio=" + precio + ", existencia="
				+ existencia + ", genero=" + genero + ", ebook=" + ebook + ", pasta=" + pasta + ", lenguaje=" + lenguaje
				+ "]";
	}
	
	
	
}
