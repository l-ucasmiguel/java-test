import java.util.Scanner;								// Importa a classe Scanner do pacote java.util

public class Main {									    // Declaração da classe principal

	public static void main(String[] args) {			// Método principal (ponto de entrada do programa)
		
		// Ler um texto até a quebra de linha

		Scanner sc = new Scanner(System.in);			// Criação de um objeto Scanner para ler a entrada do usuário

		String s1, s2, s3;			           			// Declaração do tipo String para armazenar as palavras digitadas

		System.out.println("Digite 3 palavras: ");

		s1 = sc.nextLine();				      			// Lê a primeira palavra digitada pelo usuário e armazena em s1
		s2 = sc.nextLine();								// Lê a segunda palavra digitada pelo usuário e armazena em s2
		s3 = sc.nextLine();								// Lê a terceira palavra digitada pelo usuário e armazena em s3
		
		System.out.println("Dados Digitados: \n ");		// Exibe uma mensagem indicando que os dados estão sendo exibidos
		
		System.out.println(s1);							// Exibe as palavras digitadas pelo usuário, uma por linha
		System.out.println(s2);
		System.out.println(s3);

		sc.close();										// Fecha o objeto Scanner para liberar recursos
	}

}