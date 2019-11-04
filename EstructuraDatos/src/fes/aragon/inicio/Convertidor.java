package fes.aragon.inicio;

  import java.awt.EventQueue;

 import javax.swing.JFrame;
 import javax.swing.JOptionPane;
 import javax.swing.JPanel;
 import javax.swing.border.EmptyBorder;
 import fes.aragon.lista.t.*;
import javax.swing.SpringLayout;
 import javax.swing.JButton;
import javax.swing.JTextField;
 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
import java.awt.Font;

/**
 * 
 * @author SAMUEL
 * PROGRAMA QUE RESUELVE UNA OPECION POSTFIJA
 */

public class Convertidor extends JFrame {

	private JPanel contentPane;
 	private JTextField textField;
	private JTextField textField_1;

 	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			try {
				Convertidor frame = new Convertidor();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
				}
			}
	});
	}
 	/**
 	 * EN ESTA PARTE SE CREA UNA VENTANA QUE RESUELVE UNA OPERACION POSTFIJA
 	 */
	public Convertidor() {
 		setLocationRelativeTo(this);
		setResizable(false);
		setTitle("Resolver una expresion posfija");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 648, 388);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	SpringLayout sl_contentPane = new SpringLayout();
contentPane.setLayout(sl_contentPane);
	
	JButton btnAceptar = new JButton("aceptar");
	sl_contentPane.putConstraint(SpringLayout.SOUTH, btnAceptar, -69, SpringLayout.SOUTH, contentPane);
	btnAceptar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
					String cadena = textField.getText();
 					String[] arg = cadena.split(" ");
 					Pila<Float> pila = new Pila<>();
 					int i = 0;
 					while (i < arg.length) {
 						if (arg[i].equals("+") || arg[i].equals("-") || arg[i].equals("*") || arg[i].equals("/")) {
 							if (arg[i].equals("+")) {
 								pila.insertar(pila.sacar() + pila.sacar());
 							} else if (arg[i].equals("-")) {
 								pila.insertar(pila.sacar() - pila.sacar());
 							} else if (arg[i].equals("*")) {
								pila.insertar(pila.sacar() * pila.sacar()); 							} else if (arg[i].equals("/")) {
 								float tmp = pila.sacar();
								pila.insertar(pila.sacar() / tmp);
							}
					} else {
						pila.insertar(Float.parseFloat(arg[i]));
					}
					i++;
 					}
 					textField_1.setText("El resultado es: " + pila.sacar());
 				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(rootPane, "error de dato");
					textField.setText("");
				}
		}
			
		});
 		contentPane.add(btnAceptar);
 		
 		textField = new JTextField();
 		textField.setFont(new Font("Tahoma", Font.PLAIN, 41));
		sl_contentPane.putConstraint(SpringLayout.EAST, textField, 468, SpringLayout.WEST, contentPane);
		contentPane.add(textField);
		textField.setColumns(10);
 		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField, 169, SpringLayout.SOUTH, textField_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField_1, -284, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 76, SpringLayout.SOUTH, textField_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 0, SpringLayout.WEST, textField_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_1, 40, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_1, -55, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnAceptar, 0, SpringLayout.EAST, textField_1);
		textField_1.setEditable(false);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}

}
