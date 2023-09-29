package dtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

	@Override
	public Integer idLog() {
		Integer id = -1;
		try {
			Connection conn = DBConnection.obtenerConexion();
			String sql = "select * from error_log";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				id = rs.getInt("id_log");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
	}

	
}
