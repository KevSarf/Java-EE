package com.example.servletjspdemo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/about")
public class AboutServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html><html><head><meta charset=\"UTF-8\"></head><body>" +
				"<h1>Kevin Sarfo</h1>"+
				"<p>IT Student - 3rd year</p>"+
				"<p></p>"+
				"<h3>Languages</h3>"+
				"<ul>"+
				"<li>Php</li>"+
				"<li>Java</li>"+
				"<li>Python</li>"+
                "<li>C++</li>"+
				"</ul></body><html>");
	}
}
