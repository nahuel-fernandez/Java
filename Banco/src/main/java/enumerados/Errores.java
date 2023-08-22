package enumerados;

public enum Errores {
	Error1(1, "Producto no disponible"),
	Error2(2, "Producto inexistente");
	
	private String descripcion;
	private Integer codigo;
	
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
