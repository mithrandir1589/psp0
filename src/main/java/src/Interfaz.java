package src;

import javax.swing.JOptionPane;

/**
 * Clase encargada de construir y mostrar la interfaz de la aplicación. Se comunica unicamente con la clase Calculos
 * @author Miguel Ángel Quintero
 * @version 05/02/2017
 *
 */

public class Interfaz {
	/**
	 * Método main invoca el método cargarPantalla 
	 * @param args
	 */
	public static void main(String[] args) {//Declaracion metodo
		cargarPantalla();		
	}
	/**Fin del método **/
	
	/**
	 * Método encargado de instanciar la clase Calculos, para realizar la invocación del método inicializarValores, al que 
	 * le pasa como parametro la ruta ingresada en el campo de texto que aparece en pantalla, que de ser correcta devuelve 
	 * el promedio y la desviación de los números presentes en la lista ingresada. 
	 */
	public static void cargarPantalla(){//Declaracion metodo
		Calculos c = new Calculos();
		String rutaArchivo = JOptionPane.showInputDialog("Ingrese la ruta del archivo");
		if(rutaArchivo == null){
			System.exit(0);
		}
				
		c.inicializarValores(rutaArchivo);
		
		JOptionPane.showMessageDialog(null, "El promedio del arreglo es: " + c.getPromedio() + "\n" + 
		"Y la desviacion es: " + c.getDesviacion());
		
	}
	/**Fin del método **/

}
