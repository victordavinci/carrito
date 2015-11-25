package modelo.productos;

import java.time.LocalDate;

/**
 * 
 * @author Godoy | Lucero
 *
 */

public class Bebida extends Producto {
	
	//Atributos
	private LocalDate fechaVencimiento;
	private double volumen;
	private boolean isRetornable;
	private boolean isAlcoholica;

	/**
	 * Constructor
	 * @param nombre
	 * @param codigo
	 * @param precio
	 * @param stock
	 * @param fechaVencimiento
	 * @param volumen
	 * @param retornable
	 * @param alcoholica
	 */
	public Bebida(String nombre, String codigo, double precio, int stock,
			LocalDate fechaVencimiento, double volumen, boolean ret, boolean alc) {
		super(nombre, codigo, precio, stock);
		this.fechaVencimiento = fechaVencimiento;
		this.volumen = volumen;
		this.isRetornable = ret;
		this.isAlcoholica = alc;
	}// constructor
	
	// //getters and setters
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public boolean isRetornable() {
		return isRetornable;
	}

	public void setRetornable(boolean isRetornable) {
		this.isRetornable = isRetornable;
	}

	public boolean isAlcoholica() {
		return isAlcoholica;
	}

	public void setAlcoholica(boolean isAlcoholica) {
		this.isAlcoholica = isAlcoholica;
	}

	/**
	 *  toString agregando Fecha de Vencimiento
	 */
	public String toString() {
		return super.toString().concat(
				" Fecha Vencimiento: " + this.getFechaVencimiento());
	}

}// fin de la clase Bebida
