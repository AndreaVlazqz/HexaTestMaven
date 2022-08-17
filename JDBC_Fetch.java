package MavenGrp.MavenDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC_Fetch {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/77407_Employees","root","Password123");
		
		Statement st = con.createStatement();
		
		String query = "Select * from EMPLOYEE";
		
		ResultSet rs = st.executeQuery(query);
		
		while (rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
		con.close();
	}

}
