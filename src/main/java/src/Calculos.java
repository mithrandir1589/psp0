package src;

import java.util.LinkedList;

/**
 * Clase encargada de realizar los cálculos y la comunicación entre la clase Interfaz y la clase Datos. Realiza
 * los calculos de desviación y promedio según los datos ingresados. 
 * @author Miguel Ángel Quintero 
 * @version 05/02/2017
 * 
 **/

public class Calculos {
	/**Variables de la clase **/
	private double promedio;
	private double desviacion;
	private String rutaArchivo;
	private LinkedList<Double> listaNumeros;
	
	/**
	 * Método que invoca los métodos que permiten obtener la ruta del archivo y la lista de números
	 * @param ruta Ruta del archivo
	 */
	public void inicializarValores(String ruta){//Declaracion metodo
		obtenerRutaArchivo(ruta);
		configurarListaNumeros();
	}
	/**Fin del método**/
	
	/**
	 * Método que obtiene la ruta del archivo y se la asigna a la variable rutaArchivo de esta clase para que sea usada por 
	 * cualquiera de los métodos de la misma.
	 * @param rutaArchivo Ruta del archivo
	 */
	private void obtenerRutaArchivo(String rutaArchivo){//Declaracion metodo
		this.rutaArchivo = rutaArchivo;		
	}
	/**Fin del método**/
	
	/**
	 * Método encargado de obtener la lista de números, obtenida de invocar el método obtenerLista de la clase Datos
	 */
	private void configurarListaNumeros(){//Declaracion metodo
		Datos datos = new Datos();
		this.listaNumeros = datos.obtenerLista(this.rutaArchivo);
	}
	/**Fin del método **/
	
	
	/**
	 * Método encargado de calcular el promedio, usando los datos presentes en la lista de números listaNumeros
	 */
	private void calcularPromedio(){//Declaracion metodo
		double suma = 0;
		int cantidadNumeros = this.listaNumeros.size();
		for (int i = 0; i < this.listaNumeros.size() ; i++){
			suma = suma + this.listaNumeros.get(i);
		}
		this.promedio = (double) suma / cantidadNumeros;
		//System.out.println(listaNumeros.get(0));
	}
	/** Fin del método **/
	
	/**
	 * Método encargado de devolver el valor del promedio de la lista de números, invocando la función calcularPromedio
	 * @return El promedio calculado 
	 */
	public double getPromedio(){//Declaracion metodo
		calcularPromedio();
		return this.promedio;
	}
	/** Fin del método **/
	
	/**
	 * Método en Método encargado de calcular la desviación, usando los datos presentes en la lista de números listaNumeros
	 */
	public void calcularDesviacion(){//Declaracion metodo
		int calculoTemporal = 0;
		double resta = 0;
		int cantidadNumeros = this.listaNumeros.size();
		double prom = getPromedio();
		for(int i= 0; i < this.listaNumeros.size(); i++){
			resta = this.listaNumeros.get(i) - prom;
			calculoTemporal = calculoTemporal + ((int) Math.pow(resta, 2));		
		}	
		this.desviacion = (double) Math.sqrt(calculoTemporal / (cantidadNumeros - 1));		
	}
	/** Fin del método **/
	
	/**
	 * Método encargado de devolver el valor de la desviación, invocando la función calcularDesviacion
	 * @return
	 */	
	public double getDesviacion(){//Declaracion metodo
		calcularDesviacion();
		return this.desviacion;
	}
	/** Fin del método **/
}
