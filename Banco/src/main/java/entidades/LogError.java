package entidades;

import java.sql.Timestamp;

public class LogError {

	private Timestamp fechaHora;
	private String claseAfectada;
	private String productoAfectado;
	private String descripcion;
	
	public LogError(Timestamp fechaHora, String claseAfectada, String productoAfectado, String descripcion) {
		super();
		this.fechaHora = fechaHora;
		this.claseAfectada = claseAfectada;
		this.productoAfectado = productoAfectado;
		this.descripcion = descripcion;
	}

	public Timestamp getFechaHora() {
		return fechaHora;
	}

	public String getClaseAfectada() {
		return claseAfectada;
	}

	public String getProductoAfectado() {
		return productoAfectado;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	
	
}
