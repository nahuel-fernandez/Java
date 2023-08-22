package entidades;

public class CajaDeAhorro extends Producto {
	private static Integer numero = 0;
	
	public CajaDeAhorro(Integer banco, Integer sucursal) {
		super(banco, sucursal);
		numero++;
	}
}
