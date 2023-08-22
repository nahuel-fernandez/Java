package entidades;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class Cliente {
	String nombre;
	Documento documento;
	String FechaDeNacimiento;
	List<Producto> productos;
	
	public Cliente(String nombre, Documento documento, String fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.documento = documento;
		FechaDeNacimiento = fechaDeNacimiento;
		this.productos = new ArrayList<Producto>();
	}
	
	public String getNombre() {
		return nombre;
	}

    public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getFechaDeNacimiento() {
		return FechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		FechaDeNacimiento = fechaDeNacimiento;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
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
	 
	
}


