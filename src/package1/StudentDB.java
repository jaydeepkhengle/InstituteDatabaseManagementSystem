package package1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class StudentDB {

	private JFrame frmStudentDataBase;
	int width;
	int height;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDB window = new StudentDB();
					window.frmStudentDataBase.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentDB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentDataBase = new JFrame();
		frmStudentDataBase.setIconImage(Toolkit.getDefaultToolkit().getImage(StudentDB.class.getResource("/InstitueDataBaseManagement/Logo.jpg")));
		frmStudentDataBase.setTitle("AM Institute of Technology/ Student Database Management");
		frmStudentDataBase.getContentPane().setBackground(new Color(27, 60, 97));
		frmStudentDataBase.getContentPane().setForeground(new Color(0, 0, 0));
		frmStudentDataBase.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Database Management");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Bell MT", Font.BOLD, 50));
		lblNewLabel.setBounds(411, 44, 700, 52);
		frmStudentDataBase.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(327, 106, 868, 14);
		frmStudentDataBase.getContentPane().add(separator);
		
		JButton btnNewButton_3_1 = new JButton("Log Out");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Do You Want To Log Out", "Log Out", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_3_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_3_1.setBounds(1406, 22, 78, 21);
		frmStudentDataBase.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_2_1 = new JButton("Back");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard.main(null);
				frmStudentDataBase.setVisible(false);
			}
			
		});
		btnNewButton_2_1.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnNewButton_2_1.setBounds(713, 732, 96, 28);
		frmStudentDataBase.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(27, 60, 97));
		btnNewButton.setToolTipText("Click To Add Data");
		btnNewButton.setBounds(414, 166, 200, 183);
		frmStudentDataBase.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudent.main(null);
			}
		});
		btnNewButton.setIcon(new ImageIcon(StudentDB.class.getResource("/InstitueDataBaseManagement/ADD (Custom).png")));
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(27, 60, 97));
		btnNewButton_3.setToolTipText("Click To Delete Data");
		btnNewButton_3.setBounds(911, 440, 200, 183);
		frmStudentDataBase.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteStudent.main(null);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(StudentDB.class.getResource("/InstitueDataBaseManagement/delete (Custom).png")));
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(27, 60, 97));
		btnNewButton_2.setToolTipText("Click To Udpate Data");
		btnNewButton_2.setBounds(414, 440, 200, 183);
		frmStudentDataBase.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateStudent.main(null);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(StudentDB.class.getResource("/InstitueDataBaseManagement/download (Custom) (1).png")));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(27, 60, 97));
		btnNewButton_1.setToolTipText("Click To Show Data");
		btnNewButton_1.setBounds(911, 166, 200, 183);
		frmStudentDataBase.getContentPane().add(btnNewButton_1);
		btnNewButton_1.setIcon(new ImageIcon(StudentDB.class.getResource("/InstitueDataBaseManagement/download (Custom).png")));
		
		JLabel lblNewLabel_1 = new JLabel("Add Data");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel_1.setBounds(414, 372, 200, 36);
		frmStudentDataBase.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Display Data");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(911, 372, 200, 36);
		frmStudentDataBase.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Update Data");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(414, 650, 200, 36);
		frmStudentDataBase.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Delete Data");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel_1_2_1.setBounds(911, 650, 200, 36);
		frmStudentDataBase.getContentPane().add(lblNewLabel_1_2_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(327, 708, 868, 14);
		frmStudentDataBase.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(StudentDB.class.getResource("/InstitueDataBaseManagement/Gear.png")));
		lblNewLabel_2.setBounds(656, 308, 200, 200);
		frmStudentDataBase.getContentPane().add(lblNewLabel_2);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowStudent.main(null);
			}
		});
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension dim = tool.getScreenSize();
		width = dim.width;
		height = dim.height;
		
		frmStudentDataBase.setSize(width, height);
		frmStudentDataBase.setLocationRelativeTo(null);
		frmStudentDataBase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
