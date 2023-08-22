package enumerados;

public enum TipoDeDocumento {
	DNI("Documento Nacional de Identidad"),
	PA("Pasaporte"),
	CI("Cedula de Identidad"),
	LC("Libreta Civica"),
	LE("Libreta de Enrolamiento");
	
	private String descripcion;
	
	private TipoDeDocumento(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}
}
