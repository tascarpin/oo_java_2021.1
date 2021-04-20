package classe_objeto;

public class ContaJuridica extends Conta{
	
	private String cnpj;	
	
	public ContaJuridica(String nome, String numero, String cnpj) {
		super(nome, numero);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
		
	//Sobrescrita de m�todo concreto
	public String funcaoQualquer(String str, int x) {
		return "Funcao qualquer";
	}

	//Sobrescrito de m�todo abstrato
	@Override
	public String funcaoQualquer2() {
		return "Conta jur�dica";
	}
	
}
