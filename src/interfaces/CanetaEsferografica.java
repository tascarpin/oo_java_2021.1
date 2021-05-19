package interfaces;

public class CanetaEsferografica implements Caneta {

	@Override
	public String escrever() {
		return "Caneta esferografica escrevendo.";
	}

	@Override
	public String getCor() {
		return "Caneta esferografica azul.";
	}
}
