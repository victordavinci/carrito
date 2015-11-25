package modelo.productos;

/**
 * 
 * @author Godoy | Lucero
 *
 */

public class Electrodomestico extends Producto {

	/**
	 * Constructor
	 * @param nombre
	 * @param codigo
	 * @param precio
	 * @param stock
	 * @param perGarantia
	 * @param descripcion
	 */
	public Electrodomestico(String nombre, String codigo, double precio,
			int stock, int perGarantia, String descripcion) {
		super(nombre, codigo, precio, stock);
		this.perGarantia = perGarantia;
		this.descripcion = descripcion;
	}// constructor

	private int perGarantia;
	private String descripcion;

	// getters and setters
	public int getPerGarantia() {
		return perGarantia;
	}

	public void setPerGarantia(int perGarantia) {
		this.perGarantia = perGarantia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}// fin de la clase Electrodomestico
