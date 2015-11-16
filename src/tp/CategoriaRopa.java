package tp;

public enum CategoriaRopa {

     HOMBRE(1,"Hombre"),
	 MUJER (2,"Mujer"),
	 CHICOS(3,"Chicos");
	 
	//Valores inmutables
	 private final int codigoCategoria;
	 private final String nombre;
	
	 
	 //constructor
	private CategoriaRopa(int cod ,String nom){
		this.codigoCategoria = cod;
		this.nombre = nom;
	}//fin del constructor
	
	
	
	
}//fin de CategoriaRopa
