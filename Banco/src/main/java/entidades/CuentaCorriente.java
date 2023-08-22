package entidades;

public class CuentaCorriente extends Producto {
	private static Integer numero = 0;
	
	public CuentaCorriente(Integer banco, Integer sucursal) {
		super(banco, sucursal);
		numero++;
	}
}
