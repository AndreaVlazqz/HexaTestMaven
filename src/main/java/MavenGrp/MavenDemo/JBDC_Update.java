package MavenGrp.MavenDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class JBDC_Update {

	public static void main(String[] args) throws SQLException {
		
		int empID;
		String empCountry;
		
		empID = Integer.parseInt(JOptionPane.showInputDialog("Which record (ID) do you want to update?"));
		empCountry = JOptionPane.showInputDialog("Which is the country you want for this record?" );
		
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/77407_Employees","root","Password123");
		
		Statement st = con.createStatement();
		
		String query = "UPDATE EMPLOYEE SET EMPCOUNTRY ='" + empCountry + "'WHERE EMPID =" + empID;
		
		st.execute(query);
		
		System.out.println("The record UPDATE successfully");
		
		con.close();

	}

}
