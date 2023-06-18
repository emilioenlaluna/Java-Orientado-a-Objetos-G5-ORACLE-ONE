package Bank;

public class Funcionario {
	private String Id;
	private String Nombre;
	private String Apellido;
	private String Telefono;
	private char Sexo;
	private Direccion Direccion_ = new Direccion();
	private String Correo;
	private String Contraseña;
	private double Salario;
	//protected double salario; viisble para las clases hijas y en el mismo paquete
	private int Tipo = 0;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public char getSexo() {
		return Sexo;
	}

	public void setSexo(char sexo) {
		Sexo = sexo;
	}

	public Direccion getDireccion_() {
		return Direccion_;
	}

	public void setDireccion_(Direccion direccion_) {
		Direccion_ = direccion_;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	public double getSalario() {
		return Salario;
	}

	public double getBonificacion() {
		return this.Salario * .1;
	}

	public int getTipo() {
		return Tipo;
	}

	public void setTipo(int tipo) {
		Tipo = tipo;
	}
}
