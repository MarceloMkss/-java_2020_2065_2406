package com.ipartek.formacion.bases.servlets.cookies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IdiomaCookie
 */
@WebServlet("/idioma-Cookie")
public class IdiomaCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;      

	// en ese caso solo usare el metodo doPost
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idioma = request.getParameter("idioma");
		Cookie lenguaje_cookie = new Cookie("idioma", idioma);
		lenguaje_cookie.setMaxAge(60*60*24*7); //Integer.MAX_VALUE);
		response.addCookie(lenguaje_cookie);
		
		response.sendRedirect("cookie-idioma.jsp");
		
	}
	
	

}
