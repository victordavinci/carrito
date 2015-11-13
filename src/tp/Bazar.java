package tp;

public class Bazar extends Producto {

	public Bazar(String nombre, String codigo, double precio) {
		super(nombre, codigo, precio);
		// TODO Auto-generated constructor stub
	}
	
	private String texto;
	
	//getters and setters
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	

}//fin de la clase Bazar
