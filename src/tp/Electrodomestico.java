package tp;

public class Electrodomestico extends Producto {

	public Electrodomestico(String nombre, String codigo, double precio) {
		super(nombre, codigo, precio);
		// TODO Auto-generated constructor stub
	}
	
	private int garantia;
	private String descripcion;
	
	//getters and setters
	public int getGarantia() {
		return garantia;
	}
	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}//fin de la clase Electrodomestico
