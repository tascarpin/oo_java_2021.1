package interfaces;

public class Giz implements Caneta {

	@Override
	public String escrever() {
		return "Giz escrevendo.";
	}

	@Override
	public String getCor() {
		return "Giz branco.";
	}
}
