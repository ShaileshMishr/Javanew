package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStmt {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root", "india123");
		
		PreparedStatement st = con.prepareStatement("insert into student values(?,?,?)");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student ID : ");
		int sid = sc.nextInt();
		
		System.out.println("Enter student name : ");
		String sname = sc.next();
		
		System.out.println("Enter student marks : ");
		int marks = sc.nextInt();
		
		st.setInt(1, sid);
		st.setString(2, sname);
		st.setInt(3, marks);
		
		st.execute();
		
		System.out.println("Record Added successfully.....");
		
		 con.close();
		 System.out.println("Connection closed");
	}

}
