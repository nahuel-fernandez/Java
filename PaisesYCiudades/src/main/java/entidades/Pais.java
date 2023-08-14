package entidades;

import java.util.Objects;


//Clase para representar a los paises y su informacion
public class Pais extends Locacion{
	private static Integer idpais = 0;
	public Pais() {
	}

	public Pais(String descripcion) {
		super(descripcion);
		idpais++;
	}
	
	public Pais(Integer id, String descripcion) {
		super(id, descripcion);
	}
}
