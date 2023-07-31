package utilitarios;

import entidades.Cliente;
import entidades.ProductoPerecedero;

public class Mensaje {
	public static void mostrarMensaje(Cliente[] clientes, ProductoPerecedero[] productos) {
		for(Cliente cliente : clientes) {
			String mensaje = "Hola {nombre}:\nEsta semana tenemos estas ofertas para ti:\n";
			mensaje = mensaje.replace("{nombre}", cliente.getNombre());
			for(ProductoPerecedero producto : productos) {
				String oferta = "\t-{producto} Antes: {precioNormal} Despues: {precioDeOferta}\n";
				oferta = oferta.replace("{producto}", producto.getDescripcion());
				oferta = oferta.replace("{precioNormal}", String.format("%.2f", producto.getPrecio()));
				oferta = oferta.replace("{precioDeOferta}", String.format("%.2f", producto.getPrecioInventario()));
				mensaje += oferta;
			}
			System.out.println(mensaje);
		}
	}
}
