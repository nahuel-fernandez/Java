package conexionesDB;

import java.sql.Connection;
import java.sql.DriverManager;


public class AdministradorDeConexiones {
	
	public static Connection obtenerConexion() throws Exception {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/paises_ciudades";
		String usuario = "root";
		String clave = "";
		
		// CREAMOS LA CONEXION
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, usuario, clave);
		return conn;
	}
}
