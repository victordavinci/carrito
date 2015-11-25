package modelo.productos;

/**
 * 
 * @author Godoy | Lucero
 *
 */

public enum TipoBazar {

	COCINA(1, "Utensilios"), BANIO(2, "Banio"), HOGAR(3, "Hogar");

	// valores Inmutables
	private final int codigoTipo;
	private final String nombreTipo;

	/**
	 * Constructor
	 * @param codT
	 * @param nombre
	 */
	private TipoBazar(int codT, String nombre) {
		this.codigoTipo = codT;
		this.nombreTipo = nombre;
	}// fin del constructor
}// fin de tipoBazar
