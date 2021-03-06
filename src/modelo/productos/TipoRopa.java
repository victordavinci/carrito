package modelo.productos;

/**
 * 
 * @author Godoy | Lucero
 *
 */

public enum TipoRopa {
	REMERA(1, "Remera"), PANTALON(2, "Pantalon"), MEDIA(3, "Media");

	// valores Inmutables
	private final int codigoTipo;
	private final String nombreTipo;

	/**
	 * Constructor
	 * @param codT
	 * @param nombre
	 */
	private TipoRopa(int codT, String nombre) {
		this.codigoTipo = codT;
		this.nombreTipo = nombre;
	}// fin del constructor

}// fin de TipoRopa
