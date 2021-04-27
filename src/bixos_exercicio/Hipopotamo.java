package bixos_exercicio;

public class Hipopotamo extends Animal {

	public Hipopotamo(int idade, double peso, double tamanho) {
		super(idade, peso, tamanho);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String fazerBarulho() {
		return "Hipopotamo fazendo barulho";
	}

	@Override
	public String comer() {
		return "Hipopotamo comendo";
	}

	@Override
	public String vaguear() {
		return "Hipopotamo vagueiando";
	}	

}
