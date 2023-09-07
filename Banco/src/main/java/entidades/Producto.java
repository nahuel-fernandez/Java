package entidades;

import enumerados.TipoCuenta;


public abstract class Producto {
	Integer banco;
	Integer sucursal;
	TipoCuenta producto;
	
	Producto(Integer banco, Integer sucursal){
		this.banco = banco;
		this.sucursal = sucursal;
	}

	@Override
	public String toString() {
		return "banco=" + banco + ", sucursal=" + sucursal;
	}

	public abstract String getNumero();

	public Integer getBanco() {
		return banco;
	}

	public void setBanco(Integer banco) {
		this.banco = banco;
	}

	public Integer getSucursal() {
		return sucursal;
	}

	public void setSucursal(Integer sucursal) {
		this.sucursal = sucursal;
	}
	
	public abstract Integer getNumeroEntero();
	public TipoCuenta getProducto() {
		return producto;
	}

	public int compareTo(Cuenta c) {
		return 0;
	}

	public int compareTo(TarjetaDeCredito t) {
		return 0;
	}
	
	
}
