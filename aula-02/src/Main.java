
public class Main {

	public static void main(String[] args) {
		int x,y,z;
		System.out.println("Exemplo 01:");
		x = 5;
		y = 2;
		z = x*y;
		System.out.printf("%d x %d é = %d \n \n",x,y,z);
		
		
		System.out.println("Exemplo 02:");
		int d;
		double e,f;
		d = 5;
		e = 2;
		f = d*e;
		System.out.printf("%d x %.2f é = %.2f\n\n",d,e,f);
		
		
		System.out.println("Exemplo 03:");
		double b,B,h,area;							// Se aqui fosse do tipo FLOAT seria uma boa prática declarar as linhas debaixo desta forma:
		b = 6.0;									// b = 6f;
		B = 8.0;									// B = 8f;
		h = 5.0;									// h = 5f;
		area = (b+B) / 2.0 *h;						// area = (b+B) / 2f *h
		System.out.printf("%.2f \n\n",area);
		
		
		System.out.println("Exemplo 04:");
		int k,l;
		double resultado;
		k = 5;										// Uma expressão como essa abaixo normalmente voltaria um número inteiro, pq o 'K e L' são
		l = 2;										// Inteiros, para 'avisar' a IDE que quero o resultado em double ou float é só colocar
		resultado = (double) k/l;					// antes (double) ou (float), isto é chamado de CASTING
		System.out.printf("%.2f \n\n",resultado);
		
		
		System.out.printf("Exemplo 05:\n");
		double m;
		int n;
		m = 5.0;									// Neste caso 'm' é double, para converter para int precisamos usar
		n = (int) m;								// Casting  (int), caso contrário vai dar erro de tipo
		System.out.println(n);
	}

}