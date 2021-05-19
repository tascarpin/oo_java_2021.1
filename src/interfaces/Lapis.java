package interfaces;

public class Lapis implements Caneta {

	@Override
	public String escrever() {
		return "Lapis escrevendo.";
	}

	@Override
	public String getCor() {
		return "Lapis marrom.";
	}
}
