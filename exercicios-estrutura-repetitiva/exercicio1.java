/*
 * ler uma quantidade indeterminada de valores x e y, escrever para cada x e y se os valores foram digitados em ordem crescente ou 
 * decrescente.
 * 
 * a leitura dos dados vai ser encerrada quando dois valores iguais forem digitados 
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while(x != y){
            if(x > y){
                System.out.println("DECRESCENTE");
            } else {
                System.out.println("CRESCENTE");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}