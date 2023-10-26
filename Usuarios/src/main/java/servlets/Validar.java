package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Usuario;

/**
 * Servlet implementation class Validar
 */
public class Validar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final List<Usuario> usuarios = Arrays.asList(new Usuario("user1@educacionit.com", "user1.1234"), new Usuario("user2@educacionit.com", "user2.1235"), new Usuario("user3@educacionit.com", "user3.1236"));
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Establece el tipo de contenido
		response.setContentType("text/html;charset=UTF-8");

		// Obtiene el stream de salida
		PrintWriter out = response.getWriter();
		
		

		// Envia informacion
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"en\">");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
		out.println("<title>Document</title>");
		out.println("</head>");
		out.println("<body>");
		if( usuarioValido(request)) {
			out.println("<h1>CREDENCIALES CORRECTAS</h1>");
		} else out.println("<h1>CREDENCIALES INCORRECTAS</h1>");
		out.println("<br>");
		out.println("<a href=\"index.jsp\">Volver</a>");
		out.println("</body>");
		out.println("</html>");
		
		
		
		
	}
	
	
	private boolean usuarioValido(HttpServletRequest request) {
		for(Usuario usuario : usuarios) {
			if((request.getParameter("usuario").equalsIgnoreCase(usuario.getUsuario()))&&(request.getParameter("clave").equals(usuario.getClave()))) {
				return true;
			}
		}
		return false;
	}
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
