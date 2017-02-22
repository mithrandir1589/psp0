package src;

import javax.swing.JOptionPane;

/**
 * Clase encargada de construir y mostrar la interfaz de la aplicaci�n. Se comunica unicamente con la clase Calculos
 * @author Miguel �ngel Quintero
 * @version 05/02/2017
 *
 */

public class Interfaz {
	/**
	 * M�todo main invoca el m�todo cargarPantalla 
	 * @param args
	 */
	public static void main(String[] args) {//Declaracion metodo
		cargarPantalla();		
	}
	/**Fin del m�todo **/
	
	/**
	 * M�todo encargado de instanciar la clase Calculos, para realizar la invocaci�n del m�todo inicializarValores, al que 
	 * le pasa como parametro la ruta ingresada en el campo de texto que aparece en pantalla, que de ser correcta devuelve 
	 * el promedio y la desviaci�n de los n�meros presentes en la lista ingresada. 
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
	/**Fin del m�todo **/

}
