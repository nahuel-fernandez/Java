package entidades;

public class PlazoFijo extends Producto {
	private static Integer numero = 0;
	
	public PlazoFijo(Integer banco, Integer sucursal) {
		super(banco, sucursal);
		numero++;
	}
}
