package entidades;



public class ProductoNoPerecedero extends Producto{
	
	

	public ProductoNoPerecedero() {
		super();
		id_no_perecedero++;
	}

	@Override
	public String toString() {
		return "ProductoNoPerecedero [descripcion=" + descripcion + ", precio=" + this.getPrecioInventario() + ", cantidadDeInventario="
				+ cantidadDeInventario + "]";
	}
	
	public Float getPrecioInventario() {
		return this.precioInventario;
	}

	

	
}
