package fgabank;

public class ContaCorrente extends Conta{
	
	private double limite;
	private double saldoTotal;
	
	
	public ContaCorrente() {
		this.limite = 500.0;
	}
	
	@Override
	public boolean sacar(double valor){
		if(valor > 0 && saldo >= valor) {
			saldo -= valor;
			return true;
		}else if(valor <= (saldo+limite)){
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	@Override
	public boolean transferir(double valor, Conta destinatario) {
		double saldoTotal = saldo + limite;
		if(valor > 0 && saldoTotal >= valor) {
			saldoTotal -= valor;
			destinatario.depositar(valor);
			return true;
		}
		return false;
	}
	
	public double getLimite() {
		return this.limite;
	}
	
	public double getSaldoTotal() {
		this.saldoTotal = super.saldo + this.limite;
		return saldoTotal;
	}

}
