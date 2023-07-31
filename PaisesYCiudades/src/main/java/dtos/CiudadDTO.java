package dtos;

import java.sql.Connection;
import java.sql.PreparedStatement;

import conexionesDB.AdministradorDeConexiones;
import daos.CiudadDAO;
import entidades.Ciudad;
import entidades.Pais;

public class CiudadDTO implements CiudadDAO{
	private static Connection conn;
	@Override
	public boolean insertar(Pais pais) {
		try {
			conn = AdministradorDeConexiones.obtenerConexion();
			String sql = "insert into ciudades (descripcion) values(?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, pais.getDescripcion());
			ps.executeUpdate();
			return true;
		}catch(Exception e) {
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
	public Ciudad buscar(String descripcion) {
		// TODO Auto-generated method stub
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

}
