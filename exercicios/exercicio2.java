/*
 * fazer um programa para ler a medida da largura e do comprimento de um terreno retangular com uma casa decimal, bem como o valor
 * do metro quadrado do terreno com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do terreno, bem como o
 * valor do preço do terreno, ambos com duas casas decimais.
 */
import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        double largura, comprimento, valorMetroQuadrado, area, precoTerreno;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        largura = sc.nextDouble();
        comprimento = sc.nextDouble();
        valorMetroQuadrado = sc.nextDouble();

        area = largura * comprimento;
        precoTerreno = area * valorMetroQuadrado;

        System.out.printf("AREA = %.2f\n", area);
        System.out.printf("PRECO = %.2f\n", precoTerreno);
        
        sc.close();
    }
}
