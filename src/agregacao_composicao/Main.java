package agregacao_composicao;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		//Agregação
		Jogador jogador1 = new Jogador("Tassio");
		Jogador jogador2 = new Jogador("Carneiro");
		Jogador jogador3 = new Jogador("Pinheiro");
		
		ArrayList<Jogador> arrayJogador = new ArrayList<Jogador>();
		
		arrayJogador.add(jogador1);
		arrayJogador.add(jogador2);
		arrayJogador.add(jogador3);

		
		Time time = new Time();
		time.setJogador(arrayJogador);
		time.imprime1();
		time.imrpime2();
		
		//Composição
		//Vou com o exmeplo do exercício
		
		
		
	
	}

}
