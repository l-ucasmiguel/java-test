// Importa a classe Scanner do pacote java.util para receber entrada do usuário
import java.util.Scanner;


//Define a classe pública "Main"
public class Main {

	
// 03- Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
// de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

	
    // Define o método principal "main" que é o ponto de entrada do programa
	public static void main(String[] args) {

		
        // Cria um objeto Scanner para ler entrada do usuário a partir do console
		Scanner sc = new Scanner(System.in);
		
		
        // Declara as variáveis inteiras A, B, C, D e dif (diferença)
		int A, B, C, D, dif;
		
		
        // Lê os valores de A, B, C e D a partir do console
	    A = sc.nextInt();
	    B = sc.nextInt();
	    C = sc.nextInt();
	    D = sc.nextInt();

        // Calcula a diferença entre o produto de A e B e o produto de C e D
	    dif = A * B - C * D;
	    
        // Exibe a diferença calculada na saída padrão (console)
	    System.out.println("DIFERENCA = " + dif);	
		
	    // Fecha o objeto Scanner para liberar os recursos
		sc.close();
	}
}