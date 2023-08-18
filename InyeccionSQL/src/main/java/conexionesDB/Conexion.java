package conexionesDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
	//Retorna una coexion a una base de datos mysql
	public static Connection obtenerConexion() throws Exception {
		//Datos que se van a usar en la creacion de la conexion
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/usuarios";
		String usuario = "root";
		String clave = "";
		
		// Se crea la conexion
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, usuario, clave);
		return conn;
	}		
}
