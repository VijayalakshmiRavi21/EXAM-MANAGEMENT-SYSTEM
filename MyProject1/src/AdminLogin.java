import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;

public class AdminLogin {
	
	private JFrame frame3;
	private JTextField tf1;
	private JTextField tf2;
	
	private JButton b1;
	
	AdminLogin(){
		
	frame3 = new JFrame();
	frame3.getContentPane().setBackground(new Color(230, 230, 250));
	frame3.setBounds(100, 100, 635, 341);
	frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame3.getContentPane().setLayout(null);
	JLabel l1 = new JLabel("ADMIN LOGIN");
	l1.setForeground(new Color(178, 34, 34));
	l1.setFont(new Font("Algerian", Font.BOLD, 16));
	l1.setBounds(237, 11, 318, 52);
	frame3.getContentPane().add(l1);
	JLabel l2 = new JLabel("User Name");
	l2.setFont(new Font("Arial", Font.BOLD, 14));
	l2.setBounds(51, 95, 92, 23);
	frame3.getContentPane().add(l2);
	JLabel l3 = new JLabel("Password");
	l3.setFont(new Font("Arial", Font.BOLD, 14));
	l3.setBounds(51, 129, 81, 23);
	frame3.getContentPane().add(l3);
	tf1 = new JTextField();
	tf1.setBounds(153, 95, 120, 20);
	frame3.getContentPane().add(tf1);
	tf1.setColumns(10);
	tf2 = new JTextField();
	tf2.setBounds(153, 129, 120, 20);
	frame3.getContentPane().add(tf2);
	
	
	b1 = new JButton("LOGIN");
	b1.setFont(new Font("Times New Roman", Font.BOLD, 14));
	b1.setBounds(90, 200, 90, 23);
	frame3.getContentPane().add(b1);
	b1.addActionListener(new ActionListener() {
		

		public void actionPerformed(ActionEvent e) {
			
			
			String uname=tf1.getText();
			String psd=tf2.getText();
			if(uname.equals("Admin")&& psd.equals("Admin"))
			{
				JOptionPane.showMessageDialog(frame3, "You are Successfully Logined!");
			}
			else
			{
				JOptionPane.showMessageDialog(frame3, "Invalid Username or Password!");
			}
			
			
		}

		
	});
	frame3.setVisible(true);
	b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			
			frame3.dispose();
			new AdminPanel();
		}

		
	});
	frame3.setVisible(true);
	}
	public static void main(String args[])
	{
		new AdminLogin();
	}
	}