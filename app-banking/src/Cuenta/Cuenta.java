package Cuenta;

public class Cuenta {
	double Saldo = 0;
	int Agencia;
	int Numero;
	String Nombre;

	public void depositar(double Cantidad) {
		this.Saldo += Cantidad;
	}

	public boolean retirar(double Cantidad) {
		if (this.Saldo > Cantidad) {
			this.Saldo-=Cantidad;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean transferir(double Cantidad,Cuenta cuenta) {
		if(this.Saldo>Cantidad) {
			this.Saldo-=Cantidad;
			//cuenta.Saldo+=Cantidad;
			cuenta.depositar(Cantidad);
			return true;
		}else {
			return false;
		}

	}
}
