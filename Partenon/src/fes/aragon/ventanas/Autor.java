package fes.aragon.ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Autor extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private ArrayList<fes.aragon.partenon.Autor> autores = null;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Autor dialog = new Autor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Autor() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblAutor = new JLabel("Autor");
			lblAutor.setBounds(198, 11, 46, 14);
			contentPanel.add(lblAutor);
		}
		{
			JLabel lblNombre = new JLabel("Nombre");
			lblNombre.setBounds(10, 47, 46, 14);
			contentPanel.add(lblNombre);
		}
		{
			JLabel lblCorreo = new JLabel("Correo");
			lblCorreo.setBounds(10, 80, 46, 14);
			contentPanel.add(lblCorreo);
		}

		textField = new JTextField();
		textField.setBounds(90, 44, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(90, 77, 86, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (textField.getText().equals("")
								|| textField_1.getText().equals("")) {
							JOptionPane.showMessageDialog(null,
									"Datos Incompletos, favor de verificar");
						} else {
							fes.aragon.partenon.Autor autor = new fes.aragon.partenon.Autor();
							autor.setNombre(textField.getText());
							autor.setCorreo(textField_1.getText());
							autores.add(autor);
							System.out.println(autores.toString());
							dispose();
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
		/*if (autores != null) {
			if (autores.getNombre().equals("")) {
				this.textField.setText(autores.getNombre());
			} else {
				this.textField_1.setText(autores.getCorreo());
			}
		}*/
	}

	public ArrayList<fes.aragon.partenon.Autor> getAutores() {
		return autores;
	}

	public void setAutores(ArrayList<fes.aragon.partenon.Autor> autores) {
		this.autores = autores;
	}

	

}
