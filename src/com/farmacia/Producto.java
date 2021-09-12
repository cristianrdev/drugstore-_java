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
	 */
	private String codigo;
	private float precioBase;
	private String nombre;
	private Boolean generico;
	private Boolean suplemento; 
	private Integer cantidaVitaminas;
	private char informacionVitaminas;
	private char contraindicaciones;
	
	//constructores

	public Producto(String codigo, float precioBase, String nombre, Boolean generico, Boolean suplemento,
			Integer cantidaVitaminas, char informacionVitaminas, char contraindicaciones) {
		super();
		this.codigo = codigo;
		this.precioBase = precioBase;
		this.nombre = nombre;
		this.generico = generico;
		this.suplemento = suplemento;
		this.cantidaVitaminas = cantidaVitaminas;
		this.informacionVitaminas = informacionVitaminas;
		this.contraindicaciones = contraindicaciones;
	}
	
	
	// geters y seters

	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
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

	public char getInformacionVitaminas() {
		return informacionVitaminas;
	}

	public void setInformacionVitaminas(char informacionVitaminas) {
		this.informacionVitaminas = informacionVitaminas;
	}

	public char getContraindicaciones() {
		return contraindicaciones;
	}

	public void setContraindicaciones(char contraindicaciones) {
		this.contraindicaciones = contraindicaciones;
	}


	
	//TO STRING
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", precioBase=" + precioBase + ", nombre=" + nombre + ", generico="
				+ generico + ", suplemento=" + suplemento + ", cantidaVitaminas=" + cantidaVitaminas
				+ ", informacionVitaminas=" + informacionVitaminas + ", contraindicaciones=" + contraindicaciones + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
