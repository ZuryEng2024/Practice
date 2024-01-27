import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Implementacion implements Metodos {

	List<Refaccionaria> lista = new ArrayList<Refaccionaria>();

	@Override
	public void guardar(Refaccionaria obj) {
		// TODO Auto-generated method stub
		boolean estatus = false;
		int contador = 0;
		for (Refaccionaria r : lista) {
			if (r.getNombre_Refaccionaria().equals(obj.getNombre_Refaccionaria())) {
				System.out.println("Este nombre ya existe");
				estatus = true;
			} // if

			contador++;
		} // for
		if (estatus == false) {
			lista.add(obj);
			System.out.println("Se guardo correctamente");
		}

	}

	@Override
	public void editar(int indice, Refaccionaria obj) {
		// TODO Auto-generated method stub
		lista.set(indice, obj);
	}

	@Override
	public void eliminarXindice(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

	@Override
	public Refaccionaria buscarXindice(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		System.out.println(lista);
	}

	//// Metodos personalizados

	public void mostrarIndiceNombre() {
		System.out.println("Registros de la lista");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("[" + i + "]" + lista.get(i).getNombre_Refaccionaria());
		}
	}

	// buscar por nombre
	public void buscarXnombre() {
		System.out.println(" ");
		System.out.println("ingrese el nombre a buscar");
		Scanner lectura = null;
		lectura = new Scanner(System.in);
		boolean status = false;
		int contador = 0;
		String nombre = lectura.nextLine();
		for (Refaccionaria r : lista) {

			if (r.getNombre_Refaccionaria().equals(nombre)) {
				System.out.println("Existe--> " + r);
				status = true;
			}
			contador++;
		}
		if (status == false) {
			System.out.println(" El producto no  existe");

		}
		
	}

	// buscar por ubicacion
	public void buscarXubicacion() {
		System.out.println(" ");
		System.out.println("ingrese la ubicacion");
		Scanner lectura = null;
		lectura = new Scanner(System.in);
		boolean status = false;
		int contador = 0;
		String ubicacion = lectura.nextLine();
		for (Refaccionaria r : lista) {
			if (r.getUbicacion().equals(ubicacion)) {
				System.out.println("Existe--> " + r);
				status = true;
			}
			contador++;
			if (status == false) {
				System.out.println(" El producto no  existe");
			}

		}
		
	}

	// eliminar por nombre
	public void eliminarXnombre() {

		try {
			Scanner lectura = null;
			System.out.println(" ");
			System.out.println("ingrese el nombre a eliminar");
			lectura = new Scanner(System.in);
			String nombre = lectura.nextLine();

			boolean statuss = false;
			int contador = 0;
			for (Refaccionaria r : lista) {
				if (r.getNombre_Refaccionaria().equals(nombre)) {
					lista.remove(contador);
					System.out.println("Se elimino correctamente");
					statuss = true;
				}
				contador++;
			}
			if (statuss == false) {
				System.out.println(" El producto no  existe");
			}
			System.out.println("elige uno de la lista--> " + lista);

		} catch (Exception e) {
			// handle exception
		}
	}

}
