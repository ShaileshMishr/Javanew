// Prepared Statement : insert
package jdbc;

import java.io.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert1JDBC {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			// creating a connection
			String url = "jdbc:mysql://localhost:3306/youtube";
			String username="root";
			String password="india123";
			Connection con = DriverManager.getConnection(url,username,password);
			
			// create a query
			
			String q = "insert into table1(tName,tCity) values (?,?)";
			
			// get the PreparedStatement object
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			// Taking input from user to store in database
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Name :");
			String name = br.readLine();
			
			System.out.println("Enter city :");
			String city= br.readLine();
			
			// set the values to query
			
			// pstmt.setString(1,"Shailesh Mishra");
			// pstmt.setString(2,"Lucknow");
			
			// set values taking from user
			pstmt.setString(1,name);
			pstmt.setString(2,city);
			
			pstmt.executeUpdate();

			System.out.println("Inserted ....");
			
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
