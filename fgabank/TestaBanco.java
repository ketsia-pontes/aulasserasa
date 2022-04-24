package fgabank;

public class TestaBanco {
	
	public static void main(String[] args) {
		
//quando a classe pessoa estava sem metodos get/set (todos os atributos sendo publicos)
		
//		Pessoa pessoaNumero1 = new Pessoa();
//		pessoaNumero1.nome = "Jose das Couves";
//		pessoaNumero1.profissao = "Agricultor";
//		pessoaNumero1.cpf = "643.829.641-48";
//		
//		System.out.println("Nome: " + pessoaNumero1.nome);
//		System.out.println("Profissao: " + pessoaNumero1.profissao);
//		System.out.println("CPF: " + pessoaNumero1.cpf);
//		
//		
//		Pessoa pessoaNumero2 = pessoaNumero1;
//		pessoaNumero2.nome = "Joao dos Tomates";
//		
//		System.out.println("Nome: " + pessoaNumero2.nome);


//Testando classe configurada com get/set		
		
//		Pessoa pessoaNova = new Pessoa();
//		pessoaNova.setNome("Jose das Couves");
//		System.out.println("Nome: " + pessoaNova.getNome());
//		
//		Pessoa pessoaComConstrutor1 = new Pessoa("Joao dos Tomates", "259.800.966-55", "123456-78");
//		
//		System.out.println("Nome: " + pessoaComConstrutor1.getNome());
//		System.out.println("Nome: " + pessoaComConstrutor1.getCpf());
//		System.out.println("Nome: " + pessoaComConstrutor1.getRg());
		
		PessoaFisica pfKetsia = new PessoaFisica();
		pfKetsia.setNome("Ketsia Pontes");
		pfKetsia.setEmail("ketsiapontes@yhoo.com.br");
		pfKetsia.setTelefone("99988855");
		pfKetsia.setCpf("879.359.983-88");
		pfKetsia.setProfissao("Economista");
		pfKetsia.setRg("12345678-9");

		
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setConta(7889);
//		conta1.setSaldo(1000.5); >> nao se deve mapear diretamente essa info porque é variável (muda com o extrato). Portanto, só pode ser exibida
		conta1.settitular(pfKetsia);
		
		conta1.depositar(100.0);
		
		System.out.println("Agencia: " + conta1.getAgencia());
		System.out.println("Conta: " + conta1.getConta());
		System.out.println("Titular: " + conta1.gettitular().getNome());
		System.out.printf("Saldo Atual: R$ %.2f\n", conta1.getSaldo());
		
		
		if(conta1.sacar(20.0)) {
			System.out.println("Saque efetuado com sucesso");
		} else {
			System.out.println("Verifique o valor do saque");
		}
		
		System.out.printf("Saldo Atual: R$ %.2f\n", conta1.getSaldo());
	
		
		PessoaFisica pfAngelo = new PessoaFisica();
		pfAngelo.setNome("Angelo");
		pfAngelo.setEmail("angelo@yhoo.com.br");
		pfAngelo.setTelefone("99986895");
		pfAngelo.setCpf("859.309.983-08");
		pfAngelo.setProfissao("Advogado");
		pfAngelo.setRg("98765432-9");
		
		Conta conta2 = new Conta();
		conta2.setAgencia(5582);
		conta2.setConta(2234);
		conta2.settitular(pfAngelo);
		
		conta1.transferir(50, conta2);
		System.out.println("Saldo Atual Ketsia: " + conta1.getSaldo());
		System.out.println("Saldo Atual Angelo: " + conta2.getSaldo());
		
		
		ContaCorrente cc1 = new ContaCorrente();
		cc1.depositar(1000);
		System.out.println("Saldo: "+cc1.getSaldo());
		System.out.println("Limite "+cc1.getLimite());
		System.out.println("Saldo Total: "+cc1.getSaldoTotal());
		
		cc1.sacar(1500);
		System.out.println("Saldo: "+cc1.getSaldo());
		System.out.println("Limite "+cc1.getLimite());
		System.out.println("Saldo Total: "+cc1.getSaldoTotal());
	
	}

}
