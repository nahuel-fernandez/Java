<!DOCTYPE html
    PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="es">

<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="style.css" />
    <link rel="stylesheet" href="table.css" />
    <link rel="stylesheet" href="button.css" />
    <link rel="stylesheet" href="form.css" />
    
    <title>Inicio</title>
</head>

<body>
    <div>
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
                    <input type="text" name="correo" placeholder="usuario@dominio.ext" required="true"/>
                    <br />
                    <input type="password" name="clave" placeholder="1234" required="true"/>
                    <br />
                    <button type="submit" class="submit">Enviar</button>
                    <button type="reset" class="reset">Limpiar</button>
                </form>
            </div>
        </section>
    </div>

    <div>
        <footer>
            <p>Implementado por N.F.</p>
        </footer>
    </div>
</body>

</html>
