/*
 * escreva um programa que repita a leitura de uma senha até que ela seja válida, para cada leitura de senha incorreta informada 
 * escrever uma mensagem "SENHA INVALIDA". Quando a senha informada for correta imprimir a mensagem "ACESSO PERMITIDO" e o algoritmo
 * é encerrado, considere a senha correta como o valor 2002.
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int senha = 0;

        while(senha != 2002){
            senha = sc.nextInt();

            if(senha == 2002){
                System.out.println("ACESSO PERMITIDO");
            } else {
                System.out.println("SENHA INVALIDA");
            }
        }

        sc.close();
    }
}