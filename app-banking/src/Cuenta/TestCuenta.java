package Cuenta;

public class TestCuenta {
	public static void main(String[] args) {
		Cuenta primeracuenta=new Cuenta();
		primeracuenta.Agencia=7;
		primeracuenta.Nombre="Cesar M";
		//primeracuenta.Saldo=7833.5;
		Cuenta segundacuenta=new Cuenta();
		segundacuenta=primeracuenta;
		//System.out.println(primeracuenta.Saldo);
		//System.out.println(segundacuenta.Saldo);
		
		//segundacuenta.Saldo+=78.3;
		System.out.println("---------------");
		//System.out.println(primeracuenta.Saldo);
		//System.out.println(segundacuenta.Saldo);
		System.out.println("---------------");
		System.out.println(primeracuenta);
		System.out.println(segundacuenta);
		
	}
}
