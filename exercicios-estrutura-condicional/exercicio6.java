/*
 * ler 2 valores inteiros (A e B) após, o programa deve mostrar uma mensagem "SAO MULTIPLOS" ou "NAO SAO 
 * MULTIPLOS", indicando se os valores lidos são múltiplos entre si, atenção: os numeros devem poder ser
 * digitamos em ordem crescente ou decrescente.
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		
		if(numero1 % numero2 == 0 || numero2 % numero1 == 0) {
			System.out.println("SAO MULTIPLOS");
		} else {
			System.out.println("NAO SAO MULTIPLOS");
		}
		
		sc.close();
	}

}