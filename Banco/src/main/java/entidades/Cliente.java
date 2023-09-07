package entidades;

import java.util.List; 
import java.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

import ordenados.OrdenProducto;


public class Cliente {
	String nombre;
	Documento documento;
	String fechaDeNacimiento;
	List<Producto> productos;
	
	public Cliente(String nombre, Documento documento, String fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.documento = documento;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.productos = new ArrayList<Producto>();
	}
	
	public void cargarProducto(Producto producto) {
		if(!(producto.getProducto() == null)) {
			productos.add(producto);
			productos.sort(new OrdenProducto<Producto>());
		}
	}
	
	private String mostrarProductos() {
		if(!this.productos.isEmpty()) {
			Iterator<Producto> listaProd = this.productos.iterator();
			String pr = "Productos[";
			while(listaProd.hasNext())
				pr += listaProd.next().toString();
			return pr += "]";
		}
		return "";
	}
	
	@Override
	public String toString() {
		String mensaje;
		if(this.productos == null) 
			mensaje = "Productos null.";
		else mensaje = "Cliente [nombre=" + nombre + ", documento=" + documento + ", fechaDeNacimiento=" + fechaDeNacimiento
				+ ", " + mostrarProductos() + "]";
		return mensaje;
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
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
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


