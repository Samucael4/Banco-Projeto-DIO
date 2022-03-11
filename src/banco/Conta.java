package banco;

public abstract class Conta implements interfaceConta {
	
	protected int agencia;
	protected int numero;
	protected int saldo;
	protected Cliente cliente;
	
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUANCIALS = 1;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUANCIALS++;
		this.cliente = cliente;
		
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public int getSaldo() {
		return saldo;
	}

	public void sacar() {

	}

	public void depositar() {

	}

	public void transferir() {

	}
	
	protected void imprimirInfos() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %d", this.saldo));
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
}
