package main;

import genericos.Parametrica; 
import ordenados.Orden;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Parte I - Documentos
		Set<Parametrica<String, String>> documentos = new HashSet<>();
		String tipo;
		String descripcion;
		while(true) {
			System.out.print("Ingrese el tipo de documento: ");
			tipo = teclado.next();
			System.out.print("Ingrese la descripcion del  documento: ");
			descripcion = teclado.next();
			Parametrica<String, String> documento = new Parametrica<String, String>(tipo, descripcion);
			if(!documentos.add(documento)) {
			   System.out.println("El documento ya existe en la tabla.");
			}
			System.out.print("¿Desea ingresar mas elementos a la tabla? (s/n): ");
			String respuesta = teclado.next();
			if(respuesta.equalsIgnoreCase("n")) {
				break;
			}
		}
		System.out.println("\nLista de Documentos:");

		Iterator<Parametrica<String, String>> iteradorDoc = documentos.iterator();

		while (iteradorDoc.hasNext()) {
			Parametrica<String, String> documento = iteradorDoc.next();
			System.out.println(documento);
		}
		
		System.out.println("\n******************************************************************");
		
		
		//Parte II - Telefonos
		Set<Parametrica<Integer, String>> telefonos = new TreeSet<Parametrica<Integer, String>>(new Orden());
		Integer codigo;
		while(true) {
			System.out.print("Ingrese el codigo del telefono: ");
			codigo = teclado.nextInt();
			System.out.print("Ingrese la descripcion del telefono: ");
			descripcion = teclado.next();
			Parametrica<Integer, String> telefono = new Parametrica<Integer, String>(codigo, descripcion);
			if(!telefonos.add(telefono)) {
			   System.out.println("El telefono ya existe en la tabla.");
			}
			System.out.print("¿Desea ingresar mas elementos a la tabla? (s/n): ");
			String respuesta = teclado.next();
			if(respuesta.equalsIgnoreCase("n")) {
				break;
			}
		}
		Iterator<Parametrica<Integer, String>> iteradorTel = telefonos.iterator();
		System.out.println("\nLista de telefonos ingresados ordenados por codigo: ");
		while (iteradorTel.hasNext()) {
			Parametrica<Integer, String> telefono = iteradorTel.next();
			System.out.println(telefono);
		}
		teclado.close();
	}

}
