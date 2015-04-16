package com.zubiri.formulario;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet(
		description = "conexion de usuarios", 
		urlPatterns = { "/ComprobacionUsuario" }, 
		initParams = { 
				@WebInitParam(name = "superusuario", value = "iosu", description = "nombre del usuario"), 
				@WebInitParam(name = "supercontrasena", value = "1234", description = "contrasena del usuario")
		})
public final class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("bienvenido viajero");
		String usuario=request.getParameter("usuario");
		System.out.println("usuario: "+usuario);
		String contrasena=request.getParameter("contrasena");
		System.out.println("contrasena: "+contrasena);
		
		if (usuario.equals("iosu")&&contrasena.equals("1234")){
			response(response, "bienvenido super usuario "+usuario);
		}else{		
			response(response, "hola "+usuario);
		}
	}
	
	private void response(HttpServletResponse response, String msg)
			throws IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<p>"+msg+"</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
