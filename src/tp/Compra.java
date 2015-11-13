package tp;
import java.util.Date;
import java.util.ArrayList;

public class Compra {

	public static void main(String[] args) {
		ArrayList <Producto> miCarrito = new ArrayList<Producto>();
		Bebida bebida1 = new Bebida("CocaCola", "B1", 7.0, , 1.5, true,false);
		Bebida bebida2 = new Bebida("Fanta", "B2", 6.5);
		Bebida bebida3 = new Bebida("Sprite", "B3", 5.0);
		miCarrito.add(bebida1);
		miCarrito.add(bebida2);
		miCarrito.add(bebida3);
		

	}
	
	public void calcularFormadePago(){
		
	}

}
