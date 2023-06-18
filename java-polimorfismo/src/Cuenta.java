
public class Cuenta {
	private String FechaCreacion;
	private double Saldo;
	private String NIP;
	private String IdCuenta;
	Cliente Titular = new Cliente();
	private static int Total;

	public Cuenta() {
		this.Total += 1;
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

	public String getFechaCreacion() {
		return FechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		FechaCreacion = fechaCreacion;
	}

	public String getNIP() {
		return NIP;
	}

	public void setNIP(String nIP) {
		NIP = nIP;
	}

	public String getIdCuenta() {
		return IdCuenta;
	}

	public void setIdCuenta(String idCuenta) {
		IdCuenta = idCuenta;
	}

	public Cliente getTitular() {
		return Titular;
	}

	public void setTitular(Cliente titular) {
		Titular = titular;
	}

	public static int getTotal() {
		return Cuenta.Total;
	}

}
