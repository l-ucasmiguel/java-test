import java.util.Scanner;								

public class Main {									    // Ler um texto até a quebra de linha

	public static void main(String[] args) {			
		
		Scanner sc = new Scanner(System.in);			// Criação de um objeto Scanner para ler a entrada do usuário
		
		int x;
		String s1, s2, s3;			           			

		System.out.println("Digite 3 palavras: ");
		
		
		x  = sc.nextInt();								// 1) Nessas próximas 4 linhas a gente usa o objeto criado Scanner 'sc'
		sc.nextLine();											// SOLUÇÃO
		s1 = sc.nextLine();				      			// 2) e coloca os valores do tipo conforme declarado na variaveis
		s2 = sc.nextLine();								
		s3 = sc.nextLine();								
		
		
		System.out.println("Dados Digitados: ");		// Exibe uma mensagem indicando que os dados estão sendo exibidos
		System.out.println(x);							// Exibe os valores digitados pelo usuário, uma por linha
		System.out.println(s1);							
		System.out.println(s2);
		System.out.println(s3);

		sc.close();										// Fecha o objeto Scanner para liberar recursos
	}

}


// Obs: Quando você usa um comando de leitura diferente do 'nextLine()' e dá alguma quebra de linha, essa quebra de linha fica 'pendente'
// na entrada padrão. Se você então fizer um 'nextLine()', aquela quebra de linha pendente será absorvida pelo 'nextLine()'.
// A solução para este problema é fazer um 'nextLine()' extra antes de fazer o 'nextLine()' de seu interesse, para este 'nextLine()' consumir
// aquela quebra de linha que ficou pendente.