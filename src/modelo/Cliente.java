package modelo;

/**
 * 
 * @author Godoy | Lucero
 * @version 1.0
 */

public class Cliente {
	// Atributos
	private String nombre;
	private String apellido;
	private int nroSocio;
	private int age;

	/**
	 * Constructor
	 * @param nombre
	 * @param apellido
	 * @param nroSocio
	 * @param edad
	 */
	public Cliente(String nombre, String apellido, int nroSocio, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroSocio = nroSocio;
		this.setAge(edad);
	}

	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNroSocio() {
		return nroSocio;
	}

	public void setNroSocio(int nroSocio) {
		this.nroSocio = nroSocio;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Cliente Nº: " + nroSocio + " Nombre= " + nombre + ", Apellido="
				+ apellido;
	}

}// Class
