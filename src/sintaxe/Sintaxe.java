package sintaxe;

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
	public String[] vetStr;
	

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
		System.out.printf("O meu nome3 é: %s%n", nome + " " + sobrenome);		
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
}
