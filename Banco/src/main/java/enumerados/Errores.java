package enumerados;

public enum Errores {
	Error1(1, "Producto no disponible"),
	Error2(2, "Producto inexistente");
	
	private Integer codigo;
	private String descripcion;
	
	
	private Errores(Integer codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

    public String getDescripcion() {
		return descripcion;
	}
}
