package com.parth;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class form_servlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		PrintWriter out = res.getWriter();
		
		out.println("UserName: " + uname);
		out.println("Email: " + email);
		out.println("Password: " + password);
		
	}
	
}
