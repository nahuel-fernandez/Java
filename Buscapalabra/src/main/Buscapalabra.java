package main;

import java.io.BufferedReader; 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Buscapalabra {

	public static void main(String[] args) throws IOException {
		/*
		 Busca una palabra solicitada por consola dentro del archivo texto.txt
		 Si la palabra existe, se indica en qué fila y columna se encuntra y la encierra entre "<<>>"
		 */ 
		
		//Instancia un objeto File de entrada
		File archivo = new File("src" + File.separator + "archivos" + File.separator + "texto.txt");
		
		//Construye el Bufferedreader
		BufferedReader reader = new BufferedReader(new FileReader(archivo));
		
		//Define variables
		String lineaLeida = "";
		String palabra;
		
		List<String> lineas = new ArrayList<String>();
		Scanner teclado = new Scanner(System.in);
		
		//Lee el archivo y guarda cada linea
		while(true) {
			lineaLeida = reader.readLine();
			if (lineaLeida != null) {
				lineas.add(lineaLeida);
			}
			else {
				break;
			}
		}
		
		reader.close();
		System.out.print("Ingrese la palabra a buscar: ");
		palabra = teclado.next();
		
		//Pasa las lineas del texto a un arreglo para poder obtener el indice de cada una
		String[] lineasLeidas = new String[lineas.size()];
		for(int i= 0; i < lineasLeidas.length; i++) {
			lineasLeidas[i] = lineas.get(i);
		}
		
		/*
		 * Pasa cada linea del texto a un array para conocer sus indices de fila y separa cada palabra de cada linea para conocer sus indices de columna
		   y guarda esos indices.
		   
		 * En cada linea, reemplaza cada ocurrencia de la palabra a buscar por la misma palabra encerrada entre <<>> 
		   */
		boolean existe = false;
		for(int i = 0; i < lineasLeidas.length; i++) {
			if(lineasLeidas[i].contains(palabra)) {
				
				//Palabras de cada linea
				existe = true;
				String[] palabrasLeidas = lineasLeidas[i].split(" ");
				int col = 0;
				String linea = "";
				for(int j = 0; j < palabrasLeidas.length; j++) {
					if((palabrasLeidas[j].replaceAll("[^\\w+]", "")).equals(palabra)) {
						System.out.println("Palabra \"" + palabra + "\" encontrada en:  Fila " + (i+1) + ", Columna " + (col+1));
						palabrasLeidas[j] = "<<" + palabra + ">>";
					}
					linea += palabrasLeidas[j] + " ";
					col += palabrasLeidas[j].length()+1;
				}
				lineasLeidas[i] = linea;
			}
		}	
		
		if(existe) {
			//Vacia el contenido del archivo para cargarlo modificado
			BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
			writer.write("");
			
			//Carga el contenido del archivo con cada ocurrencia de la palabra a buscar encerradad entre <<>>
			for(String l : lineasLeidas) {
				writer.write(l, 0 , l.length());
				writer.newLine();
			}
			
			writer.close();
		}	else System.out.println("El archivo no contiene la palabra ingresada.");
		teclado.close();
	}

}
