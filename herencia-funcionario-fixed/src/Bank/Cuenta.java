package Bank;

public class Cuenta {
	private double Saldo = 0;
	int Agencia;
	int Numero;
	String Nombre;
	Cliente Titular = new Cliente();

	private static int total;

	public Cuenta(int Agencia,int Numero) {
		this.Agencia = Agencia;
		this.Numero=Numero;
	}

	public void depositar(double Cantidad) {
		this.Saldo += Cantidad;
	}

	public boolean retirar(double Cantidad) {
		if (this.Saldo > Cantidad) {
			this.Saldo -= Cantidad;
			return true;
		} else {
			return false;
		}
	}

	public boolean transferir(double Cantidad, Cuenta cuenta) {
		if (this.Saldo > Cantidad) {
			this.Saldo -= Cantidad;
			cuenta.depositar(Cantidad);
			return true;
		} else {
			return false;
		}

	}

	public double obtenerSaldo() {
		return this.Saldo;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int Numero) {
		this.Numero = Numero;
	}

	public void setAgencia(int agencia) {
		Agencia = agencia;
	}

	public int getAgencia() {
		return this.Agencia;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setTitular(Cliente titular) {
		Titular = titular;
	}

	public Cliente getTitular() {
		return Titular;
	}

	public static int getTotal() {
		return Cuenta.total;
	}

}
