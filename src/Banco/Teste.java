package Banco;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario nico = new Funcionario();
        nico.setNome("Nico Steppat");
        nico.setCpf("223355646-9");
        nico.setSalario(2600.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

	}

}
