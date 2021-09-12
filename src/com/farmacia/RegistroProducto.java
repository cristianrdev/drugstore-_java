package com.farmacia;
import java.util.ArrayList;

public class RegistroProducto {
	//ATRIBUTOS, los atributos pueden ser publicos o privados.
	private ArrayList<Producto> productos;

	
	//CONSTRUCTOR
	public RegistroProducto() {
		super();
		this.productos = new ArrayList<Producto>();
	}
	
	
	//METODO que guarda un producto en una lista
	public void agregarproducto(Producto producto) {
		this.productos.add(producto);
	}
	
	//MEDOTO que lista todos los productos
	
	public void listarproducto() {
		
	}	
	

	
	

	
	
	
	

	
	// geters y seters
}
