package modelo.productos;

import java.time.LocalDate;


public class Bebida extends Producto{
	/*Encapsulamiento y
	constructor*/
	public Bebida(String nombre, String codigo, double precio,int stock, LocalDate fechaVencimiento, double 
			volumen, boolean ret, boolean alc) {
		super(nombre, codigo, precio,stock);
		this.fechaVencimiento = fechaVencimiento;
		this.volumen = volumen;
		this.isRetornable = ret;
		this.isAlcoholica = alc;
	}//constructor
	
	private LocalDate fechaVencimiento;
	private double volumen;
	private boolean isRetornable;
	private boolean isAlcoholica;
	
	////getters and setters
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
    

}//fin de la clase Bebida 
