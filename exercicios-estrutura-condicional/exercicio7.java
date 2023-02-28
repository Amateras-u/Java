x/*
 * leia a hora inicial e a hora final de um jogo, a seguir calcule a duração do jogo, sabendo que o mesmo 
 * pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duracaoJogo;
		
		if(horaInicial < horaFinal) {
			duracaoJogo = horaFinal - horaInicial; 
		} else {
			duracaoJogo = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S)");
		
		sc.close();
	}

}