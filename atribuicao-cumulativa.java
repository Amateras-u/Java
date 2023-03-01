/*
 * problema: operadora de telefonia, a partir de 100 minutos consumindo de ligação cobrança do plano de 50 reais
 * acima de 100 minutos, o valor do plano é acrescido em 2 reais por minuto
 */
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50;
		
		/*
		 * operadores de atribuição cumulativa:
		 * 
		 * a += b; = equivale a = a = a + b;
		 * a -= b; = equivale a = a = a - b;
		 * a *= b; = equivale a = a = a * b;
		 * a /= b; = equivale a = a = a / b;
		 * a %= b; = equivale a = a = a % b; 
		 */
		if(minutos > 100) {
			conta += (minutos - 100) * 2;
		}
		
		System.out.printf("VALOR DA CONTA = %.2f\n", conta);
		
		sc.close();
	}

}