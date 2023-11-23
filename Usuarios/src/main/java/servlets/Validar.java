package servlets;

import java.io.IOException;   

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Usuario;
import dtos.UsuarioDTO;

/**
 * Servlet implementation class Principal
 */
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
		// seteamos el atributo mensaje

		// reenviamos la peticion con los objetos request y response

		if (usuario != null && usuario.getClave().equals(clave)) {
			redireccion = "valido.jsp";
			request.setAttribute("usuario", usuario);
		} else {
			request.setAttribute("credencialesCorrectas", false);
		}

		RequestDispatcher rd = request.getRequestDispatcher(redireccion);
		rd.forward(request, response);

	}
}
