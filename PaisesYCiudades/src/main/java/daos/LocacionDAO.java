package daos;

import java.util.List; 

import entidades.Locacion;



public interface LocacionDAO {

	public boolean insertar(Integer id, Locacion locacion);
	public boolean insertar(Locacion locacion);
	public boolean existe(Integer id);
	public boolean existe(String descripcion);
	public Locacion buscar(Integer id);
	public Locacion buscar(Locacion locacion);
	public List<Locacion> buscar(String descripcion, Integer id);
	public boolean eliminar(Locacion locacion);
	public boolean eliminar(Integer id);
	public boolean modificar(Integer id, String descripcion);
}
