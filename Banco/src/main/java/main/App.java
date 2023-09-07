package main;

 
import enumerados.TipoDeDocumento;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Documento;
import entidades.Cuenta;
import entidades.TarjetaDeCredito;


public class App 
{
    private static Map<Documento, Cliente> clientes = new HashMap<Documento, Cliente>();
	
	public static void main( String[] args ){
		Scanner teclado = new Scanner(System.in);
		String tdoc;
		Integer nrodoc;
		
		//Los datos de clientes y sus respectivos productos son cargados mediante hardcoding.
		cargarClientes();
		
		while(true) {
	        System.out.print("Ingrese tipo de documento: ");
	        tdoc = teclado.next();
	        TipoDeDocumento tdd = buscarTDoc(tdoc);
	        if(tdd == null) {
	        	System.out.println("El tipo de documento ingresado no existe. Ingrese un tipo de documento valido: ");
	        	for(TipoDeDocumento t : TipoDeDocumento.values()) {
	        		System.out.println(t.name() + "- ");
	        	}
	        }
	        else {
	        	System.out.print("Ingrese el numero de documento: ");
	        	nrodoc = teclado.nextInt();
	        	Documento doc = new Documento(tdd, nrodoc);
	        	if(!existeCliente(doc)) {
	        		System.out.println("El cliente no existe. Intente de nuevo.");
	        	}
	        	else {
	        		System.out.println(clientes.get(doc).toString());
	        		break;
	        	}
	        }
		}
		teclado.close();	
    }
    private static TipoDeDocumento buscarTDoc(String tipo) {
    	for(TipoDeDocumento t : TipoDeDocumento.values()) {
    		if(tipo.equalsIgnoreCase(t.name()))
    			return t;
    	}
    	return null;
    }
    private static boolean existeCliente(Documento documento) {
    	return clientes.containsKey(documento);
    }
    
    private static void cargarCliente(Cliente cliente) {
    	clientes.put(cliente.getDocumento(), cliente);
    }
    
