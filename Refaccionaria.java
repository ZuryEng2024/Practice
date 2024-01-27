
public class Refaccionaria {
	private String nombre_Refaccionaria;
	private String ubicacion;
	private String tipo_refaccion;
	private float precio_venta;
	private int cantidad;
	private float precio_compra;
	private float ganancia;
	
	
	//contructor vacio
	public Refaccionaria() {
	}

	//construcor con parametros
	public Refaccionaria(String nombre_Refaccionaria, String ubicacion, String tipo_refaccion, float precio_venta,
			int cantidad, float precio_compra, float ganancia) {
		this.nombre_Refaccionaria = nombre_Refaccionaria;
		this.ubicacion = ubicacion;
		this.tipo_refaccion = tipo_refaccion;
		this.precio_venta = precio_venta;
		this.cantidad = cantidad;
		this.precio_compra = precio_compra;
		this.ganancia = ganancia;
	}
	
	//to string
	@Override
	public String toString() {
		return "Refaccionaria [nombre_Refaccionaria=" + nombre_Refaccionaria + ", ubicacion=" + ubicacion
				+ ", tipo_refaccion=" + tipo_refaccion + ", precio_venta=" + precio_venta + ", cantidad=" + cantidad
				+ ", precio_compra=" + precio_compra + ", ganancia=" + ganancia + "]\n";
	}

	//Encapsulamiento
	public String getNombre_Refaccionaria() {
		return nombre_Refaccionaria;
	}

	public void setNombre_Refaccionaria(String nombre_Refaccionaria) {
		this.nombre_Refaccionaria = nombre_Refaccionaria;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTipo_refaccion() {
		return tipo_refaccion;
	}

	public void setTipo_refaccion(String tipo_refaccion) {
		this.tipo_refaccion = tipo_refaccion;
	}

	public float getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(float precio_venta) {
		this.precio_venta = precio_venta;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(float precio_compra) {
		this.precio_compra = precio_compra;
	}

	public float getGanancia() {
		return ganancia;
	}

	public void setGanancia(float ganancia) {
		this.ganancia = ganancia;
	}

		
	

}
