package Cuenta;

public class ClientePruebasReferencias {
	public static void main(String[] args) {
		
		Cuenta cuenta=new Cuenta();
		Cliente cliente=new Cliente();
		
		//
		
		Cuenta cuentaEmilio=new Cuenta();
		cuentaEmilio.Titular=new Cliente();
		//cuentaEmilio.Titular.Nombre="EMilio Luna";
		//System.out.println(cuentaEmilio.Titular.Nombre);
	}
}
