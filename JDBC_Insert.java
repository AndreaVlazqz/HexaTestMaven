package MavenGrp.MavenDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Insert {

	public static void main(String[] args) throws SQLException {
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/77407_Employees","root","Password123");
		
		Statement st = con.createStatement();
		
		String query = "INSERT INTO EMPLOYEE VALUES (103,'ANDREA','MEXICO')";
		
		st.execute(query);
		
		System.out.println("The record inserted successfully");
		
		con.close();
	}

}
