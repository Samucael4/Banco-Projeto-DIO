package banco;

public class Main {

	public static void main(String[] args) {
		
		Cliente eu = new Cliente();
		eu.setNome("Eu");
		
		Conta cc = new ContaCorrente(eu);
		
		cc.depositar(2000);
		
		
		Conta cp = new ContaPoupanca(eu);
		
		cc.transferir(1500, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
