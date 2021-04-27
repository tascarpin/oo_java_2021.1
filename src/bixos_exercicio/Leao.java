package bixos_exercicio;

public class Leao extends Felino {

	public Leao(int idade, double peso, double tamanho) {
		super(idade, peso, tamanho);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String fazerBarulho() {
		return "Leao fazendo barulho";
	}

	@Override
	public String comer() {
		return "Leao comendo";
	}

	@Override
	public String toString() {
		return "Leao com atributos que se seguem: idade=" + idade + ", peso=" + peso + ", tamanho=" + tamanho + "]";
	}

	
	
}
