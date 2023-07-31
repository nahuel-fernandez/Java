package entidades;

import java.util.Objects;

public class Pais {
	private static Integer id = 0;
	String descripcion;
	
	public Pais() {
	}

	public Pais(String descripcion) {
		id++;
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
		Pais other = (Pais) obj;
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
