<%@page import="entidades.Usuario" session="true"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html
    PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="es">

<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Bienvenido</title>
</head>
<%
Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
%>
<body>

	<section>
		<%if(usuario != null) {%>
		<h1 style="color: yellowgreen;">Bienvenido <%=usuario.getCorreo()%></h1>
		<%}else{
			response.sendRedirect("index.jsp");
		}
			%>
	</section>
	<section>	
		<form action="Logout" method="post">
			<button type="submit" class="submit">Cerrar sesión</button>
		</form>
	</section>
	<div>
		<footer>
			<p>Implementado por N.F.</p>
		</footer>
	</div>
</body>

</html>