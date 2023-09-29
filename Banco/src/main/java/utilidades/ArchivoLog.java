package utilidades;

import java.io.BufferedReader;  
import java.io.BufferedWriter; 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import dtos.LogDTO;
import entidades.LogError;



public class ArchivoLog {
	
	public static void cargarLog(LogError log, String clase, LogDTO ldto) throws IOException {
		String directorio = "archivos";
		String archivo = "log.txt";
		String ruta = directorio + File.separator + archivo;
		
		//Verifica si existen el directorio y el archivo. En caso contrario los crea.
		File dir = new File(directorio);
		if(!dir.exists()) {
			if(dir.mkdir()) {
				Path path = Paths.get(ruta);
				boolean pathExists = Files.exists(path, new LinkOption[] {LinkOption.NOFOLLOW_LINKS});
				if(!pathExists) {
					File arc = new File(ruta);
					arc.createNewFile();
				}
			}else System.out.println("No se pudo crear el archio log.");
		}
		
		
		//Se procede a leer el archivo de log de errores y se guardan sus lineas en una lista
		List<String> lineas = new ArrayList<String>();
		String lineaLeida="";
		try (BufferedReader br = new BufferedReader(new FileReader( new File(ruta)))){
			while(true) {
				lineaLeida = br.readLine();
				if(lineaLeida != null) {
					lineas.add(lineaLeida);
				}
				else break;
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		//Se agrega el nuevo log a la lista
		lineas.add("Fecha: " + log.getFechaHora().toString() + " - Clase: " + clase + " - " + "Mensaje: " + log.getDescripcion() + " - Registrado en la tabla logs id[" + ldto.idLog() + "]");
		
		//Se procede a agregar en el archivo log.txt la lista con el nuevo log de error
		try (BufferedWriter bw = new BufferedWriter(new FileWriter( new File(ruta)))) {
			bw.write("");
			for(String l : lineas) {
				bw.write(l);
				bw.newLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
