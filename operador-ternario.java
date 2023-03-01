
public class Main {

	public static void main(String[] args) {
		double preco = 34.5;
		
		/*
		 * expressão condicional ternária é uma opção além do if e else quando queremos decidir um valor
		 * com base em alguma condição.
		 * 
		 * estrutura (condicao) ? valorSeForVerdade : valorSeForFalso;
		 */
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
		/*
		 * opção com if e else:
		 * 
		 * if(desconto < 20){
		 * 	desconto = preco * 0.1;
		 * } else {
		 * 	desconto = preco * 0.05;
		 * }
		 */
	}

}
