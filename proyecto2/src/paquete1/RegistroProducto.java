package paquete1;
import java.util.ArrayList;

public class RegistroProducto{
private ArrayList<Producto> listaProductos = new ArrayList<Producto>();
	
	public RegistroProducto() {}; // constructor registro vacio
	
	
	//TODO metodo agregar producto
	
	public void agregarProducto(Producto producto) {
		boolean isFound = false;
		
		for(Producto productoLista : this.listaProductos) {
			if(productoLista.getCodigo()==producto.getCodigo()) {
				isFound = true;
				break;
				
			}
		}
		if(!isFound) {
		this.listaProductos.add(producto);
		}
	};
	
	
	
	//TODO metodo listar todos los productos
	
	public void listarProductos() {
		System.out.println(" ---- Listado de Productos ---- ");
		for(Producto producto : this.listaProductos) {
			if(producto.getPrecioBase()>10000) {
				System.out.println(producto.getNombre() + " $" + producto.getPrecioBase());		
			}
			
		}
		System.out.println(" ---- Fin Listado de Productos ---- ");
	}
	
	
	//TODO metodo eliminar todos los productos y listar cantidad eliminado
	
	public void eliminarProductos() {
		int counter = 0;
		
		for(int i=0; i< this.listaProductos.size(); i++) {
			if(this.listaProductos.get(i).getPrecioBase()<2000) {
				this.listaProductos.remove(i);
				counter++;
				i=0;
				
			}
			
		}
		System.out.println("se eliminaron " +counter+ " productos");
		
	}

//getters and setters
	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}


	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	

	
	

}
