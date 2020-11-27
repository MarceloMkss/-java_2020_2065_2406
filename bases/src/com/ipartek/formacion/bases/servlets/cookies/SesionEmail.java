package com.ipartek.formacion.bases.servlets.cookies;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/sesion-email")
public class SesionEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(); // creo una variable de la clase HttpSession
		String email = (String) session.getAttribute("email");
		Date fecha = (Date) session.getAttribute("fecha");
		
		
		response.setContentType("text/plain");
		response.getWriter().println(email);
		response.getWriter().println(fecha);
		
		
		
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}



