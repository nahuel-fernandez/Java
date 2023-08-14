package entidades;

import java.util.Objects;

//Clase para representar a las ciudades y su informacion
public class Ciudad extends Locacion{
	private static Integer idciudad = 0;
	public Ciudad() {
	}

	public Ciudad(String descripcion) {
		super(descripcion);
		idciudad++;
	}
	
	public Ciudad(Integer id, String descripcion){
		super(id, descripcion);
	}
}
