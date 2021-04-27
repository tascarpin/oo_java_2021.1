package bixos_exercicio;

public class Gato extends Felino {

	public Gato(int idade, double peso, double tamanho) {
		super(idade, peso, tamanho);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String fazerBarulho() {
		return "Gato fazendo barulho";
	}

	@Override
	public String comer() {
		return "Gato comendo";
	}

}
