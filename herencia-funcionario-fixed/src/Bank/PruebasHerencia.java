package Bank;

public class PruebasHerencia {
	public static void main(String[] args) {
		Gerente gerente=new Gerente();
		gerente.setNombre("Emilio Luna");
		gerente.setSalario(10000);
		gerente.setClave("12345");
		
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("12345"));
		System.out.println(gerente.getBonificacionActual());
	}
}
