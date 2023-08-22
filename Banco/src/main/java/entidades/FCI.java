package entidades;

public class FCI extends Producto {
	private static Integer numero = 0;
	
	public FCI(Integer banco, Integer sucursal) {
		super(banco, sucursal);
		numero++;
	}
}
