package id.ac.its.AppKontakFP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Kontak extends JFrame {

	private JPanel contentPane;
	protected JTextField nomerF;
	protected JTextField namaF;
	protected JTextField orgF;
	protected JTextField jenisF;
	Connection connection= null;//buat koneksi dg h2 DB

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kontak frame = new Kontak();
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
	public Kontak() {
		setTitle("Kontak ditemukan");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Bagian Afdhal
		JLabel nomerL = new JLabel("No Telp");
		nomerL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nomerL.setBounds(47, 31, 57, 23);
		contentPane.add(nomerL);
		
		JLabel namaL = new JLabel("Nama");
		namaL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		namaL.setBounds(47, 87, 57, 23);
		contentPane.add(namaL);
		
		JLabel orgL = new JLabel("Organisasi");
		orgL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		orgL.setBounds(47, 141, 70, 23);
		contentPane.add(orgL);
		
		JLabel jenisL = new JLabel("Jenis no");
		jenisL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jenisL.setBounds(47, 195, 70, 23);
		contentPane.add(jenisL);
		
		nomerF = new JTextField();
		nomerF.setBackground(Color.WHITE);
		nomerF.setEditable(false);
		nomerF.setColumns(10);
		nomerF.setBounds(131, 33, 201, 23);
		contentPane.add(nomerF);
		
		namaF = new JTextField();
		namaF.setBackground(Color.WHITE);
		namaF.setEditable(false);
		namaF.setColumns(10);
		namaF.setBounds(131, 89, 201, 23);
		contentPane.add(namaF);
		
		orgF = new JTextField();
		orgF.setBackground(Color.WHITE);
		orgF.setEditable(false);
		orgF.setColumns(10);
		orgF.setBounds(131, 145, 201, 23);
		contentPane.add(orgF);
		
		jenisF = new JTextField();
		jenisF.setBackground(Color.WHITE);
		jenisF.setEditable(false);
		jenisF.setColumns(10);
		jenisF.setBounds(131, 199, 201, 23);
		contentPane.add(jenisF);
		//end Afdhal
		
	}

}
