package paquete1;

public class Suplemento extends Producto{
	private int cantidadVitaminas;
    private String informacionVitaminas;
	
    public Suplemento(String codigo, int precioBase, String nombre,
			int cantidadVitaminas, String informacionVitaminas) {
		super(codigo, precioBase, nombre);
		this.cantidadVitaminas = cantidadVitaminas;
		this.informacionVitaminas = informacionVitaminas;
	}
    

	public void descontar(String dia) {
			if (dia.toLowerCase().equals("lunes")) { 
				this.setDescuento( (int)(this.getPrecioBase() *0.1));
			}
	}

	
	public void recargar() {
			
		this.setRecargo( (int)((this.cantidadVitaminas*0.02) * this.getPrecioBase()) );

	}

	/////////// Getters & Setters 

	public int getCantidadVitaminas() {
		return cantidadVitaminas;
	}


	public void setCantidadVitaminas(int cantidadVitaminas) {
		this.cantidadVitaminas = cantidadVitaminas;
	}


	public String getInformacionVitaminas() {
		return informacionVitaminas;
	}


	public void setInformacionVitaminas(String informacionVitaminas) {
		this.informacionVitaminas = informacionVitaminas;
	}
	
	
	
	
}

