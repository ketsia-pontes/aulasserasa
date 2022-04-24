package fgabank;

public class Conta {
	
	private int agencia;
	private int conta;
	private double saldo;
	private String titular;
	
	
	public Conta() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Conta(int agencia, int conta, String titular) {
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
		if(saldo > 0 && saldo >= valor) {
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
	public String gettitular() {
		return titular;
	}
	public void settitular(String titular) {
		this.titular = titular;
	}
	
	

}
