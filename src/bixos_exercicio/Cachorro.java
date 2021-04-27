package bixos_exercicio;

public class Cachorro extends Canino {

	public Cachorro(int idade, double peso, double tamanho) {
		super(idade, peso, tamanho);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String fazerBarulho() {
		return "Cachorro fazendo barulho";
	}

	@Override
	public String comer() {
		return "Cachorro comendo";
	}

}
