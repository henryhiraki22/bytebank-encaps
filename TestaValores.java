
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		Conta conta2 = new Conta(1337, 24226);
		
		int contaTotal = Conta.getTotal();
		
		System.out.println(contaTotal);
	}
}
