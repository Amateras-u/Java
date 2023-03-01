/*
 * quando se tem várias opções de fluxo a serem tratadas com base no valor de uma variável, ao invés de várias
 * estruturas if-else encadeadas, alguns preferem utilizar a estrutura switch-case.
 * 
 * problema: fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana, escreva
 * na tela o dia da semana correspondente ao número digitado.
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch(x) {
		case 1:
			dia = "DOMINGO";
			break;
		case 2:
			dia = "SEGUNDA";
			break;
		case 3:
			dia = "TERÇA";
			break;
		case 4:
			dia = "QUARTA";
			break;
		case 5:
			dia = "QUINTA";
			break;
		case 6:
			dia = "SEXTA";
			break;
		case 7:
			dia = "SABADO";
			break;
		default:
			dia = "VALOR INVALIDO";
			break;
		}
		
		System.out.println("DIA DA SEMANA: " + dia);
		
		sc.close();
	}

}
