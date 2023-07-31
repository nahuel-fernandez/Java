package entidades;

import java.util.Objects;

public class Cliente {
	String nombre;
	String apellido;
	Documento documento;
	Long id;
	Long id_clase = 1l;
	
	public Cliente() {
		super();
		
	}

	public Cliente(String nombre, String apellido, Documento documento) {
		super();
		id_clase++;
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
	}
	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(documento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(documento, other.documento);
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", id=" + id + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}


