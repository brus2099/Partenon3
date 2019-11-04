package fes.aragon.ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fes.aragon.lista.t.TDAListaSimple;
import fes.aragon.ordenamiento.MetodosDeOrdenamiento;
import fes.aragon.oyentes.Oyente;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JDesktopPane;
import javax.swing.JTextPane;

public class Visor extends JFrame {

	private JPanel contentPane;
	private Oyente<Integer> burbuja = new Oyente<>("ordenar1");
	private Oyente<Integer> seleccionDirecta = new Oyente<>("ordenar2");
	private Oyente<Integer> quicksort = new Oyente<>("ordenar5");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Visor frame = new Visor();
		frame.setVisible(true);
		frame.inicio(1);
	}

	/**
	 * Create the frame.
	 */
	public Visor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 636);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = quicksort;
		panel.setBounds(12, 55, 399, 322);
		contentPane.add(panel);
		
		JPanel Inserccion = seleccionDirecta;
		Inserccion.setBounds(436, 55, 362, 322);
		contentPane.add(Inserccion);
		
		JTextPane txtpnBurbuja = new JTextPane();
		txtpnBurbuja.setText("QUICKSORT");
		txtpnBurbuja.setBounds(177, 13, 72, 22);
		contentPane.add(txtpnBurbuja);
		
		JTextPane txtpnSeleccion = new JTextPane();
		txtpnSeleccion.setText("SELECCION");
		txtpnSeleccion.setBounds(601, 13, 72, 22);
		contentPane.add(txtpnSeleccion);
	}

	private void inicio(int metodo) {
		TDAListaSimple<Integer> lista = new TDAListaSimple<>();
		Random rd = new Random();
		for (int i = 0; i < 70; i++) {
			lista.agregarCola(rd.nextInt(100));
		}
		burbuja.setDatos(lista);
		TDAListaSimple<Integer> lista2 = new TDAListaSimple<>();
		for (int i = 0; i < 70; i++) {
			lista2.agregarCola(rd.nextInt(100));
		}
		quicksort.setDatos(lista2);
		MetodosDeOrdenamiento<Integer> met = new MetodosDeOrdenamiento<>(lista, 1);
		MetodosDeOrdenamiento<Integer> met2 = new MetodosDeOrdenamiento<>(lista2, 2);
		
		met2.agregarOyentes(quicksort);
		Thread hilo = new Thread(met);
		hilo.start();
		Thread hilo2 = new Thread(met2);
		hilo2.start();
	}
}
