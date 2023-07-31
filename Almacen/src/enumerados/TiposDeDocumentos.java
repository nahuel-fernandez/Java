package enumerados;

public enum TiposDeDocumentos {
	DNI("Documento Nacional de Identidad"),
	PA("Pasaporte"),
	CI("Cédula de Identidad"),
	LC("Libreta Cívica");
	
	private String descripcion;

	private TiposDeDocumentos(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	
}
