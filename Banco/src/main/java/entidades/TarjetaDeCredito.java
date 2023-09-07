package entidades;




import enumerados.TipoCuenta; 
import utilidades.Generador;

public class TarjetaDeCredito extends Producto implements Comparable<TarjetaDeCredito>{
	private static Integer numero = 0;
	Integer clave;
	private Integer numeroTC;
	
	public TarjetaDeCredito (Integer banco, Integer sucursal, Integer clave) {
		super(banco, sucursal);
		numero++;
		this.numeroTC = numero;
		this.clave = clave;
		this.producto = TipoCuenta.TC;
	}
	
	@Override
	public String toString() {
		return  this.producto.getDescripcion() + " [numero = " + this.getNumero() + ", " + super.toString() + ", clave = " + this.getClave() + "]";
	}

	public Integer getClave() {
		return clave;
	}

	public void setClave(Integer clave) {
		this.clave = clave;
	}

	@Override
	public String getNumero() {
		return Generador.GenerarNumero(numero, this.producto.getFormato());
	}

	public Integer getNumeroEntero() {
		return this.numeroTC;
	}
}
