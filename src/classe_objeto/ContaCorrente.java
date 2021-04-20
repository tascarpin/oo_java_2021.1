package classe_objeto;

public class ContaCorrente extends Conta {

	private String cpf;
	
	public ContaCorrente(String nome, String numero, String cpf) {
		super(nome, numero);
//		setNome(nome);
//		setNumero(numero);
//		this.nome = nome;
//		this.numero = numero;
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	//Sobrescrita de método concreto
	public String funcaoQualquer(String str, int x) {
		return "Funcao qualquer";
	}
	
	//Sobrescrito de método abstrato
	@Override
	public String funcaoQualquer2() {
		return "Conta corrente";
	}
	
	public boolean funcaoQualquer3(String str) {
		return true;
	}
	
	//Sobrecarga do método funcaoQualquer3
	public String funcaoQualquer3(String str, int x) {
		return "Funcao qualquer 3";
	}
		
}
