package com.example.ServletEx;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



// @WebServlet("/hello")  --> It will work for external tomcat here we are using embedded tomcat


public class HelloServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		System.out.println("In Service");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h2><b> Hello Kishan </b></h2>");
		
		
	}

}
