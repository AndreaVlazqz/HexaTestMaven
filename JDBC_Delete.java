package MavenGrp.MavenDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Delete {

	public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/77407_Employees","root","Password123");
		
		Statement st = con.createStatement();
		
		String query = "DELETE FROM EMPLOYEE WHERE EMPID = 103";
		
		st.execute(query);
		
		System.out.println("The record DELETE successfully");
		
		con.close();
	}

}
