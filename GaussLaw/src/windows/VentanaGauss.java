package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JTextPane;

import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class VentanaGauss extends JFrame {

	protected static final int E = 0;
	private JPanel contentPane;
	private JTextField texSuperficie;
	private JTextField textCampo;
	private JTextField textVector;
	private JLabel lblCalculo = new JLabel("");
	JComboBox comboBox_1 = new JComboBox();
	JComboBox comboBox = new JComboBox();
	JLabel lblDiagrama = new JLabel();
	private JLabel lblArea_1 = new JLabel("Area");
	private JLabel lblAngulo = new JLabel("Angulo");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaGauss frame = new VentanaGauss();
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
	public VentanaGauss() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 658);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblDiagrama.setBounds(78, 307, 275, 277);
		
		JLabel lblArea = new JLabel("Area de la superficie Gaussiana [m^2]");
		lblArea.setHorizontalAlignment(SwingConstants.CENTER);
		lblArea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblArea.setBounds(82, 54, 300, 20);
		contentPane.add(lblArea);
		
		JLabel lblCampoElectrico = new JLabel("Campo electrico [N/C]");
		lblCampoElectrico.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblCampoElectrico.setBounds(143, 116, 167, 14);
		contentPane.add(lblCampoElectrico);
		
		texSuperficie = new JTextField();
		texSuperficie.setBounds(126, 85, 86, 20);
		contentPane.add(texSuperficie);
		texSuperficie.setColumns(10);
		
		textCampo = new JTextField();
		textCampo.setBounds(126, 141, 86, 20);
		contentPane.add(textCampo);
		textCampo.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBackground(new Color(0, 51, 102));
		btnCalcular.setForeground(new Color(255, 255, 153));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (texSuperficie.getText().length()!=0 &&
						textCampo.getText().length()!=0 &&
						textVector.getText().length()!=0) {
					float Area = Float.parseFloat(texSuperficie.getText());
					float Campo = Float.parseFloat(textCampo.getText());
					float vector = Float.parseFloat(textVector.getText());
					double b = Math.toRadians(vector);
					Math.cos(b);
					
					int x= comboBox.getSelectedIndex();
					int y = comboBox_1.getSelectedIndex();
					float c=0;
					if(y==0) {
						JOptionPane.showMessageDialog(null, "Ingrese notacion cientifica");
					}else if (y==1) {
						c= (float) (Area*0.0001);
					}else if (y==2) {
						c= (float) (Area*0.001);
					}else if (y==3) {
						c= (float) (Area*0.01);
					}else if (y==4) {
						c= (float) (Area*0.1);
					}else if (y==5) {
						c= (float) (Area*1);
					}else if (y==6) {
						c= (float) (Area*10);
					}else if (y==7) {
						c= (float) (Area*100);
					}else if (y==8) {
						c= (float) (Area*1000);
					}else if (y==9) {
						c= (float) (Area*10000);
					}
					
					float a = 0;
					if(x==0) {
						JOptionPane.showMessageDialog(null, "Ingrese notacion cientifica");
					}else if(x==1) {
						a=(float) (Campo*0.000001);
					}else if(x==2){
						a=(float) (Campo*0.00001);
					}else if(x==3){
						a=(float) (Campo*0.0001);
					}else if(x==4){
						a=(float) (Campo*0.001);
					}else if(x==5){
						a=(float) (Campo*0.01);
					}else if(x==6){
						a=(float) (Campo*0.1);
					}else if(x==7){
						a=(Campo*1);
					}else if(x==8){
						a=(Campo*10);
					}else if(x==9){
						a=(Campo*100);
					}else if(x==10){
						a=(Campo*1000);
					}else if(x==11){
						a=(Campo*10000);
					}else if(x==12){
						a=(Campo*100000);
					}else if(x==13){
						a=(Campo*1000000);
					}
					
//					System.out.println(a);	
					float FlujEle =(float) (c*a*Math.cos(b));
					
					
//					System.out.println(Area); 
//					System.out.println(Campo);
//					System.out.println(vector);
//					System.out.println(FlujEle);
					
					if ( vector>=0 && vector<=23 || vector>=337 && vector<=360){
						ImageIcon grade = new ImageIcon(getClass().getResource("/Imagenes/0.jpg"));
						lblDiagrama.setIcon(new ImageIcon(grade.getImage().getScaledInstance(275, 277, Image.SCALE_SMOOTH)));
						contentPane.add(lblDiagrama);
						
						lblArea_1.setText(texSuperficie.getText()+"m^2");
						lblArea_1.setBounds(189, 368, 80, 14);
						lblAngulo.setText(textVector.getText()+"°");
						lblAngulo.setBounds(229, 409, 80, 14);
						
					} else if ( vector>=24 && vector<=68 ){
						ImageIcon grade = new ImageIcon(getClass().getResource("/Imagenes/45.jpg"));
						lblDiagrama.setIcon(new ImageIcon(grade.getImage().getScaledInstance(275, 277, Image.SCALE_SMOOTH)));
						contentPane.add(lblDiagrama);
						
						lblArea_1.setBounds(165, 368, 80, 14);
						lblAngulo.setText(textVector.getText()+"°");
						lblAngulo.setBounds(229, 399, 80, 14);
						lblArea_1.setText(texSuperficie.getText()+"m^2");
						
					} else if ( vector>=69 && vector<=113 ){
						ImageIcon grade = new ImageIcon(getClass().getResource("/Imagenes/90.jpg"));
						lblDiagrama.setIcon(new ImageIcon(grade.getImage().getScaledInstance(275, 277, Image.SCALE_SMOOTH)));
						contentPane.add(lblDiagrama);

						lblArea_1.setBounds(165, 368, 80, 14);
						
						lblAngulo.setBounds(229, 399, 80, 14);
						
					} else if ( vector>=114 && vector<=158 ){
						ImageIcon grade = new ImageIcon(getClass().getResource("/Imagenes/135.jpg"));
						lblDiagrama.setIcon(new ImageIcon(grade.getImage().getScaledInstance(275, 277, Image.SCALE_SMOOTH)));
						contentPane.add(lblDiagrama);
					} else if ( vector>=159 && vector<=203 ){
						ImageIcon grade = new ImageIcon(getClass().getResource("/Imagenes/180.jpg"));
						lblDiagrama.setIcon(new ImageIcon(grade.getImage().getScaledInstance(275, 277, Image.SCALE_SMOOTH)));
						contentPane.add(lblDiagrama);
					} else if ( vector>=204 && vector<=248 ){
						ImageIcon grade = new ImageIcon(getClass().getResource("/Imagenes/225.jpg"));
						lblDiagrama.setIcon(new ImageIcon(grade.getImage().getScaledInstance(275, 277, Image.SCALE_SMOOTH)));
						contentPane.add(lblDiagrama);
					} else if ( vector>=249 && vector<=293 ){
						ImageIcon grade = new ImageIcon(getClass().getResource("/Imagenes/270.jpg"));
						lblDiagrama.setIcon(new ImageIcon(grade.getImage().getScaledInstance(275, 277, Image.SCALE_SMOOTH)));
						contentPane.add(lblDiagrama);
					} else if ( vector>=294 && vector<=336 ){
						ImageIcon grade = new ImageIcon(getClass().getResource("/Imagenes/315.jpg"));
						lblDiagrama.setIcon(new ImageIcon(grade.getImage().getScaledInstance(275, 277, Image.SCALE_SMOOTH)));
						contentPane.add(lblDiagrama);
					}
					lblCalculo.setText(String.valueOf("ε= "+FlujEle+" Nm²/C"));
					lblAngulo.setText(textVector.getText()+"°");
					lblArea_1.setText(texSuperficie.getText()+"m^2");
				}else {
					JOptionPane.showMessageDialog(null, "Llene todos los campos");
				}
				
			}
		});
		btnCalcular.setBounds(172, 236, 89, 23);
		contentPane.add(btnCalcular);
		
		JLabel lblFlujo = new JLabel("Flujo Electrico ");
		lblFlujo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblFlujo.setBounds(107, 270, 105, 20);
		contentPane.add(lblFlujo);
		
		JLabel lblAnguloDe = new JLabel("Angulo del vector area [\u00B0]");
		lblAnguloDe.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblAnguloDe.setBounds(126, 172, 184, 29);
		contentPane.add(lblAnguloDe);
		
		textVector = new JTextField();
		textVector.setBounds(162, 205, 105, 20);
		contentPane.add(textVector);
		textVector.setColumns(10);
		
		lblCalculo.setBounds(209, 270, 144, 19);
		contentPane.add(lblCalculo);
		
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Not. Cientifica", "x10^-6", "x10^-5", "x10^-4", "x10^-3", "x10^-2", "x10^-1", "x10^0", "x10^1", "x10^2", "x10^3", "x10^4", "x10^5", "x10^6"}));
		comboBox.setBounds(216, 141, 137, 20);
		contentPane.add(comboBox);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Not. Cientifica", "x10^-4", "x10^-3", "x10^-2", "x10^-1", "x10^0", "x10^1", "x10^2", "x10^3", "x10^4", "x10^5"}));
		
		comboBox_1.setBounds(216, 85, 137, 20);
		contentPane.add(comboBox_1);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Welcome frame = new Welcome();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setLocationRelativeTo(null);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				dispose();
			}
		});
		btnInicio.setForeground(new Color(255, 255, 153));
		btnInicio.setBackground(new Color(0, 51, 102));
		btnInicio.setBounds(333, 595, 89, 23);
		contentPane.add(btnInicio);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
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
		btnAtras.setForeground(new Color(255, 255, 153));
		btnAtras.setBackground(new Color(0, 51, 102));
		btnAtras.setBounds(10, 595, 89, 23);
		contentPane.add(btnAtras);
		
		contentPane.add(lblAngulo);
		
		contentPane.add(lblArea_1);
		
	}
}
