package entidades;

public abstract class Producto {
	Integer banco;
	Integer sucursal;
	
	Producto(Integer banco, Integer sucursal){
		this.banco = banco;
		this.sucursal = sucursal;
	}
}
