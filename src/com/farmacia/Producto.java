package com.farmacia;

public class Producto {
	//atributos, los atributos pueden ser publicos o privados.
	/**                      -Formulado
	 *          -medicamento  
	                         -No formulado
	 Producto-- 
	 
	 * 			-suplemento 
	 * 
	 * 
	 **/
	private String codigo;
	private Double precioBase;
	private String nombre;
	private Boolean generico;
	private Boolean suplemento; 
	private Integer cantidaVitaminas;
	private String informacionVitaminas;
	private String contraindicaciones;
	
	//constructores
	public Producto(String codigo, Double precioBase, String nombre, Boolean generico, Boolean suplemento,
			Integer cantidaVitaminas, String string, String string2) {
		super();
		this.codigo = codigo;
		this.precioBase = precioBase;
		this.nombre = nombre;
		this.generico = generico;
		this.suplemento = suplemento;
		this.cantidaVitaminas = cantidaVitaminas;
		this.informacionVitaminas = string;
		this.contraindicaciones = string2;
	}
	
	
	
	
	// geters y seters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(Double precioBase) {
		this.precioBase = precioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getGenerico() {
		return generico;
	}

	public void setGenerico(Boolean generico) {
		this.generico = generico;
	}

	public Integer getCantidaVitaminas() {
		return cantidaVitaminas;
	}

	public void setCantidaVitaminas(Integer cantidaVitaminas) {
		this.cantidaVitaminas = cantidaVitaminas;
	}

	public String getInformacionVitaminas() {
		return informacionVitaminas;
	}

	public void setInformacionVitaminas(String informacionVitaminas) {
		this.informacionVitaminas = informacionVitaminas;
	}

	public String getContraindicaciones() {
		return contraindicaciones;
	}

	public void setContraindicaciones(String contraindicaciones) {
		this.contraindicaciones = contraindicaciones;
	}


	
	//TO STRING
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", precioBase=" + precioBase + ", nombre=" + nombre + ", generico="
				+ generico + ", suplemento=" + suplemento + ", cantidaVitaminas=" + cantidaVitaminas
				+ ", informacionVitaminas=" + informacionVitaminas + ", contraindicaciones=" + contraindicaciones + "]";
	}
	
	
	//METODOS--------------
	

	
	public Double Recargar(Producto producto) {
		double recargo = 1;
		
		producto.getPrecioBase();
		if(producto.generico== true) {
			System.out.println("Medicamento gen?rico sin recargo");
		}
		
		if(producto.generico == false && producto.suplemento == false) {
			recargo = 1.2;
			System.out.println("Recargo 20% de medicamento NO GENERICO " + recargo);
			
		}
		
		if(producto.suplemento == true) {
			recargo = 0.02 * producto.cantidaVitaminas;
			System.out.println("Recargo "+ recargo*100 +"% en suplementos por contener " + producto.cantidaVitaminas + " vitaminas");
			recargo = (1+recargo);
		}
		
		
		
		return (recargo);
	}
	
	public void Totalizar(int num) {
		System.out.println("");
		System.out.println("----------TOTALIZANDO---------");
		System.out.println("Precio Base de " + this.nombre +" ==>" + this.precioBase);
		System.out.println("Precio Totalizado " + this.nombre +   " x (" + num + ") ==>"  + this.precioBase*num*this.Recargar(this));
	
	}
	
	
	
	
	
	
	
	
	
	
	

}
