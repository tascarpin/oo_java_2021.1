package classe_objeto;

public class Executa {

	public static void main(String[] args) {
		
// Falar dos contrutores - OK
// Falar da atribuição em variaveis de tipos diferentes 		
		
//		ContaCorrente cc = new ContaCorrente();	
//		System.out.println(cc.saldo);
		
//		ContaCorrente cc = new ContaCorrente();
//		System.out.println(cc.cliente);
//		System.out.println(cc.numero);
//		cc.cpf = "123456789";
//		System.out.println(cc.cpf);
		
//		ContaCorrente cc = new ContaCorrente();
//		cc.setCpf("123456789");
//		System.out.println(cc.getCpf());
		
		
//		ContaJuridica cj = new ContaJuridica();
//		cj.setCnpj("123456789/0001-99");
//		System.out.println(cj.getCnpj());
		
		
//		Conta conta = new Conta("Tassio", "12345-6");
//		conta.setNome("Tassio carneiro");
//		System.out.println(conta.getNome());
		
		
		
		ContaCorrente cc = new ContaCorrente("Tassio", "12345-6", "123456789");
//		cc.setCpf("12345678-99");
//		System.out.println("Nome do cliente: " + cc.getNome());
//		System.out.println("Numero de CPF: " + cc.getCpf());
//		System.out.println("Numero da conta: " + cc.getNumero());
//		cc.setSaldo(100.00f);
//		cc.setLimite(1000);
//		System.out.println("Saldo: " + cc.getSaldo());
//		System.out.println("Limite: " + cc.getLimite());
			
		System.out.println(cc.funcaoQualquer3("Tassio", 38));
		
//		ContaJuridica cj = new ContaJuridica("Tassio", "12345-6", "123456789/0001-99");
//		System.out.println(cj.getCnpj());
//		cj.setCnpj("123456789/0001-00");
//		System.out.println(cj.getCnpj());
		
		

	}

}
