package servlets;

import java.io.IOException;   

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Usuario;
import dtos.UsuarioDTO;

/**
 * Servlet implementation class Validar
 */
@WebServlet(name = "Validar", urlPatterns = {"/Validar"})
public class Validar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioDTO udto = new UsuarioDTO();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Validar() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String correo = request.getParameter("correo");
		String clave = request.getParameter("clave");
		Usuario usuario = udto.buscarPorID(correo);
		String redireccion = "index.jsp";
		
		// reenviamos la peticion con response

		if (usuario != null && usuario.getClave().equals(clave)) {
			redireccion = "bienvenido.jsp";
			request.getSession().setAttribute("usuario", usuario);
		} else {
			request.getSession().setAttribute("credencialesCorrectas", false);
			
		}
		response.sendRedirect(redireccion);
	}
}
