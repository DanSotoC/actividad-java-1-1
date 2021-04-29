package paquete1;

public class Medicamento extends Producto{
	private boolean medicamento_formulado; //True agregar contradicciones
	private String contraindicaciones;
	private boolean generico;
	

	
	public Medicamento(String codigo, int precioBase, String nombre, 
			boolean medicamento_formulado, String contradicciones, boolean generico) {
		super(codigo, precioBase, nombre);
		this.medicamento_formulado = medicamento_formulado;
		this.contraindicaciones = contradicciones;
		this.generico = generico;
	}

	public void descontar(String dia) {
		if(this.generico) {
			if (dia.toLowerCase().equals("lunes")) { 
				this.setDescuento( (int)(this.getPrecioBase() *0.1));
			}
		}
	
	}
	
	public void recargar() {
		if(this.generico == false) {
				this.setRecargo((int)(this.getPrecioBase() *0.2));
		}
	}


	/////////getter & setters 
	
	public boolean isMedicamento_formulado() {
		return medicamento_formulado;
	}


	public void setMedicamento_formulado(boolean medicamento_formulado) {
		this.medicamento_formulado = medicamento_formulado;
	}


	public String getContradicciones() {
		return contraindicaciones;
	}


	public void setContradicciones(String contradicciones) {
		this.contraindicaciones = contradicciones;
	}


	public boolean isGenerico() {
		return generico;
	}


	public void setGenerico(boolean generico) {
		this.generico = generico;
	}

	
	
	
}

