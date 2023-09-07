package enumerados;

public enum TipoCuenta {
	CC("Cuenta Corriente", "###-#-#####/#", true),
	CA("Caja de Ahorro", "###-#-#####/#", true),
	TC("Tarjeta de Credito", "#### #### #### ####", true),
	PF("Plazo Fijo", "##################", false),
	FCI("Fondo Comun de Inversion", "##################", false);
	
	private String descripcion;
	private String formato;
	private boolean disponible;
	
	private TipoCuenta(String descripcion, String formato, boolean disponible) {
		this.descripcion = descripcion;
		this.formato = formato;
		this.disponible = disponible;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getFormato() {
		return formato;
	}

	public boolean isDisponible() {
		return disponible;
	}
}
