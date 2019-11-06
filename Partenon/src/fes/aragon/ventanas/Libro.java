package fes.aragon.ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;

public class Libro extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private ArrayList<fes.aragon.partenon.Autor> autores = new ArrayList<>();
	private fes.aragon.partenon.Editorial editorial = new fes.aragon.partenon.Editorial();
	private fes.aragon.partenon.Genero genero = new fes.aragon.partenon.Genero();
	private fes.aragon.partenon.Libro libro = new fes.aragon.partenon.Libro();
	private JTextField textFieldTitulo;
	private JTextField textFieldEdicion;
	private JTextField textFieldISBN;
	private JTextField textFieldPais;
	private JTextField textFieldAnio;
	private JTextField textFieldPrecio;
	private JTextField textFieldExistencia;
	private JTextField textFieldPasta;
	private JTextField textFieldLenguaje;
	private JComboBox comboBoxEbook = new JComboBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Libro dialog = new Libro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Libro() {
		setBounds(100, 100, 450, 457);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblLibro = new JLabel("Libro");
		lblLibro.setBounds(195, 11, 46, 14);
		contentPanel.add(lblLibro);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(10, 45, 46, 14);
		contentPanel.add(lblTitulo);
		
		JLabel lblAutores = new JLabel("Autores");
		lblAutores.setBounds(10, 70, 46, 14);
		contentPanel.add(lblAutores);
		
		JLabel lblEdicion = new JLabel("Edicion");
		lblEdicion.setBounds(10, 95, 46, 14);
		contentPanel.add(lblEdicion);
		
		JLabel lblEditorial = new JLabel("Editorial");
		lblEditorial.setBounds(10, 120, 46, 14);
		contentPanel.add(lblEditorial);
		
		JLabel lblIsbn = new JLabel("ISBN");
		lblIsbn.setBounds(10, 145, 46, 14);
		contentPanel.add(lblIsbn);
		
		JLabel lblPais = new JLabel("Pais");
		lblPais.setBounds(10, 170, 46, 14);
		contentPanel.add(lblPais);
		
		JLabel lblAo = new JLabel("A\u00F1o");
		lblAo.setBounds(10, 195, 46, 14);
		contentPanel.add(lblAo);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(10, 220, 46, 14);
		contentPanel.add(lblPrecio);
		
		JLabel lblExistencia = new JLabel("Existencia");
		lblExistencia.setBounds(10, 245, 46, 14);
		contentPanel.add(lblExistencia);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(10, 270, 46, 14);
		contentPanel.add(lblGenero);
		
		JLabel lblEbook = new JLabel("E-book");
		lblEbook.setBounds(10, 295, 46, 14);
		contentPanel.add(lblEbook);
		
		JLabel lblPasta = new JLabel("Pasta");
		lblPasta.setBounds(10, 320, 46, 14);
		contentPanel.add(lblPasta);
		
		JLabel lblLenguaje = new JLabel("Lenguaje");
		lblLenguaje.setBounds(10, 345, 46, 14);
		contentPanel.add(lblLenguaje);
		
		JButton btnAadirGenero = new JButton("A\u00F1adir genero");
		btnAadirGenero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Genero dialog = new Genero();
					dialog.setGenero(genero);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnAadirGenero.setBounds(95, 266, 116, 23);
		contentPanel.add(btnAadirGenero);
		
		JButton btnAadirAutor = new JButton("A\u00F1adir autor");
		btnAadirAutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Autor dialog = new Autor();
					dialog.setAutores(autores);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnAadirAutor.setBounds(95, 66, 116, 23);
		contentPanel.add(btnAadirAutor);
		
		JButton btnAadirEditorial = new JButton("A\u00F1adir editorial");
		btnAadirEditorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Editorial dialog = new Editorial();
					dialog.setEditorial(editorial);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnAadirEditorial.setBounds(95, 111, 116, 23);
		contentPanel.add(btnAadirEditorial);
		
		textFieldTitulo = new JTextField();
		textFieldTitulo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (textFieldTitulo.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Por favor, introduce un T�tulo.");
				}
			}
		});
		textFieldTitulo.setBounds(95, 42, 86, 20);
		contentPanel.add(textFieldTitulo);
		textFieldTitulo.setColumns(10);
		
		textFieldEdicion = new JTextField();
		textFieldEdicion.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (textFieldEdicion.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Por favor introduce una Edici�n");
				}
			}
		});
		textFieldEdicion.setBounds(95, 92, 86, 20);
		contentPanel.add(textFieldEdicion);
		textFieldEdicion.setColumns(10);
		
		textFieldISBN = new JTextField();
		textFieldISBN.setBounds(95, 142, 86, 20);
		contentPanel.add(textFieldISBN);
		textFieldISBN.setColumns(10);
		
		textFieldPais = new JTextField();
		textFieldPais.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (textFieldPais.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Por favor, introduce un Pais.");
				}
			}
		});
		textFieldPais.setText("");
		textFieldPais.setBounds(95, 167, 86, 20);
		contentPanel.add(textFieldPais);
		textFieldPais.setColumns(10);
		
		textFieldAnio = new JTextField();
		textFieldAnio.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (textFieldAnio.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Por favor, introduce un A�o.");
				}
			}
		});
		textFieldAnio.setBounds(95, 192, 86, 20);
		contentPanel.add(textFieldAnio);
		textFieldAnio.setColumns(10);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setText("");
		textFieldPrecio.setBounds(95, 217, 86, 20);
		contentPanel.add(textFieldPrecio);
		textFieldPrecio.setColumns(10);
		comboBoxEbook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxEbook.getSelectedItem().equals("Selecciona una opcion")){
					JOptionPane.showMessageDialog(null, "Seleccione una opcion valida");
				}
			}
		});
		
		
		comboBoxEbook.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opcion", "Disponible", "No disponible"}));
		comboBoxEbook.setBounds(95, 292, 130, 20);
		contentPanel.add(comboBoxEbook);
		
		textFieldExistencia = new JTextField();
		textFieldExistencia.setBounds(95, 242, 86, 20);
		contentPanel.add(textFieldExistencia);
		textFieldExistencia.setColumns(10);
		
		textFieldPasta = new JTextField();
		textFieldPasta.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (textFieldPasta.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Por favor, introduce un tipo de Pasta.");
				}
			}
		});
		textFieldPasta.setBounds(95, 317, 86, 20);
		contentPanel.add(textFieldPasta);
		textFieldPasta.setColumns(10);
		
		textFieldLenguaje = new JTextField();
		textFieldLenguaje.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (textFieldLenguaje.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Por favor, introduce un Lenguaje.");
				}
			}
		});
		textFieldLenguaje.setBounds(95, 342, 86, 20);
		contentPanel.add(textFieldLenguaje);
		textFieldLenguaje.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (textFieldTitulo.getText().equals("") || 
							textFieldEdicion.getText().equals("") || 
							textFieldISBN.getText().equals("") || 
							textFieldPais.getText().equals("") || 
							textFieldAnio.getText().equals("") ||
							textFieldExistencia.getText().equals("") || 
							textFieldPasta.getText().equals("") || 
							textFieldLenguaje.getText().equals("")){
							JOptionPane.showMessageDialog(null, "Por favor, verifica los datos.");
						} else {
							libro.setTitulo(textFieldTitulo.getText());
							libro.setEdicion(textFieldEdicion.getText());
							libro.setIsbn(Integer.parseInt((String)textFieldISBN.getText()));
							libro.setPais(textFieldPais.getText());
							libro.setAnio(textFieldAnio.getText());
							libro.setPrecio(Float.parseFloat((String)textFieldPrecio.getText()));
							libro.setExistencia(Integer.parseInt((String)textFieldExistencia.getText()));
							libro.setPasta(textFieldPasta.getText());
							boolean ebook;
							if (comboBoxEbook.getSelectedItem().equals("Disponible")) {
								ebook = true;
							} else {
								ebook = false;
							}
							libro.setEbook(ebook);
							libro.setLenguaje(textFieldLenguaje.getText());
							libro.setAutores(autores);
							libro.setEditorial(editorial);
							libro.setGenero(genero);
							System.out.println(libro.toString());
						}
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
