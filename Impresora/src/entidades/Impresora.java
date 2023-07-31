package entidades;

import java.util.Arrays;   

import excepciones.ImpresionException;
import excepciones.ImpresoraException;

public class Impresora implements AutoCloseable{
	private static final String[] IMPRESORAS_VALIDAS = new String[] {"Canon", "HP", "Epson", "Brother", "Samsung"};
	private String impresora;
	private String[] documento;
	
	public Impresora(String impresora) throws ImpresoraException{
		super();
		setImpresora(impresora);
	}
	
	public Impresora(String impresora, String[] documento) throws ImpresoraException{
		super();
		setImpresora(impresora);
		this.documento = documento;
	}
	
	public boolean existeImpresora(String impresora) {
		for(String imp : IMPRESORAS_VALIDAS) {
			if(impresora.equalsIgnoreCase(imp)) {
				return true;
			}
		}
		return false;
	}
	 
	public void imprimir() throws ImpresionException{
		imprimir(this.documento);
	}
	
	public void imprimir(String[] documento) throws ImpresionException{
		this.documento = documento;
		if(!(documento == null)) {
			for(String linea : documento) {
				System.out.print(linea);
			}
		}
		else throw new ImpresionException("El documento esta vacio.");
	}
	
	public static String informarImpresoras() {
		return Arrays.toString(IMPRESORAS_VALIDAS);
	}
	
	@Override
    public void close() throws Exception {
		System.out.println("Ha finalizado la conexion con la impresora " + this.impresora);
    }

	public String getImpresora() {
		return impresora;
	}
	
	public void setImpresora(String impresora) throws ImpresoraException{
		if(existeImpresora(impresora)) {
			this.impresora = impresora;
		} else throw new ImpresoraException("Impresora incorrecta. Las impresoras validas son: " + informarImpresoras());
	}

	public String[] getDocumento() {
		return documento;
	}

	public void setDocumento(String[] documento) {
		this.documento = documento;
	}
}
