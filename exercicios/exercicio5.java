/*
 * fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcular e mostrar a diferença do produto
 * de A e B pelo produto de C e D.
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int diferenca = A * B - C * D;

        System.out.printf("DIFERENCA = %d\n", diferenca);
        
        sc.close();
    }
}