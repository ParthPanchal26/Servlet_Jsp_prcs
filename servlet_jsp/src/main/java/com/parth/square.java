package com.parth;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class square extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter out = res.getWriter();
		
//		int sum = Integer.parseInt(req.getParameter("sum"));
		
//		HttpSession ss = req.getSession();
//		int sum = (int) ss.getAttribute("sum");
		
		int sum = 0;
		Cookie sums[] = req.getCookies();
		
		for(Cookie c : sums) {
			if(c.getName().equals("sum")) {
				sum = Integer.parseInt(c.getValue());
			}
		}
		
		int square = sum * sum;
		
		out.println("Addition is : " + sum);
		out.println("Square of sum is: " + square);
	}
	
}
