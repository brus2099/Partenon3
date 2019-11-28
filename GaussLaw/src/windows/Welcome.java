package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Color;

public class Welcome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 301);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 102));
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnNewButton = new JButton("Calculadora");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					VentanaGauss frame = new VentanaGauss();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnNewButton.setBackground(new Color(0, 51, 102));
		btnNewButton.setForeground(new Color(255, 255, 153));
		btnNewButton.setBounds(171, 184, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnqueEs = new JButton("Comencemos");
		btnqueEs.setBackground(new Color(0, 51, 102));
		btnqueEs.setForeground(new Color(255, 255, 153));
		btnqueEs.addActionListener(new ActionListener() {
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
		btnqueEs.setBounds(154, 150, 120, 23);
		contentPane.add(btnqueEs);
		
		JLabel lblLeyDeGauss = new JLabel("LEY DE GAUSS");
		lblLeyDeGauss.setForeground(new Color(255, 255, 153));
		lblLeyDeGauss.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 32));
		lblLeyDeGauss.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeyDeGauss.setBounds(73, 56, 287, 41);
		contentPane.add(lblLeyDeGauss);
		
		JLabel lblcampoElectrico = new JLabel("(CAMPO ELECTRICO)");
		lblcampoElectrico.setForeground(new Color(255, 255, 153));
		lblcampoElectrico.setHorizontalAlignment(SwingConstants.CENTER);
		lblcampoElectrico.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 32));
		lblcampoElectrico.setBounds(35, 94, 373, 41);
		contentPane.add(lblcampoElectrico);
	}
}
