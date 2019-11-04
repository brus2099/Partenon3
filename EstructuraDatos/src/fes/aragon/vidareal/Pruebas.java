package fes.aragon.vidareal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

import fes.aragon.lista.t.TDAListaSimple;

public class Pruebas {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\lenovo\\Desktop\\datos.csv");
		TDAListaSimple<Persona> listas = new TDAListaSimple<>();
		if (f.exists()) {
			System.out.println("Si existe");
			try {
				FileReader fr = new FileReader(f);
				BufferedReader buf = new BufferedReader(fr);
				String linea = "";
				while ((linea = buf.readLine()) != null) {
					String[] arg = linea.split(",");
					listas.agregarCola(new Persona(arg[0], Integer
							.parseInt(arg[1])));

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		for (int i = 0; i < listas.getLongitud(); i++) {
			if (listas.obtenerDato(i).getEdad() > 30) {
				System.out.println(listas.obtenerDato(i).toString());

			}

		}

	}
}
