package modelo.compra;
/**
 * @author Godoy | Lucero
 * @version 1.0
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.productos.Producto;
import java.util.HashMap;

public class Compra {

	// Atributos
	private Cliente cli;
	private List<Item> articulos;
	private LocalDate fecha;
	private Double subtotal;
	private String formaPago;

	// Constructor
	public Compra(String nom, String ape, int nroSoc,int age, String formaPago) {
		this.cli = new Cliente(nom, ape, nroSoc, age);
		this.articulos = new ArrayList<Item>();
		this.fecha = LocalDate.now();
		this.formaPago = formaPago;
		this.subtotal = 0.0;
	}

	// Getters & Setters
	public Cliente getCli() {
		return cli;
	}

	public void setCli(Cliente cli) {
		this.cli = cli;
	}

	public List<Item> getArticulo() {
		return articulos;
	}

	public void setArticulo(List<Item> articulo) {
		this.articulos = articulo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	@Override
	public String toString() {
		return "Nº Cliente: "+this.getCli().getNroSocio()+" | "+this.getCli().getNombre()+" "+this.getCli().getApellido()+" | Medio de Pago: "+this.getFormaPago()+"\nFecha: "+this.fecha;
	}
	
	// Métodos
	/**
	 * Agrega productos a la compra
	 */
	public void agregarProd(int cantidad, Producto producto) {
		if (producto.getStock() >= cantidad) {
			//validate fecha vencimientooo
			articulos.add(new Item(cantidad, producto));
			producto.setStock(producto.getStock() - cantidad);
			System.out.println("Producto: " + producto.getCodigo() + " " + producto.getStock() + " unidades en Stock");
			this.subtotal = this.subtotal + (producto.getPrecio() * cantidad);
		} else {
			System.out.println("Atención!! Falta Stock -----> Stock: " + producto.getStock() + " " + " Pedido: " + cantidad);
			System.out.println("La compra del producto "+producto.getCodigo()+" "+producto.getNombre()+" no se registro.");
		}
	}
	/**
	 * Imprimir Ticket de compra
	 */
	public void imprimirTicket() {
		// cabecera
		System.out.println("****************** Ticket No valido como Factura  *********************\n\n");
		System.out.println(this);
		System.out.println("Detalle:\n Nº Item | --------  | Cantidad | -------- | Producto | -------- | Subtotal |");
		// articulos
		for (int i  = 0; i < this.articulos.size(); i++) {
			System.out.println("---"+(i+1)+this.articulos.get(i).toString());
		}
		System.out.println("Subtotal:----------------------------------------------------------- " + this.getSubtotal() + " $ (Pesos)");
		calcularTotalConDescuento();
		System.out.println("Descuento: "+this.getFormaPago()+"---------------------------------- " + this.getSubtotal() + " $ (Pesos)");
		System.out.println("\n\n****************** Gracias por su compra  *********************");
	}
	/**
	 * Aplicar descuento segun forma de pago, y redondear valor
	 */
	public void calcularTotalConDescuento() {
		double redondeo = 0.0;
		//efectivo descuento del 10 %
		if (formaPago.equalsIgnoreCase("Efectivo")) {
			redondeo = this.getSubtotal()*0.9;
		//tarjeta descuento del 15 %	
		} else if(formaPago.equalsIgnoreCase("Tarjeta")){
			redondeo = this.subtotal * 0.85;
		}else{
			System.out.println("Error");
		}
		//rendondeo de decimales
		this.setSubtotal((double)Math.round(redondeo));
	}// fin metodo calculaeTotalConDescuento
	
	public String checkFormaPago(String s){
		String r ="";
		if (s.equalsIgnoreCase("e")){
			r = "Efectivo";
		}else if(s.equalsIgnoreCase("t")){
			r = "Tarjeta";
		}else{
			System.err.println("ingrese Efectivo o Tarjeta");
		}
		return r;
	}
	
		/**
		 * Clase Item (Composición)
		 */
		public class Item {

			// Atributos
			private int cantidad;
			private Producto producto;
			

			/**
			 * Constructor Clase Item
			 * @param cantidad
			 * @param producto
			 */
			public Item(int cantidad, Producto producto) {
				this.cantidad = cantidad;
				
					this.producto = producto;
				
			}
			//Setters & Getters
			 public void setCantidad(int cantidad) {
				this.cantidad = cantidad;
			}
			 public int getCantidad(){
				 return this.cantidad;
			 }
			 public Producto getProducto(){
				 return this.producto;
			 }
			 public void setProducto(Producto p){
				 
				 this.producto = p;
			 }
			 
			@Override // toString
			public String toString() {
				return "-----------------------" + cantidad + "-----------------" + producto.getNombre() + "----------------"
						+ (this.producto.getPrecio() * cantidad);
			}
		}// Clase Item
		
	
	
}// Clase Compra
