<!DOCTYPE html
    PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="es">

<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Inicio</title>
</head>

<body>


	<section>
	<h2>Formulario de Ingreso:</h2>

	<%
	Boolean credencialesCorrectas = (Boolean) request.getAttribute("credencialesCorrectas");

	if (credencialesCorrectas != null && !credencialesCorrectas) {
	%>
	<div>
		<h1 style="color: red;">Credenciales Incorrectas</h1>
	</div>

	<%
	}
	%>
	<div>
		<form action="Validar" method="post">
			<div>
				<input type="email" name="correo" placeholder="usuario@dominio.ext"
					required="true" />
			</div>
			<div>
				<input type="password" name="clave" placeholder="1234"
					required="true" />
			</div>

			<div>
				<button type="submit" class="submit">Enviar</button>
				<button type="reset" class="reset">Limpiar</button>
			</div>
		</form>
	</div>
	</section>


	<div>
		<footer>
		<p>Implementado por N. F.</p>
		</footer>
	</div>
</body>

</html>