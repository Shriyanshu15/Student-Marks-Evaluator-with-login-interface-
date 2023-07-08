import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField usernm;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 723, 358);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 128, 192), new Color(192, 192, 192), null, null));
		panel.setBounds(10, 11, 689, 299);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER LOGIN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(242, 11, 247, 66);
		panel.add(lblNewLabel);
		
		JLabel user = new JLabel("Username");
		user.setFont(new Font("Tahoma", Font.PLAIN, 20));
		user.setBounds(165, 102, 119, 25);
		panel.add(user);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(165, 153, 119, 25);
		panel.add(lblPassword);
		
		usernm = new JTextField();
		usernm.setBounds(284, 103, 245, 31);
		panel.add(usernm);
		usernm.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(282, 154, 247, 31);
		panel.add(pass);
		
		JButton log = new JButton("LOGIN");
		log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernm.getText();
				String password = pass.getText();
				if(password.contains("hello@KIIT") && username.contains("2006193")) {
					usernm.setText(null);
					pass.setText(null);
					StudentMarks.main(null);
				}
				else {
					JOptionPane.showMessageDialog(null, " INVALID ID OR PASSWORD ","ERROR",JOptionPane.ERROR_MESSAGE);
					usernm.setText(null);
					pass.setText(null);
					usernm.requestFocus();
				}
				
			}
		});
		log.setFont(new Font("Tahoma", Font.PLAIN, 18));
		log.setBounds(141, 229, 92, 38);
		panel.add(log);
		
		JButton reset = new JButton("RESET");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usernm.setText(null);
				pass.setText(null);
			}
		});
		reset.setFont(new Font("Tahoma", Font.PLAIN, 18));
		reset.setBounds(314, 229, 92, 38);
		panel.add(reset);
		
		JButton bye = new JButton("EXIT");
		bye.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		bye.setFont(new Font("Tahoma", Font.PLAIN, 18));
		bye.setBounds(487, 229, 92, 38);
		panel.add(bye);
	}
}
