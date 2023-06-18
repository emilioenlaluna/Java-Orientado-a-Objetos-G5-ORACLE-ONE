package Funcionario;

public class PruebasFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNombre("Emilio");
		funcionario.setSalario(2000.2);

		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.getBonificacion());
	}
}
