package jdbc;

import java.sql.*;

public class demo {

	public static void main(String[] args) {
		
	        try {
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root", "india123");
		 
		 Statement st = con.createStatement();
		 ResultSet rs = st.executeQuery("select * from student");
	
		 // ResultSet rs = st.executeQuery("select sname from student where sid=1 ");
	//	 rs.next();
		// System.out.println(rs.next());
	//	  String name = rs.getString("sname");
	//	 System.out.println("Name of student is : " + name);
		 
		 while(rs.next()) {
			 System.out.print(rs.getInt(1) + " - ");
			 System.out.print(rs.getString(2) + " - ");
			 System.out.println(rs.getInt(3));
		 }
		 
		 
		 con.close();
		 System.out.println("Connection closed");
	        }
	        catch (Exception exception) {
	            System.out.println(exception);
	        }
		 
	}

}
