/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.poo.Clases;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of persona.
 * 
 * @author Alfredo Juarez
 */
public class persona {
	/**
	 * Description of the property nombre.
	 */
	private String nombre = "";

	/**
	 * Description of the property apellido.
	 */
	private String apellido = "";

	/**
	 * Description of the property email.
	 */
	private String email = "";

	/**
	 * Description of the property long.
	 */
	private long celular = 0L;
	
	// Start of user code (user defined attributes for persona)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public persona() {
		// Start of user code constructor for persona)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for persona)

	// End of user code
	/**
	 * Returns nombre.
	 * @return nombre 
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets a value to attribute nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	/**
	 * Returns apellido.
	 * @return apellido 
	 */
	public String getApellido() {
		return this.apellido;
	}

	/**
	 * Sets a value to attribute apellido. 
	 * @param newApellido 
	 */
	public void setApellido(String newApellido) {
		this.apellido = newApellido;
	}

	/**
	 * Returns email.
	 * @return email 
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Sets a value to attribute email. 
	 * @param newEmail 
	 */
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}

	/**
	 * Returns long.
	 * @return long 
	 */
	public long getLong() {
		return this.celular;
	}

	/**
	 * Sets a value to attribute long. 
	 * @param newLong 
	 */
	public void setLong(long newcelular) {
	    this.celular = newcelular;
	}

}
