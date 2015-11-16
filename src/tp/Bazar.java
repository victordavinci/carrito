package tp;

public class Bazar extends Producto {

	private String descripcion;
	private int garantia;
//	private String texto;
	private TipoBazar tipoBazar;
	
     //constructor
	public Bazar(String nombre, String codigo, double precio, int stock, String descripcion,TipoBazar tipoBazar) {
		super(nombre, codigo, precio,stock);
		this.descripcion = descripcion;
		this.tipoBazar = tipoBazar;
	}//fin de constructor
	
	
	//getters and setters
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public TipoBazar getTipoBazar() {
		return tipoBazar;
	}
	public void setTipoBazar(TipoBazar tipoBazar) {
		this.tipoBazar = tipoBazar;
	}
	
}//fin de la clase Bazar
