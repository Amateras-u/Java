/*
 * faça um programa que leia um valor qualquer e apresenta uma mensagem dizendo em qual dos seguintes
 * intervalos ([0, 25]), ([25, 50]), ([50, 75]), ([75, 100]) este valor se encontra, caso o valor não
 * esteja em nenhum dos intervalos, imprimir a mensagem "FORA DE INTERVALO"
 */
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		if(valor >= 0 && valor <= 25.00) {
			System.out.println("INTERVALO [0, 25]");
		} else if(valor >= 25 && valor <= 50) {
			System.out.println("INTERVALO [25, 50]");
		} else if(valor >= 50 && valor <= 75) {
			System.out.println("INTERVALO [50, 75]");
		} else if(valor >= 75 && valor <= 100) {
			System.out.println("INTERVALO [75, 100]");
		} else {
			System.out.println("FORA DE INTERVALO");
		}
		
		sc.close();
	}

}