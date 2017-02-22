package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 * 
 * Clase encargada de la manipulación de los datos, lee el archivo .txt cargado y almacena los datos leídos
 * en una lista
 * @author Miguel Ángel Quintero P.
 * @version 05/02/2017
 * 
 * **/

public class Datos {
	/**Variables de la clase**/	
	private LinkedList<Double> listaNumeros = new LinkedList();
    
	
	/**
	 * @param ruta. String con la ruta del archivo con la lista de números. 
	 * Metodo que crea la lista de números teniendo en cuenta la ruta recibida.
	 * @return Lista de números.
	 *
	 * **/
	public LinkedList<Double> obtenerLista(String ruta){//Declaracion metodo
		try {
			BufferedReader bf = new BufferedReader(new FileReader(ruta));
			LinkedList<Double> listaTemporal = new LinkedList();
			String lineaLeida; 
			double numeroTemporal;
			
			while ((lineaLeida = bf.readLine()) != null) {
				numeroTemporal = Double.parseDouble(lineaLeida);
				listaTemporal.add(numeroTemporal);				
			}
			listaNumeros = listaTemporal;
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error leyendo el mensaje. Verifique que la ruta ingresada "
					+ "exista o que campo de la ruta no esté vacío");
			System.exit(0);
		}
		return listaNumeros;
	}
	/**Fin del método**/ 

}
