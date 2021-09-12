package com.farmacia;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("-----Farmacia-----");
		//CREA OBJETOS PRODUCTOS
		Producto producto1 = new Producto("101", 2300.0, "desloratadina", true, false, 0 , "info1", "no tomar con antibioticos");
		Producto producto2 = new Producto("201", 6000.0, "suplemento vitamin", false, true, 10, "info_vitamina1", "no combinar");
		
		
		
		//AGREGAR PRODUCTOS EN UNA LISTA CON EL METODO RegistroProducto 
		RegistroProducto lista_productos = new RegistroProducto();
		lista_productos.agregarproducto(producto1);
		lista_productos.agregarproducto(producto2);
		
		
		
	
	}
	
	
}
