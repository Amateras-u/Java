/*
 * leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto de um plano
 * a seguir determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos na
 * origem (x = y = 0) 
 * 
 * se o ponto estiver na origem escreva uma mensagem "ORIGEM".
 * se o ponto estiver sobre um dos eixos escreva "EIXO X" ou "EIXO Y", conforme for a situação.
 */
import java.util.Locale;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if(x > 0 && y > 0) {
			System.out.println("Q1");
		} else if(x < 0 && y > 0) {
			System.out.println("Q2");
		} else if(x < 0 && y < 0) {
			System.out.println("Q3");
		} else if(x > 0 && y < 0) {
			System.out.println("Q4");
		} else if(x == 0 && y != 0) {
			System.out.println("EIXO Y");
		} else if(x != 0 && y == 0) {
			System.out.println("EIXO X");
		} else {
			System.out.println("ORIGEM");
		}
		
		sc.close();
	}
}