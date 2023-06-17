package Cuenta;

public class Encapsulamiento {
	public static void main(String[] args) {
		Cuenta cuenta=new Cuenta();
		cuenta.setNombre("Diego");
		Cliente cliente =new Cliente();
		cliente.setDireccion("fjdsiofjsdofjdo");
		cliente.setEdad(78);
		cliente.setNombre("Emilio");
		cuenta.setTitular(cliente);
		
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());;
	}
}
