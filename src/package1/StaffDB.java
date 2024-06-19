package package1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class StaffDB {

	private JFrame frmStudentDataBase;
	int width;
	int height;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffDB window = new StaffDB();
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
	public StaffDB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentDataBase = new JFrame();
		frmStudentDataBase.setIconImage(Toolkit.getDefaultToolkit().getImage(StaffDB.class.getResource("/InstitueDataBaseManagement/Logo.jpg")));
		frmStudentDataBase.setTitle("AM Institute of Technology/ Staff Database Management");
		frmStudentDataBase.getContentPane().setBackground(new Color(27, 60, 97));
		frmStudentDataBase.getContentPane().setForeground(new Color(0, 0, 0));
		frmStudentDataBase.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Staff Database Management");
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

		JButton btnAddData = new JButton("");
		btnAddData.setBackground(new Color(27, 60, 97));
		btnAddData.setToolTipText("Click To Add Data");
		btnAddData.setBounds(414, 166, 200, 183);
		frmStudentDataBase.getContentPane().add(btnAddData);
		btnAddData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStaff.main(null);
			}
		});
		btnAddData.setIcon(new ImageIcon(StaffDB.class.getResource("/InstitueDataBaseManagement/ADD (Custom).png")));

		JButton btnDeleteData = new JButton("");
		btnDeleteData.setBackground(new Color(27, 60, 97));
		btnDeleteData.setToolTipText("Click To Delete Data");
		btnDeleteData.setBounds(911, 440, 200, 183);
		frmStudentDataBase.getContentPane().add(btnDeleteData);
		btnDeleteData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteStaff.main(null);
			}
		});
		btnDeleteData.setIcon(new ImageIcon(StaffDB.class.getResource("/InstitueDataBaseManagement/delete (Custom).png")));

		JButton btnUpdateData = new JButton("");
		btnUpdateData.setBackground(new Color(27, 60, 97));
		btnUpdateData.setToolTipText("Click To Udpate Data");
		btnUpdateData.setBounds(414, 440, 200, 183);
		frmStudentDataBase.getContentPane().add(btnUpdateData);
		btnUpdateData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateStaff.main(null);
			}
		});
		btnUpdateData.setIcon(new ImageIcon(StaffDB.class.getResource("/InstitueDataBaseManagement/download (Custom) (1).png")));

		JButton btnDisplayData = new JButton("");
		btnDisplayData.setBackground(new Color(27, 60, 97));
		btnDisplayData.setToolTipText("Click To Show Data");
		btnDisplayData.setBounds(911, 166, 200, 183);
		frmStudentDataBase.getContentPane().add(btnDisplayData);
		btnDisplayData.setIcon(new ImageIcon(StaffDB.class.getResource("/InstitueDataBaseManagement/download (Custom).png")));
		

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
		lblNewLabel_2.setIcon(new ImageIcon(StaffDB.class.getResource("/InstitueDataBaseManagement/Gear.png")));
		lblNewLabel_2.setBounds(656, 308, 200, 200);
		frmStudentDataBase.getContentPane().add(lblNewLabel_2);
		btnDisplayData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowStaff.main(null);
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


