package id.ac.its.AppKontakFP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class AboutPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutPage frame = new AboutPage();
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
	public AboutPage() {
		setTitle("About Page");
		setBackground(UIManager.getColor("Button.background"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 586, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Bagian Afdhal
		//membuat interface dan isi halaman about
		JLabel lblNewLabel = new JLabel("About this app");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(246, 10, 98, 37);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrAplikasiKontakTelepoon = new JTextArea();
		txtrAplikasiKontakTelepoon.setEditable(false);
		txtrAplikasiKontakTelepoon.setBackground(UIManager.getColor("Button.background"));
		txtrAplikasiKontakTelepoon.setLineWrap(true);
		txtrAplikasiKontakTelepoon.setWrapStyleWord(true);
		txtrAplikasiKontakTelepoon.setText("Aplikasi kontak telepoon sederhana. \r\n"
				+ "User bisa melakukan operasi dasar sepeti membuat daftar kontak baru "
				+ "dan mencari kontak yang sudah ada berdasarkan nama atau nomor telepon.\r\n\r\n"
				+ "Dibuat untuk Final Project PBO F Semester Gasal 2021.\r\n\r\n"
				+ "Dibuat oleh kelompok 7 : \r\n"
				+ "- Rizaldi Nur Rahman Naufal 05111940000201\r\n"
				+ "- Afdhal Maruf Lukman 05111940007001\r\n"
				+ "- Moh. Ilham Fakhri Zamzami 5025201275\r\n"
				+ "- Aqil Ramadhan Hadiono 5025201261");
		txtrAplikasiKontakTelepoon.setBounds(8, 57, 556, 206);
		contentPane.add(txtrAplikasiKontakTelepoon);
		//end bagian afdhal
	}
}
