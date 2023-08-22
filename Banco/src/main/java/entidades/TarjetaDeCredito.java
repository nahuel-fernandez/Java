package entidades;

public class TarjetaDeCredito extends Producto {
	private static Integer numero = 0;
	Integer clave;
	
	public TarjetaDeCredito (Integer banco, Integer sucursal, Integer clave) {
		super(banco, sucursal);
		numero++;
		this.clave = clave;
	}
}
