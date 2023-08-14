package dtos;

import java.sql.Connection;    
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexionesDB.AdministradorDeConexiones;
import daos.LocacionDAO;
import entidades.Locacion;
import entidades.Ciudad;

//Clase que implementa la interface CiudadDAO
public class CiudadDTO implements LocacionDAO{
	private static Connection conn;
	
	@Override
	public boolean insertar(Integer idpais, Locacion ciudad) {
		try {
			conn = AdministradorDeConexiones.obtenerConexion();
			String sql = "insert into ciudades (idpais, descripcion) values(?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, idpais);
			ps.setString(2, ciudad.getDescripcion());
			ps.executeUpdate();
			System.out.println("La ciudad \"" + ciudad.getDescripcion() + "\" fue agregaada a la base de datos.");
			return true;
		}catch(Exception e) {
			System.out.println("No se pudo agregar la ciudad \"" + ciudad.getDescripcion() + "\" a la base de datos.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean existe(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existe(String descripcion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Ciudad buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Locacion> buscar(String descripcion, Integer idpais) {
		List<Locacion> ciudades = new ArrayList<Locacion>();
		try {
			conn = AdministradorDeConexiones.obtenerConexion();
			String sql = "select * from ciudades where descripcion like concat ('%', ?, '%') and idpais = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, descripcion);
			ps.setInt(2, idpais);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ciudades.add(new Ciudad(rs.getInt("idciudad"), rs.getString("descripcion")));
			}
			return ciudades;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean eliminar(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificar(Integer id, String descripcion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertar(Locacion locacion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Locacion buscar(Locacion locacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(Locacion locacion) {
		// TODO Auto-generated method stub
		return false;
	}

}
