package interfaces;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public interface DBConnection {

	default Connection getConexion() {
		Connection conn = null;

		// instanciamos el objeto
		Properties propiedades = new Properties();
		try {
		
			// cargamos el archivo utilizando la ruta relativa donde esta el proyecto
			propiedades.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("database.properties"));

			// leemos las propiedades
			String DRIVER = propiedades.getProperty("db.driver");
			System.out.println(DRIVER);
			String URL = propiedades.getProperty("db.url");
			System.out.println(URL);
			String USER = propiedades.getProperty("db.user", "root");
			System.out.println(USER);
			String PASS = propiedades.getProperty("db.pass");
			System.out.println(PASS);

			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASS);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