    private static void cargarClientes() {
    	Cliente c1 = new Cliente("ADRIÁN PLAZA PEGUEROLES", new Documento(TipoDeDocumento.DNI, 998855223), "27/03/1985");
    	if(existeCliente(c1.getDocumento())) {
    		System.out.println("El cliente con tipo de documento " + c1.getDocumento().getTipo().name() + " numero " + c1.getDocumento().getNumero() + " ya existe en la base de datos.");
    	}else {
		    	c1.cargarProducto(new Cuenta(5, 3, "CC"));
		    	c1.cargarProducto(new Cuenta(10, 6, "CA"));
		    	c1.cargarProducto(new TarjetaDeCredito(2, 9, 456));
		    	c1.cargarProducto(new Cuenta(7, 9, "CC") );
		    	cargarCliente(c1);
		   }
    	
    	Cliente c2 = new Cliente("DAVID OLIVER GUTIERREZ ", new Documento(TipoDeDocumento.DNI, 525875845), "02/10/1948");
    	if(existeCliente(c2.getDocumento())) {
    		System.out.println("El cliente con tipo de documento " + c2.getDocumento().getTipo().name() + " numero " + c2.getDocumento().getNumero() + " ya existe en la base de datos.");
    	}else {
	    	c2.cargarProducto(new Cuenta(155, 333, "CA"));
	    	c2.cargarProducto(new Cuenta(155, 56, "CA"));
	    	c2.cargarProducto(new TarjetaDeCredito(12, 49, 56));
	    	c2.cargarProducto(new Cuenta(57, 29, "CC") );
	    	cargarCliente(c2);
    	}
    	
    	Cliente c3 = new Cliente("GABRIEL GOMIS COBOS", new Documento(TipoDeDocumento.DNI, 54879521), "12/05/1992");
    	if(existeCliente(c3.getDocumento())) {
    		System.out.println("El cliente con tipo de documento " + c3.getDocumento().getTipo().name() + " numero " + c3.getDocumento().getNumero() + " ya existe en la base de datos.");
    	}else {
	    	c3.cargarProducto(new Cuenta(8, 9, "H"));
	    	c3.cargarProducto(new Cuenta(11, 61, "CC"));
	    	c3.cargarProducto(new TarjetaDeCredito(9, 19, 34));
	    	c3.cargarProducto(new Cuenta(75, 98, "CC") );
	    	cargarCliente(c3);
    	}
    	
    	Cliente c4 = new Cliente("LAURA GARCIA DELCLOS", new Documento(TipoDeDocumento.DNI, 45865965), "05/04/1990");
    	if(existeCliente(c4.getDocumento())) {
    		System.out.println("El cliente con tipo de documento " + c4.getDocumento().getTipo().name() + " numero " + c4.getDocumento().getNumero() + " ya existe en la base de datos.");
    	}else {
	    	c4.cargarProducto(new Cuenta(190, 56, "CA"));
	    	c4.cargarProducto(new Cuenta(58, 98, "CC"));
	    	c4.cargarProducto(new TarjetaDeCredito(278, 69, 5647));
	    	c4.cargarProducto(new Cuenta(117, 119, "CC") );
	    	cargarCliente(c4);
    	}
    	
    	Cliente c5 = new Cliente("MARCO BARBERO MOTA ", new Documento(TipoDeDocumento.DNI, 63524178), "10/12/1982");
    	if(existeCliente(c5.getDocumento())) {
    		System.out.println("El cliente con tipo de documento " + c5.getDocumento().getTipo().name() + " numero " + c5.getDocumento().getNumero() + " ya existe en la base de datos.");
    	}else {
	    	c5.cargarProducto(new Cuenta(57, 63, "CC"));
	    	c5.cargarProducto(new Cuenta(101, 56, "CA"));
	    	c5.cargarProducto(new TarjetaDeCredito(232, 911, 45));
	    	c5.cargarProducto(new Cuenta(712, 329, "CC") );
	    	cargarCliente(c5);
    	}
    	
    	Cliente c6 = new Cliente("MARIANA MOSQUERA FERNÁNDEZ ", new Documento(TipoDeDocumento.DNI, 56321478), "15/07/1993");
    	if(existeCliente(c6.getDocumento())) {
    		System.out.println("El cliente con tipo de documento " + c6.getDocumento().getTipo().name() + " numero " + c6.getDocumento().getNumero() + " ya existe en la base de datos.");
    	}else {
	    	c6.cargarProducto(new Cuenta(55, 636, "CC"));
	    	c6.cargarProducto(new Cuenta(140, 654, "CA"));
	    	c6.cargarProducto(new TarjetaDeCredito(243, 329, 908));
	    	c6.cargarProducto(new Cuenta(231, 457, "CC") );
	    	cargarCliente(c6);
    	}
    	
    	Cliente c7 = new Cliente("OLEKSANDRA KHOMENKO ", new Documento(TipoDeDocumento.DNI, 25631495), "21/06/1991");
    	if(existeCliente(c7.getDocumento())) {
    		System.out.println("El cliente con tipo de documento " + c7.getDocumento().getTipo().name() + " numero " + c7.getDocumento().getNumero() + " ya existe en la base de datos.");
    	}else {
	    	c7.cargarProducto(new Cuenta(98, 254, "CC"));
	    	c7.cargarProducto(new Cuenta(62, 98, "CA"));
	    	c7.cargarProducto(new TarjetaDeCredito(72, 69, 54));
	    	c7.cargarProducto(new Cuenta(765, 70, "CC") );
	    	cargarCliente(c7);
    	}
    	
    	Cliente c8 = new Cliente("PAULA SALA IVARS ", new Documento(TipoDeDocumento.DNI, 36259814), "06/11/1984");
    	if(existeCliente(c8.getDocumento())) {
    		System.out.println("El cliente con tipo de documento " + c8.getDocumento().getTipo().name() + " numero " + c8.getDocumento().getNumero() + " ya existe en la base de datos.");
    	}else {
	    	c8.cargarProducto(new Cuenta(64, 33, "CC"));
	    	c8.cargarProducto(new Cuenta(303, 46, "CA"));
	    	c8.cargarProducto(new TarjetaDeCredito(24, 49, 90));
	    	c8.cargarProducto(new Cuenta(94, 92, "CC") );
	    	cargarCliente(c8);
    	}
    	
    	Cliente c9 = new Cliente("PABLO ROMERO CLAVIJO ", new Documento(TipoDeDocumento.DNI, 56127836), "10/08/1978");
    	if(existeCliente(c9.getDocumento())) {
    		System.out.println("El cliente con tipo de documento " + c9.getDocumento().getTipo().name() + " numero " + c9.getDocumento().getNumero() + " ya existe en la base de datos.");
    	}else {
	    	c9.cargarProducto(new Cuenta(65, 63, "CC"));
	    	c9.cargarProducto(new Cuenta(106, 66, "CA"));
	    	c9.cargarProducto(new TarjetaDeCredito(72, 97, 756));
	    	c9.cargarProducto(new Cuenta(17, 91, "CC") );
	    	cargarCliente(c9);
    	}
    	
    	Cliente c10 = new Cliente("SARA AROZAMENA AGUAYO ", new Documento(TipoDeDocumento.DNI, 35698472), "09/09/1980");
    	if(existeCliente(c10.getDocumento())) {
    		System.out.println("El cliente con tipo de documento " + c10.getDocumento().getTipo().name() + " numero " + c10.getDocumento().getNumero() + " ya existe en la base de datos.");
    	}else {
	    	c10.cargarProducto(new Cuenta(654, 33, "CC"));
	    	c10.cargarProducto(new Cuenta(310, 63, "CA"));
	    	c10.cargarProducto(new TarjetaDeCredito(5, 7, 76456));
	    	c10.cargarProducto(new Cuenta(12, 39, "FCI") );
	    	cargarCliente(c10);
    	}
    }
}
