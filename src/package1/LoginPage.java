package package1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

import package2.JDBC_Login_Credentials;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.awt.event.ActionEvent;

public class LoginPage {

	private JFrame frmAmEngineeringPvt;
	int width;
	int height;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	JLabel lblInvalidUsernameOrPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frmAmEngineeringPvt.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAmEngineeringPvt = new JFrame();
		frmAmEngineeringPvt.setResizable(false);
		frmAmEngineeringPvt.setTitle("AM Institute of Technology/ Login Portal");
		frmAmEngineeringPvt.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginPage.class.getResource("/InstitueDataBaseManagement/Logo.jpg")));
		frmAmEngineeringPvt.getContentPane().setBackground(new Color(0, 0, 0));
		frmAmEngineeringPvt.getContentPane().setForeground(new Color(44, 211, 44));
		frmAmEngineeringPvt.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LoginPage.class.getResource("/InstitueDataBaseManagement/LoginNew.png")));
		lblNewLabel.setBounds(111, 145, 250, 185);
		frmAmEngineeringPvt.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("AM Institute of Technology");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 50));
		lblNewLabel_1.setBounds(34, 10, 685, 57);
		frmAmEngineeringPvt.getContentPane().add(lblNewLabel_1);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(361, 149, 278, 177);
		frmAmEngineeringPvt.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(41, 20, 96, 13);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Password");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(41, 78, 96, 13);
		panel.add(lblNewLabel_2_1);

		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtUsername.setBounds(41, 43, 199, 25);
		panel.add(txtUsername);
		txtUsername.setColumns(10);

		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtPassword.setBounds(41, 101, 199, 25);
		panel.add(txtPassword);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 106, 213));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JDBC_Login_Credentials search = new JDBC_Login_Credentials();
				ResultSet result = search.login(txtUsername.getText(), txtPassword.getText());
				boolean flag = false;
				try {
					while(result.next()) {
						flag = true;
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				if(txtUsername.getText().equals("") || txtPassword.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Username/Password Field Can't Be Empty", "Login Failure",JOptionPane.ERROR_MESSAGE);
				}
				else if(flag==true) {
					frmAmEngineeringPvt.setVisible(false);
					Dashboard.main(null);
				}
				else {
					JOptionPane.showMessageDialog(null,"Incorrect Username/Password", "Login Failure",JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 10));
		btnNewButton.setBounds(41, 140, 85, 21);
		panel.add(btnNewButton);

		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setForeground(new Color(255, 255, 255));
		btnSignUp.setBackground(new Color(0, 198, 0));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAmEngineeringPvt.setVisible(false);
				SignUp.main(null);
			}
		});
		btnSignUp.setFont(new Font("Arial Black", Font.BOLD, 10));
		btnSignUp.setBounds(155, 140, 85, 21);
		panel.add(btnSignUp);

		JLabel lblNewLabel_3 = new JLabel("OR");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_3.setBounds(133, 145, 14, 13);
		panel.add(lblNewLabel_3);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Do You Want To Exit", "Exit", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnExit.setBounds(681, 106, 63, 21);
		frmAmEngineeringPvt.getContentPane().add(btnExit);
		
		JLabel lblNewLabel_4 = new JLabel("Database Management System");
		lblNewLabel_4.setBackground(new Color(0, 64, 128));
		lblNewLabel_4.setForeground(new Color(255, 255, 0));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_4.setBounds(214, 65, 326, 25);
		frmAmEngineeringPvt.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(LoginPage.class.getResource("/InstitueDataBaseManagement/LoginPageFingerPrintBackground.jpg")));
		lblNewLabel_5.setBounds(0, 100, 754, 295);
		frmAmEngineeringPvt.getContentPane().add(lblNewLabel_5);

		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension dim = tool.getScreenSize();
		width = (int)dim.getWidth();
		height = (int)dim.getHeight();

		frmAmEngineeringPvt.setBounds(100, 100, width/2, height/2);
		frmAmEngineeringPvt.setLocationRelativeTo(null);
		frmAmEngineeringPvt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
