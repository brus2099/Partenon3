package fes.aragon.ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Editorial extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private fes.aragon.partenon.Editorial editorial = null;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Editorial dialog = new Editorial();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Editorial() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblEditorial = new JLabel("Editorial");
			lblEditorial.setBounds(122, 5, 46, 14);
			contentPanel.add(lblEditorial);
		}
		{
			JLabel lblNewLabel = new JLabel("Nombre");
			lblNewLabel.setBounds(10, 47, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblSucursal = new JLabel("Sucursal");
			lblSucursal.setBounds(10, 72, 46, 14);
			contentPanel.add(lblSucursal);
		}
		{
			JLabel lblDireccion = new JLabel("Direccion");
			lblDireccion.setBounds(10, 98, 46, 14);
			contentPanel.add(lblDireccion);
		}
		{
			JLabel lblCorreo = new JLabel("Correo");
			lblCorreo.setBounds(10, 123, 46, 14);
			contentPanel.add(lblCorreo);
		}
		{
			JLabel lblTelefono = new JLabel("Telefono");
			lblTelefono.setBounds(10, 148, 46, 14);
			contentPanel.add(lblTelefono);
		}
		{
			textField = new JTextField();
			textField.setBounds(66, 44, 269, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(66, 69, 269, 20);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(66, 95, 269, 20);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBounds(66, 120, 269, 20);
			contentPanel.add(textField_3);
			textField_3.setColumns(10);
		}
		{
			textField_4 = new JTextField();
			textField_4.setBounds(66, 145, 269, 20);
			contentPanel.add(textField_4);
			textField_4.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String nombre = textField.getText();
						String sucursal = textField_1.getText();
						String direccion = textField_2.getText();
						String correo = textField_3.getText();
						String telefono = textField_4.getText();
						editorial.setNombre(nombre);
						editorial.setSucursal(sucursal);
						editorial.setDireccion(direccion);
						editorial.setCorreo(correo);
						editorial.setTelefono(telefono);
						System.out.println(editorial.toString());
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
		if (editorial != null ) {
			if (editorial.getNombre().equals("")) {
				this.textField.setText(editorial.getNombre());
			} 
		}
	}

	public fes.aragon.partenon.Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(fes.aragon.partenon.Editorial editorial) {
		this.editorial = editorial;
	}	
}
