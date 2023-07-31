package main;

import dtos.PaisDTO;
import entidades.Pais;
public class App 
{
    public static void main( String[] args )
    {
        PaisDTO paisDTO = new PaisDTO();
        try{
        	if(paisDTO.insertar(new Pais ("Argentina")))
        	{
        		System.out.println("El pais 'Argentina' ha sido agregado a la base de datos.");
        	}else System.out.println("No se pudo agregar el pais 'Argentina' a la base de datos.");
        }
        catch(Exception e) {
        	System.out.println(e.getMessage());
        	e.printStackTrace();
        }
    }
}
