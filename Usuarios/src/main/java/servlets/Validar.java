package servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entidades.Usuario;
import dtos.UsuarioDTO;

/**
 * Servlet implementation class Validar
 */
@WebServlet(name = "Validar", urlPatterns = {"/Validar"})
public class Validar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioDTO udto = new UsuarioDTO();
	private Map<String, Usuario> usuariosLogueados = new HashMap<String, Usuario>();

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
		
		String redireccion = "index.jsp";
		String correo = request.getParameter("correo");
		String clave = request.getParameter("clave");
		Usuario usuario = udto.buscarPorID(correo);
		
		//Verificamos si hay sesion abierta
		HttpSession session = request.getSession();
		session.setAttribute("usuariosLogueados", usuariosLogueados);
		
		if(usuario!= null && usuariosLogueados.containsKey(usuario.getCorreo())) {
			session.setAttribute("error", "Ya tiene una sesion abierta en otro navegador.");
		}	
		else {
			//Si no hay sesion abierta, validamos las credenciales
			if (usuario != null && usuario.getClave().equals(clave)) {
				usuariosLogueados.put(usuario.getCorreo(), usuario);
				redireccion = "bienvenido.jsp";
				session.setAttribute("usuario", usuario);
			} else {
				session.setAttribute("error", "Credenciales Incorrectas");
			}
			
		}
		session.setAttribute("usuariosLogueados", usuariosLogueados);
		//Reenviamos la peticion con response
		response.sendRedirect(redireccion);
	}
}
