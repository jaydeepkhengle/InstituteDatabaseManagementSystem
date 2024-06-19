package package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;


import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import package2.*;

public class UpdateStudent {

	private JFrame frmAmInstitutesOf;
	int width;
	int height;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtPhoneNumber;
	private JTextField txtEmailId;
	private String firstName;
	private String lastName;
	private long phoneNumber;
	private String emailId;
	private String address;
	private String gender;
	private SimpleDateFormat sdf;
	private String dateOfBirth;
	private String education;
	private String subject1;
	private String subject2;
	private int Id;
	private JCheckBox chckbxJava , chckbxPython;
	private JRadioButton rdbtnMale, rdbtnFemale;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtStudentID;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	
	
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStudent window = new UpdateStudent();
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
	public UpdateStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAmInstitutesOf = new JFrame();
		frmAmInstitutesOf.setTitle("AM Institute of Technology/ Student Updation");
		frmAmInstitutesOf.getContentPane().setFont(new Font("Arial", Font.PLAIN, 10));
		frmAmInstitutesOf.getContentPane().setBackground(new Color(27, 60, 97));
		frmAmInstitutesOf.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Update Student");
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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(27, 60, 97));
		panel.setBounds(238, 511, 172, 39);
		frmAmInstitutesOf.getContentPane().add(panel);
		panel.setLayout(null);
		
		rdbtnMale = new JRadioButton("Male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setForeground(new Color(255, 255, 255));
		rdbtnMale.setBackground(new Color(27, 60, 97));
		rdbtnMale.setFont(new Font("Arial Black", Font.PLAIN, 15));
		rdbtnMale.setBounds(6, 8, 65, 21);
		panel.add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setForeground(new Color(255, 255, 255));
		rdbtnFemale.setBackground(new Color(27, 60, 97));
		rdbtnFemale.setFont(new Font("Arial Black", Font.PLAIN, 15));
		rdbtnFemale.setBounds(82, 8, 87, 21);
		panel.add(rdbtnFemale);
		
		JComboBox comboBoxDegree = new JComboBox();
		comboBoxDegree.setFont(new Font("Arial", Font.PLAIN, 13));
		comboBoxDegree.setModel(new DefaultComboBoxModel(new String[] {"No Option Selected", "SSC", "HSC", "Diploma", "B.E/B Tech", "M.E/M Tech", "BCA", "MCA"}));
		comboBoxDegree.setBounds(238, 573, 156, 28);
		frmAmInstitutesOf.getContentPane().add(comboBoxDegree);
		
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("DOB");
		lblNewLabel_1_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_1_2.setBounds(526, 511, 122, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_1_1_1_1_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(691, 511, 156, 28);
		frmAmInstitutesOf.getContentPane().add(dateChooser);
		
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
		
		JButton btnSubmit = new JButton("Update");
		btnSubmit.setForeground(new Color(255, 255, 255));
		btnSubmit.setBackground(new Color(17, 193, 17));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDBC_Student_Data database = new JDBC_Student_Data();
				subject1=subject2="";
				firstName = txtFirstName.getText();
				lastName = txtLastName.getText();
				phoneNumber = Long.parseLong(txtPhoneNumber.getText());
				emailId = txtEmailId.getText();
				address = txtAddress.getText();
				Id = Integer.parseInt(txtStudentID.getText());
				
				boolean maleSelected = rdbtnMale.isSelected();
				if(maleSelected) {
					gender = rdbtnMale.getLabel();
				}
				else {
					gender = rdbtnFemale.getLabel();
				}
				sdf = new SimpleDateFormat("yyyy-MM-dd");
				dateOfBirth = sdf.format(dateChooser.getDate());
				education = (String)comboBoxDegree.getSelectedItem();
				if(chckbxJava.isSelected()) {
					subject1 = chckbxJava.getLabel();
				}
				if(chckbxPython.isSelected()) {
					subject2 = chckbxPython.getLabel();
				}
				System.out.println(subject1);
				System.out.println(subject2);
				if(JOptionPane.showConfirmDialog(null, "Do You Want To Submit", "Save & Submit", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
					
					int status = database.updateData(firstName, lastName, phoneNumber, emailId, address, gender, dateOfBirth, education, subject1, subject2, Id);
					if(status==1) {
						JOptionPane.showMessageDialog(null, "Saved Successfully", "Saved", JOptionPane.INFORMATION_MESSAGE);
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						txtFirstName.setText(null);
						txtLastName.setText(null);
						txtEmailId.setText(null);
						txtPhoneNumber.setText(null);
						comboBoxDegree.setSelectedIndex(0);
						txtAddress.setText(null);
						chckbxJava.setSelected(false);
						chckbxPython.setSelected(false);
					}
					else {
						JOptionPane.showMessageDialog(null, "Please Try Again", "Failed", JOptionPane.ERROR_MESSAGE);
					}
					
				}
				
				firstName=null;
				lastName=null;
				phoneNumber=0;
				emailId=null;
				address=null;
				gender=null;
				dateOfBirth=null;
				education=null;
				subject1=null;
				subject2=null;
				
				dateChooser.setCalendar(null);
				
				
			}
		});
		btnSubmit.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnSubmit.setBounds(686, 656, 122, 28);
		frmAmInstitutesOf.getContentPane().add(btnSubmit);
		
		txtStudentID = new JTextField();
		txtStudentID.setColumns(10);
		txtStudentID.setBounds(296, 154, 150, 28);
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
					gender = display.getString("gender");
					subject1 = display.getString("Subject_1");
					subject2 = display.getString("Subject_2");
					System.out.println(subject1);
					System.out.println(subject2);
					
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
				
				if(gender.equalsIgnoreCase("Male")) {
					rdbtnMale.doClick();
				}
				else if(gender.equalsIgnoreCase("Female")){
					rdbtnFemale.doClick();
				}
				
				try {
					txtFirstName.setText(display.getString(2));
					txtLastName.setText(display.getString(3));
					txtPhoneNumber.setText(display.getString(4));
					txtEmailId.setText(display.getString(5));
					txtAddress.setText(display.getString(6));
					comboBoxDegree.setSelectedItem(display.getString("Education"));
					dateChooser.setDate(display.getDate("DateOfBirth"));
					
				
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnSearch.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnSearch.setBounds(497, 154, 96, 28);
		frmAmInstitutesOf.getContentPane().add(btnSearch);
		
		JLabel lblNewLabel_1_2 = new JLabel("Enter Student Id");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(84, 154, 180, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_2);
		frmAmInstitutesOf.setIconImage(Toolkit.getDefaultToolkit().getImage(UpdateStudent.class.getResource("/InstitueDataBaseManagement/Logo.jpg")));
		
		frmAmInstitutesOf.setBounds(250,50,1050,800);
		frmAmInstitutesOf.setLocationRelativeTo(null);
		frmAmInstitutesOf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
