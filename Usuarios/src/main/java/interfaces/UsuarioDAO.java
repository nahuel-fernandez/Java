package interfaces;

import java.util.List;

public interface UsuarioDAO<E, K> {

	E buscarPorID(K key);

	boolean insertar(E elemento);

	boolean eliminar(E elemento);

	boolean actualizar(E elemento);

	List<E> listar();

}
