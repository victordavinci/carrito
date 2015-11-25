package vista;
/**
 * @author Godoy | Lucero
 * @version 1.0
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.InputMismatchException;
import java.util.Scanner;
import modelo.compra.Compra;
import modelo.productos.Bebida;
import modelo.productos.Catalogo;
import modelo.productos.Comestible;
import modelo.productos.Producto;
import controlador.ExceptionProducto;
import controlador.WriteXMLFile;

public class Principal {

	public static void main(String[] args) {

		// variables
		boolean comprar = false;
		Catalogo catalogo = new Catalogo();

		// Compra
		Scanner sc = new Scanner(System.in);
		System.out.println("Davinci Market | Servicio de Compras:\nDatos Cliente\nNombre:");
		String name = sc.nextLine();
		System.out.println("Apellido:\n\r");
		String last_name = sc.nextLine();
		System.out.println("Nº Cliente:");
		int nroCliente = Integer.parseInt(sc.nextLine());
		System.out.println("Edad: ");
		int age = 0;
		age = getAge(sc);
		int contador = 0;

		// limite a la cantidad de intentos
		while (age == -1) {
			if (contador < 3) {
				age = getAge(sc);
			} else {
				System.out
						.println("Se han ingresado demasiados valores inválidos.");
				System.out.println("***FIN DEL PROGRAMA***.");
				System.exit(0);
			}

			contador++;
		}

		System.out.println("Bienvenido :" + name + " " + last_name);
		
		// mostrar el catalogo
		catalogo.imprimirStock();

		// condicion de realización de compra
		Compra c = new Compra(name, last_name, nroCliente, age, "Efectivo");
		System.out.println("Realizar compra? y/n");
		String condicion = sc.nextLine().trim(); 
		if (condicion.equalsIgnoreCase("y")) {
			comprar = true;
			System.out.println("Efectivo (e) / Tarjeta (t)\r");
			c.setFormaPago(c.checkFormaPago(sc.nextLine()));
		} else if (condicion.equalsIgnoreCase("n")) {
			System.out.println("Graciass vuelva prontos | Fin de Programa ");
			// terminar Ejecución
			System.exit(0);
		}

		// while de compra
		while (comprar) {
			System.out.println("Ingresa codigo de articulo\r\n");
			String codigo = sc.nextLine();
			try {
				Producto p = catalogo.buscarProducto(codigo);

				// chequea si es bebida, si es alcoholica y la edad del cliente
				if (p instanceof Bebida && ((Bebida) p).isAlcoholica()
						&& age < 18) {
					System.out
							.println("\n\n*************************************************************");
					System.out
							.println("*No está permitido vender bebidas alcoholicas a menores.*");
					System.out
							.println("*************************************************************\n\n");
					continue;
				}

				if ((p instanceof Bebida || p instanceof Comestible)) {

					LocalDate today = LocalDate.now();
					LocalDate fechaVenc = (p instanceof Bebida) ? ((Bebida) p)
							.getFechaVencimiento() : ((Comestible) p)
							.getFechaVencimiento();

					// calcula la diferencia y la evalua según su fecha de
					// vencim antes seteada
					long cantDiasDeVenc = Period.between(fechaVenc, today)
							.getMonths()
							* 30
							+ Period.between(fechaVenc, today).getDays();

					if (cantDiasDeVenc < 5) {
						System.out
								.println("\n\n*************************************************************");
						System.out
								.println("*Este producto esta próximo a vencer.*");
						System.out
								.println("*************************************************************\n\n");
					}

				}

				System.out.println(p + "\nCantidad:");
				int cant = Integer.parseInt(sc.nextLine());
				// agregar producto al carrito
				c.agregarProd(cant, p);

			} catch (ExceptionProducto e) {
				System.err.println(e.getMessage());
				System.out.println("\nProducto " + codigo + " No encontrado");
			}
			System.out
					.println("Agregar otro articulo ? (y) ");
			condicion = sc.nextLine();
			if (condicion.equalsIgnoreCase("y")) {
				comprar = true;
			} else {
				comprar = false;
				System.out.println("Compra finalizada");
				// imprimir ticket
				c.imprimirTicket();
				// guardar xml
				WriteXMLFile.convertXML(c);
			}
		}// fin de while
		sc.close();
	}// fin de main

	/**
	 * Validación Edad del Cliente
	 * @param scEdad
	 * @return edad
	 */
	static private int getAge(Scanner scEdad) {
		int age = -1;
		try {
			age = Integer.parseInt(scEdad.nextLine());
			while(age < 1 || age >120){
				System.out.println("Edad: ");
				age = Integer.parseInt(scEdad.nextLine());
			}
		} catch (InputMismatchException e) {
			System.out
					.println("Error, la edad ingresada es inválida. Intente nuevamente");
		} catch (Exception e) {
			System.out.println("Error desconocido." + e.getMessage());
			System.out.println("***FIN DEL PROGRAMA***.");
			System.exit(1);
		}
		
		return age;
	}

}//fin de  clase Principal
