/*
 * problema: faça um programa que leia números até que o usuário digite um zero, por fim mostre a soma de 
 * todos os números digitados pelo usuário.
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// leitura do primeiro valor para testar na estrutura 
		int x = sc.nextInt();
		
		/*
		 * while é uma estrutura de repetição que vai repetir o código dentro do while até que a 
		 * condição passada como parametro seja falsa.
         * 
		 * recomendada quando não sabemos previamente a quantidade
		 * de repetições que podem ocorrer
		 */
		int soma = x;
		while(x != 0) {
			x = sc.nextInt();
			soma += x;
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}