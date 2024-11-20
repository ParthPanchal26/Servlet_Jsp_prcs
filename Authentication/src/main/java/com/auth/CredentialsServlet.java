package com.auth;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CredentialsServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		String vari_email = "parth@gmail.com";
		String vari_pass = "Parth@123";

		PrintWriter out = res.getWriter();

		if (email.equals(vari_email) && password.equals(vari_pass)) {


//			out.println(email);
//			out.println(password);

			Cookie cc = new Cookie("email", email);
			res.addCookie(cc);
			res.sendRedirect("verify");

		} else {
			
			out.println(email);
			out.println(password);
			out.println("404! User not found!");
			out.println("Please sign up, before trying to login!");

		}

	}

}
