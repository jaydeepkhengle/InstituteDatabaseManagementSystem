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

public class DeleteStaff {

	private JFrame frmAmInstitutesOf;
	int width;
	int height;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtPhoneNumber;
	private JTextField txtEmailId;
	private SimpleDateFormat sdf;
	private String department, gender;
	private int Id;
	private JComboBox comboBoxDepartment;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtStudentID;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField txtGender;
	private JTextField txtDOB;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStaff window = new DeleteStaff();
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
	public DeleteStaff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAmInstitutesOf = new JFrame();
		frmAmInstitutesOf.setTitle("AM Institute of Technology/ Staff Deletion");
		frmAmInstitutesOf.getContentPane().setFont(new Font("Arial", Font.PLAIN, 10));
		frmAmInstitutesOf.getContentPane().setBackground(new Color(27, 60, 97));
		frmAmInstitutesOf.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Staff");
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
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Qualification");
		lblNewLabel_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_1_1.setBounds(84, 573, 144, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_1_1_1_1_1);
		
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
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Department");
		lblNewLabel_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(526, 570, 122, 28);
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
		
		JButton btnSubmit = new JButton("Delete Records");
		btnSubmit.setForeground(new Color(255, 255, 255));
		btnSubmit.setBackground(new Color(255, 0, 0));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDBC_Staff_Data database = new JDBC_Staff_Data();


				Id = Integer.parseInt(txtStudentID.getText());

				if(JOptionPane.showConfirmDialog(null, "Do You Want To Delete", "Delete Confirmation", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {

					int status = database.deleteData(Id);
					if(status==1) {
						JOptionPane.showMessageDialog(null, "Deleted Successfully", "Delete", JOptionPane.INFORMATION_MESSAGE);
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						JDBC_Staff_Data db = new JDBC_Staff_Data();
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
						comboBoxDegree.setSelectedIndex(0);
						txtAddress.setText(null);
						comboBoxDepartment.setSelectedIndex(0);
						txtDOB.setText(null);
					    txtGender.setText(null);
					    txtGender.setText(null);
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
		txtStudentID.setBounds(257, 154, 172, 28);
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
				
				try {
					comboBoxDegree.setSelectedItem(display.getString("Qualification"));
					comboBoxDepartment.setSelectedItem(display.getString("Department"));
					txtDOB.setText(display.getString("DateOfBirth"));
					txtGender.setText(gender);
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
		btnSearch.setBounds(463, 154, 96, 28);
		frmAmInstitutesOf.getContentPane().add(btnSearch);
		
		comboBoxDepartment = new JComboBox();
		comboBoxDepartment.setModel(new DefaultComboBoxModel(new String[] {"No Option Selected", "Mechanical Engineering", "Civil Engineering", "Electrical Engineering", "Comp/IT Engineering"}));
		comboBoxDepartment.setFont(new Font("Arial", Font.PLAIN, 13));
		comboBoxDepartment.setBounds(691, 573, 156, 28);
		frmAmInstitutesOf.getContentPane().add(comboBoxDepartment);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(84, 110, 868, 14);
		frmAmInstitutesOf.getContentPane().add(separator_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Enter Staff Id");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(84, 154, 163, 28);
		frmAmInstitutesOf.getContentPane().add(lblNewLabel_1_2);
		
		txtGender = new JTextField();
		txtGender.setColumns(10);
		txtGender.setBounds(238, 512, 156, 27);
		frmAmInstitutesOf.getContentPane().add(txtGender);
		
		txtDOB = new JTextField();
		txtDOB.setColumns(10);
		txtDOB.setBounds(691, 512, 156, 27);
		frmAmInstitutesOf.getContentPane().add(txtDOB);
		frmAmInstitutesOf.setIconImage(Toolkit.getDefaultToolkit().getImage(DeleteStaff.class.getResource("/InstitueDataBaseManagement/Logo.jpg")));
		
		frmAmInstitutesOf.setBounds(250,50,1050,800);
		frmAmInstitutesOf.setLocationRelativeTo(null);
		frmAmInstitutesOf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
