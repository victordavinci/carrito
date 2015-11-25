package modelo.productos;

import java.time.LocalDate;

/**
 * 
 * @author Godoy | Lucero
 *
 */

public class Comestible extends Producto {
	
	//Atributos
	
	private LocalDate fechaVencimiento;
	private double peso;
	
	/**
	 * Constructor
	 * @param nombre
	 * @param codigo
	 * @param precio
	 * @param stock
	 * @param fechaVencimiento
	 * @param peso
	 */
	
	public Comestible(String nombre, String codigo, double precio, int stock,
		LocalDate fechaVencimiento, double peso) {
		super(nombre, codigo, precio, stock);
		this.fechaVencimiento = fechaVencimiento;
		this.peso = peso;
	}// constructor

	// getters and setters
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}// fin de la clase Comestible
