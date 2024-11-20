package com.math;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/square")
public class Square extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		PrintWriter out = res.getWriter();

		int sum = 0;
		Cookie sums[] = req.getCookies();

		for (Cookie c : sums) {
			if (c.getName().equals("sum")) {
				sum = Integer.parseInt(c.getValue());
			}
		}

		if (sum == sum) {

			int square = sum * sum;

			out.println("Addition is : " + sum);
			out.println("Square of sum is: " + square);
		} else {
			out.println("No calculations!");
		}

	}

}
