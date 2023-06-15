package Cuenta;

public class CrearCuenta {
	public static void main(String[] args) {
		Cuenta objeto=new Cuenta();
		objeto.Saldo=1000;
		System.out.println(objeto.Saldo);
		
		Cuenta objeto2=new Cuenta();
		objeto2.Nombre="Emilio Luna";
		System.out.println(objeto2.Nombre);
	}
}
