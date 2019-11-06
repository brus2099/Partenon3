package fes.aragon.ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Ubicacion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private ArrayList<fes.aragon.partenon.Ubicacion> ubicaciones = null;
	private JComboBox comboBox = new JComboBox();
	private JComboBox comboBox_1 = new JComboBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Ubicacion dialog = new Ubicacion();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Ubicacion() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 228);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JLabel lblUbicacion = new JLabel("Ubicacion");
			lblUbicacion.setBounds(173, 10, 45, 14);
			contentPanel.add(lblUbicacion);
		}
		{
			JLabel lblEstante = new JLabel("Estante");
			lblEstante.setBounds(20, 75, 37, 14);
			contentPanel.add(lblEstante);
		}
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("Selecciona una opcion")){
					JOptionPane.showMessageDialog(null, "Seleccione una opcion valida");
				}
			}
		});
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opcion", "A", "B", "C", "D", "E"}));
		comboBox.setBounds(107, 72, 130, 20);
		contentPanel.add(comboBox);
		{
			JLabel lblFila = new JLabel("Fila");
			lblFila.setBounds(20, 111, 46, 14);
			contentPanel.add(lblFila);
		}
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_1.getSelectedItem().equals("Selecciona una opcion")){
					JOptionPane.showMessageDialog(null, "Seleccione una opcion valida");
				}
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opcion", "1", "2", "3", "4", "5"}));
		comboBox_1.setBounds(106, 108, 139, 20);
		contentPanel.add(comboBox_1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 228, 434, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(comboBox.getSelectedItem().equals("Selecciona una opcion") || comboBox_1.getSelectedItem().equals("Selecciona una opcion")){
							JOptionPane.showMessageDialog(null, "Por favor, ingrese valores.");
						} else {
							fes.aragon.partenon.Ubicacion ubic = new fes.aragon.partenon.Ubicacion();
							ubic.setEstantes((String)comboBox.getSelectedItem());
							ubic.setFilas(Integer.parseInt((String)comboBox_1.getSelectedItem()));
							ubicaciones.add(ubic);
							dispose();
							System.out.println(ubicaciones.toString());	
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
		
		/*if(ubicacion!=null){
			if(ubicacion.getEstantes().equals("")){
				this.comboBox.setSelectedItem(ubicacion.getEstantes());
			} else {
				this.comboBox_1.setSelectedItem(String.valueOf(ubicacion.getFilas()));
			}
		}*/
	}

	public ArrayList<fes.aragon.partenon.Ubicacion> getUbicacion() {
		return ubicaciones;
	}

	public void setUbicacion(ArrayList<fes.aragon.partenon.Ubicacion> ubicacion) {
		this.ubicaciones = ubicacion;
	}

	

	
}
