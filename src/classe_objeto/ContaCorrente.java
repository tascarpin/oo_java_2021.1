package classe_objeto;

public class ContaCorrente extends Conta {

	private String cpf;
	
	public ContaCorrente(String nome, String numero, String cpf) {
		super(nome, numero);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
