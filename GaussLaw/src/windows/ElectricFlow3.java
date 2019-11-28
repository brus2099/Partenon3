package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

public class ElectricFlow3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElectricFlow3 frame = new ElectricFlow3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ElectricFlow3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 499);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(0, 0, 434, 55);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblque = new JLabel("Flujo El\u00E9ctrico");
		lblque.setHorizontalAlignment(SwingConstants.CENTER);
		lblque.setBounds(94, 11, 251, 28);
		panel.add(lblque);
		lblque.setForeground(new Color(255, 255, 153));
		lblque.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
		lblque.setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 240));
		panel_1.setBounds(0, 0, 434, 460);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane txtpnEsTodaRegin = new JTextPane();
		txtpnEsTodaRegin.setEditable(false);
		txtpnEsTodaRegin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		txtpnEsTodaRegin.setForeground(new Color(0, 0, 128));
		txtpnEsTodaRegin.setBackground(new Color(255, 255, 240));
		txtpnEsTodaRegin.setText("Para estudiar el flujo el\u00E9ctrico a trav\u00E9s de una superficie, a continuaci\u00F3n se analizan tres casos:\r\n\r\n     1. Cuando las lineas de flujo electrico inciden perpendicularmente con la superficie, entonces el flujo el\u00E9ctrico que la atraviesa es m\u00E1ximo, debido a que en estas condiciones coincide que las lineas de flujo electrico son paralelas con el vector area; por tanto, el \u00E1ngulo de inclinaci\u00F3n entre ambos es cero, mientras que el coseno de cero es igual a la unidad.\r\n\r\n     2. Cuando las lineas de inducci\u00F3n tienen determinada inclinaci\u00F3n con respecto al vector \u00E1rea, se reduce el n\u00FAmero de lineas de flujo electrico que atraviesan el \u00E1rea; entonces, solo se considera la componente del campo el\u00E9ctrico que sea perpendicular a la superficie, la cual se determina por el coseno del angulo entre las lineas de induccion y el \u00E1rea. Donde, es el \u00E1ngulo que forman la linea recta imaginaria, que coincide con el vector area, el cual es perpendicular con la superficie y que a su vez sale de esta, con las lineas del campo el\u00E9ctrico.\r\n\r\n     3. El caso extremo ocurre cuando el \u00E1ngulo formado entre el vector \u00E1rea y la vertical al plano es de 90\u00B0; en otras palabras, cuando las lineas de flujo de campo el\u00E9ctrico son paralelas a la superficie, entonces estas ser\u00E1n perpendiculares al vector \u00E1rea y, por tanto, la magnitud del flujo es cero, debido a que el coseno de 90\u00B0 es cero.");
		txtpnEsTodaRegin.setBounds(10, 62, 414, 359);
		panel_1.add(txtpnEsTodaRegin);
		
		ImageIcon ec1 = new ImageIcon("FlowEc1.jpg");
		
		ImageIcon ec2 = new ImageIcon("FlowEc2.jpg");
		
		JButton btnNewButton = new JButton("Atras");
		btnNewButton.setBounds(10, 424, 89, 23);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ElectricFlow frame = new ElectricFlow();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception ex) {
					ex.printStackTrace();
				} 
				dispose();
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 153));
		btnNewButton.setBackground(new Color(0, 51, 102));
		
		JButton btnNewButton_2 = new JButton("Siguiente");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					VentanaGauss frame = new VentanaGauss();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				dispose();
			}
		});
		btnNewButton_2.setBounds(335, 424, 89, 23);
		panel_1.add(btnNewButton_2);
		btnNewButton_2.setForeground(new Color(255, 255, 153));
		btnNewButton_2.setBackground(new Color(0, 51, 102));
	}
}
