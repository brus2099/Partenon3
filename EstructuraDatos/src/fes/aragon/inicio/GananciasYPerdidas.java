package fes.aragon.inicio;

import fes.aragon.cola.Cola;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import fes.aragon.pruebas.*;

/**
 * 
 * @author SAMUEL URIBE RAMIREZ PROGRAMA QUE CALCULA LAS GANANCIAS Y PERDIDAS
 *         INDICADAS
 * 
 */

public class GananciasYPerdidas {

	public static void main(String[] args) {
		Cola<Acciones> cola = new Cola<>();
		File f = new File("C:\\Users\\lenovo\\Documents\\Acciones.txt");
		String[] arreglo = null;

		try {
			FileReader fr = new FileReader(f);
			BufferedReader bf = new BufferedReader(fr);
			arreglo = bf.readLine().split(",");

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(arreglo.length);
		for (int i = 0; i < arreglo.length; i += 3) {
			cola.borrar();
			if (arreglo[i].equals("c")) {
				cola.insertar(new Acciones(Integer.parseInt(arreglo[i + 1]),
						Float.parseFloat(arreglo[i + 2]), arreglo[i].charAt(0)));
				cola.mostrar();
			} else if (arreglo[i].equals("v")) {
				Acciones venta = new Acciones(Integer.parseInt(arreglo[i + 1]),
						Float.parseFloat(arreglo[i + 2]), arreglo[i].charAt(0));
				System.out.println("_____________________________");
				cola.mostrar();
				System.out.println("_____________________________");
				boolean sigue = true;
				int acciones = venta.getNumAcciones();
				float precio = venta.getPrecioAcciones();
				float sumaGanacias = 0;

				while (sigue && !cola.vacia()) {
					Acciones obj = cola.sacar();
					acciones = acciones - obj.getNumAcciones();

					if (acciones >= 0) {
						sumaGanacias += (precio - obj.getPrecioAcciones())
								* obj.getNumAcciones();
						if (acciones == 0) {
							sigue = false;
						}
					} else if (acciones < 0) {
						sumaGanacias += (precio - obj.getPrecioAcciones())
								* (obj.getNumAcciones() + acciones);
						sigue = false;
						Acciones sobrante = new Acciones(Math.abs(acciones),
								obj.getPrecioAcciones(), 'c');
						cola.prioridad(sobrante);
					}
				}

				cola.mostrar();
				System.out.println("suma: " + sumaGanacias);
				if (acciones > 0) {
					System.out
							.println("las acciones no se vendieron por completo");
				}
				System.out.println("acciones: " + acciones);
			}
		}
	}
}
