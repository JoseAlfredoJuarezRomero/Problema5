/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.poo.Clases;

import ito.poo.Clases.persona;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of cliente.
 * 
 * @author Alfredo Juarez
 */
public class cliente extends persona {
	/**
	 * Description of the property noCliente.
	 */
	private int noCliente = 0;

	/**
	 * Description of the property creditoDisponible.
	 */
	private float creditoDisponible = 0F;

	// Start of user code (user defined attributes for cliente)

	// End of user code

	/**
	 * The constructor.
	 */
	public cliente() {
		// Start of user code constructor for cliente)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for cliente)

	// End of user code
	/**
	 * Returns noCliente.
	 * @return noCliente 
	 */
	public int getNoCliente() {
		return this.noCliente;
	}

	/**
	 * Sets a value to attribute noCliente. 
	 * @param newNoCliente 
	 */
	public void setNoCliente(int newNoCliente) {
		this.noCliente = newNoCliente;
	}

	/**
	 * Returns creditoDisponible.
	 * @return creditoDisponible 
	 */
	public float getCreditoDisponible() {
		return this.creditoDisponible;
	}

	/**
	 * Sets a value to attribute creditoDisponible. 
	 * @param newCreditoDisponible 
	 */
	public void setCreditoDisponible(float newCreditoDisponible) {
		this.creditoDisponible = newCreditoDisponible;
	}

}
