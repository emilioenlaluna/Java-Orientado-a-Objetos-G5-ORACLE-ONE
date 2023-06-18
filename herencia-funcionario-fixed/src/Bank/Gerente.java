package Bank;

public class Gerente extends Funcionario {
	private String Clave="123456789";


	public boolean iniciarSesion(String clave) {
		return this.Clave==clave;
	}
	//SObrecarga
	public boolean iniciarSesion(String clave,String Correo) {
		return this.Clave==clave;
	}

	public void setClave(String clave) {
		Clave = clave;
	}
	
	//super acceder a la clase superior
	// super acceder a las funciones y metodos de la clase superior
	//sobre escritura del metodo
	public double getBonificacion() {
		return super.getSalario();
	}
	
	public double getBonificacionActual() {
		return super.getSalario()+super.getBonificacion();
	}
	
}
