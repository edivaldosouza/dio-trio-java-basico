
public abstract class Conta implements IConta{
	protected int agencia;
	protected int numero;
	protected double saldo;
	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;
	
	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	
	
	@Override
	public void sacar(double valor) {
		saldo =  saldo - valor;
	}
	
	@Override
	public void depositar(double valor) {
		saldo = saldo + valor;	
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {	
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	@Override
	public void pagar_conta(double valor) {	
		this.sacar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
