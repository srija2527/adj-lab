package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCprogram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDB","root","");
			System.out.println("Creating a table");
			String query="CREATE TABLE student(regdno INT NOT NULL, name VARCHAR(45) NOT NULL, branch VARCHAR(30) NOT NULL, section VARCHAR(45) NOT NULL)";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
			
			System.out.println("Table student Created\n");
			String query1 = "INSERT INTO student " + "VALUES (1216, 'divya', 'IT', 'A')";
			stmt.executeUpdate(query1);
			query1 = "INSERT INTO student " + "VALUES (533, 'Anuhya', 'CSE', 'A')";
			stmt.executeUpdate(query1);
			query1 = "INSERT INTO student " + "VALUES (1219, 'prabha', 'IT', 'B')";
			stmt.executeUpdate(query1);
			query1 = "INSERT INTO student " + "VALUES (236, 'Bhanu', 'EEE', 'A')";
			stmt.executeUpdate(query1);
			
			System.out.println("Values inserted into table successfully");
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM student");
	         System.out.println("\nREGDNO\tNAME\tBRANCH\tSECTION");
	         
	         while (rs.next()) {
	            int regdno = rs.getInt("regdno");
	            String name = rs.getString("name");
	            String branch = rs.getString("branch");
	            String section = rs.getString("section");
	            System.out.println(regdno + "\t" + name + "\t" + branch + "\t" + section);
	         }
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}

