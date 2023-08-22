package enumerados;

public enum Productos {
	CC("Cuenta Corriente", true),
	CA("Caja de Ahorro", true),
	TC("Tarjeta de Credito", true),
	PF("Plazo Fijo", false),
	FCI("Fondo Comun de Inversion", false);
	
	private String descripcion;
	private boolean disponible;
	
	private Productos(String descripcion, boolean disponible) {
		this.descripcion = descripcion;
		this.disponible = disponible;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public boolean isDisponible() {
		return disponible;
	}

}
