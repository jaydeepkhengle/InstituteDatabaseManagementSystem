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
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class AddStaff {

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
	JComboBox comboBoxDepartment;
	
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStaff window = new AddStaff();
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
	public AddStaff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAmInstitutesOf = new JFrame();
		frmAmInstitutesOf.setTitle("AM Institute of Tehcnology/ Staff Entry");
		frmAmInstitutesOf.getContentPane().setFont(new Font("Arial", Font.PLAIN, 10));
		frmAmInstitutesOf.getContentPane().setBackground(new Color(27, 60, 97));
		frmAmInstitutesOf.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Staff Entry Form");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		lblNewLabel.setBounds(268, 25, 560, 78);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(84, 110, 868, 14);
		frmAmInstitutesOf.getContentPane().add(separator);

		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(84, 163, 122, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(526, 163, 122, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Phone No");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(84, 229, 122, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("Address");
		lblNewLabel_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1_1_1.setBounds(84, 325, 122, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Gender");
		lblNewLabel_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_1.setBounds(84, 466, 122, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_1_1_1_1);

		txtFirstName = new JTextField();
		txtFirstName.setBounds(238, 167, 156, 27);
		frmAmInstitutesOf.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);

		txtLastName = new JTextField();
		txtLastName.setColumns(10);
		txtLastName.setBounds(691, 167, 156, 27);
		frmAmInstitutesOf.getContentPane().add(txtLastName);

		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBounds(238, 233, 156, 27);
		frmAmInstitutesOf.getContentPane().add(txtPhoneNumber);

		JLabel lblNewLabel_1_1_1_2 = new JLabel("Email Id");
		lblNewLabel_1_1_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1_1_2.setBounds(526, 229, 122, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_1_1_2);

		txtEmailId = new JTextField();
		txtEmailId.setColumns(10);
		txtEmailId.setBounds(691, 233, 156, 27);
		frmAmInstitutesOf.getContentPane().add(txtEmailId);

		JTextArea txtAddress = new JTextArea();
		txtAddress.setBounds(238, 330, 609, 83);
		frmAmInstitutesOf.getContentPane().add(txtAddress);

		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Qualification");
		lblNewLabel_1_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_1_1.setBounds(84, 545, 144, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_1_1_1_1_1);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(27, 60, 97));
		panel.setBounds(238, 466, 172, 39);
		frmAmInstitutesOf.getContentPane().add(panel);
		panel.setLayout(null);

		JRadioButton rdbtnMale = new JRadioButton("Male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setForeground(new Color(255, 255, 255));
		rdbtnMale.setBackground(new Color(27, 60, 97));
		rdbtnMale.setFont(new Font("Arial Black", Font.PLAIN, 15));
		rdbtnMale.setBounds(6, 8, 65, 21);
		panel.add(rdbtnMale);

		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setForeground(new Color(255, 255, 255));
		rdbtnFemale.setBackground(new Color(27, 60, 97));
		rdbtnFemale.setFont(new Font("Arial Black", Font.PLAIN, 15));
		rdbtnFemale.setBounds(82, 8, 87, 21);
		panel.add(rdbtnFemale);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"No Option Selected", "B.E/B Tech", "M.E/M Tech", "BCA", "MCA", "Ph.D"}));
		comboBox.setBounds(238, 545, 156, 28);
		frmAmInstitutesOf.getContentPane().add(comboBox);

		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("DOB");
		lblNewLabel_1_1_1_1_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_1_2.setBounds(526, 466, 122, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_1_1_1_1_2);

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(691, 466, 156, 28);
		frmAmInstitutesOf.getContentPane().add(dateChooser);

		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Department");
		lblNewLabel_1_1_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(526, 545, 122, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_1_1_1_1_1_1);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBounds(73, 611, 868, 14);
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

		JButton btnSubmit = new JButton("Save & Submit");
		btnSubmit.setHorizontalAlignment(SwingConstants.LEFT);
		btnSubmit.setForeground(new Color(255, 255, 255));
		btnSubmit.setBackground(new Color(17, 193, 17));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDBC_Staff_Data add = new JDBC_Staff_Data();

				
				try {
					firstName = txtFirstName.getText();
					if(firstName.equals("")||firstName.equals(null)) {
						throw new EmptyFirstName();
					}
					lastName = txtLastName.getText();
					if(lastName.equals("")||lastName.equals(null)) {
						throw new EmptyLastName();
					}
					phoneNumber = Long.parseLong(txtPhoneNumber.getText());
					emailId = txtEmailId.getText();
					if(emailId.equals("")||emailId.equals(null)) {
						throw new EmptyEmailId();
					}
					address = txtAddress.getText();
					if(address.equals("")||address.equals(null)) {
						throw new EmptyAddress();
					}
					
					if(rdbtnMale.isSelected()) {
						gender = rdbtnMale.getLabel();
					}
					else if(rdbtnFemale.isSelected()) {
						gender = rdbtnFemale.getLabel();
					}
					if(rdbtnMale.isSelected() || rdbtnFemale.isSelected()) {
						
					}
					else {
						throw new EmptyGender();
					}
					education = (String)comboBox.getSelectedItem();
					if(comboBox.getSelectedItem()==null) {
						throw new EmptyEducation();
					}
					department = (String)comboBoxDepartment.getSelectedItem();
					
					
					sdf = new SimpleDateFormat("yyyy-MM-dd");
					dateOfBirth = sdf.format(dateChooser.getDate());
					if(dateOfBirth.equals("")||dateOfBirth.equals(null)) {
						throw new EmptyDateOfBirth();
					}
					
					JDBC_Student_Data display = new JDBC_Student_Data();
					ResultSet result = display.displayData();
					boolean flag = true;
					try {
						while(result.next()) {
							if(emailId.equals(result.getString(5))) {
								flag=false;
								break;
							}
							else {
								flag = true;
							}
						}
					} catch (SQLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
	
					
					
					if(JOptionPane.showConfirmDialog(null, "Do You Want To Submit", "Save & Submit", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
						int rowNumber = add.countRows();
						int status = add.insertData(rowNumber,firstName, lastName, phoneNumber, emailId, address, gender, dateOfBirth, education, department);
						if(flag) {
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
								comboBox.setSelectedIndex(0);
								txtAddress.setText(null);
						        comboBoxDepartment.setSelectedIndex(0);
								rdbtnMale.setSelected(false);
								rdbtnFemale.setSelected(false);
								buttonGroup.clearSelection();
							}
							else {
								JOptionPane.showMessageDialog(null, "Please Try Again", "Failed", JOptionPane.ERROR_MESSAGE);
							}
						}
						else {
							JOptionPane.showMessageDialog(null, "Email ID Already Exists", "Already Exists", JOptionPane.INFORMATION_MESSAGE);
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
					

					dateChooser.setCalendar(null);
					
				}catch (EmptyFirstName a) {
					// TODO: handle exception
					a.throwMessage();
				}catch (NumberFormatException nfe) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Please Check Field Phone Number", "Empty Fields", JOptionPane.INFORMATION_MESSAGE);
				}catch (EmptyLastName a) {
					// TODO: handle exception
					a.throwMessage();
				}catch (EmptyEmailId a) {
					// TODO: handle exception
					a.throwMessage();
				}catch (EmptyAddress e2) {
					// TODO: handle exception
					e2.throwMessage();
				}catch (EmptyGender e2) {
					// TODO: handle exception
					e2.throwMessage();
				}catch (EmptyDateOfBirth e2) {
					// TODO: handle exception
					e2.throwMessage();
				}catch (EmptyEducation e2) {
					// TODO: handle exception
					e2.throwMessage();
				}catch (NullPointerException e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "DOB Field Can't Be Empty", "Empty Fields", JOptionPane.INFORMATION_MESSAGE);
				}
			
			}
		});
		btnSubmit.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnSubmit.setBounds(666, 656, 144, 28);
		frmAmInstitutesOf.getContentPane().add(btnSubmit);
		
		comboBoxDepartment = new JComboBox();
		comboBoxDepartment.setModel(new DefaultComboBoxModel(new String[] {"No Option Selected", "Mechanical Engineering", "Civil Engineering", "Electrical Engineering", "Comp/IT Engineering"}));
		comboBoxDepartment.setFont(new Font("Arial", Font.PLAIN, 13));
		comboBoxDepartment.setBounds(691, 545, 156, 28);
		frmAmInstitutesOf.getContentPane().add(comboBoxDepartment);
		frmAmInstitutesOf.setIconImage(Toolkit.getDefaultToolkit().getImage(AddStaff.class.getResource("/InstitueDataBaseManagement/Logo.jpg")));

		frmAmInstitutesOf.setBounds(250,50,1050,800);
		frmAmInstitutesOf.setLocationRelativeTo(null);
		frmAmInstitutesOf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
