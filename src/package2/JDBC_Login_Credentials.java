package package2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC_Login_Credentials {
	
	Connection con;
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet result;
	
	public JDBC_Login_Credentials() {
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
	//Login 
	public ResultSet login(String username, String password) {
		
		ResultSet result=null;
		PreparedStatement pstmt=null;
		
		try {
			pstmt = con.prepareStatement("select password from Login_Credentials where Username = ? and password = ? ");
			pstmt.setString(1, username);
			pstmt.setString(2, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			result = pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return result;
	}
	
	
	//Insert
	public int insertData(String firdstName, String lastName, String username, String password) {
		
		int status=0;
		try {
			pstmt = con.prepareStatement("insert into Login_Credentials values(?,?,?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pstmt.setString(1, null);
			pstmt.setString(2, firdstName);
			pstmt.setString(3, lastName);
			pstmt.setString(4, username);
			pstmt.setString(5, password);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			status=pstmt.executeUpdate();
			System.out.println("Added Successfully");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	//Delete
	public int deleteData(String field, String input) {
		stmt = null;
		int status=0;
		try {
			stmt = con.createStatement();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			status = stmt.executeUpdate("delete from Student_Data where " + field + " = " + "'" + input + "'");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	//Update
	public int updateData(String field, String input, String rowParamter) {
		stmt = null;
		int status=0;
		
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			status = stmt.executeUpdate("update Student_Data set " + field + " = " + "'" + input + "' " + "where rollnumber = " + rowParamter);
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	//SignUp UserName preExistance Check
	public ResultSet signUp(String username) {
		PreparedStatement pstmt = null;
		ResultSet result = null;
		
		try {
			pstmt = con.prepareStatement("select username from login_credentials where username = ? ");
			pstmt.setString(1, username);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			result = pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}
	

}
