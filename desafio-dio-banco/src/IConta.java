
public interface IConta {
	void sacar(double valor);
	void depositar(double valor);
	void transferir(double valor, Conta contaDestino);
	void pagar_conta(double valor);
	void imprimirExtrato();
}
