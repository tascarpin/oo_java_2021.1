package bixos_exercicio;

abstract class Canino extends Animal {

	protected Canino(int idade, double peso, double tamanho) {
		super(idade, peso, tamanho);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String vaguear() {
		return "Canino vagueiando";
	}

}
