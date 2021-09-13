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
	
	//METODO que lista todos los productos
	public void listarproducto() {

		for(int i = 0 ; i<this.productos.size();i++) {
			Producto producto = this.productos.get(i); //obtiene el objeto según su índice
			if(producto.getPrecioBase()>10000) {
				System.out.print("mayor a $10.000" + "==>  ");
				
			}
			else {
				System.out.print("menor a $10.000" + "==>  ");
			}
			System.out.println(producto.getCodigo() + " / "+ producto.getNombre() + " / " + producto.getPrecioBase()); //imprime el objeto seleccionado
			
		}
	}	
	
	//METODO que elimina producto cuyo precio es menor a $2.000
	public void eliminaproducto() {
		for(int i = 0 ; i<this.productos.size();i++) {
			Producto producto = this.productos.get(i); //obtiene el objeto según su índice
			if(producto.getPrecioBase()<2000) {
				System.out.println();
				System.out.print("Este producto será eliminado ==> ");
				System.out.println(producto.getCodigo() + " / "+ producto.getNombre() + " / " + producto.getPrecioBase()); //imprime el objeto seleccionado	
				this.productos.remove(producto); 
			}
		}
		System.out.println("-------Listado actualizado-------");
	this.listarproducto();
	}

	
	

	
	
	
	

	
	// geters y seters
}
