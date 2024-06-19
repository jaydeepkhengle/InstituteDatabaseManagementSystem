package package1;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dashboard {

	private JFrame frmEntryPage;
	int width;
	int height;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard();
					window.frmEntryPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Dashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEntryPage = new JFrame();
		frmEntryPage.setTitle("AM Institute of Technology/ Dashboard");
		frmEntryPage.getContentPane().setBackground(new Color(27, 60, 97));
		frmEntryPage.getContentPane().setForeground(new Color(0, 0, 0));
		frmEntryPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setToolTipText("Click For Staff Database");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmEntryPage.setVisible(false);
				StaffDB.main(null);
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(Dashboard.class.getResource("/InstitueDataBaseManagement/staff-removebg-preview.png")));
		lblNewLabel_2.setBounds(333, 307, 272, 254);
		frmEntryPage.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(0, 0, 1522, 827);
		frmEntryPage.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome To Star Engineering Pvt Ltd");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 50));
		lblNewLabel_1.setBounds(316, 43, 890, 54);
		frmEntryPage.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(326, 102, 868, 14);
		frmEntryPage.getContentPane().add(separator);
		
		JLabel lblNewLabel_1_1 = new JLabel("Database Management System ");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(316, 116, 890, 49);
		frmEntryPage.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("OR");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(723, 432, 71, 24);
		frmEntryPage.getContentPane().add(lblNewLabel);
		
		JLabel lblStaff = new JLabel("Staff Database");
		lblStaff.setHorizontalAlignment(SwingConstants.CENTER);
		lblStaff.setForeground(Color.WHITE);
		lblStaff.setFont(new Font("Arial Black", Font.BOLD, 28));
		lblStaff.setBounds(348, 586, 272, 24);
		frmEntryPage.getContentPane().add(lblStaff);
		
		JLabel lblStudentDatabase = new JLabel("Student Database");
		lblStudentDatabase.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentDatabase.setForeground(Color.WHITE);
		lblStudentDatabase.setFont(new Font("Arial Black", Font.BOLD, 28));
		lblStudentDatabase.setBounds(885, 586, 295, 24);
		frmEntryPage.getContentPane().add(lblStudentDatabase);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(326, 671, 868, 14);
		frmEntryPage.getContentPane().add(separator_1);
		
		JButton btnNewButton_3 = new JButton("Log Out");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Do You Want To Log Out", "Log Out", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_3.setBounds(1406, 10, 78, 21);
		frmEntryPage.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEntryPage.setVisible(false);
				LoginPage.main(null);
			}
		});
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnNewButton_2.setBounds(713, 722, 96, 28);
		frmEntryPage.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setToolTipText("Click For Student Database");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmEntryPage.setVisible(false);
				StudentDB.main(null);
			}
		});
		lblNewLabel_2_1.setIcon(new ImageIcon(Dashboard.class.getResource("/InstitueDataBaseManagement/Student-removebg-preview.png")));
		lblNewLabel_2_1.setBounds(908, 307, 272, 254);
		frmEntryPage.getContentPane().add(lblNewLabel_2_1);
		frmEntryPage.setIconImage(Toolkit.getDefaultToolkit().getImage(Dashboard.class.getResource("/InstitueDataBaseManagement/Logo.jpg")));
		
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension dim = tool.getScreenSize();
		width = dim.width;
		height = dim.height;
		
		frmEntryPage.setSize(width, height);
		frmEntryPage.setLocationRelativeTo(null);
		frmEntryPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
