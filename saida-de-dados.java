// importação da classe Locale
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// comando System.out.print()
		// imprime uma mensagem sem quebra de linha ao final 
		System.out.print("olá mundo!");
		// comando System.out.println() 
		// imprime uma mensagem com uma quebra de linha ao final
		System.out.println("bom dia!");
		
		// declarando uma variável int
		int y = 32;
		
		// imprimindo o conteúdo da variável 
		System.out.println(y);
		
		// declarando uma variável double
		double x = 10.35784;
		
		// imprimindo o conteúdo da variável
		System.out.println(x);
		

		// podemos controlar a quantidade de casas decimais que seram exibidas.
		// da seguinte forma: System.out.printf("%.2f%n", x); 
		// %.2f indica que queremos duas casas decimais  
		// %n indica que queremos uma quebra de linha | \n também funcionaria 
		// por último colocamos virgula e passamos a variável 
        
		// Locale é uma classe que vem no jdk para configurarmos a localização do nosso app
		// para utilizarmos essa classe temos que importala
		// por padrão o comando printf assume como separar para casas decimais o do idioma
		// presente no computador, para mudar isso para o padrão americano usamos:

		Locale.setDefault(Locale.US); 
		
		System.out.printf("%.2f%n", x);
		// imprimindo agora com 4 casas decimais
		System.out.printf("%.4f\n", x);

		// para concatenar vários elementos em um mesmo comando de escrita (regra geral para print e println)
		// usamos da seguinte forma: elemento1 + elemento2 + elemento2 + ... + elementoN
		// exemplo abaixo:
		System.out.println("Resultado em " + x + " METROS");

		// para concatenar vários elementos em um mesmo comando de escrita usando printf
		// usamos da seguinte forma: "TEXTO1 %f TEXTO2 %f TEXTO3", variavel1, variavel2
		// onde temos os marcadores com %f %algumacoisa entra as variáveis 
		// relembrando: %f -> ponto flutuante, %n ou \n -> quebra de linha
		System.out.printf("Resultado = %.2f metros%n", x);

		// concatenando vários elementos em um mesmo comando de escrita:
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
	}
 
}
