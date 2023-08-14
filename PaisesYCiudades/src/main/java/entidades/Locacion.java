package entidades;

import java.util.Objects;

public class Locacion {
	public Integer id;
	String descripcion;
	
	
	public Locacion() {
	}

	public Locacion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Locacion(Integer id, String descripcion) {
		this.id= id;
		this.descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Locacion other = (Locacion) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", descripcion=" + descripcion + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}