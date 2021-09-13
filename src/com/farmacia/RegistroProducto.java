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
	
	
	//METODO que guarda un producto en una lista (NO SE DEBE REPETIR EL CODIGO DE PRODUCTO!!)
	public void agregarproducto(Producto producto) {
		boolean existe = false;
		int i = 0;
		String id_buscado = producto.getCodigo();
		
		for (i= 0; i<this.productos.size(); i++) {		
			//System.out.println("EL CODIGO BUSCADO" + id_buscado + "/"+ this.productos.get(i).getCodigo());	
			if(this.productos.get(i).getCodigo().equals(id_buscado)) {
				existe = true;
			}
		}
		if(existe == false) {
			this.productos.add(producto);
		} else {
			System.out.println("El codigo " +  producto.getCodigo() + " con el nombre "+ producto.getNombre() + " ya existe!!");
		}
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
		System.out.println("Eliminando productos < $2.000");
		this.productos.removeIf(e -> e.getPrecioBase()<2000);
		/**for(int i = 0 ; i<this.productos.size();i++) {
			Producto producto = this.productos.get(i); //obtiene el objeto según su índice
			if(producto.getPrecioBase()<2000) {
				System.out.println();
				System.out.print("Este producto <$2.000 será eliminado ==> ");
				System.out.println(producto.getCodigo() + " / "+ producto.getNombre() + " / " + producto.getPrecioBase()); //imprime el objeto seleccionado	
				this.productos.remove(producto); 
			}
		}

		**/
		System.out.println("-------Listado actualizado-------");
		this.listarproducto();
	}
	
	

	
	// geters y seters
}
