import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre_Refaccionaria;
		String ubicacion;
		String tipo_refaccion;
		float precio_venta;
		int cantidad;
		float precio_compra;
		float ganancia;

		Refaccionaria ref;
		Scanner lectura = null;

		Implementacion imp = new Implementacion();

		int menuPrincipal, subMenu, indice;

		do {
			System.out.println("Menu Refaccionaria");
			System.out.println("1---Guardar");
			System.out.println("2---Buscar por indice(ingrese el numero dentro del corchete)");
			System.out.println("3---Buscar por nombre");
			System.out.println("4---Buscar por ubicion");
			System.out.println("5---Editar");
			System.out.println("6---Eliminar");
			System.out.println("7---Eliminar por nombre");
			System.out.println("8---Listar");
			System.out.println("9---salir");
			lectura = new Scanner(System.in);
			menuPrincipal = lectura.nextInt();
			switch (menuPrincipal) {
			case 1:

				System.out.println("Ingrese nombre de Refaccionaria");
				lectura = new Scanner(System.in);
				nombre_Refaccionaria = lectura.nextLine();

				System.out.println("Ingrese la ubicacion");
				lectura = new Scanner(System.in);
				ubicacion = lectura.nextLine();
				System.out.println("Ingrese tipo de refaccion");
				lectura = new Scanner(System.in);
				tipo_refaccion = lectura.nextLine();
				System.out.println("Ingrese precio venta");
				lectura = new Scanner(System.in);
				precio_venta = lectura.nextFloat();
				System.out.println("Ingresar cantidad");
				lectura = new Scanner(System.in);
				cantidad = lectura.nextInt();
				System.out.println("Ingrese precio compra");
				lectura = new Scanner(System.in);
				precio_compra = lectura.nextFloat();
				ganancia = (precio_venta * cantidad) - (precio_compra * cantidad);

				// guardar
				ref = new Refaccionaria(nombre_Refaccionaria, ubicacion, tipo_refaccion, precio_venta, cantidad,
						precio_compra, ganancia);
				imp.guardar(ref);

				break;
			case 2:// buscar por indice
				imp.mostrarIndiceNombre();
				System.out.println("Ingrese el indice a buscar [ ]");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();
				// buscar
				ref = imp.buscarXindice(indice);
				System.out.println("Se encontro " + ref);

				break;
			case 3:// buscar por nombre
				imp.buscarXnombre();
				break;
			case 4:// buscar por ubicacion
				imp.buscarXubicacion();

				break;
			case 5:// editar
				imp.mostrarIndiceNombre();
				System.out.println("Ingrese el indice a editar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();

				// buscar
				ref = imp.buscarXindice(indice);
				System.out.println("Se encontro " + ref);
				do {
					System.out.println("Submenu");
					System.out.println("1--Nuevo nombre");
					System.out.println("2--precio de venta");
					System.out.println("3--regresar");
					lectura = new Scanner(System.in);
					subMenu = lectura.nextInt();

					switch (subMenu) {
					case 1:
						System.out.println("ingrese nuevo nombre");
						lectura = new Scanner(System.in);
						nombre_Refaccionaria = lectura.nextLine();
						// actualizacion
						ref.setNombre_Refaccionaria(nombre_Refaccionaria);
						imp.editar(indice, ref);
						System.out.println("se edito correctamente");
						break;
					case 2:
						System.out.println("ingrese nuevo precio de venta");
						lectura = new Scanner(System.in);
						precio_venta = lectura.nextFloat();
						// actualizacion
						ref.setPrecio_compra(precio_venta);
						imp.editar(indice, ref);
						System.out.println("se edito correctamente");
						break;
					case 3:
						System.out.println("Regresando a menu Refaccionaria");
						break;

					}

				} while (subMenu < 3);

				break;
			case 6:// eliminar por indice
				imp.mostrarIndiceNombre();

				System.out.println("Ingrese el indice  a eliminar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();
				imp.eliminarXindice(indice);
				break;
			case 7:// eliminar por nombre

				imp.eliminarXnombre();
				break;
			case 8:
				imp.listar();
				break;
			case 9:
				System.out.println("Saliendo");
				break;

			}// switch

		} while (menuPrincipal < 9);

	}

}
