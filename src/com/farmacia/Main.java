package com.farmacia;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("-----Farmacia-----");
		//CREA OBJETOS PRODUCTOS
		Producto producto1 = new Producto("101", 3500.0, "desloratadina", true, false, 0 , "info1", "no tomar con antibioticos");
		Producto producto2 = new Producto("201", 12000.0, "suplemento vitamin", false, true, 10, "info_vitamina1", "no combinar");
		Producto producto3 = new Producto("102", 8500.0, "Antibiotico1", false, false, 0, "na", "no combinar");
		Producto producto4 = new Producto("202", 21000.0, "Suplemento power life", false, true, 9, "muchas vitaminas", "contraindicaciones");
		
		Producto producto5 = new Producto("101", 9000.0, "antibiotico", false, false, 0, "antibiotico efectivo", "ninguna");
		
		
		//CREA EL OBJETO RegistroProductos
		RegistroProducto lista_productos = new RegistroProducto();
		
		//AGREGAR PRODUCTOS AL OBJETO lista_productos EN UNA LISTA CON EL METODO RegistroProducto 
		lista_productos.agregarproducto(producto1);
		lista_productos.agregarproducto(producto2);
		lista_productos.agregarproducto(producto3);
		lista_productos.agregarproducto(producto4);
		lista_productos.agregarproducto(producto5);
		
		//LISTA PRODUCTOS MAYOR A 10.000
		lista_productos.listarproducto();
		//ELIMINA PRODUCTOS MENOR A 2000
		lista_productos.eliminaproducto();
		

		//TOTALIZANDO 2 UNIDADES DEL PRODUCTO2
		producto1.Totalizar(1);
		producto2.Totalizar(1);
		producto3.Totalizar(1);
		producto4.Totalizar(1);
	
		
	
	}
	
	
}
