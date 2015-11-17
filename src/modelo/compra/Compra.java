package modelo.compra;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import modelo.productos.Producto;
public class Compra {

//Atributos
private Cliente cli;
private List<Item> articulo;
private LocalDate fecha;

//Constructor

public Compra(String nom, String ape, int nroSoc){
	this.cli = new Cliente(nom, ape, nroSoc);
	this.articulo = new ArrayList<Item>();
	this.fecha = LocalDate.now();
	
}//constructor	
//Composición
private class Item{
	private int nro_itemcodigo;
	private Double cantidad;
	private Producto producto;
//Constructor
public Item (Double cantidad, Producto producto ){
	this.nro_itemcodigo ++;
	this.cantidad = cantidad;
	this.producto = producto;
}//contructor
	

}//Clase Item
//Mètodos
public void agregarProd(Double cantidad, Producto producto){
	if (articulo == null){
		articulo = new ArrayList<Item>();
	}
	articulo.add(new Item(cantidad, producto));
}
public void mostrarProd(){
	for(Item item :this.articulo){
		System.out.println(this.toString());
	}
}
}//Clase Compra
