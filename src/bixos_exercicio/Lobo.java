package bixos_exercicio;

public class Lobo extends Canino {

	public Lobo(int idade, double peso, double tamanho) {
		super(idade, peso, tamanho);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String fazerBarulho() {
		return "Lobo fazendo barulho";
	}

	@Override
	public String comer() {
		return "Lobo comendo";
	}

}
