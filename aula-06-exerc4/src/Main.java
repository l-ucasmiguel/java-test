// Importa a classe Locale para definir a formatação local
import java.util.Locale;

//Importa a classe Scanner para receber entrada do usuário
import java.util.Scanner;


//Define a classe pública "Main"
public class Main {

	// Define o método principal "main" que é o ponto de entrada do programa
	public static void main(String[] args) {

		
// 04 - Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
		
		
        // Define o local padrão como "Locale.US" para usar a formatação dos EUA (ponto como separador decimal)
		Locale.setDefault(Locale.US);
		
		
        // Cria um objeto Scanner para ler entrada do usuário a partir do console
		Scanner sc = new Scanner(System.in);

		
        // Declara as variáveis inteiras "numero" e "horas", e as variáveis de ponto flutuante "valorHora" e "salario"
		int numero, horas;
	    double valorHora, salario;

	    
        // Lê o número do funcionário, as horas trabalhadas e o valor da hora do usuário
	    numero = sc.nextInt();
	    horas = sc.nextInt();
	    valorHora = sc.nextDouble();

	    
        // Calcula o salário multiplicando as horas trabalhadas pelo valor da hora
	    salario = valorHora * horas;

        // Exibe o número do funcionário e o salário formatado na saída padrão (console)
	    System.out.println("NUMBER = " + numero);
	    System.out.printf("SALARY = U$ %.2f%n", salario);
		
	    
        // Fecha o objeto Scanner para liberar os recursos
		sc.close();
	}
}