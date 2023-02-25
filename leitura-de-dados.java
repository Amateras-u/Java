// importando o Scanner 
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// Criando um objeto do tipo Scanner
		Scanner sc = new Scanner(System.in);
		String x;
	
		/*
		 * para fazermos a leitura de uma única palavra
		 * utilizamos a função next() e armazenamos o
		 * resultado na variável x 
		 */
		
		x = sc.next();
		
		System.out.println("Você digitou: " + x);
	
		int y;
		
		/*
		 * para fazermos a leitura de um número inteiro
		 * utilizamos a função nextInt() e armazenamos o
		 * resultado na variável y
		 */
		
		y = sc.nextInt();
		
		System.out.println("Você digitou o número: " + y);
		
		double z;
		
		/*
		 * para fazermos a leitura de um número ponto flutuante
		 * utilizamos a função nextDouble() e armazenamos o
		 * resultado na variável z
		 * 
		 * a função nextDouble() pega a localização, então temos
		 * que setar a localização americana para não termos erros
		 * na hora de digitar 1.86 por exemplo, isso tem que ser 
		 * feito antes da declaração do nosso objeto Scanner 
		 */
		
		// Locale.setDefault(Locale.US); isso tem que ir antes da declaração do Scanner.
		
		z = sc.nextDouble();
		
		System.out.println("Você digitou o número de ponto flutuante: " + z);
		
		char a;
		
		/*
		 * para lermos um caractere utilizamos da seguinte forma:
		 * next().charAt(0) e logo em seguida armazenamos na variável a
		 * 
		 * a função charAt(0) pega o primeiro caractere de uma String
		 */
		
		a = sc.next().charAt(0);
		
		System.out.println("Você digitou o caractere: " + a);
		
		String dado_string;
		int dado_int;
		double dado_double;
		
		/*
		 * para lermos vários dados na mesma linha basta chamarmos
		 * os comandos correspondentes
		 */
		
		dado_string = sc.next();
		dado_int = sc.nextInt();
		dado_double = sc.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println(dado_string);
		System.out.println(dado_int);
		System.out.println(dado_double);	
		// utilizamos a função close para desalocar a memória alocada para o objeto sc
		sc.close();		
	}
}
