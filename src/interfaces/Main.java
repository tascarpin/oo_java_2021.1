package interfaces;

public class Main {

	public static void main(String[] args) {
//		CanetaEsferografica caneta_esferografica = new CanetaEsferografica();
//		Lapis lapis = new Lapis();
//		Giz giz = new Giz();
		
		Caneta caneta_esferografica = new CanetaEsferografica();
		Caneta lapis = new Lapis();
		Caneta giz = new Giz();
		
		System.out.println(caneta_esferografica.getCor());
		System.out.println(lapis.escrever());
		System.out.println(giz.getCor());	
		
		Estojo estojo = new Estojo();
		estojo.adicionaCaneta(caneta_esferografica);
		estojo.adicionaCaneta(lapis);
		estojo.adicionaCaneta(giz);	
					
	}

}
