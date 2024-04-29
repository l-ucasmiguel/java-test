public class Main {

	public static void main(String[] args) {
		
//		sqrt = raiz quadrada
//		pow	 = potenciação
//		abs  = valor absoluto
		
		
//		Exemplo:		
//		a = Math.sqrt(x);			// Variável 'A' recebe a raiz quadrada de 'X'
//		a = Math.pow(x,y);			// Variável 'A' recebe o resultado de 'X' elevado a 'Y'
//		a = Math.abs(x);			// Variável 'A' recebe o valor absoluto de 'X'
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A,B,C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C + "\n");
		
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C + "\n");
		
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);	
	}

}
