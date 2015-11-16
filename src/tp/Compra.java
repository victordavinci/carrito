package tp;

import java.time.LocalDate;
import java.util.ArrayList;

public class Compra {

	public static void main(String[] args) {
		ArrayList <Producto> miCarrito = new ArrayList<Producto>();
		//Bebidas
		Bebida bebida1 = new Bebida("CocaCola", "B1", 7.0,40,LocalDate.parse("2015-08-08"), 1.5, true,false);
		Bebida bebida2 = new Bebida("Fanta", "B2", 6.5,20,LocalDate.parse("2015-09-18"), 1.00, true,false);
		Bebida bebida3 = new Bebida("Stella Artois", "B3", 25.0,12,LocalDate.parse("2015-06-24"), 970, true,true);
		//Comestibles
		Comestible comestible1 = new Comestible("Mayonesa","C1",12.50,30,LocalDate.parse("2014-04-21" ),500);
		Comestible comestible2 = new Comestible("Azúcar","C2",22.00,3,LocalDate.parse("2015-09-11" ),500);
		Comestible comestible3 = new Comestible("Café","C3",44.50,5,LocalDate.parse("2015-10-28" ),1000);
		//Textil
		Textil textil1 = new Textil("Musculosa","T1",125.00,10,"L","Polyester",TipoRopa.REMERA,CategoriaRopa.MUJER);
		Textil textil2 = new Textil("Bermuda","T2",202.00,20,"XL","Algodón",TipoRopa.PANTALON,CategoriaRopa.HOMBRE);
		Textil textil3 = new Textil("Medias futbol","T3",44.50,5,"S","Algodón",TipoRopa.MEDIA,CategoriaRopa.CHICOS);
		//Electrodomesticos
		Electrodomestico electrodomestico1 = new Electrodomestico("Heladera","E1",4500,7,1,"320 Litros No frost");
		Electrodomestico electrodomestico2 = new Electrodomestico("Televisor","E2",9999.00,6,2,"Smart TV 40'' 3D incluye lentes");
		Electrodomestico electrodomestico3 = new Electrodomestico("Microondas","E3",7000.99,3,4,"400 Litros Horno Grill");
		//Bazar 
	    Bazar bazar1 = new  Bazar("Platos","B1",555.00,7,"Juego de platos Cuadrados Cereramica",TipoBazar.COCINA);
	    Bazar bazar2 = new  Bazar("Cortina","B2",67.00,9,"Cortina Baño Tamaño Estándar Diseños Varios" ,TipoBazar.BANIO);
	    Bazar bazar3 = new  Bazar("Florero","B3",98.00,1,"Florero Vidrio Alto diseño rectangular" ,TipoBazar.HOGAR);
		
		
		miCarrito.add(bebida1);
		miCarrito.add(bebida2);
		miCarrito.add(bebida3);
		miCarrito.add(comestible1);
		miCarrito.add(comestible2);
		miCarrito.add(comestible3);
		miCarrito.add(textil1);
		miCarrito.add(textil2);
		miCarrito.add(textil3);
		miCarrito.add(electrodomestico1);
		miCarrito.add(electrodomestico2);
		miCarrito.add(electrodomestico3);
		miCarrito.add(bazar1);
		miCarrito.add(bazar2);
		miCarrito.add(bazar3);
		
	}//fin de main
	
	public void calcularFormadePago(){
		
	}

}//fin de la clase Compra
