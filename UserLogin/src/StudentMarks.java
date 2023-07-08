import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentMarks {

	private JFrame frame;
	private JTextField sub1;
	private JTextField sub2;
	private JTextField sub3;
	private JTextField sub4;
	private JTextField tot;
	private JTextField avg;
	private JTextField grd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMarks window = new StudentMarks();
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
	public StudentMarks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 740, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 128, 128), new Color(192, 192, 192), null, null));
		panel.setBounds(22, 37, 682, 386);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT MARKS CALCULATION SYSTEM");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(25, 11, 632, 58);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Subject 1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(130, 86, 93, 28);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Subject 2");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(130, 125, 93, 28);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Subject 3");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(130, 164, 93, 28);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Subject 4");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(130, 203, 93, 28);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Total Marks");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_4.setBounds(130, 242, 93, 28);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Average");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_5.setBounds(130, 281, 93, 28);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Grade");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_6.setBounds(130, 320, 93, 28);
		panel.add(lblNewLabel_1_6);
		
		sub1 = new JTextField();
		sub1.setBounds(253, 92, 96, 20);
		panel.add(sub1);
		sub1.setColumns(10);
		
		sub2 = new JTextField();
		sub2.setColumns(10);
		sub2.setBounds(253, 131, 96, 20);
		panel.add(sub2);
		
		sub3 = new JTextField();
		sub3.setColumns(10);
		sub3.setBounds(253, 170, 96, 20);
		panel.add(sub3);
		
		sub4 = new JTextField();
		sub4.setColumns(10);
		sub4.setBounds(253, 209, 96, 20);
		panel.add(sub4);
		
		tot = new JTextField();
		tot.setColumns(10);
		tot.setBounds(253, 248, 96, 20);
		panel.add(tot);
		
		avg = new JTextField();
		avg.setColumns(10);
		avg.setBounds(253, 287, 96, 20);
		panel.add(avg);
		
		grd = new JTextField();
		grd.setColumns(10);
		grd.setBounds(253, 326, 96, 20);
		panel.add(grd);
		
		JButton addbt = new JButton("ADD");
		addbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int s1 = Integer.parseInt(sub1.getText());
				int s2 = Integer.parseInt(sub2.getText());
				int s3 = Integer.parseInt(sub3.getText());
				int s4 = Integer.parseInt(sub4.getText());
				
				int total = s1 + s2 + s3 + s4;
				float average = total/4;
				
				tot.setText(String.valueOf(total));
				avg.setText(String.valueOf(average));
				
				if(average > 48) {
					grd.setText("Passed");
				}
				else {
					grd.setText("Failed");
				}
			}
		});
		addbt.setFont(new Font("Times New Roman", Font.BOLD, 18));
		addbt.setBounds(444, 114, 113, 51);
		panel.add(addbt);
		
		JButton clrbt = new JButton("CLEAR");
		clrbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sub1.setText("");
				sub2.setText("");
				sub3.setText("");
				sub4.setText("");
				tot.setText("");
				avg.setText("");
				grd.setText("");
				sub1.requestFocus();
			}
		});
		clrbt.setFont(new Font("Times New Roman", Font.BOLD, 18));
		clrbt.setBounds(444, 194, 113, 51);
		panel.add(clrbt);
		
		JButton extbt = new JButton("EXIT");
		extbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		extbt.setFont(new Font("Times New Roman", Font.BOLD, 18));
		extbt.setBounds(444, 272, 113, 51);
		panel.add(extbt);
	}
}
