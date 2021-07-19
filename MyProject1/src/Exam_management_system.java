import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Exam_management_system {
	private JFrame frame1;
	
	private JLabel l1;
	private JButton b1;
	private JButton b2;
	
	////////////////
	public Exam_management_system ()
	{
	frame1 = new JFrame();
	frame1.getContentPane().setBackground(new Color(175, 238, 238));
	frame1.setBackground(new Color(255, 250, 240));
	frame1.setBounds(100, 100, 770, 449);
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame1.getContentPane().setLayout(null);
	JLabel l1 = new JLabel("EXAM MANAGEMENT SYSTEM");
	l1.setForeground(new Color(128, 0, 0));
	l1.setFont(new Font("Algerian", Font.BOLD, 23));
	l1.setBounds(82, 31, 355, 52);
	frame1.getContentPane().add(l1);
	b1 = new JButton("STUDENT");
	b1.setFont(new Font("Times New Roman", Font.BOLD, 15));
	b1.setForeground(new Color(25, 25, 112));
	b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			
			frame1.dispose();
			new Registration_form();
		}

		
	});
	frame1.setVisible(true);
	b1.setBounds(60, 163, 119, 32);
	frame1.getContentPane().add(b1);
	JButton b2 = new JButton("ADMIN");
	b2.setForeground(new Color(25, 25, 112));
	b2.setFont(new Font("Times New Roman", Font.BOLD, 15));
	b2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frame1.dispose();
			new AdminLogin();
		}
	});
	frame1.setVisible(true);
	b2.setBounds(262, 163, 119, 32);
	frame1.getContentPane().add(b2);
	frame1.setVisible(true);
	frame1.setSize(500,500);
	}
	public static void main(String args[])
	{
		new Exam_management_system();
		
		
	}
}
	


