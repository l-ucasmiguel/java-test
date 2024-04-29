import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("Digite um número de ponto flutuante: ");
		
		// Normalmente o eclipse segue o padrão do país do usuário,
		// no caso do BR a separação de ponto flutuante é feito com ','
		
		Locale.setDefault(Locale.US);	// Usamos este comando para padronizar com US que por padrão usa '.' 
		Scanner sc = new Scanner(System.in);
		
		double x; 
		x = sc.nextDouble();
		System.out.printf("Você digitou: %.2f", x);
		
		sc.close();
	}

}
