import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int x = 5;
		
		/* estrutura de controle simples.
		 * estrutura if executa o código contindo dentro dela, caso a condição seja verdadeira
		 * essa condição pode ser uma expressão lógica, comparativa ou uma junção de ambas, caso
		 * a condição seja falsa temos que não a execução alguma 
		 */
		if(x < 0) {
			System.out.println(x + " é menor que 0");
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o horário atual: ");
		int hora = sc.nextInt();
		
		/*
		 * estrutura condicional composta
		 * estrutura condicional composta é composta por um if e um else, o if tem uma condição
		 * quando essa condição é verdadeira temos como execução o que está contido dentro do 
		 * if, mas quando a condição no if é falsa temos como execução o que está contido dentro
		 * do else
		 */
		if(hora < 12) {
			System.out.println("Bom dia");
		} else {
			System.out.println("Boa tarde");
		}
		
		/*
		 * para testarmos mais de uma condição podetemos usar encadeamento de estruturas condicionais
		 * onde vamos ter estruturas condicionais dentro de estruturas condicionais
		 * um detalhe importante é que tanto o if quanto o else se tiverem apenas uma linha de código
		 * as chaves são opcionais. 
		 */
		
		if(hora < 12) {
			System.out.println("Bom dia");
		} else if(hora < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}
		
		sc.close();
	}
}
