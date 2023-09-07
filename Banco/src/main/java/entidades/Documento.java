package entidades;

import java.util.Objects;

import enumerados.TipoDeDocumento;

public class Documento {
	TipoDeDocumento tipo;
	Integer numero;
	
	public Documento(TipoDeDocumento tipo, Integer numero) {
		super();
		this.tipo = tipo;
		this.numero = numero;
	}
	
	
    @Override
	public String toString() {
		return "Documento [tipo=" + tipo + "-" + tipo.getDescripcion() + ", numero=" + numero + "]";
	}


	public TipoDeDocumento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeDocumento tipo) {
		this.tipo = tipo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Documento other = (Documento) obj;
		return Objects.equals(numero, other.numero) && tipo == other.tipo;
	}
	
	
}
