package entidades;

import java.util.Objects;

import enumerados.TiposDeDocumentos;

public class Documento {
	TiposDeDocumentos tipo;
	Integer numero;
	
	
	public Documento() {
		super();
	}

    public Documento(String tipo, Integer numero) {
		super();
		this.tipo = buscarTipo(tipo);
		if(this.tipo != null) {
			this.numero = numero;
		}
		else System.out.println("No existe ese tipo de documento.");
	}
    
    private TiposDeDocumentos buscarTipo(String tipo) {
    	for(TiposDeDocumentos tipodoc : TiposDeDocumentos.values()) {
    		if(tipo.equalsIgnoreCase(tipodoc.name())) {
    			return tipodoc;
    		}
    	}
    	return null;
    }

    public TiposDeDocumentos getTipo() {
		return tipo;
	}

    public void setTipo(TiposDeDocumentos tipo) {
		this.tipo = tipo;
	}

    public Integer getNumero() {
		return numero;
	}

    public void setNumero(Integer numero) {
		this.numero = numero;
	}

    @Override
	public String toString() {
		return "Documento [tipo=" + tipo + ", numero=" + numero + "]";
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
