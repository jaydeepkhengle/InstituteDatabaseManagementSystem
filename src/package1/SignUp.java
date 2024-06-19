package package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import package2.*;

public class SignUp {

	private JFrame frmSignUpPage;
	int width;
	int height;
	private JTextField txtFirstName;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JPasswordField txtCnfrmPassword;
	private JTextField txtLastName;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
					window.frmSignUpPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignUpPage = new JFrame();
		frmSignUpPage.setIconImage(Toolkit.getDefaultToolkit().getImage(SignUp.class.getResource("/InstitueDataBaseManagement/Logo.jpg")));
		frmSignUpPage.setResizable(false);
		frmSignUpPage.setTitle("AM Institute of Technology/ Signup Portal");
		frmSignUpPage.getContentPane().setBackground(new Color(30, 21, 89));
		frmSignUpPage.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Sign Up");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(314, 39, 153, 44);
		frmSignUpPage.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(SignUp.class.getResource("/InstitueDataBaseManagement/SignUp.jpg")));
		lblNewLabel_1.setBounds(105, 92, 250, 250);
		frmSignUpPage.getContentPane().add(lblNewLabel_1);

		JPanel panel = new JPanel();
		panel.setBounds(354, 106, 301, 223);
		frmSignUpPage.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 21, 79, 22);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Last Name");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(10, 53, 79, 22);
		panel.add(lblNewLabel_2_1);

		txtFirstName = new JTextField();
		txtFirstName.setBounds(149, 24, 96, 19);
		panel.add(txtFirstName);
		txtFirstName.setColumns(10);

		JLabel lblNewLabel_2_1_1 = new JLabel("New Username");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(10, 90, 110, 22);
		panel.add(lblNewLabel_2_1_1);

		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(149, 93, 96, 19);
		panel.add(txtUsername);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("Enter Password");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2_1_1_1.setBounds(10, 122, 110, 22);
		panel.add(lblNewLabel_2_1_1_1);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(149, 122, 96, 19);
		panel.add(txtPassword);

		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Confirm Password");
		lblNewLabel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2_1_1_1_1.setBounds(20, 154, 110, 22);
		panel.add(lblNewLabel_2_1_1_1_1);

		txtCnfrmPassword = new JPasswordField();
		txtCnfrmPassword.setBounds(149, 155, 96, 19);
		panel.add(txtCnfrmPassword);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JDBC_Login_Credentials jdbc = new JDBC_Login_Credentials();
				String firstName = txtFirstName.getText();
				String lastName = txtLastName.getText();
				String username = txtUsername.getText();
				String password = txtPassword.getText();
				String cnfrmPassword = txtCnfrmPassword.getText();	
				boolean flag=true;
				ResultSet result = jdbc.signUp(txtUsername.getText());

				try {
					while(result.next()) {
						flag=false;
						JOptionPane.showMessageDialog(null, "Username Already Exists", "Sign Up", JOptionPane.WARNING_MESSAGE);
					}

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(password.equals(cnfrmPassword)) {
					if(flag) {
						JDBC_Login_Credentials insert = new JDBC_Login_Credentials();
						int signUpResult = insert.insertData(firstName, lastName, username, cnfrmPassword);
						if(signUpResult==1) {
							JOptionPane.showMessageDialog(null, "Signed Up Successfully", "Sign Up", JOptionPane.INFORMATION_MESSAGE);
							lblNewLabel_3 = new JLabel("Sign Up Successfull ! Plese Login Again");
							lblNewLabel_3.setBounds(51, 178, 188, 13);
							panel.add(lblNewLabel_3);
							lblNewLabel_3.setForeground(new Color(0, 255, 0));
							frmSignUpPage.repaint();
						}
						else {
							JOptionPane.showMessageDialog(null, "Sign Up Failed", "Failure", JOptionPane.ERROR_MESSAGE);
						}


						try {
							Thread.sleep(1500);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						frmSignUpPage.remove(lblNewLabel_3);
						frmSignUpPage.setVisible(false);
						LoginPage.main(null);
					}
					
				}
				else {
					//Password doesn't match error
					JOptionPane.showMessageDialog(null, "Password Doesn't Match", "Sign Up", JOptionPane.ERROR_MESSAGE);
				}



				
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 10));
		btnNewButton.setBounds(96, 191, 85, 21);
		panel.add(btnNewButton);

		txtLastName = new JTextField();
		txtLastName.setColumns(10);
		txtLastName.setBounds(149, 53, 96, 19);
		panel.add(txtLastName);
		
		JButton btnBackToLogin = new JButton("Back");
		btnBackToLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage.main(null);
				frmSignUpPage.setVisible(false);
			}
		});
		btnBackToLogin.setFont(new Font("Arial Black", Font.BOLD, 10));
		btnBackToLogin.setBounds(647, 10, 85, 21);
		frmSignUpPage.getContentPane().add(btnBackToLogin);

		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension dim = tool.getScreenSize();
		width = (int)dim.getWidth();
		height = (int)dim.getHeight();

		frmSignUpPage.setBounds(100, 100, width/2, height/2);
		frmSignUpPage.setLocationRelativeTo(null);
		frmSignUpPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
