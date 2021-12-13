import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tugas8 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAlas1;
	private JTextField textFieldTinggi1;
	private JTextField textFieldLuas1;
	private JTextField textFieldAlas2;
	private JTextField textFieldTinggi2;
	private JTextField textFieldLuas2;
	private JTextField textFieldHasilSegitiga;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tugas8 frame = new Tugas8();
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
	public Tugas8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menghitung 2 buah Luas Segitiga");
		lblNewLabel.setBounds(56, 11, 219, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Alas 1 :");
		lblNewLabel_1.setBounds(42, 56, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tinggi 1 :");
		lblNewLabel_2.setBounds(42, 81, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Luas 1 :");
		lblNewLabel_3.setBounds(42, 106, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Alas 2 :");
		lblNewLabel_4.setBounds(42, 131, 46, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tinggi 2 :");
		lblNewLabel_5.setBounds(42, 156, 46, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Luas 2 :");
		lblNewLabel_6.setBounds(42, 181, 46, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("luas segitiga yg paling besar :");
		lblNewLabel_7.setBounds(42, 206, 219, 14);
		panel.add(lblNewLabel_7);
		
		textFieldAlas1 = new JTextField();
		textFieldAlas1.setBounds(97, 53, 86, 20);
		panel.add(textFieldAlas1);
		textFieldAlas1.setColumns(10);
		
		textFieldTinggi1 = new JTextField();
		textFieldTinggi1.setBounds(98, 78, 86, 20);
		panel.add(textFieldTinggi1);
		textFieldTinggi1.setColumns(10);
		
		textFieldLuas1 = new JTextField();
		textFieldLuas1.setEditable(false);
		textFieldLuas1.setBounds(98, 103, 86, 20);
		panel.add(textFieldLuas1);
		textFieldLuas1.setColumns(10);
		
		textFieldAlas2 = new JTextField();
		textFieldAlas2.setBounds(97, 128, 86, 20);
		panel.add(textFieldAlas2);
		textFieldAlas2.setColumns(10);
		
		textFieldTinggi2 = new JTextField();
		textFieldTinggi2.setBounds(98, 153, 86, 20);
		panel.add(textFieldTinggi2);
		textFieldTinggi2.setColumns(10);
		
		textFieldLuas2 = new JTextField();
		textFieldLuas2.setEditable(false);
		textFieldLuas2.setBounds(97, 178, 86, 20);
		panel.add(textFieldLuas2);
		textFieldLuas2.setColumns(10);
		
		textFieldHasilSegitiga = new JTextField();
		textFieldHasilSegitiga.setEditable(false);
		textFieldHasilSegitiga.setBounds(271, 203, 124, 20);
		panel.add(textFieldHasilSegitiga);
		textFieldHasilSegitiga.setColumns(10);
		
		JButton btnProses = new JButton("Proses");
		btnProses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Alas1 = Integer.parseInt(textFieldAlas1.getText());
				int Tinggi1 = Integer.parseInt(textFieldTinggi1.getText());
				int Hasil1 = Alas1 * Tinggi1 / 2;
				textFieldLuas1.setText(Integer.toString(Hasil1));
				
				int Alas2 = Integer.parseInt(textFieldAlas2.getText());
				int Tinggi2 = Integer.parseInt(textFieldTinggi2.getText());
				int Hasil2 = Alas2 * Tinggi2 / 2;
				textFieldLuas2.setText(Integer.toString(Hasil2));
				
				if(Hasil1 > Hasil2) {
					textFieldHasilSegitiga.setText("Segitiga 1 = " + Hasil1);
				} else if (Hasil1 < Hasil2) {
					textFieldHasilSegitiga.setText("Segitiga 2 = " + Hasil2);
				} else {
					textFieldHasilSegitiga.setText("Segitiga sama besar");
				}
			}
		});
		
		btnProses.setBounds(249, 77, 89, 23);
		panel.add(btnProses);
		
		JButton btnBersihkan = new JButton("Bersihkan");
		btnBersihkan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldAlas1.setText(null);
				textFieldTinggi1.setText(null);
				textFieldLuas1.setText(null);
				textFieldAlas2.setText(null);
				textFieldTinggi2.setText(null);
				textFieldLuas2.setText(null);
				textFieldHasilSegitiga.setText(null);
			}
		});
		btnBersihkan.setBounds(249, 127, 89, 23);
		panel.add(btnBersihkan);
		
		
	}
}
