package modelo.productos;

/**
 * 
 * @author Godoy | Lucero
 *
 */

public class Textil extends Producto {

	//Atributos
	private String talle;
	private String tela;
	private TipoRopa tipo;
	private CategoriaRopa categoria;
		
	/**
	 * Construuctor
	 * @param nombre
	 * @param codigo
	 * @param precio
	 * @param stock
	 * @param talle
	 * @param tela
	 * @param tipoRopa
	 * @param categoriaRopa
	 */
	public Textil(String nombre, String codigo, double precio, int stock,
			String talle, String tela, TipoRopa tipoRopa,
			CategoriaRopa categoriaRopa) {
		super(nombre, codigo, precio, stock);
		this.talle = talle;
		this.tela = tela;
		this.tipo = tipoRopa;
		this.categoria = categoriaRopa;
	}// constructor


	// getters and setters
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

}// fin de la clase Textil
