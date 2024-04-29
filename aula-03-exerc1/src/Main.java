import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("2) Digite um número inteiro: ");
		Scanner sc = new Scanner(System.in);
		
		int y;
		y = sc.nextInt();
		
		System.out.println("Você digitou: " + y);
		sc.close();

	}

}
