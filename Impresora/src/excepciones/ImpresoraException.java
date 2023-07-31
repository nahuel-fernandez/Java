package excepciones;



public class ImpresoraException extends Exception{
	private static final long serialVersionUID = 1L;
	private String mensaje;
	
	public ImpresoraException(String mensaje){
		this.mensaje = mensaje;
    }
	
	@Override 
	public String getMessage(){
		return mensaje;
	}
	
}
