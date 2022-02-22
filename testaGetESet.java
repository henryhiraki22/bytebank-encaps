
public class testaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337,24226);
		
		conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
		
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Paulo Silveira");
		
		conta.setTitular(cliente);	
		conta.getTitular().setProfissao("programador");
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		titularDaConta.setCpf("121212121212");
		
		
		
		
		System.out.println(titularDaConta.getNome());
		System.out.println(titularDaConta.getCpf());
	}
	
}
