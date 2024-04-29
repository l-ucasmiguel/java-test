import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("Hello World, ");			//Primeiro Código 
		System.out.println("welcome");				//println -> quebra de linha
		
		int y = 32;
		double x = 10.35784;						//double = float, porém com precisão dupla, ele tem mais precisão
		
		System.out.println(y);						
		System.out.println(x);
		
		System.out.println("");
		System.out.println("Texto formatado:");
		Locale.setDefault(Locale.US);				// definindo o local para saber se vai ser usado '.' ou ','
		System.out.printf("%.2f%n", x);				// printf é usado para imprimir um texto formatado
													//"%.2f%n" é uma formula para delimitar 2 casas decimais, %n or \n quebra de linha 
		
		System.out.println("RESULTADO = " + x + " metros");
		System.out.printf("RESULTADO = %.2f metros%n", x);		// o valor de 'x' vai entrar no lugar do '%.2f'
		System.out.println("");
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$: %.2f %n \n", nome,idade,renda); 
		// %f = ponto flutuante | %d = inteiro | %s = string | %n = quebra de linha | %c = char
	}

}
