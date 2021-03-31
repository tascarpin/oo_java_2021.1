package sintaxe;

import java.util.Scanner;

//Comentarios em linha

/*Comentários em bloco
 * 
 */
public class Sintaxe {

	public int int1 = 1, int2 = 2, int3 = 3;
	public float float1 = 1.1f , float2 = 2.2f, float3 = 3.3f;
	public double double1 = 1.1, double2 = 2.2, double3 = 3.3;
	public boolean boolean1;
	public String nome = "Tassio", sobrenome = "Pinheiro", str1;
	public char[] vetChar;
	//Outra forma de declarar um vetor
	public String vetStr[];
	

	public void calculaInt() {
		
		System.out.println(int1+int2+int3);
		
	}
	
	public void calculaFloat() {
		int x = 20;
		System.out.println(float1+float2+float3);
		System.out.printf("O valor é %.2f e o outro é %d", float1+float2+float3, x);
		System.out.println();
		
	}
	
	public void calculaDouble() {
		
		System.out.println(double1+double2+double3);
		
	}
	
	public void calculaComCast() {
		
		System.out.printf("O valor é: %.1f", double1 + (double)int1);
		
	}
	
	public void concatenaString() {
		
		System.out.println("O meu nome1 é: " + nome + " " + sobrenome);		
		System.out.printf("O meu nome2 é: %s%n", nome + " " + sobrenome);		
		str1 = nome.concat(sobrenome);
		System.out.printf("O meu nome3 é: %s%n", str1);				
	}

	public void vetorChar() {
		vetChar = new char[6];
		
		vetChar[0] = 'T';
		vetChar[1] = 'a';
		vetChar[2] = 's';
		vetChar[3] = 's';
		vetChar[4] = 'i';
		vetChar[5] = 'o';
		
		System.out.println("Meu nome é: " + vetChar[0] + vetChar[1] + vetChar[2] + vetChar[3] + vetChar[4] + vetChar[5] + "\n");
		System.out.printf("%c%c%c%c%c%c\n", vetChar[0], vetChar[1], vetChar[2],  vetChar[3], vetChar[4], vetChar[5]);
		
		
	}
	
	public void fluxoFor() {
		
		for(int i = 0; i < 6; ++i) {			
			System.out.println(vetChar[i]);		
		}
		
	}
	
	public void concatChar() {
		str1 = "";
		for(int i = 0; i < 6; ++i) {
			str1 = str1.concat(Character.toString(vetChar[i]));
		}
		System.out.printf("Meu nome concatChar é: %s%n", str1);
		
	}
	
	public void contcatCharComOperador() {
		String auxStr1 = "";
		String auxStr2 = "";
		for(int i = 0; i < 6; ++i) {
			auxStr1 = auxStr1 + Character.toString(vetChar[i]); 
			auxStr2 += Character.toString(vetChar[i]); 
		}
		System.out.println("Meu nome concatCharComOperador1 é:" + auxStr1);
		System.out.println("Meu nome concatCharComOperador2 é:" + auxStr2);
		System.out.println("Meu nome valueOf é:" + String.copyValueOf(vetChar));
	}	
	
	public void codicionalIF2() {
	
		if(int1 > int2)//True
			System.out.println("O valor do inteiro 1 é maior que o valor do inteiro 2.\n");
		else // False
			System.out.println("O valor do inteiro 1 é menor que o valor do inteiro 2.\n");

	}
	
	public void codicionalIF3() {
		
		if (!(int1 <= int2))
			System.out.println("O valor do inteiro 1 é maior que o valor do inteiro 2.\n");
		else // False
			System.out.println("O valor do inteiro 1 é menor que o valor do inteiro 2.\n");

	}
	
	public void codicionalIF4() {
		
		String result = int1 < int3? "True" : "False";
		System.out.println(result);
	}
	
	public void operadorLogico() {
		int idade = 15;		
		boolean amigoDoDono = true;
		
		if (idade < 18 && amigoDoDono == false) {
			System.out.println("Não pode entrar");
		}
		else {
			System.out.println("Pode entrar");
		}
	}
	
	public void operadorLogico2() {
		int idade = 15;		
		boolean amigoDoDono = true;
		
		if (idade < 18 || amigoDoDono == false) {
			System.out.println("Não pode entrar");
		}
		else {
			System.out.println("Pode entrar");
		}
	}
	
	public void incrementosPrePos() {
		int i = 0;
		int x = i++;
		System.out.println(x);
		int y = ++i;
		System.out.println(y);		
		
	}
	
	public void loopWhile() {
		int i = 0;

		while (i < 5) {
		  System.out.println(i);
		  i++;
		}
	}
	
	public void loopDoWhile(int x, int y) {		
		do {
		  System.out.println(x);
		  x++;
		}
		while (x < y);
	}
	
	public void switchCase(String str) {
		String day = str ;
				
		switch (day) {
		  case "Monday":
		    System.out.println("Monday");
		    break;
		  case "Tuesday":
		    System.out.println("Tuesday");
		    break;
		  case "Wednesday":
		    System.out.println("Wednesday");
		    break;
		  case "Thursday":
		    System.out.println("Thursday");
		    break;
		  case "Friday":
		    System.out.println("Friday");
		    break;
		  case "Saturday":
		    System.out.println("Saturday");
		    break;
		  case "Sunday":
		    System.out.println("Sunday");
		    break;
		  default:
	    	System.out.println("Nenhuma das opções");
	    	break;
		}
	}	
	
	public void vetorComForIf() {
		Scanner ler = new Scanner(System.in);

		int n = 10; // tamanho do vetor
		int v[] = new int[n]; // declaração do vetor "v"
		int i; // índice ou posição

		// Entrada de Dados
		for (i = 0; i < n; i++) {
			System.out.printf("Informe %2do. valor de %d: ", (i + 1), n);
			v[i] = ler.nextInt();
			ler.close();
		}

		// Processamento: somar todos os valores, definir o maior e o menor valor
		int soma = 0;
		int menor = v[0]; // v[0] = 1o. valor armazenador no vetor "v"
		int maior = v[0];
		for (i = 0; i < n; i++) {
			soma = soma + v[i];

			if (v[i] < menor)
				menor = v[i];

			if (v[i] > maior)
				maior = v[i];
		}

		// Saída (resultados)
		System.out.printf("\n");
		for (i = 0; i < n; i++) {
			if (v[i] == menor)
				System.out.printf("v[%d] = %2d <--- menor valor\n", i, v[i]);
			else if (v[i] == maior)
				System.out.printf("v[%d] = %2d <--- maior valor\n", i, v[i]);
			else
				System.out.printf("v[%d] = %2d\n", i, v[i]);
		}

		System.out.printf("\nSoma = %d\n", soma);
		
	}
}
