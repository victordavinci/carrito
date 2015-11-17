package vista;

import java.time.LocalDate;
import java.util.ArrayList;

import modelo.productos.Bazar;
import modelo.productos.Bebida;
import modelo.productos.CategoriaRopa;
import modelo.productos.Comestible;
import modelo.productos.Electrodomestico;
import modelo.productos.Producto;
import modelo.productos.Textil;
import modelo.productos.TipoBazar;
import modelo.productos.TipoRopa;

public class Principal {

	public static void main(String[] args) {
//productos Stock
		ArrayList <Producto> miStock = new ArrayList<Producto>();
		//Bebidas
		Bebida bebida1 = new Bebida("CocaCola", "B1", 7.0,40,LocalDate.parse("2015-08-08"), 1.5, true,false);
		Bebida bebida2 = new Bebida("Fanta", "B2", 6.5,20,LocalDate.parse("2015-09-18"), 1.00, true,false);
		Bebida bebida3 = new Bebida("Stella Artois", "B3", 25.0,12,LocalDate.parse("2015-06-24"), 970, true,true);
		//Comestibles
		Comestible comestible1 = new Comestible("Mayonesa","C1",12.50,30,LocalDate.parse("2014-04-21"),500);
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
		
		
		miStock.add(bebida1);
		miStock.add(bebida2);
		miStock.add(bebida3);
		miStock.add(comestible1);
		miStock.add(comestible2);
		miStock.add(comestible3);
		miStock.add(textil1);
		miStock.add(textil2);
		miStock.add(textil3);
		miStock.add(electrodomestico1);
		miStock.add(electrodomestico2);
		miStock.add(electrodomestico3);
		miStock.add(bazar1);
		miStock.add(bazar2);
		miStock.add(bazar3);
		//Recorrer el ArrayList (muestra los productos)
		for(Producto prod: miStock){
			System.out.println(prod.toString());
			if(prod instanceof Bebida){
//				Bebida a = (Bebida) prod;
//				System.out.println(a.getFechaVencimiento());
				System.out.println(((Bebida) prod).getFechaVencimiento());
			}
		}
	
	}//main

}//class
