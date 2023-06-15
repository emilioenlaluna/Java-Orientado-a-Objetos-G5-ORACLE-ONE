package Cuenta;

public class Metodos {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		cuenta.Saldo=300;
		cuenta.depositar(100);
		System.out.println(cuenta.Saldo);
		cuenta.retirar(100);
		System.out.println(cuenta.Saldo);
		//trasnferir
		Cuenta cuentajimena=new Cuenta();
		cuentajimena.depositar(8000);
		System.out.println(cuentajimena.Saldo);
		
		cuentajimena.transferir(400,cuenta);
		System.out.println(cuentajimena.Saldo);
		System.out.println(cuenta.Saldo);
		if(cuentajimena.transferir(400,cuenta)) {
			System.out.println("Tranferencia exitosa");
		}
	}
}
