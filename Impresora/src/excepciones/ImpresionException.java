package excepciones;


public class ImpresionException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private String mensaje;
	
	public ImpresionException(String mensaje) {
		this.mensaje = mensaje;
	}
	
	@Override 
	public String getMessage(){
		return mensaje;
	}
}
