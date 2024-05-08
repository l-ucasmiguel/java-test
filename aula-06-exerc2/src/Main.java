import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
// 02- Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
// casas decimais conforme exemplos.
		
		
        // Define o local padrão como os Estados Unidos para formatação correta de números.
		Locale.setDefault(Locale.US);
		
		
        // Cria um objeto Scanner para ler dados da entrada padrão (teclado).
		Scanner sc = new Scanner(System.in);
		
		
        // Declaração das variáveis R (raio), A (área) e pi (valor de pi).
		double R, A, pi = 3.14159;
	    
		
        // Lê o valor do raio da entrada.
	    R = sc.nextDouble();

	    
        // Calcula a área do círculo usando a fórmula A = pi * R * R.
	    A = pi * R * R;

        // Exibe a área formatada com quatro casas decimais na saída padrão.
	    System.out.printf("A=%.4f%n", A);

        // Fecha o Scanner para liberar os recursos.
		sc.close();
	}
}