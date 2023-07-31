package daos;

import entidades.Ciudad;
import entidades.Pais;

public interface CiudadDAO {
	public boolean insertar(Pais pais);
	public boolean existe(Integer id);
	public boolean existe(String descripcion);
	public Ciudad buscar(Integer id);
	public Ciudad buscar(String descripcion);
	public boolean eliminar(Integer id);
	public boolean modificar(Integer id, String descripcion);
}
