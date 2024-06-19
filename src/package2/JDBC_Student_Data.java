package package2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC_Student_Data {
	
	Connection con;
	
	
	
	//Constructor
	public JDBC_Student_Data() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Got Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fullstack", "root", "ashu1234@2015");
			System.out.println("Got Connection");
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Display
	public ResultSet displayData() {
		ResultSet result;
		Statement stmt = null;
		
		try {
			stmt = con.createStatement();
			System.out.println("Got Statement");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result = null;
		try {
			result = stmt.executeQuery("select * from Student_Data");
			System.out.println("Displayed Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	//Display Row
	public ResultSet displayRow(int ID) {
		ResultSet result;
		Statement stmt = null;
		
		try {
			stmt = con.createStatement();
			System.out.println("Got Statement");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result = null;
		try {
			result = stmt.executeQuery("select * from Student_Data where Id = " + ID);
			System.out.println("Displayed Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	// Count Row
	public int countRows() {
		int count=1;
		Statement stmt = null;
		stmt = null;
		ResultSet result;
		
		try {
			stmt=con.createStatement();
			System.out.println("Got Statement");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result=null;
		try {
			result = stmt.executeQuery("select count(*) from Student_Data");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(result.next()) {
				count = result.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ++count;
	}
	//Insert
	public int insertData(int rowNumber, String firdstName, String lastName, long phoneNumber, String emailId, String address, String gender, String dateOfBirth, String education, String subject1, String subject2) {
		
		PreparedStatement pstmt = null;
		
		int status=0;
		try {
			pstmt = con.prepareStatement("insert into Student_Data values(?,?,?,?,?,?,?,?,?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pstmt.setInt(1, rowNumber);
			pstmt.setString(2, firdstName);
			pstmt.setString(3, lastName);
			pstmt.setLong(4, phoneNumber);
			pstmt.setString(5, emailId);
			pstmt.setString(6, address);
			pstmt.setString(7, gender);
			pstmt.setString(8, dateOfBirth);
			pstmt.setString(9, education);
			pstmt.setString(10, subject1);
			pstmt.setString(11, subject2);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			status=pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	//Delete
	public int deleteData(int Id) {
		
		int status = 0;
		PreparedStatement pstmt = null;
		
		try {
			pstmt = con.prepareStatement("delete from Student_Data where Id = ? ");
			pstmt.setInt(1, Id);
			
			status = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	//Update
	public int updateData(String firstName, String lastName, long phoneNumber, String emailId, String address, String gender, String dateOfBirth, String education, String subject1, String subject2, int Id) {
		
		int status=0;
		PreparedStatement pstmt = null;
		
		try {
			pstmt = con.prepareStatement("update Student_Data set Id = ? , FirstName = ? , LastName = ? , PhoneNumber = ? , EmailId = ? , Address = ? , Gender = ? , DateOfBirth = ? , Education = ? , Subject_1 = ? , Subject_2 = ? where ID = " + Id);
			pstmt.setInt(1, Id);
			pstmt.setString(2, firstName);
			pstmt.setString(3, lastName);
			pstmt.setLong(4, phoneNumber);
			pstmt.setString(5, emailId);//primary key
			pstmt.setString(6, address);
			pstmt.setString(7, gender);
			pstmt.setString(8, dateOfBirth);
			pstmt.setString(9, education);
			pstmt.setString(10, subject1);
			pstmt.setString(11, subject2);
			status = pstmt.executeUpdate();
			
			pstmt.close();
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	
	//Update Row Number
	public int updateRowNumber(int Id) {
		
		int status=0;
		PreparedStatement pstmt = null;
		
		
		try {
			pstmt = con.prepareStatement("update Student_Data set Id = ? where ID = ?");
			pstmt.setInt(1, Id);
			pstmt.setInt(2, Id+1);
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			status = pstmt.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		
		try {
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status==1) {
			System.out.println("Row Number Updated Successfully");
		}
		else {
			System.out.println("Row Number Updation Failure");
		}
		
		return status;
	}	

}
