package utilidades;



public class Generador {

	
	public static String GenerarNumero(Integer numero, String formato) {
		String numeroGenerado = formato.replace("#", "0");
		char[] ng = numeroGenerado.toCharArray();
		String numeroRecibido = numero.toString();
		int j = ng.length - 1;
		for (int i = numeroRecibido.length()-1; i >= 0; i--) {
			if(ng[j] == '0') {
				ng[j] = numeroRecibido.charAt(i);
			}else i++;	   
			j--;
		}
		numeroGenerado = "";
		for(int i = 0; i <= ng.length - 1; i++) {
			numeroGenerado += ng[i];
		}
		return numeroGenerado;
	}
}
