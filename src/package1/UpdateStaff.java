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

import package2.JDBC_Staff_Data;
import package2.JDBC_Student_Data;

public class UpdateStaff {

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
	SimpleDateFormat sdf;
	private String dateOfBirth;
	private String education;
	private String department;
	JComboBox comboBoxSpecialization;
	private JRadioButton rdbtnMale, rdbtnFemale;
	
	private int Id;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtStudentID;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStaff window = new UpdateStaff();
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
	public UpdateStaff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAmInstitutesOf = new JFrame();
		frmAmInstitutesOf.setTitle("AM Institute of Technology/ Staff Updation");
		frmAmInstitutesOf.getContentPane().setFont(new Font("Arial", Font.PLAIN, 10));
		frmAmInstitutesOf.getContentPane().setBackground(new Color(27, 60, 97));
		frmAmInstitutesOf.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Update Staff");
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
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Degree");
		lblNewLabel_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_1_1.setBounds(84, 573, 144, 28);
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
		comboBoxDegree.setModel(new DefaultComboBoxModel(new String[] {"No Option Selected", "B.E/B Tech", "M.E/M Tech", "BCA", "MCA", "Ph.D"}));
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
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Specialization");
		lblNewLabel_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(526, 570, 156, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_1_1_1_1_1_1);
		
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
				JDBC_Staff_Data database = new JDBC_Staff_Data();
				
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
				department = (String)comboBoxSpecialization.getSelectedItem();
				
				
				if(JOptionPane.showConfirmDialog(null, "Do You Want To Submit", "Save & Submit", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
					
					int status = database.updateData(firstName, lastName, phoneNumber, emailId, address, gender, dateOfBirth, education, department, Id);
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
						rdbtnMale.setSelected(false);
						rdbtnFemale.setSelected(false);
						buttonGroup.clearSelection();
						comboBoxSpecialization.setSelectedItem(0);
						comboBoxSpecialization.setSelectedIndex(0);
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
				department=null;
				rdbtnMale.setSelected(false);
				rdbtnFemale.setSelected(false);
				dateChooser.setCalendar(null);
				
				
			}
		});
		btnSubmit.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnSubmit.setBounds(686, 656, 122, 28);
		frmAmInstitutesOf.getContentPane().add(btnSubmit);
		
		txtStudentID = new JTextField();
		txtStudentID.setColumns(10);
		txtStudentID.setBounds(296, 154, 138, 28);
		frmAmInstitutesOf.getContentPane().add(txtStudentID);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDBC_Staff_Data database = new JDBC_Staff_Data();
				ResultSet display; 
				display = database.displayRow(Integer.parseInt(txtStudentID.getText()));
				try {
					display.next();
					gender = display.getString("gender");
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				System.out.println(gender);
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
					comboBoxDegree.setSelectedItem(display.getString("Qualification"));
					comboBoxSpecialization.setSelectedItem(display.getString("department"));
					dateChooser.setDate(display.getDate("DateOfBirth"));

					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnSearch.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnSearch.setBounds(482, 154, 96, 28);
		frmAmInstitutesOf.getContentPane().add(btnSearch);
		
		comboBoxSpecialization = new JComboBox();
		comboBoxSpecialization.setModel(new DefaultComboBoxModel(new String[] {"No Option Selected", "Mechanical Engineering", "Civil Engineering", "Electrical Engineering", "Comp/IT Engineering"}));
		comboBoxSpecialization.setFont(new Font("Arial", Font.PLAIN, 13));
		comboBoxSpecialization.setBounds(691, 573, 156, 28);
		frmAmInstitutesOf.getContentPane().add(comboBoxSpecialization);
		
		JLabel lblNewLabel_1_2 = new JLabel("Enter Staff Id");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(84, 154, 144, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_2);
		frmAmInstitutesOf.setIconImage(Toolkit.getDefaultToolkit().getImage(UpdateStaff.class.getResource("/InstitueDataBaseManagement/Logo.jpg")));
		
		frmAmInstitutesOf.setBounds(250,50,1050,800);
		frmAmInstitutesOf.setLocationRelativeTo(null);
		frmAmInstitutesOf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
