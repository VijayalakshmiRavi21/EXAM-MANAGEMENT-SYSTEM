import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class AdminPanel {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTable table;
	DefaultTableModel model;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPanel window = new AdminPanel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 591, 509);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(220, 20, 60));
		panel.setBackground(new Color(144, 238, 144));
		panel.setBounds(0, 0, 575, 470);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel l1 = new JLabel("ADMIN LOGIN");
		l1.setForeground(new Color(220, 20, 60));
		l1.setFont(new Font("Algerian", Font.BOLD, 16));
		l1.setBounds(209, 11, 137, 36);
		panel.add(l1);
		
		JLabel l2 = new JLabel("QNo:");
		l2.setFont(new Font("Arial", Font.BOLD, 13));
		l2.setBounds(20, 78, 57, 14);
		panel.add(l2);
		
		JLabel l3 = new JLabel("Question");
		l3.setFont(new Font("Arial", Font.BOLD, 13));
		l3.setBounds(20, 112, 57, 14);
		panel.add(l3);
		
		JLabel l4 = new JLabel("Option1");
		l4.setFont(new Font("Arial", Font.BOLD, 13));
		l4.setBounds(20, 147, 57, 14);
		panel.add(l4);
		
		JLabel l5 = new JLabel("Option2");
		l5.setFont(new Font("Arial", Font.BOLD, 13));
		l5.setBounds(20, 183, 57, 14);
		panel.add(l5);
		
		JLabel l6 = new JLabel("Option3");
		l6.setFont(new Font("Arial", Font.BOLD, 13));
		l6.setBounds(20, 221, 57, 14);
		panel.add(l6);
		
		JLabel l7 = new JLabel("Option4");
		l7.setFont(new Font("Arial", Font.BOLD, 13));
		l7.setBounds(20, 257, 57, 14);
		panel.add(l7);
		
		t1 = new JTextField();
		t1.setBounds(87, 75, 111, 20);
		panel.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(87, 109, 111, 20);
		panel.add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(87, 144, 111, 20);
		panel.add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(87, 180, 111, 20);
		panel.add(t4);
		t4.setColumns(10);
		
		t5 = new JTextField();
		t5.setBounds(87, 218, 111, 20);
		panel.add(t5);
		t5.setColumns(10);
		
		t6 = new JTextField();
		t6.setBounds(87, 254, 111, 20);
		panel.add(t6);
		t6.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(223, 76, 328, 372);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(0, 255, 255));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int i=table.getSelectedRow();
				if(i>=0) {
					t1.setText(model.getValueAt(i, 0).toString());
					t2.setText(model.getValueAt(i, 1).toString());
					t3.setText(model.getValueAt(i, 2).toString());
					t4.setText(model.getValueAt(i, 3).toString());
					t5.setText(model.getValueAt(i, 4).toString());
					t6.setText(model.getValueAt(i, 5).toString());
					JOptionPane.showMessageDialog(null," Question updated successfully");
				}
				else
				{
					JOptionPane.showMessageDialog(null," Please select row first");
				}
				
			}
		});
		scrollPane.setViewportView(table);
		model=new DefaultTableModel();
		Object[] column= {"QNo","Question","Option1","Option2","Option3","Option4"};
		final Object[] row=new Object[6];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		
		JButton b1 = new JButton("ADD QUESTION");
		b1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals("")||t5.getText().equals("")||t6.getText().equals("")) {
					JOptionPane.showMessageDialog(null," Please Fill Complete Information");
				}
				else {
					row[0]=t1.getText();
					row[1]=t2.getText();
					row[2]=t3.getText();
					row[3]=t4.getText();
					row[4]=t5.getText();
					row[5]=t6.getText();
					model.addRow(row);
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
					JOptionPane.showMessageDialog(null," Questions added successfully!");
				}
				
			}
		});
		b1.setBounds(41, 320, 157, 23);
		panel.add(b1);
		
		JButton b2 = new JButton("UPDATE QUESTION");
		b2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				model.setValueAt(t1.getText(), i, 0);
				model.setValueAt(t2.getText(), i, 1);
				model.setValueAt(t3.getText(), i, 2);
				model.setValueAt(t4.getText(), i, 3);
				model.setValueAt(t5.getText(), i, 4);
				model.setValueAt(t6.getText(), i, 5);
			}
		});
		b2.setBounds(41, 354, 157, 23);
		panel.add(b2);
		
		JButton b3 = new JButton("DELETE QUESTION");
		b3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				if(i>=0)
				{
					model.removeRow(i);
					JOptionPane.showMessageDialog(null," Questions deleted successfully!");
				}
				else {
					JOptionPane.showMessageDialog(null," Please select the row first");
				}
				
			}
		});
		b3.setBounds(41, 388, 157, 23);
		panel.add(b3);
		
		JButton b4 = new JButton("CLEAR");
		b4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
			}
		});
		b4.setBounds(41, 422, 157, 23);
		panel.add(b4);
		
		JButton b5 = new JButton("EXIT");
		b5.setForeground(new Color(220, 20, 60));
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
    			new Exam_management_system();
    		}

    		
    	});
    	frame.setVisible(true);
		b5.setBounds(510, 0, 65, 23);
		panel.add(b5);
	}
}
