package conexiones;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;

public class DBConnection {

	//Retorna una coexion a una base de datos
	public static Connection obtenerConexion() throws Exception {
		
		Properties dbprop = new Properties();
		String dbpropdir = "archivos";
		String dbpropfile = "db.properties";
		dbprop.load(new FileInputStream(new File(dbpropdir + File.separator + dbpropfile)));
			
		// Se crea la conexion con los datos provistos por el archivo de propiedades
		Class.forName(dbprop.getProperty("driver"));
		Connection conn = DriverManager.getConnection(dbprop.getProperty("url"), dbprop.getProperty("usuario"), dbprop.getProperty("clave"));
		
		return conn;
	}
}
