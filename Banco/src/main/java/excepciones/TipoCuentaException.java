package excepciones;

import enumerados.Errores;

public class TipoCuentaException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String mensaje;
	
	public TipoCuentaException(Errores error) {
		mensaje = "Error " + error.getCodigo() + ":" + error.getDescripcion();
	}

	@Override
	public String getMessage() {
		return mensaje;
	}	
	
	
}