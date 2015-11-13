package tp;

public class Textil extends Producto {

	public Textil(String nombre, String codigo, double precio) {
		super(nombre, codigo, precio);
		// TODO Auto-generated constructor stub
	}
	
	private int talle;
	private String tela;
	
	//getters and setters
	public int getTalle() {
		return talle;
	}
	public void setTalle(int talle) {
		this.talle = talle;
	}
	public String getTela() {
		return tela;
	}
	public void setTela(String tela) {
		this.tela = tela;
	}
	
	

}//fin de la clase Textil
