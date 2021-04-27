package main;

import bixos_exercicio.Cachorro;
import bixos_exercicio.Gato;
import bixos_exercicio.Hipopotamo;
import bixos_exercicio.Leao;
import bixos_exercicio.Lobo;

public class Main {

	public static void main(String[] args) {
		
		Leao leao = new Leao(5, 5.5, 5.5);
		Gato gato = new Gato(10, 10.5, 10.5);
		Cachorro cachorro = new Cachorro(15, 15.5, 15.5);
		Lobo lobo = new Lobo(20, 20.5, 20.5);
		Hipopotamo hipopotamo = new Hipopotamo(25, 25.5, 25.5);
		
		System.out.println(leao.fazerBarulho());
		System.out.println(leao.comer());
		System.out.println(leao.vaguear());
		System.out.println(leao.dormir());
		System.out.println(leao.toString());
		
		System.out.println("--");
		
		System.out.println(gato.fazerBarulho());
		System.out.println(gato.comer());
		System.out.println(gato.vaguear());
		System.out.println(gato.dormir());
		System.out.println(gato.toString());
		
		System.out.println("--");
		
		System.out.println(cachorro.fazerBarulho());
		System.out.println(cachorro.comer());
		System.out.println(cachorro.vaguear());
		System.out.println(cachorro.dormir());
		System.out.println(cachorro.toString());
		
		System.out.println("--");
		
		System.out.println(lobo.fazerBarulho());
		System.out.println(lobo.comer());
		System.out.println(lobo.vaguear());
		System.out.println(lobo.dormir());
		System.out.println(lobo.toString());
		
		System.out.println("--");
		
		System.out.println(hipopotamo.fazerBarulho());
		System.out.println(hipopotamo.comer());
		System.out.println(hipopotamo.vaguear());
		System.out.println(hipopotamo.dormir());
		System.out.println(hipopotamo.toString());
		
		
	}

}
