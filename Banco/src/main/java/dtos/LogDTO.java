package dtos;

import java.sql.Connection; 
import java.sql.PreparedStatement;


import conexiones.DBConnection;
import daos.LogDAO;
import entidades.LogError;

public class LogDTO implements LogDAO{

	@Override
	public boolean insertarLog(LogError log) {
		try {
			Connection conn = DBConnection.obtenerConexion();
			String sql = "insert into error_log (fecha_hora, clase_afectada, producto_afectado, descripcion) values(?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setTimestamp(1, log.getFechaHora());;
			ps.setString(2, log.getClaseAfectada());
			ps.setString(3, log.getProductoAfectado());
			ps.setString(4, log.getDescripcion());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return false;
	}

	
}
