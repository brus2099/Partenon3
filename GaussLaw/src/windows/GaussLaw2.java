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

public class GaussLaw2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GaussLaw2 frame = new GaussLaw2();
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
	public GaussLaw2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 412);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(0, 0, 434, 55);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblque = new JLabel("Ley de Gauss");
		lblque.setHorizontalAlignment(SwingConstants.CENTER);
		lblque.setBounds(94, 11, 251, 28);
		panel.add(lblque);
		lblque.setForeground(new Color(255, 255, 153));
		lblque.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
		lblque.setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 240));
		panel_1.setBounds(0, 0, 434, 373);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane txtpnEsTodaRegin = new JTextPane();
		txtpnEsTodaRegin.setEditable(false);
		txtpnEsTodaRegin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		txtpnEsTodaRegin.setForeground(new Color(0, 0, 128));
		txtpnEsTodaRegin.setBackground(new Color(255, 255, 240));
		txtpnEsTodaRegin.setText("De manera general, la ley de Gauss se emplea para calcular el campo el\u00E9ctrico, E, cuando la distribuci\u00F3n de la carga el\u00E9ctrica es sim\u00E9trica en cuerpos esf\u00E9ricos, cilindricos o planos, para su aplicaci\u00F3n, se debe cumplir al menos alguna de las siguientes condiciones:\r\n\r\na) Puede considerarse constante por simetria sobre toda la superficie.\r\n\r\nb) El producto E\u2022dA puede considerarse E dA porque Ey dA son paralelas.\r\n\r\nc)E\u2022dA=0, porque E y dA son perpendiculares\r\n\r\nd) Cuando se dice que el campo sobre la superficie es cero porque no hay carga dentro.");
		txtpnEsTodaRegin.setBounds(10, 62, 414, 267);
		panel_1.add(txtpnEsTodaRegin);
		
		JButton btnNewButton = new JButton("Atras");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					GaussLaw1 frame = new GaussLaw1();
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
		btnNewButton.setBounds(10, 338, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Calculadora");
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
		btnNewButton_2.setForeground(new Color(255, 255, 153));
		btnNewButton_2.setBackground(new Color(0, 51, 102));
		btnNewButton_2.setBounds(335, 340, 89, 23);
		panel_1.add(btnNewButton_2);
		
		ImageIcon sigma = new ImageIcon("photoSigma.jpg");
		
		ImageIcon diferential = new ImageIcon("photoDiferential.jpg");
		
		
	}
}
