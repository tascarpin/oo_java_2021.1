package agregacao_composicao;

import java.util.ArrayList;

public class Time {
	
	private ArrayList<Jogador> jogador;
	
	public ArrayList<Jogador> getJogador() {
		return jogador;
	}

	public void setJogador(ArrayList<Jogador> jogador) {
		this.jogador = jogador;
	}

	public void imprime1() {
		System.out.println(jogador.toString());				
	}
	
	public void imrpime2() {
		for(int i = 0; i < jogador.size(); ++i) {			
			System.out.println(jogador.get(i).getNome());		
		}
	}
}
