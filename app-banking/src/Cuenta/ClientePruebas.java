package Cuenta;

public class ClientePruebas {
	public static void main(String[] args) {
		Cliente cliente=new Cliente();
		//cliente.Nombre="Diego";
		//cliente.Documento="";
		//cliente.Telefono="78949";
		
		Cuenta cuenta =new Cuenta();
		
		cuenta.Titular=cliente;
		
		//System.out.println(cuenta.Titular.Nombre);
		System.out.println(cliente);
		System.out.println(cuenta.Titular);
		
	}
}
