package classe_objeto;

abstract class Conta {

	private String nome, numero ;
	private float saldo, limite;
	
	protected Conta(String nome, String numero) {
		this.nome = nome;
		this.numero = numero;
	}

	protected String getNumero() {
		return numero;
	}

	protected void setNumero(String numero) {
		this.numero = numero;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public String funcaoQualquer(String str, int x) {
		return "Conta";
	}
	
	public abstract String funcaoQualquer2();
		
}
