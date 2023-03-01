
public class Main {

	public static void main(String[] args) {
		/*
		 * se uma variável for apenas declarada e não iniciada teremos um erro de conpilação.
		 * para uma variável ser iniciada ela tem que ter um valor associado.
		 */
		double x = 20.00;
		double price = x;
		
		System.out.println(price);	
		
		/*
		 * caso tenhamos uma variável declarada dentro de uma estrutura de controle teremos um erro de escopo 
		 * ao tentarmos acessar ela fora da estrutura de controle.
		 * 
		 * ou seja quando declaramos uma variável dentro de uma estrutura temos que ela só existe
		 * durante a execução da estrutura, após a estrutura chegar no fim as variáveis são desalocadas
		 * da memória.
		 */
		
		if(price < 200.00) {
			double discount = price * 0.1;
			System.out.println(discount);
		}
	}

}
