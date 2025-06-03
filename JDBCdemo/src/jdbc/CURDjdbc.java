package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CURDjdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root", "india123");
		
		Statement st = con.createStatement();
		
		// Insert value in Database
		 boolean status = st.execute("insert into student values (6, 'Dudu', 23)");
		 System.out.println(status);
		 
		 
		 // Update value in DB
		boolean up =  st.execute("update student set sname = 'Gaurav' where sid=4 " );
		 System.out.println(up);
		 
		 // Delete value in DB
		 boolean dl =  st.execute("delete from student where sid=4 " );
		 System.out.println(dl);
		 
		 con.close();
		 System.out.println("Connection closed");
		 
		 
		 
	}

}
