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

public class ElectricFlow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElectricFlow frame = new ElectricFlow();
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
	public ElectricFlow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 579);
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
		panel_1.setBounds(0, 0, 434, 540);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane txtpnEsTodaRegin = new JTextPane();
		txtpnEsTodaRegin.setEditable(false);
		txtpnEsTodaRegin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		txtpnEsTodaRegin.setForeground(new Color(0, 0, 128));
		txtpnEsTodaRegin.setBackground(new Color(255, 255, 240));
		txtpnEsTodaRegin.setText("El flujo el\u00E9ctrico es el n\u00FAmero de lineas de fuerza del campo el\u00E9ctrico que pasan perpendicularmente a trav\u00E9s del \u00E1rea de una superficie. Su magnitud se obtiene mediante el producto escalar de los vectores, la intensidad del campo el\u00E9ctrico, E, y el vector \u00E1rea, A; por tanto, el flujo el\u00E9ctrico es una cantidad escalar que se cumple solamente cuando las\r\nlineas de flujo del campo el\u00E9ctrico inciden perpendicularmente sobre el \u00E1rea de la superficie.");
		txtpnEsTodaRegin.setBounds(10, 62, 414, 134);
		panel_1.add(txtpnEsTodaRegin);
		
		JTextPane txtpnConEsteNombre = new JTextPane();
		txtpnConEsteNombre.setToolTipText("");
		txtpnConEsteNombre.setEditable(false);
		txtpnConEsteNombre.setForeground(new Color(0, 0, 128));
		txtpnConEsteNombre.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		txtpnConEsteNombre.setBackground(new Color(255, 255, 240));
		txtpnConEsteNombre.setText("En este punto, resulta indispensable definir el concepto de vector \u00E1rea, el cual constituye unvector imaginario perpendicular a la superficie que tiene la misma magnitud del \u00E1rea de la propia su superficie y que sale de esta.");
		txtpnConEsteNombre.setBounds(10, 193, 414, 70);
		panel_1.add(txtpnConEsteNombre);
		
		JButton btnNewButton = new JButton("Atras");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
						KarlGauss frame = new KarlGauss();
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
		btnNewButton.setBounds(10, 506, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Siguiente");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ElectricFlow3 frame = new ElectricFlow3();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				dispose();
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 153));
		btnNewButton_2.setBackground(new Color(0, 51, 102));
		btnNewButton_2.setBounds(335, 506, 89, 23);
		panel_1.add(btnNewButton_2);
		
		ImageIcon flow = new ImageIcon(getClass().getResource("/Imagenes/Flow.jpg"));
		JLabel flowPhoto = new JLabel();
		flowPhoto.setBounds(65, 274, 307, 221);
		flowPhoto.setIcon(new ImageIcon(flow.getImage().getScaledInstance(307, 221, Image.SCALE_SMOOTH)));
		panel_1.add(flowPhoto);
	}
}