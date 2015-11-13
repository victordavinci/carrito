package tp;

import java.util.Date;

public class Comestible extends Producto {

	public Comestible(String nombre, String codigo, double precio) {
		super(nombre, codigo, precio);
		
	}
	
	private Date fechaVencimiento;
	private double peso;
	
	//getters and setters
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	

}//fin de la clase Comestible
