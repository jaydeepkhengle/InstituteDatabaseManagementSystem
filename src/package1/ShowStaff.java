package package1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import package2.JDBC_Staff_Data;
import package2.JDBC_Student_Data;
import javax.swing.JSeparator;

public class ShowStaff {

	private JFrame frmAmInstitutesOf;
	int width;
	int height;
	private DefaultTableModel model;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowStaff window = new ShowStaff();
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
	public ShowStaff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAmInstitutesOf =  new JFrame();
		frmAmInstitutesOf.setTitle("AM Institute of Technology/ Staff Database");
		frmAmInstitutesOf.setIconImage(Toolkit.getDefaultToolkit().getImage(ShowStaff.class.getResource("/InstitueDataBaseManagement/Logo.jpg")));
		frmAmInstitutesOf.getContentPane().setBackground(new Color(27, 60, 97));
		frmAmInstitutesOf.getContentPane().setLayout(null);
		
		JLabel lblStudentDatabase = new JLabel("Staff Database");
		lblStudentDatabase.setForeground(new Color(255, 255, 0));
		lblStudentDatabase.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		lblStudentDatabase.setBounds(481, 33, 560, 78);
		frmAmInstitutesOf.getContentPane().add(lblStudentDatabase);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(93, 163, 1335, 517);
		frmAmInstitutesOf.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "First Name", "Last Name", "Phone Number", "Email Id", "Adress", "Gender", "Date of Birth", "Qualification", "Department"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(15);
		table.getColumnModel().getColumn(1).setPreferredWidth(45);
		table.getColumnModel().getColumn(2).setPreferredWidth(45);
		table.getColumnModel().getColumn(3).setPreferredWidth(50);
		table.getColumnModel().getColumn(5).setPreferredWidth(130);
		table.getColumnModel().getColumn(6).setPreferredWidth(30);
		table.getColumnModel().getColumn(7).setPreferredWidth(45);
		table.getColumnModel().getColumn(8).setPreferredWidth(35);
		table.getColumnModel().getColumn(9).setPreferredWidth(35);
		scrollPane.setViewportView(table);
		
		JButton btnShow = new JButton("Refresh");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDBC_Staff_Data showTable = new JDBC_Staff_Data();
				ResultSet result = showTable.displayData();
				
				DefaultTableModel model = new DefaultTableModel();
				String[]columnNames = {"ID", "First Name", "Last Name", "Phone Number", "Email Id", "Adress", "Gender", "Date of Birth", "Qualification", "Department"};
				model.setColumnIdentifiers(columnNames);
				
				try {
					while(result.next()) {
						model.addRow(new Object[] {
							result.getString(1),
							result.getString(2),
							result.getString(3),
							result.getLong(4),
							result.getString(5),
							result.getString(6),
							result.getString(7),
							result.getString(8),
							result.getString(9),
							result.getString(10),
							
						});
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				table.setModel(model);
				table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				try {
					result.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnShow.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnShow.setBounds(662, 718, 96, 28);
		frmAmInstitutesOf.getContentPane().add(btnShow);
		
		JButton btnShow_1 = new JButton("Back");
		btnShow_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAmInstitutesOf.setVisible(false);
			}
		});
		btnShow_1.setFont(new Font("Arial Black", Font.BOLD, 13));
		btnShow_1.setBounds(801, 718, 96, 28);
		frmAmInstitutesOf.getContentPane().add(btnShow_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(93, 109, 1335, 14);
		frmAmInstitutesOf.getContentPane().add(separator);
				
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension dim = tool.getScreenSize();
		width = dim.width;
		height = dim.height;
		frmAmInstitutesOf.setSize(width, height);
		frmAmInstitutesOf.setLocationRelativeTo(null);
		frmAmInstitutesOf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

}
