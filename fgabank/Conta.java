package fgabank;

public class Conta {
	
	private int agencia;
	private int conta;
	protected double saldo;
	private PessoaHeranca titular;
	
	
	public Conta() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Conta(int agencia, int conta, PessoaHeranca titular) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		this.saldo = 0;
	}
	
	
	//metodos
	
	public void depositar(double valor) {
		if(valor>0) {
			saldo += valor;
		}	
	}
	
	public boolean sacar(double valor) {
		if(valor > 0 && saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transferir(double valor, Conta destinatario) {
		if(valor > 0 && saldo >= valor) {
			saldo -= valor;
			destinatario.depositar(valor);
			return true;
		}
		return false;
	}



	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public PessoaHeranca gettitular() {
		return titular;
	}
	public void settitular(PessoaHeranca titular) {
		this.titular = titular;
	}
	
	

}
