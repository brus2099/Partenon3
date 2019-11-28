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

public class GaussLaw1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GaussLaw1 frame = new GaussLaw1();
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
	public GaussLaw1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 589);
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
		panel_1.setBounds(0, 0, 434, 550);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane txtpnEsTodaRegin = new JTextPane();
		txtpnEsTodaRegin.setEditable(false);
		txtpnEsTodaRegin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		txtpnEsTodaRegin.setForeground(new Color(0, 0, 128));
		txtpnEsTodaRegin.setBackground(new Color(255, 255, 240));
		txtpnEsTodaRegin.setText("La ley de Gauss a la letra establece lo siguiente:\r\n\r\n\"El numero total de las lineas de fuerza del campo el\u00E9ctrico que entran o salen de cual-\r\nquier superficie cerrada es num\u00E9ricamente igual a la carga el\u00E9ctrica total encerrada por\r\nla superficie.\"");
		txtpnEsTodaRegin.setBounds(10, 62, 414, 120);
		panel_1.add(txtpnEsTodaRegin);
		
		JButton btnNewButton = new JButton("Atras");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ElectricFlow5 frame = new ElectricFlow5();
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
		btnNewButton.setBounds(10, 516, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Siguiente");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					GaussLaw2 frame = new GaussLaw2();
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
		btnNewButton_2.setBounds(335, 516, 89, 23);
		panel_1.add(btnNewButton_2);
		
		JTextPane txtpnPeroSiLos = new JTextPane();
		txtpnPeroSiLos.setText("Todo lo que se manifiesta en este enunciado se representa mediante la siguiente eciaci\u00F3n:");
		txtpnPeroSiLos.setForeground(new Color(0, 0, 128));
		txtpnPeroSiLos.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		txtpnPeroSiLos.setEditable(false);
		txtpnPeroSiLos.setBackground(new Color(255, 255, 240));
		txtpnPeroSiLos.setBounds(10, 178, 414, 38);
		panel_1.add(txtpnPeroSiLos);
		
		ImageIcon sigma = new ImageIcon(getClass().getResource("/Imagenes/photoSigma.jpg"));
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(166, 215, 97, 38);
		lblNewLabel.setIcon(new ImageIcon(sigma.getImage().getScaledInstance(97, 38, Image.SCALE_SMOOTH)));
		panel_1.add(lblNewLabel);
		
		JTextPane txtpnSinEmbargoRecuerda = new JTextPane();
		txtpnSinEmbargoRecuerda.setText("Sin embargo, recuerda que matem\u00E1ticamente la sumatoria de la variable corresponde a la integral de la diferencial de la misma variable; entonces, de forma general, la ley de Gauss se expresa con la siguiente ecuaci\u00F3n:");
		txtpnSinEmbargoRecuerda.setForeground(new Color(0, 0, 128));
		txtpnSinEmbargoRecuerda.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		txtpnSinEmbargoRecuerda.setEditable(false);
		txtpnSinEmbargoRecuerda.setBackground(new Color(255, 255, 240));
		txtpnSinEmbargoRecuerda.setBounds(10, 254, 414, 70);
		panel_1.add(txtpnSinEmbargoRecuerda);
		
		ImageIcon diferential = new ImageIcon(getClass().getResource("/Imagenes/photoDiferential.jpg"));
		JLabel label = new JLabel();
		label.setBounds(153, 323, 122, 38);
		label.setIcon(new ImageIcon(diferential.getImage().getScaledInstance(122, 38, Image.SCALE_SMOOTH)));
		panel_1.add(label);
		
		JTextPane txtpnDondeo = new JTextPane();
		txtpnDondeo.setText("Donde:\r\n\r\n\u03B5o = Permitividad del vac\u00EDo considerado igual al del aire ( Xo= 8.85 x 10**-12 C/Nm**2)\r\nE Campo el\u00E9ctrico expresado en N/C\r\nA=Area expresada en m**2\r\nq=Carga el\u00E9ctrica expresada en C");
		txtpnDondeo.setForeground(new Color(0, 0, 128));
		txtpnDondeo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		txtpnDondeo.setEditable(false);
		txtpnDondeo.setBackground(new Color(255, 255, 240));
		txtpnDondeo.setBounds(10, 367, 414, 138);
		panel_1.add(txtpnDondeo);
		
		
	}
}
