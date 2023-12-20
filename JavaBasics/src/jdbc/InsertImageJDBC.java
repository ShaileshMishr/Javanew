package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertImageJDBC {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			// creating a connection
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","india123");
		
			// create a query
			String q = "insert into images(pic) values(?)";
			
			// get the PreparedStatement object
			PreparedStatement pstmt = con.prepareStatement(q);
			
			FileInputStream fis = new FileInputStream("C:\\Users\\shaileshm\\eclipse-workspace\\FirstProject\\src\\jdbc\\Shailesh.jpg");
			pstmt.setBinaryStream(1, fis,fis.available());
			pstmt.executeUpdate();
			
			System.out.println("Done.....");
			
			con.close();
			
			
		} catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
