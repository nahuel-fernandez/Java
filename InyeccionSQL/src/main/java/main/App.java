package main;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import conexionesDB.Conexion;


public class App 
{
    public static void main( String[] args )
    {
    	/*Se realiza la carga de usuarios. La misma se modulariza para poder modificar la forma de realizarla sin modificar el código principal.*/
        agregarUsuarios();
        
        /*Se realiza la consulta de los usuarios activos para cada modulo. La consulta esta modularizada para poder modificar
        la forma de hacerlo sin modificar el codigo principal.*/
        
        try {
        	ResultSet rs = consultarUsuariosActivos();
        	System.out.println("Lista de usuarios activos para el modulo requerido: ");
        	while(rs.next()) {
        		System.out.println("\t -" + rs.getString("usuario"));
        	}
        }
        catch(Exception e) {
        	System.out.println(e.getMessage());
        	e.printStackTrace();
        }
    }
    
    
    private static void agregarUsuarios() {
    	
    	//En este caso los datos de los usuarios se realiza por hard coding.
    	try {
	    	Connection conn = Conexion.obtenerConexion();
	    	Statement st = conn.createStatement();
	    	st.executeUpdate("insert into permisos (usuario, modulo, activo) values ('usuario1', 'modulo1', false)");
	    	st.executeUpdate("insert into permisos (usuario, modulo, activo) values ('usuario2', 'modulo1', false)");
	    	st.executeUpdate("insert into permisos (usuario, modulo, activo) values ('usuario3', 'modulo4', true)");
	    	st.executeUpdate("insert into permisos (usuario, modulo, activo) values ('usuario4', 'modulo3', true)");
	    	st.executeUpdate("insert into permisos (usuario, modulo, activo) values ('usuario5', 'modulo1', true)");
	    	st.executeUpdate("insert into permisos (usuario, modulo, activo) values ('usuario6', 'modulo3', false)");
	    	st.executeUpdate("insert into permisos (usuario, modulo, activo) values ('usuario7', 'modulo1', true)");
    	}
    	catch (Exception e) {
    		System.out.println("No se pudo obtener conexion a la Base de Datos.");
    		System.out.println( e.getMessage() );
    		e.printStackTrace();
    	}	
    }
    
    private static ResultSet consultarUsuariosActivos() throws Exception{
    	/*En este caso, se consultan los usuarios activos para un módulo especifico y
    	 por hard coding se carga su nombre con codigo malicioso para mostrar 
    	 como funciona la inyeccion SQL.
    	*/
    	Connection conn = Conexion.obtenerConexion();
    	Statement st = conn.createStatement();
    	String modulo;
    	modulo = "'modulo1' --";
    	String sql = "select usuario from permisos where modulo = " + modulo + " and activo = true";
    	return st.executeQuery(sql);
	}
}
