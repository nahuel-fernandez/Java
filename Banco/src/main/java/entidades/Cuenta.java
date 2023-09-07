package entidades;


import java.util.Date;
import java.sql.Timestamp;

import dtos.LogDTO; 
import enumerados.Errores;
import enumerados.TipoCuenta;   
import excepciones.TipoCuentaException;
import utilidades.Generador;


public class Cuenta extends Producto implements Comparable<Cuenta>{

	private static Integer numeroCC = 0;
	private static Integer numeroCA = 0;
	private static Integer numeroPF = 0;
	private static Integer numeroFCI = 0;
	private Integer numero;
	
	public Cuenta(Integer banco, Integer sucursal, String tipo) {
		super (banco, sucursal);
		try {
			setTipo(tipo);
		} catch (TipoCuentaException e) {
			System.out.println(e.getMessage() + ": \"" + tipo + "\"" );
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		return  this.producto.getDescripcion() + " [numero = " + this.getNumero() + ", banco = " + this.banco + ", sucursal = " + this.sucursal + "]";
	}
	
	
	@Override
	public String getNumero() {
		//Segun el tipo de cuenta, retorna el numero correspondiente al tipo con su correspondiente formato
		return Generador.GenerarNumero(this.getNumeroEntero(), this.producto.getFormato());
	}
	
	@Override
	public Integer getNumeroEntero() {
		return this.numero;
	}
	
	public TipoCuenta getTipo() {
		return producto;
	}

	public void setTipo(String tipo) throws TipoCuentaException{
		TipoCuenta t = buscarTipo(tipo);
		boolean ok = true;
		Errores error = null; 
		if(t == null) {
			error = Errores.Error2;
			ok = false;
		}
		else {
			if(!t.isDisponible()) {
				error = Errores.Error1;
				ok = false;
			}
		}
		if(!ok) {
			Date fecha = new Date();
			Timestamp fechahora = new Timestamp(fecha.getTime());
			LogError log = new LogError(fechahora, this.getClass().getSimpleName(), tipo, error.getDescripcion());
			LogDTO ldto = new LogDTO();
			ldto.insertarLog(log);
			throw new TipoCuentaException (error);
		}
		switch(t) {
		case CC : {numeroCC++;
				   this.numero = numeroCC;
				   break;}	
		case CA : {numeroCA++;
				   this.numero = numeroCA;
				   break;}	
		case PF : {numeroPF++;
				   this.numero = numeroPF;
				   break;}	
		case FCI :{numeroFCI++;
				   this.numero = numeroFCI;
				   break;}	
		default:
			break;  
		}
		this.producto = t;
	}
	
	private TipoCuenta buscarTipo(String tipo) {
		TipoCuenta tipoEncontrado = null;
		TipoCuenta [] tipos = TipoCuenta.values();
		for(TipoCuenta t : tipos) {
			if(tipo.toUpperCase().equals(t.name().toUpperCase())) {
				tipoEncontrado = t;
				break;
			}
		}
		return tipoEncontrado;
	}
	
}
