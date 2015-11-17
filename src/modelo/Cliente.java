package modelo;

import java.util.Date;

public class Cliente {
	//Atributos
	private String nombre;
	private String apellido;
	private int nroSocio;
		
	//constructor
	public Cliente(String nombre, String apellido, int nroSocio) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroSocio = nroSocio;
	}
	//Getters and Setters
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
	@Override
	public String toString() {
		return "Cliente Nº: " + nroSocio + " Nombre= " + nombre + ", Apellido=" + apellido;
	}
	

	

}//Class
