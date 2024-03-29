package main;

import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner;
import dtos.CiudadDTO; 
import dtos.PaisDTO;
import entidades.Locacion;
import entidades.Ciudad;
import entidades.Pais;

public class App 
{
    public static void main( String[] args ){
    	
    	//Variables a usar
    	Scanner teclado = new Scanner(System.in);
    	String miciudad;
    	List<Locacion> ciudades = new ArrayList<Locacion>();
    	CiudadDTO ciudad = new CiudadDTO(); 
    	
    	
    	/*Se procede a la carga de la informacion en la base de datos. La carga de las tablas está modularizada para poder modificar la forma de hacerlo.
    	*/
    	agregarPaises();
    	agregarCiudades();
    	
    	System.out.print("Ingrese una ciudad a buscar: ");
    	miciudad = teclado.next();
    	ciudades = ciudad.buscar(miciudad, 1);
    	if(ciudades != null) {
	    	if(ciudades.size()>0) {
	    		System.out.println("Ciudades que coinciden con su busqueda: ");
	    		for(Locacion c : ciudades) {
	    			System.out.println("\t-" + c.getDescripcion());
	    		}
	    	}	
	    	else System.out.println("No se encontraron coincidencias para su busqueda.");
    	}	else System.out.println("Lista nula");
    	teclado.close();
    }
    
    
    /*
      A continuacion los modulos que ingresan informacion a las tablas.
      En este caso los datos se cargan por código (hard coding), pero se puede modificar para solicitar los mismos por pantalla.
    */
    private static void agregarPaises() {
    	PaisDTO paisDTO = new PaisDTO();
    	paisDTO.insertar(new Pais ("Argentina"));
    }
    
    private static void agregarCiudades() {
    	CiudadDTO ciudadDTO = new CiudadDTO();
    	ciudadDTO.insertar(1, new Ciudad ("San Luis"));
    	ciudadDTO.insertar(1, new Ciudad ("Concordia"));
    	ciudadDTO.insertar(1, new Ciudad ("San Juan"));
    	ciudadDTO.insertar(1, new Ciudad ("Buenos Aires"));
    	ciudadDTO.insertar(1, new Ciudad ("Cordoba"));
    	ciudadDTO.insertar(1, new Ciudad ("Corrientes"));
    }
}
