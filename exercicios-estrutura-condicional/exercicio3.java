/*
 * fazer um programa para ler três números inteiros. em seguida, mostrar qual o menor dentre os três lidos
 * em caso de empate mostrar apenas uma vez.
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();
		
		if(numero1 <= numero2 && numero1 <= numero3 ) {
			System.out.println("MENOR = " + numero1);
		} else if(numero2 <= numero3) {
			System.out.println("MENOR = " + numero2);
		} else {
			System.out.println("MENOR = " + numero3);
		}
		
		sc.close();
	}

}
