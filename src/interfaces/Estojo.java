package interfaces;

import java.util.ArrayList;

public class Estojo {
	private ArrayList<Caneta> estojo;

	public Estojo() {				
		this.estojo = new ArrayList<Caneta>();
	}

	public ArrayList<Caneta> getEstojo() {
		return estojo;
	}

	public void adicionaCaneta(Caneta caneta) {
		this.estojo.add(caneta);		
	}
	
}
