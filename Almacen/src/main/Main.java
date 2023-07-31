package main;

import entidades.Cliente;
import entidades.Documento;
import entidades.Producto;
import entidades.ProductoPerecedero;
import utilitarios.Mensaje;

public class Main {

	public static void main(String[] args){
		Cliente[] clientes = new Cliente[3];
		ProductoPerecedero[] productos = new ProductoPerecedero[10];
		
		clientes[0] = (new Cliente("Lionel", "Messi", new Documento("DNI", 1111111)));
		clientes[1] = (new Cliente("Angel", "Di Maria", new Documento("DNI", 2222222)));
		clientes[2] = (new Cliente("Emiliano", "Martinez", new Documento("DNI", 33333333)));
		
		productos[0] = new ProductoPerecedero("Leche", 5.6f, 10, 5);
		productos[1] = new ProductoPerecedero("Queso", 7.6f, 11, 10);
		productos[2] = new ProductoPerecedero("Panceta", 6.6f, 2, 51);
		productos[3] = new ProductoPerecedero("Jamon", 54.6f, 4, 15);
		productos[4] = new ProductoPerecedero("Atun", 57.6f, 10, 2);
		productos[5] = new ProductoPerecedero("Bife de Chorizo", 52.6f, 9, 8);
		productos[6] = new ProductoPerecedero("Tomate", 8.6f, 8, 11);
		productos[7] = new ProductoPerecedero("Cebolla", 596.6f, 25, 8);
		productos[8] = new ProductoPerecedero("Queso Crema", 51.6f, 98, 96);
		productos[9] = new ProductoPerecedero("Hamburguesa", 15.6f, 11, 4);
		
		Mensaje.mostrarMensaje(clientes, productos);
	}


}
