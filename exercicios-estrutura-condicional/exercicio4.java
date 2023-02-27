/*
 * fazer um programa para ler um número inteiro, e depois dizer se este número é positivo ou negativo
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if(numero >= 0) {
			System.out.println("NÂO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}

}