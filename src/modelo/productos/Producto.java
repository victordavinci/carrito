package modelo.productos;

public abstract class Producto {

	private String nombre;
	private String codigo;
	private double precio;
	private int stock;
	/*Encapsulamiento y
	constructor*/
	public Producto(String nombre, String codigo, double precio,int stock) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.stock = stock;
	}
	//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", stock=" + stock + "]";
	}//toString
	

}//fin de la clase Producto	
