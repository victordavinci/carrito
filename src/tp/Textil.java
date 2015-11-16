package tp;

public class Textil extends Producto {

	/*Encapsulamiento y
	constructor*/
	public Textil(String nombre, String codigo, double precio,int stock, String talle,String tela, TipoRopa tipoRopa, CategoriaRopa categoriaRopa) {
		super(nombre, codigo, precio,stock);
		this.talle = talle;
		this.tela = tela;
		this.tipo = tipoRopa;
		this.categoria = categoriaRopa;
	}//constructor
	private String talle;
	private String tela;
	private TipoRopa tipo;
	private CategoriaRopa categoria;
	
	//getters and setters
	public String getTalle() {
		return talle;
	}
	public void setTalle(String talle) {
		this.talle = talle;
	}
	
	public String getTela() {
		return tela;
	}
	public void setTela(String tela) {
		this.tela = tela;
	}
	
	public TipoRopa getTipo() {
		return tipo;
	}
	public void setTipo(TipoRopa tipo) {
		this.tipo = tipo;
	}
	public CategoriaRopa getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaRopa categoria) {
		this.categoria = categoria;
	}
	
	

}//fin de la clase Textil
