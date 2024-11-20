package com.parth;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class math extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String num_1 = req.getParameter("num_1");
		String num_2 = req.getParameter("num_2");
		
		int new_num_1 = Integer.parseInt(num_1);
		int new_num_2 = Integer.parseInt(num_2);
		
		int sum = new_num_1 + new_num_2;
		
//		PrintWriter out = res.getWriter();
		
//		out.println("Addition: " + num_1 + " + " + num_2 + " = " + sum);
		
//		req.setAttribute("sum", sum);
//		
//		RequestDispatcher rd = req.getRequestDispatcher("square");
//		rd.forward(req, res);
		
//		### URL ReWriting ###
//		res.sendRedirect("square?sum=" + sum);
		
//		HttpSession ss = req.getSession();
//		ss.setAttribute("sum", sum);
		
		Cookie cc = new Cookie("sum", sum + "");
		res.addCookie(cc);
		res.sendRedirect("square");
		
	}
	
}
