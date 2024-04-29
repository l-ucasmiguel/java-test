import java.util.Scanner;							// Esta linha importa a class 'Scanner' do package 'java.util'
public class Main {									// Declaração da classe chamada 'Main'

	
	public static void main(String[] args) {		// Declaração do método principal 'main', que é o ponto de entrada do programa JAVA
		
		System.out.print("1) Digite uma palavra (texto sem espaços): ");
		
		
		Scanner sc = new Scanner(System.in);		// Desta forma estou associando o objeto scanner ao teclado no modo console criação de 
													// um objeto 'Scanner' chamado de 'sc' para capturar a entrada do usuário do console. O
													// construtor 'Scanner(System.in)' indica que o scanner irá ler a entrada do sistema(console)
		
		
		String x;									// Declaração de uma variável de tipo String chamada x, que será usada para 
													// armazenar a entrada do usuário.
		
		
		x = sc.next();								// A função 'next()' do objeto 'Scanner' é usada para ler a próxima entrada
													// do usuário como uma sequência de caracteres e atribui esse valor à variável 'x'
		System.out.println("Você digitou: " + x);	// Imprime a mensagem "Você digitou: " seguida pelo valor armazenado na variável x.
		sc.close();									// Fecha o objeto Scanner para liberar recursos associados a ele.
		
	}

}
