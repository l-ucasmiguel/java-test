import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

// 01- 	Faça um programa que calcule o preço de um terreno, sendo que o terreno tem 10.0 metros de largura e 30.0 metros 
//		de comprimento, é um terreno retangular com uma casa decimal, o valor do metro é 200.00 com duas casas decimais.
//		Em seguida o programa deve mostrar o valor da área do terreno e também mostrar o valor do preço total do terreno,
//		com duas casas decimais.
		
// 		área = largua x comprimento = 300 neste caso 
// 		preço = área x preço do metro quadrado = 60000.00
		
		
		// Define o local padrão como os Estados Unidos para formatação correta de números.
		Locale.setDefault(Locale.US);
		
		
		// Cria um objeto Scanner para ler dados da entrada padrão (teclado).
		Scanner sc = new Scanner(System.in);
		
		
		// Lê os valores de largura, comprimento e preço do metro quadrado da entrada.
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		
		// Calcula a área multiplicando largura por comprimento.
		double area = largura * comprimento;
		
		
		// Calcula o preço multiplicando a área pelo preço do metro quadrado.
		double preco = area * metroQuadrado;
		
		
		// Exibe a área e o preço formatados com duas casas decimais na saída padrão.
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		
		// Fecha o Scanner para liberar os recursos.
		sc.close();
	}

}