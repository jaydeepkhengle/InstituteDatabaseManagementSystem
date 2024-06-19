package package1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import package2.JDBC_Student_Data;

public class DeleteStudent {

	private JFrame frmAmInstitutesOf;
	int width;
	int height;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtPhoneNumber;
	private JTextField txtEmailId;
	SimpleDateFormat sdf;
	String subject1;
	String subject2;
	private int Id;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtStudentID;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField txtGender;
	private JTextField txtDOB;
	private JCheckBox chckbxJava, chckbxPython;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStudent window = new DeleteStudent();
					window.frmAmInstitutesOf.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DeleteStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAmInstitutesOf = new JFrame();
		frmAmInstitutesOf.setTitle("AM Institute's Of Technology/ Student Deletion");
		frmAmInstitutesOf.getContentPane().setFont(new Font("Arial", Font.PLAIN, 10));
		frmAmInstitutesOf.getContentPane().setBackground(new Color(27, 60, 97));
		frmAmInstitutesOf.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Student");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		lblNewLabel.setBounds(292, 23, 452, 78);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(84, 218, 868, 14);
		frmAmInstitutesOf.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(84, 265, 122, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(526, 265, 122, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Phone No");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(84, 327, 122, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Address");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1_1_1.setBounds(84, 389, 122, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Gender");
		lblNewLabel_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_1.setBounds(84, 511, 122, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(238, 269, 156, 27);
		frmAmInstitutesOf.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setColumns(10);
		txtLastName.setBounds(691, 269, 156, 27);
		frmAmInstitutesOf.getContentPane().add(txtLastName);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBounds(238, 331, 156, 27);
		frmAmInstitutesOf.getContentPane().add(txtPhoneNumber);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Email Id");
		lblNewLabel_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1_1_2.setBounds(526, 327, 122, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_1_1_2);
		
		txtEmailId = new JTextField();
		txtEmailId.setColumns(10);
		txtEmailId.setBounds(691, 331, 156, 27);
		frmAmInstitutesOf.getContentPane().add(txtEmailId);
		
		JTextArea txtAddress = new JTextArea();
		txtAddress.setBounds(238, 394, 609, 83);
		frmAmInstitutesOf.getContentPane().add(txtAddress);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Education");
		lblNewLabel_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_1_1.setBounds(84, 573, 122, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_1_1_1_1_1);
		
		JComboBox comboBoxEducation = new JComboBox();
		comboBoxEducation.setFont(new Font("Arial", Font.PLAIN, 13));
		comboBoxEducation.setModel(new DefaultComboBoxModel(new String[] {"No Option Selected", "SSC", "HSC", "Diploma", "B.E/B Tech", "M.E/M Tech", "BCA", "MCA"}));
		comboBoxEducation.setBounds(238, 573, 156, 28);
		frmAmInstitutesOf.getContentPane().add(comboBoxEducation);
		
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("DOB");
		lblNewLabel_1_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_1_2.setBounds(526, 511, 122, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Subject");
		lblNewLabel_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(526, 570, 122, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_1_1_1_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(27, 60, 97));
		panel_1.setBounds(691, 573, 156, 39);
		frmAmInstitutesOf.getContentPane().add(panel_1);
		
		chckbxJava = new JCheckBox("Java");
		chckbxJava.setForeground(new Color(255, 255, 255));
		chckbxJava.setBackground(new Color(27, 60, 97));
		chckbxJava.setFont(new Font("Arial Black", Font.BOLD, 13));
		chckbxJava.setBounds(6, 6, 62, 21);
		panel_1.add(chckbxJava);
		
		chckbxPython = new JCheckBox("Python");
		chckbxPython.setForeground(new Color(255, 255, 255));
		chckbxPython.setBackground(new Color(27, 60, 97));
		chckbxPython.setFont(new Font("Arial Black", Font.BOLD, 13));
		chckbxPython.setBounds(70, 6, 84, 21);
		panel_1.add(chckbxPython);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(84, 632, 868, 14);
		frmAmInstitutesOf.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAmInstitutesOf.setVisible(false);
	
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnNewButton.setBounds(835, 656, 96, 28);
		frmAmInstitutesOf.getContentPane().add(btnNewButton);
		
		JButton btnSubmit = new JButton("Delete Records");
		btnSubmit.setForeground(new Color(255, 255, 255));
		btnSubmit.setBackground(new Color(255, 0, 0));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDBC_Student_Data database = new JDBC_Student_Data();


				Id = Integer.parseInt(txtStudentID.getText());

				if(JOptionPane.showConfirmDialog(null, "Do You Want To Submit", "Save & Submit", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {

					int status = database.deleteData(Id);
					if(status==1) {
						JOptionPane.showMessageDialog(null, "Deleted Successfully", "Saved", JOptionPane.INFORMATION_MESSAGE);
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						JDBC_Student_Data db = new JDBC_Student_Data();
						int rowCount = db.countRows()-1;
						
						int limit = rowCount-Id;
						while(limit>=0) {
							System.out.println("Enter Loop");
							database.updateRowNumber(Id);
							Id++;
							limit--;
						}
						txtFirstName.setText(null);
						txtLastName.setText(null);
						txtEmailId.setText(null);
						txtPhoneNumber.setText(null);
						comboBoxEducation.setSelectedIndex(0);
						txtAddress.setText(null);
						chckbxJava.setSelected(false);
						chckbxPython.setSelected(false);
						txtGender.setText(null);
						txtDOB.setText(null);
						txtStudentID.setText(null);
					}
					else {
						JOptionPane.showMessageDialog(null, "Please Try Again", "Failed", JOptionPane.ERROR_MESSAGE);
					}

				}

			}
		});
		btnSubmit.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnSubmit.setBounds(637, 656, 156, 28);
		frmAmInstitutesOf.getContentPane().add(btnSubmit);

		txtStudentID = new JTextField();
		txtStudentID.setColumns(10);
		txtStudentID.setBounds(296, 154, 161, 28);
		frmAmInstitutesOf.getContentPane().add(txtStudentID);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxJava.setSelected(false);
				chckbxPython.setSelected(false);
				JDBC_Student_Data database = new JDBC_Student_Data();
				ResultSet display; 
				display = database.displayRow(Integer.parseInt(txtStudentID.getText()));
				try {
					display.next();
					subject1 = display.getString("Subject_1");
					subject2 = display.getString("Subject_2");
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				if(subject1.equalsIgnoreCase("Java")) {
					chckbxJava.setSelected(true);
				}
				if(subject2.equalsIgnoreCase("Python")) {
					chckbxPython.setSelected(true);
				}
				
				try {
					txtGender.setText(display.getString("Gender"));
					txtDOB.setText(display.getString("DateOfBirth"));
					txtFirstName.setText(display.getString(2));
					txtLastName.setText(display.getString(3));
					txtPhoneNumber.setText(display.getString(4));
					txtEmailId.setText(display.getString(5));
					txtAddress.setText(display.getString(6));

					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnSearch.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnSearch.setBounds(506, 154, 96, 26);
		frmAmInstitutesOf.getContentPane().add(btnSearch);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(84, 111, 868, 14);
		frmAmInstitutesOf.getContentPane().add(separator_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Enter Student Id");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(84, 154, 202, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_2);
		
		txtGender = new JTextField();
		txtGender.setColumns(10);
		txtGender.setBounds(238, 511, 156, 27);
		frmAmInstitutesOf.getContentPane().add(txtGender);
		
		txtDOB = new JTextField();
		txtDOB.setColumns(10);
		txtDOB.setBounds(691, 512, 156, 27);
		frmAmInstitutesOf.getContentPane().add(txtDOB);
		frmAmInstitutesOf.setIconImage(Toolkit.getDefaultToolkit().getImage(DeleteStudent.class.getResource("/InstitueDataBaseManagement/Logo.jpg")));
		
		frmAmInstitutesOf.setBounds(250,50,1050,800);
		frmAmInstitutesOf.setLocationRelativeTo(null);
		frmAmInstitutesOf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
