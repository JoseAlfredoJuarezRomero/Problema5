/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.poo.Clases;

import ito.poo.Clases.persona;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of empleado.
 * 
 * @author Alfredo Juarez
 */
public class empleado extends persona {
	/**
	 * Description of the property nss.
	 */
	private String nss = "";

	/**
	 * Description of the property noEmpleado.
	 */
	private int noEmpleado = 0;

	/**
	 * Description of the property sueldo.
	 */
	private float sueldo = 0F;

	/**
	 * Description of the property puesto.
	 */
	private String puesto = "";

	// Start of user code (user defined attributes for empleado)

	// End of user code

	/**
	 * The constructor.
	 */
	public empleado() {
		// Start of user code constructor for empleado)
		super();
		// End of user code
	}

	/**
	 * Description of the method cambioPuesto.
	 */
	public void cambioPuesto() {
		// Start of user code for method cambioPuesto
		// End of user code
	}

	// Start of user code (user defined methods for empleado)

	// End of user code
	/**
	 * Returns nss.
	 * @return nss 
	 */
	public String getNss() {
		return this.nss;
	}

	/**
	 * Sets a value to attribute nss. 
	 * @param newNss 
	 */
	public void setNss(String newNss) {
		this.nss = newNss;
	}

	/**
	 * Returns noEmpleado.
	 * @return noEmpleado 
	 */
	public int getNoEmpleado() {
		return this.noEmpleado;
	}

	/**
	 * Sets a value to attribute noEmpleado. 
	 * @param newNoEmpleado 
	 */
	public void setNoEmpleado(int newNoEmpleado) {
		this.noEmpleado = newNoEmpleado;
	}

	/**
	 * Returns sueldo.
	 * @return sueldo 
	 */
	public float getSueldo() {
		return this.sueldo;
	}

	/**
	 * Sets a value to attribute sueldo. 
	 * @param newSueldo 
	 */
	public void setSueldo(float newSueldo) {
		this.sueldo = newSueldo;
	}

	/**
	 * Returns puesto.
	 * @return puesto 
	 */
	public String getPuesto() {
		return this.puesto;
	}

	/**
	 * Sets a value to attribute puesto. 
	 * @param newPuesto 
	 */
	public void setPuesto(String newPuesto) {
		this.puesto = newPuesto;
	}

}
