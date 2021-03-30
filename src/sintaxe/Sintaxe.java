package sintaxe;

import java.util.Scanner;

//Comentarios em linha

/*Comentários em bloco
 * 
 */
public class Sintaxe {

	public int int1 = 1, int2 = 2, int3 = 3;
	public float float1 = 1.1f, float2 = 2.2f, float3 = 3.3f;
	public double double1 = 1.1, double2 = 2.2, double3 = 3.3;
	public boolean boolean1;
	public String nome = "Tassio", sobrenome = "Pinheiro", str;
	public char[] vetChar;
	// Outra forma de declarar um vetor
	public String vetStr[];
 
	//Construtor da classe
	public Sintaxe() {
		vetChar = new char[6];
		vetChar[0] = 'T';
		vetChar[1] = 'a';
		vetChar[2] = 's';
		vetChar[3] = 's';
		vetChar[4] = 'i';
		vetChar[5] = 'o';
	}	

	public void calculaInt() {

		System.out.println(int1 + int2 + int3);

	}

	public void calculaFloat() {
		int x = 20;
		System.out.println(float1 + float2 + float3);
		System.out.printf("O valor é %.2f e o outro é %d", float1 + float2 + float3, x);
		System.out.println();

	}

	public void calculaDouble() {

		System.out.println(double1 + double2 + double3);

	}

	public void calculaComCast() {

		System.out.printf("O valor é: %.1f", double1 + (double) int1);

	}

	public void concatenaString() {

		System.out.println("O meu nome1 é: " + nome + " " + sobrenome);
		System.out.printf("O meu nome2 é: %s%n", nome + " " + sobrenome);
		str = nome.concat(sobrenome);
		System.out.printf("O meu nome3 é: %s%n", str);
	}

	public void vetorChar() {	
		
		System.out.println(
				"Meu nome é: " + vetChar[0] + vetChar[1] + vetChar[2] + vetChar[3] + vetChar[4] + vetChar[5] + "\n");
		System.out.printf("%c%c%c%c%c%c\n", vetChar[0], vetChar[1], vetChar[2], vetChar[3], vetChar[4], vetChar[5]);

	}
	
	public void fluxoFor1() {
		 
		for (int i = 0; i < 10; i = i+1) {
			System.out.println("Olá");
		}
		
	}
	
	public void fluxoFor2() {
		int i = 0;
		
		for (i = 5; i < 10; i = i+1) {
			System.out.println("Mundo");
		}		
		
	}
	
	public void fluxoFor3() {
		int i = 0;
		for (; i < 10; ++i) {
			System.out.println("Louco");
		}
		
	}
	
	public void fluxoFor4() {
		int i = 0;
		for (; i < 10;) {
			++i;
			System.out.println("Incremento");
		}
		
	}
	
	public void fluxoFor5() {
		int i = 10;
		for (; i > 0;) {
			--i;
			System.out.println("Decremento5");
		}
		
	}
	
	public void fluxoFor6() {
		int i = 10;
		for (; i > 0; i = i-1) {
			System.out.println("Decremento6");
		}
		
	}	
	
	public void fluxoForVet() {
		for (int i = 0; i < 6; ++i) {
			System.out.println(vetChar[i]);
		}
	}
	
	public void fluxoForVet2() {
		for (int i = 0; i < vetChar.length ; ++i) {
			System.out.println(vetChar[i]);
		}
	}
	
	public void fluxoForVet3() {
		for (char aux : vetChar) {
			System.out.println(aux);
		}
	}

	// Concatenação dos chars queestão dentro do meu vetor de char.
	// Entrada: vetChar = ['T', 'A', 'S', 'S', 'I', 'O'], tamanho do meu vetor é 5.
	// Saída: String STR = "Tassio"	
	public void concatCharComFor1() {	
		str = "";	
		for (int i = 0; i < 6; ++i ) {
			str = str + vetChar[i];		
			str += vetChar[i];		
		}	
		System.out.println("meu nome é " + str);			
	}
	
	public void concatCharComFor2() {
		str = "";
		for (int i = 0; i < vetChar.length; ++i) {	
			//T + A + S + S + I + O = TASSIO
			str = str.concat(Character.toString(vetChar[i])); //TASSIO	
		}
		System.out.printf("Meu nome concatChar é: %s%n", str);

	}

	public void concatCharComFor3() {
		str = "";
		for (char aux : vetChar) {	
			//T + A + S + S + I + O = TASSIO
			str = str.concat(Character.toString(aux)); //TASSIO	
		}
		System.out.printf("Meu nome concatChar é: %s%n", str);

	}
	
	public void valueOf() {
		str = String.valueOf(vetChar);
		
		System.out.println("Aqui é com o uso da função statioca valueOf da classe String:" + str);
		System.out.printf("Aqui é com o uso da função statioca valueOf da classe String: %s%n", str);
	}
	
	public void contcatCharComOperador() {
		String auxStr1 = "";
		String auxStr2 = "";
		for (int i = 0; i < 6; ++i) {
			auxStr1 = auxStr1 + Character.toString(vetChar[i]);				
			auxStr2 += Character.toString(vetChar[i]);
		}
		
		System.out.println("Meu nome concatCharComOperador1 é:" + auxStr1);
		System.out.println("Meu nome concatCharComOperador2 é:" + auxStr2);
		System.out.println("Meu nome valueOf é:" + String.copyValueOf(vetChar));
	}

	public void codicionalIF1() {
		
		if(int1 < int2)//True
			System.out.println("O valor do inteiro 1 é menor que o valor do inteiro 2.\n");
		else // False
			System.out.println("O valor do inteiro 1 é maior que o valor do inteiro 2.\n");

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

//---------------------------------------------------	
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
	
	public void loopDoWhile() {		
		int i = 4;
		
		do {
		  System.out.println(i);
		  i++;
		}
		while (i < 5);
	}
	
//---------------------------------------------------
	
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
