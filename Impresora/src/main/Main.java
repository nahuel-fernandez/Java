package main;
import java.util.Scanner;

import entidades.Impresora;
import excepciones.ImpresionException;
import excepciones.ImpresoraException;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner teclado = new Scanner(System.in);
		String imp;
		while(true){
			System.out.print("Ingrese la impresora: ");
			imp = teclado.next();
			try (Impresora impresora = new Impresora(imp)) {
				impresora.imprimir(new String[] { "Hola ", "Mundo\n" });
				impresora.setDocumento(new String[] { "Esto ", "es ", "una ", "prueba ", "de ", "impresion.\n" });
				impresora.imprimir();
				impresora.setDocumento(null);
				impresora.imprimir();
				break;
			} catch(ImpresoraException e) {
				System.out.println(e.getMessage());
				continue;
			}
			  catch(ImpresionException e) {
				  System.out.println(e.getMessage());
				  break;
			  }
			}
		teclado.close();
		}
}

