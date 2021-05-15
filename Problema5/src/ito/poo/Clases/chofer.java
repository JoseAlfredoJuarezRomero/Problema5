/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.poo.Clases;

import ito.poo.Clases.empleado;
import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of chofer.
 * 
 * @author Alfredo Juarez
 */
public class chofer extends empleado {
	/**
	 * Description of the property rutas.
	 */
	private HashSet<String> rutas = new HashSet<String>();

	/**
	 * Description of the property numAutobus.
	 */
	private int numAutobus = 0;

	// Start of user code (user defined attributes for chofer)

	// End of user code

	/**
	 * The constructor.
	 */
	public chofer() {
		// Start of user code constructor for chofer)
		super();
		// End of user code
	}

	/**
	 * Description of the method agregarRuta.
	 * @param  
	 */
	public void agregarRuta(String agregarRuta ) {
		// Start of user code for method agregarRuta
		// End of user code
	}

	/**
	 * Description of the method eliminarRuta.
	 * @param  
	 */
	public void eliminarRuta(boolean elimarRuta ) {
		
		// Start of user code for method eliminarRuta
		// End of user code
	}

	// Start of user code (user defined methods for chofer)

	// End of user code
	/**
	 * Returns rutas.
	 * @return rutas 
	 */
	public HashSet<String> getRutas() {
		return this.rutas;
	}

	/**
	 * Returns numAutobus.
	 * @return numAutobus 
	 */
	public int getNumAutobus() {
		return this.numAutobus;
	}

	/**
	 * Sets a value to attribute numAutobus. 
	 * @param newNumAutobus 
	 */
	public void setNumAutobus(int newNumAutobus) {
		this.numAutobus = newNumAutobus;
	}

}
