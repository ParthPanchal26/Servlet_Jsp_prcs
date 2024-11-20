package com.context;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Context extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter out = res.getWriter();
			
//		using ServletContext here!
		ServletContext ctx = getServletContext();		
		String f_name = ctx.getInitParameter("f_name");
		out.println("First name: " + f_name);
		
//		using ServletConfig here!
		ServletConfig cg = getServletConfig();
		String l_name = cg.getInitParameter("l_name");
		out.println("Last name: " + l_name);
		
	}
	
}
