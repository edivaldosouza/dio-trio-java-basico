
public class Main {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta poupanca = new ContaPoupanca();
		Banco banco = new Banco();
		
		
		cc.depositar(300);
		banco.setNome("Banco do Brasil");
		banco.imprimirNome();
	
		cc.pagar_conta(30);
		
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
