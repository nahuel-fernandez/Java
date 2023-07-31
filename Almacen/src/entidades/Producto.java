package entidades;

public abstract class Producto {
	String descripcion;
	Float precioInventario;
	Integer cantidadDeInventario;
	Long id = 1l;
	Long id_perecedero = 1l;
	Long id_no_perecedero = 1l;
	
	public Producto() {
		super();
	}
	
	public Producto(String descripcion, Float precioInventario, Integer cantidadDeInventario) {
		super();
		this.descripcion = descripcion;
		this.precioInventario = precioInventario;
		this.cantidadDeInventario = cantidadDeInventario;
		this.id++;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public abstract Float getPrecioInventario();

	public Integer getCantidadDeInventario() {
		return cantidadDeInventario;
	}
	
	public void setCantidadDeInventario(Integer cantidadDeInventario) {
		this.cantidadDeInventario = cantidadDeInventario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
