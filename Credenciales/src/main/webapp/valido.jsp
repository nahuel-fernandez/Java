<%@page import="entidades.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html
    PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="es">

<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Validacion</title>
</head>
<%
Usuario usuario = (Usuario) request.getAttribute("usuario");
%>
<body>


	<section>
	<h1 style="color: yellowgreen;">Credenciales correctas</h1>
	</section>

	<section>
	<h1 style="color: yellowgreen;"><%=(usuario == null ? "" : usuario)%></h1>
	</section>
	<a href="index.jsp">Volver</a>


	<div>
		<footer>
		<p>Implementado por N.F.</p>
		</footer>
	</div>
</body>

</html>