import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Tugas7 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tugas7 frame = new Tugas7();
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
	public Tugas7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nama: M. Acla Alamsyah Putra");
		lblNewLabel.setBounds(89, 47, 147, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NIM: 1922423380");
		lblNewLabel_1.setBounds(89, 72, 141, 14);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Show more");
		btnNewButton.setBounds(88, 190, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Jurusan : Teknik Informatika");
		lblNewLabel_2.setBounds(89, 97, 169, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Konsentrasi : Software Engineering");
		lblNewLabel_3.setBounds(89, 122, 206, 14);
		panel.add(lblNewLabel_3);
	}
}
