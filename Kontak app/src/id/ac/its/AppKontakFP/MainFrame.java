package id.ac.its.AppKontakFP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.DropMode;

//import id.ac.its.AppKontakFP.Kontak;


public class MainFrame {

	private JFrame frmJavaKontakApp;
	private JTextField cariF;
	private JTextField nomerF;
	private JTextField namaF;
	private JTextField orgF;
	private JPanel panel;
	private JComboBox jenis_comboBox;
	private Kontak kontak;
	Connection connection= null;//buat koneksi dg h2 DB
	private JButton aboutBtn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmJavaKontakApp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}
	
	//buat fungsi membuat tabel di database yg sudah terhubung
	public void createTableNew() {
		try {
			DatabaseMetaData dmd = connection.getMetaData();
			ResultSet set = dmd.getTables(null, null, "KONTAK", null);
			
			if(set.next()) {
				//kalau tabel sudah ada, do nothing
			}
			else {
				String create_table =" create table KONTAK (notelp varchar(13), "
						+ "nama varchar(30), "
						+ "organisasi varchar(50), "
						+ "jenisno varchar(10), "
						+ "primary key(notelp))";
				
				PreparedStatement statement = connection.prepareStatement(create_table);
				statement.executeUpdate();
				
				JOptionPane.showMessageDialog(null, "Table created succesfully");
			}
		}
		catch(Exception e){
			
		}
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {//koneksikan ke server database H2
			Class.forName("org.h2.Driver");
			connection= DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			
			JOptionPane.showMessageDialog(null, "Berhasil Terhubung");
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//Frame utama
		frmJavaKontakApp = new JFrame();
		frmJavaKontakApp.setTitle("Java Kontak app sederhana");
		frmJavaKontakApp.setBounds(100, 100, 1000, 600);
		frmJavaKontakApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJavaKontakApp.getContentPane().setLayout(null);
		
		//Bagian Aqil

		
		//frame membuat kontak baru
		panel = new JPanel();
		panel.setVisible(false); //buat invisible sebelum dipencet buat kontak baru
		panel.setBounds(22, 187, 424, 323);
		frmJavaKontakApp.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel namaL = new JLabel("Nama");
		namaL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		namaL.setBounds(41, 112, 57, 23);
		panel.add(namaL);
		
		nomerF = new JTextField();
		nomerF.setBounds(125, 58, 201, 23);
		panel.add(nomerF);
		nomerF.setColumns(10);
		
		JLabel nomerL = new JLabel("No Telp");
		nomerL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nomerL.setBounds(41, 56, 57, 23);
		panel.add(nomerL);
		
		namaF = new JTextField();
		namaF.setColumns(10);
		namaF.setBounds(125, 114, 201, 23);
		panel.add(namaF);
		
		JLabel orgL = new JLabel("Organisasi");
		orgL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		orgL.setBounds(41, 166, 70, 23);
		panel.add(orgL);
		
		orgF = new JTextField();
		orgF.setColumns(10);
		orgF.setBounds(125, 170, 201, 23);
		panel.add(orgF);
		
		JLabel jenisL = new JLabel("Jenis no");
		jenisL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jenisL.setBounds(41, 220, 70, 23);
		panel.add(jenisL);
		
		jenis_comboBox = new JComboBox();
		jenis_comboBox.setBackground(Color.WHITE);
		jenis_comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		jenis_comboBox.setModel(new DefaultComboBoxModel(new String[] {"Kerja", "Rumah", "Pribadi"}));
		jenis_comboBox.setBounds(125, 225, 201, 21);
		panel.add(jenis_comboBox);
		
		JButton buatB = new JButton("Buat Baru");
		//Add actionlistener here
		buatB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		buatB.setBounds(144, 270, 136, 30);
		panel.add(buatB);
		
		
		createTableNew();//deklarasikan
	}
}
