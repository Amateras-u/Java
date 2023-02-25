public class Main {

	public static void main(String[] args) {
		
		int x;
		double y;
		
		// por meio do comando de atribuição, fazemos processamento de dados.
		x = 5;
		y = x * 2;
		
		System.out.println(x);
		System.out.println(y);
		
		// exemplo de processamento calculando a área de um trapézio 
		double b, B, h, area;
		
		/*
		 * é uma boa prática sempre indicar o tipo do número, se a 
		 * expressão for de ponto flutuante (não inteira)
		 * 
		 * para double usa-se:
		 * .0
		 * 
		 * para float usa-se
		 * f
		 */
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
	
		/*
		 * quando fazemos operações com números inteiros o compilador espera
		 * que tenhamos como retorno um número inteiro
		 * 
		 * casting é a conversão explicita de valores de um tipo de dado para
		 * outro
		 * 
		 * nesse caso para dizermos pro compilador que queremos o resultado
		 * como double temos que utilizar (double) antes da expressão
		 */
		
		int numero1, numero2;
		double resultado;
		
		numero1 = 5;
		numero2 = 2;
		
		resultado = (double) numero1 / numero2;
		
		System.out.println(resultado);
		
		/*
		 * converter de um tipo de dado para outro pode ocasionar perca de informação,
		 */
		
		double numero3;
		int numero4;
		
		numero3 = 5.0;
		numero4 = (int) numero3;
		
		System.out.println(numero4);
	}

}