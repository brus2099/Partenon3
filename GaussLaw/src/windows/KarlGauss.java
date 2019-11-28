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

public class KarlGauss extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KarlGauss frame = new KarlGauss();
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
	public KarlGauss() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(0, 0, 434, 55);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblque = new JLabel("Karl Friedrich Gauss\r\n");
		lblque.setBounds(94, 11, 251, 28);
		panel.add(lblque);
		lblque.setForeground(new Color(255, 255, 153));
		lblque.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
		lblque.setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 240));
		panel_1.setBounds(0, 0, 434, 461);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane txtpnEsTodaRegin = new JTextPane();
		txtpnEsTodaRegin.setEditable(false);
		txtpnEsTodaRegin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		txtpnEsTodaRegin.setForeground(new Color(0, 0, 128));
		txtpnEsTodaRegin.setBackground(new Color(255, 255, 240));
		txtpnEsTodaRegin.setText("Karl Friedrich Gauss (1777-1855), matem\u00E1tico alem\u00E1n conocido por sus diversas contribuciones al campo de la fisica, en especial por sus estudios de electromagnetismo y de los fen\u00F3menos fisicos en el campo de la electricidad. Realiz\u00F3 destacadas investigaciones sobre los fen\u00F3menos el\u00E9ctricos est\u00E1ticos.");
		txtpnEsTodaRegin.setBounds(10, 62, 246, 150);
		panel_1.add(txtpnEsTodaRegin);
		
		JTextPane txtpnConEsteNombre = new JTextPane();
		txtpnConEsteNombre.setToolTipText("");
		txtpnConEsteNombre.setEditable(false);
		txtpnConEsteNombre.setForeground(new Color(0, 0, 128));
		txtpnConEsteNombre.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		txtpnConEsteNombre.setBackground(new Color(255, 255, 240));
		txtpnConEsteNombre.setText("\"El flujo el\u00E9ctrico a trav\u00E9s de una superficie cerrada es num\u00E9ricamente igual a la carga el\u00E9ctrica total de un cuerpo electrizado dentro de la superficie.\"");
		txtpnConEsteNombre.setBounds(64, 324, 314, 82);
		panel_1.add(txtpnConEsteNombre);
		
		JButton btnNewButton = new JButton("Atras");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Welcome frame = new Welcome();
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
		btnNewButton.setBounds(10, 427, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Siguiente");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ElectricFlow frame = new ElectricFlow();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				dispose();
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 153));
		btnNewButton_2.setBackground(new Color(0, 51, 102));
		btnNewButton_2.setBounds(335, 427, 89, 23);
		panel_1.add(btnNewButton_2);
		
		JTextPane txtpnSusEstudiosEstuvieron = new JTextPane();
		txtpnSusEstudiosEstuvieron.setText("Sus estudios estuvieron relacionados con la intensidad de campo el\u00E9ctrico, la carga el\u00E9ctrica que lo genera y el n\u00FAmero de lineas de fuerza. Como resultado de sus estudios, estableci\u00F3 una ecuaci\u00F3n que relaciona dichas variables y elabor\u00F3 un enunciado que en la actualidad se llama ley de Gauss, la cual establece:");
		txtpnSusEstudiosEstuvieron.setForeground(new Color(0, 0, 128));
		txtpnSusEstudiosEstuvieron.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		txtpnSusEstudiosEstuvieron.setEditable(false);
		txtpnSusEstudiosEstuvieron.setBackground(new Color(255, 255, 240));
		txtpnSusEstudiosEstuvieron.setBounds(10, 211, 414, 102);
		panel_1.add(txtpnSusEstudiosEstuvieron);
		
		//ImageIcon gauss = new ImageIcon("carl-friedrich-gauss.jpg");
		ImageIcon gauss = new ImageIcon(getClass().getResource("/Imagenes/carl-friedrich-gauss.jpg"));
		//getClass().getResource("/Imagenes/accept.png")
		JLabel gaussPhoto = new JLabel();
		gaussPhoto.setBounds(246, 62, 178, 150);
		gaussPhoto.setIcon(new ImageIcon(gauss.getImage().getScaledInstance(178, 150, Image.SCALE_SMOOTH)));
		panel_1.add(gaussPhoto);
	}
}
