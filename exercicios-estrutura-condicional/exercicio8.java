/*
 * com base na tabela escrever um programa que leia o código de um item e a quantidade desse item
 * e calcule e mostre o valor da conta
 * codigo | produto         | preço
 * 1      | cachorro quente | 4.00
 * 2      | x-salada        | 4.50
 * 3      | x-bacon         | 5.00
 * 4      | torrada simples | 2.00
 * 5      | refrigerante    | 1.50
 */
import java.util.Locale;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double valorConta;
		
		if(codigo == 1) {
			valorConta = quantidade * 4.00;
		} else if(codigo == 2) {
			valorConta = quantidade * 4.50;
		} else if(codigo == 3) {
			valorConta = quantidade * 5.00;
		} else if(codigo == 4) {
			valorConta = quantidade * 2.00;
		} else {
			valorConta = quantidade * 1.50;
		}
		
		System.out.printf("TOTAL: R$%.2f\n", valorConta);
		
		sc.close();
	}
}