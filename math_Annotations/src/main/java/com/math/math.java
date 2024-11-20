package com.math;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/math")
public class math extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int num_1 = Integer.parseInt(req.getParameter("num_1"));
		int num_2 = Integer.parseInt(req.getParameter("num_2"));
		
		int sum = num_1 + num_2;
		
		Cookie cc = new Cookie("sum", sum + "");
		res.addCookie(cc);
		res.sendRedirect("square");
		
		
	}
	
}
