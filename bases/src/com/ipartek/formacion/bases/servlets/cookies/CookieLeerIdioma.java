package com.ipartek.formacion.bases.servlets.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie-leer-idioma")
public class CookieLeerIdioma extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dato = leerCookie(request, "nombre"); // solicita la demo
		
		// request = solicitud
		// response = respuesta
		
		response.setContentType("text/plain");
		response.getWriter().println(dato); // nos imprime  la respuesta
	}

	private String leerCookie(HttpServletRequest request, String nombre) {
		Cookie[] cookies = request.getCookies();
		
		String dato = null;
		
		for(Cookie c: cookies) {
			if(nombre.equals(c.getName())) { //c.getName().equals("demo")
				dato = c.getValue();
				break;
			}
			
		}
		return dato;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
