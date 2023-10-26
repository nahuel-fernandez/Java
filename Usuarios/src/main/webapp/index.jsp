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
        <header>
            <img src="images/editor.png" width="100" height="100" />
        </header>
    </div>

    <div>
        <nav>
            <a href="index.html">Inicio</a>
        </nav>
    </div>

    <div>
        <section>
            <h2>Validación de usuario y clave</h2>
            <div>
                <form action="Validar" method="get">
                    <input type="text" name="usuario" placeholder="Usuario" required="true"/>
                    <br />
                    <input type="password" name="clave" placeholder="Clave" required="true"/>
                    <br />
                    <button type="reset" class="reset">Limpiar</button>
                    <button type="submit" class="submit">Enviar</button>
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
