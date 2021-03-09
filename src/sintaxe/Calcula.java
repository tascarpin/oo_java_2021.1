package sintaxe;

import java.util.Scanner;

public class Calcula {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero1, numero2, sum;
		
		System.out.println("Entre com o primerio numero:");
		numero1 = input.nextInt();		
		
		System.out.println("Entre com o segundo numero:");
		numero2 = input.nextInt();
		
		sum = numero1 + numero2;
		
		System.out.printf("A soma é %d%n ", sum);
		
		input.close();
	}
	
}
