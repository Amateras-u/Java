import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
		/*
		 * o comando nextLine() lê um texto
		 * até que a linha seja quebrada
		 */
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		/*
		 * quebra de linha pendente, ocorre quando temos a leitura de um tipo de dado qualquer
		 * antes de fazermos a leitura da linha, porque damos uma quebra de linha e ela fica 
		 * pendente na entrada padrão do teclado (fica no buffer)
		 * 
		 * para limpar o buffer podemos dar apenas mais um nextLine()
		 */
		
		int x;
		String s4, s5, s6;
		
		x = sc.nextInt();
		sc.nextLine(); // "limpando o buffer"
		s4 = sc.nextLine();
		s5 = sc.nextLine();
		s6 = sc.nextLine();
		
		System.out.println("Outros dados digitados: ");
		System.out.println(x);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
		sc.close();
	}

}
