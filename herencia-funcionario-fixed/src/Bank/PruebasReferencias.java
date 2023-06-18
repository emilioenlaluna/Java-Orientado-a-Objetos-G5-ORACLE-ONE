package Bank;

public class PruebasReferencias {
	public static void main(String[] args) {		
		
		Funcionario funcionario=new Funcionario();
		funcionario.setSalario(3000);
		
		
		Gerente g1 = new Gerente();
        g1.setNombre("Marcos");
        g1.setSalario(5000.0);

        Contador ev = new Contador();
        ev.setSalario(2500.0);

   

        ControlBonificaciones controle = new ControlBonificaciones();
        controle.registrar(g1);
        controle.registrar(ev);
        controle.registrar(funcionario);
  

        System.out.println(controle.getSuma());
		
	}
}
