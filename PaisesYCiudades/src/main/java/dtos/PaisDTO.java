package dtos;

import daos.PaisDAO;
import entidades.Pais;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import conexionesDB.AdministradorDeConexiones;

public class PaisDTO implements PaisDAO{
	private static Connection conn;
	
	public PaisDTO(){
		try {
			conn = AdministradorDeConexiones.obtenerConexion();
		}catch(Exception e) {
			System.out.println("No se pudo establecer conexion con la base de datos.\n" + e.getMessage());
			e.printStackTrace();
		}
	};
	
	@Override
	public boolean insertar(Pais pais){
		try {
			String sql = "insert into paises (descripcion) values(?)";
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
	public boolean existe(Pais pais) {
		String sql = "select * from paises";
		boolean ok = false;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			rs.first();
			while(rs.next()){
				ok = rs.getString("descripcion").equalsIgnoreCase(pais.getDescripcion());
				if(ok) break;
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public Pais buscar(Pais pais) {
		try {
			String sql = "select * from paises where descripcion like %" + pais.getDescripcion() + "%";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);
			rs.first();
			if(rs.next()) {
				pais.setId(rs.getInt("idpais"));
				pais.setDescripcion(rs.getString("descripcion"));
			}else {
				System.out.println("No existe ningun pais con la descripcion \"" + pais.getDescripcion() + "\" en la base de datos.");
			}
			return pais;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean eliminar(Pais pais) {
		try {
			Pais p = buscar(pais);
			if(!(p == null)) {	
				String sql = "delete * from paises where idpais id = ?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, p.getId());
				ps.execute();
				System.out.println("El pais \"" + pais.getDescripcion() + "\" ha sido eliminado de la base de datos.");
				return true;
			}else {
				System.out.println("No existe ningun pais con la descripcion \"" + pais.getDescripcion() + "\" en la base de datos.");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean modificar(Pais p) {
		// TODO Auto-generated method stub
		return false;
	}

}
