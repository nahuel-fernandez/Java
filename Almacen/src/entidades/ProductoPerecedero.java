package entidades;



public class ProductoPerecedero extends Producto{
	Float precio;
	Integer diasPorVencer;
	Integer cantidadDiasOferta = 10;
	private static Float OFERTA = 30f;
	
	public ProductoPerecedero() {
		super();
		
	}
	
	public ProductoPerecedero(String descripcion, Float precioInventario, Integer cantidadDeInventario, Integer diasPorVencer) {
		super( descripcion,  precioInventario, cantidadDeInventario);
		this.precio = precioInventario;
		id_perecedero++;
		this.diasPorVencer = diasPorVencer;
	}
	
	@Override
	public String toString() {
		return "ProductoPerecedero [diasPorVencer=" + diasPorVencer + ", cantidadDiasOferta=" + cantidadDiasOferta
				+ ", descripcion=" + descripcion + ", precioInventario=" + this.getPrecioInventario() + ", precio=" + precio
				+ "]";
	}

	public Float getPrecioInventario() {
		if(this.getDiasPorVencer() <= 10) {
			return (this.getPrecio() - (this.getPrecio() * OFERTA / 100));
		}
		return this.getPrecio();
	}
	
	

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Integer getDiasPorVencer() {
		return diasPorVencer;
	}

	public void setDiasPorVencer(Integer diasPorVencer) {
		this.diasPorVencer = diasPorVencer;
	}

	public Integer getCantidadDiasOferta() {
		return cantidadDiasOferta;
	}

	public void setCantidadDiasOferta(Integer cantidadDiasOferta) {
		this.cantidadDiasOferta = cantidadDiasOferta;
	}

	public static Float getOFERTA() {
		return OFERTA;
	}

	
}
