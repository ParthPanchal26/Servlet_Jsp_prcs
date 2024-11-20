package com.auth;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class verify extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		PrintWriter out = res.getWriter();

		String email = "";

		Cookie users[] = req.getCookies();

		for (Cookie c : users) {

			if (c.getName().equals("email")) {
				email = c.getValue();
			}
		}

		out.println("200! User LoggedIn!");
		out.println("User email: " + email);

	}

}
