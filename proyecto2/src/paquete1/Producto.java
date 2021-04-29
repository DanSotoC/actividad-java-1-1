package paquete1;

public abstract class Producto {
	 private String codigo;
	 private int precioBase;
	 private String nombre; //Validar min de 3 caracteres
	 private int descuento=0;
	 private int recargo=0;
	 	
	 public Producto(String codigo, int precioBase, String nombre) {
         super();
         this.codigo = codigo;
         if (nombre.length() < 3) {
			throw new ArithmeticException("El nombre debe tener al menos 3 caracteres"); 
         } else {
			this.nombre = nombre;
         }
         // Validar precio mayor a 0
         if (precioBase <= 0) {
			throw new ArithmeticException("El precio debe ser positivo"); 
         } else {
			this.precioBase = precioBase;
         }
	 }

	 public abstract void descontar(String dia);
	    
     public abstract void recargar();

     public void totalizar() {
		 float resultado;
		 resultado = this.recargo + this.precioBase - this.descuento;
		 System.out.println("El valor total a pagar es: $" + resultado + " por "+ this.nombre);	 
	 }

	public String getCodigo() {
		return codigo;
	}

	public int getRecargo() {
		return recargo;
	}

	public void setRecargo(int recargo) {
		this.recargo = recargo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}


	public String mostrar() {
		return "Producto [codigo=" + codigo + ", precioBase=" + precioBase + ", nombre=" + nombre + ", descuento="
				+ descuento + ", recargo=" + recargo + "]";
	};
	 
	
}
