package paquete1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegistroProducto coleccion =  new RegistroProducto();
        Medicamento med0 = new Medicamento("01",50000,"paracetamol",false,"contraindicaciones",false);
        Medicamento med1 = new Medicamento ("02",1500,"ibuprofeno",false,"sin",true);
        Suplemento sup1 = new Suplemento("03",1200,"Ensure",1,"Alto en vitaminas");
        Suplemento sup2 = new Suplemento("04",18000,"Ensure Advance",15,"Alto en vitaminas A,B,C y D");
        coleccion.agregarProducto(med0);
        med0.descontar("lunes");
        med0.recargar();
        med0.totalizar();
        
        coleccion.agregarProducto(med1);
        coleccion.agregarProducto(sup1);
        coleccion.agregarProducto(sup2);
        
        coleccion.listarProductos();
        coleccion.eliminarProductos();
        
	}
	
}
