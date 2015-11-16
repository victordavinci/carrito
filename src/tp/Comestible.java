package tp;

import java.time.LocalDate;


public class Comestible extends Producto {

	public Comestible(String nombre, String codigo, double precio,int stock, LocalDate fechaVencimiento,double peso) {
		super(nombre, codigo, precio,stock);
		this.fechaVencimiento = fechaVencimiento;
		this.peso = peso;
	}//constructor
	
	private LocalDate fechaVencimiento;
	private double peso;
	
	//getters and setters
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
	
	
	

}//fin de la clase Comestible
