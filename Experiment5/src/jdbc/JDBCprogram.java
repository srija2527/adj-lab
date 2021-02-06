package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCprogram {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDB","root","");
			
			String query="update student set section=? where regdno=?";
			
			PreparedStatement upsmt=con.prepareStatement(query);
			
			upsmt.setString(1, "B");
			upsmt.setString(2, "1216");
			
			
			int rows=upsmt.executeUpdate();
			System.out.println(rows+" row(s) are updated.");
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from student");
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
