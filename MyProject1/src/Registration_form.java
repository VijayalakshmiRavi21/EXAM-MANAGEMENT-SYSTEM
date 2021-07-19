import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Registration_form implements ActionListener{

	
	
	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	////////////////
	public Registration_form ()
	{
	initialize();
	}
	////
	private void initialize()
	{
	frame = new JFrame();
	frame.getContentPane().setBackground(new Color(255, 192, 203));
	frame.setBounds(100, 100, 635, 491);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	JLabel l1 = new JLabel("REGISTRATION FORM");
	l1.setForeground(new Color(178, 34, 34));
	l1.setFont(new Font("Algerian", Font.BOLD, 20));
	l1.setBounds(236, 11, 318, 52);
	frame.getContentPane().add(l1);
	JLabel l2 = new JLabel("Roll_Number");
	l2.setFont(new Font("Arial Black", Font.BOLD, 12));
	l2.setBounds(51, 95, 84, 23);
	frame.getContentPane().add(l2);
	JLabel l3 = new JLabel("Name");
	l3.setFont(new Font("Arial Black", Font.BOLD, 12));
	l3.setBounds(51, 129, 84, 23);
	frame.getContentPane().add(l3);
	JLabel l4 = new JLabel("Father_Name");
	l4.setFont(new Font("Arial Black", Font.BOLD, 12));
	l4.setBounds(51, 171, 92, 23);
	frame.getContentPane().add(l4);
	tf1 = new JTextField();
	tf1.setBounds(179, 97, 161, 20);
	frame.getContentPane().add(tf1);
	tf1.setColumns(10);
	tf2 = new JTextField();
	tf2.setBounds(179, 131, 161, 20);
	frame.getContentPane().add(tf2);
	tf2.setColumns(10);
	tf3 = new JTextField();
	tf3.setBounds(179, 173, 161, 20);
	frame.getContentPane().add(tf3);
	tf3.setColumns(10);
	b1 = new JButton("SAVE&NEXT");
	b1.setForeground(new Color(30, 144, 255));
	b1.setFont(new Font("Times New Roman", Font.BOLD, 14));
	b1.setBounds(100, 381, 127, 36);
	b1.addActionListener(new ActionListener() {
		private String String;

		public void actionPerformed(ActionEvent e) {
			
			
			frame.dispose();
			
			new OnlineTest(String);
		}

		
	});
	frame.setVisible(true);
	b1.addActionListener(this);
	frame.getContentPane().add(b1);
	JLabel l5 = new JLabel("Mother_Name");
	l5.setFont(new Font("Arial Black", Font.BOLD, 12));
	l5.setBounds(51, 220, 92, 23);
	frame.getContentPane().add(l5);
	JLabel l6 = new JLabel("Gender");
	l6.setFont(new Font("Arial Black", Font.BOLD, 12));
	l6.setBounds(51, 270, 84, 23);
	frame.getContentPane().add(l6);
	JLabel l7 = new JLabel("Contact_Number");
	l7.setFont(new Font("Arial Black", Font.BOLD, 12));
	l7.setBounds(51, 310, 108, 23);
	frame.getContentPane().add(l7);
	tf4 = new JTextField();
	tf4.setBounds(179, 222, 161, 20);
	frame.getContentPane().add(tf4);
	tf4.setColumns(10);
	tf5 = new JTextField();
	tf5.setBounds(179, 272, 161, 20);
	frame.getContentPane().add(tf5);
	tf5.setColumns(10);
	tf6 = new JTextField();
	tf6.setBounds(179, 312, 161, 20);
	frame.getContentPane().add(tf6);
	tf6.setColumns(10);
	frame.setVisible(true);
	///////////////////////////////////////////////////////////////
	final JButton b2 = new JButton("UPDATE");
	b2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	/* String firstName = tf1.getText();
	String lastName = tf2.getText();
	String emailId = tf3.getText();
	String city = tf4.getText();
	String pass =tf5.getText();
	String mobileNumber = tf6.getText();
	int len = mobileNumber.length(); */
	try {
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vijidb", "root", "root");
	String query =
	"Update Data Set Roll_Number= '001' where Name = 'viji'";
	Statement sta = connection.createStatement(); int x = sta.executeUpdate(query);
	if (x == 1) {
	JOptionPane.showMessageDialog(b2,
	"A data was Updated successfully!");
	}
	connection.close();
	} catch (Exception exception) {
	exception.printStackTrace();
	}
	}
	});
	b2.setBounds(164, 450, 89, 23);
	//frame.getContentPane().add(b2);
	/////////////////////////////////////////////////////////////////////////////////////
	final JButton b3 = new JButton("DELETE");
	b3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	/* String firstName = tf1.getText();
	String lastName = tf2.getText();
	String emailId = tf3.getText();
	String city = tf4.getText();
	String pass =tf5.getText();
	String mobileNumber = tf6.getText();
	int len = mobileNumber.length();
	*/
	try {
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vijidb", "root", "root");
	String query =
	" delete from Data where Roll_Number='1011'";
	Statement sta = connection.createStatement(); int x = sta.executeUpdate(query);
	if (x > 0) {
	JOptionPane.showMessageDialog(b3,
	"A data was deleted successfully!");
	}
	connection.close();
	} catch (Exception exception) {
	exception.printStackTrace();
	}
	}
	});
	b3.setBounds(309, 450, 89, 23);
	//frame.getContentPane().add(b3);
	///////////////////////////////////////////////////////////////////////////////////////
	JButton b4 = new JButton("Compute");
	b4.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	/* String firstName = tf1.getText();
	String lastName = tf2.getText();
	String emailId = tf3.getText();
	String city = tf4.getText();
	String pass =tf5.getText();
	String mobileNumber = tf6.getText();
	int len = mobileNumber.length();
	*/
	PreparedStatement p = null;
	ResultSet rs = null;
	try {
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vijidb", "root", "root");
	String query =
	"select * from Data";
	System.out.println("Roll_Number\t\tName\t\tFather_Name\t\tMother_Name\t\tGender\t\tContact_Number");
	p = connection.prepareStatement(query);
	rs = p.executeQuery();
	if (rs.next()) {
	String Roll_Number = tf1.getText();
	String Name = tf2.getText();
	String Father_Name = tf3.getText();
	String Mother_Name= tf4.getText();
	String Gender =tf5.getText();
	String Contact_Number = tf6.getText();
	int len = Contact_Number.length();
	System.out.println(Roll_Number+ "\t\t" + Name+ "\t\t" +Father_Name+ "\t\t"+Mother_Name+ "\t\t"
	+ Gender+"\t\t"+Contact_Number);
	connection.close();
	}
	}
	catch (Exception exception) {
	exception.printStackTrace();
	System.out.println(e);
	}
	}
	});
	b4.setBounds(164, 380, 89, 23);
	//frame.getContentPane().add(b4);
	}
	////////////////////////////////////////////////////////////////////////////////
	public void actionPerformed(ActionEvent e) {
	String Roll_Number= tf1.getText();
	String Name = tf2.getText();
	String Father_Name = tf3.getText();
	String Mother_Name = tf4.getText();
	String Gender =tf5.getText();
	String Contact_Number = tf6.getText();
	int len = Contact_Number.length();
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vijidb", "root", "root");
	String query = "INSERT INTO Data values('" + Roll_Number+ "','" + Name + "','" + Father_Name+ "','" + Mother_Name+ "','" +Gender+ "','" + Contact_Number + "')";
	Statement sta = connection.createStatement(); int x = sta.executeUpdate(query);
	if (x == 0) {
	JOptionPane.showMessageDialog(b1, "This is alredy exist");
	} else {
	JOptionPane.showMessageDialog(b1,
	"Welcome, You Registered Sucessfully!!!!");
	}
	connection.close();
	} catch (ClassNotFoundException | SQLException e1) {
	e1.printStackTrace();
	}
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	public void run() {
	try {
	Registration_form window = new Registration_form();
	window.frame.setVisible(true);
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	});
	}
	public void show() {
		// TODO Auto-generated method stub
		
	}
	}