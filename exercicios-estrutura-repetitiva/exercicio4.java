/*
 * faça um programa para ler coordenadas (x, y) de uma quantidade indeterminada de pontos no plano cartesiano e informar a qual quadrante
 * pertence cada coordenada. 
 *
 * o algoritmo sera encerrado quando pelo menos uma das duas coordenadas for nula. (não deve escrever nada nesse caso)
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while(x != 0 && y != 0){
            if(x > 0 && y > 0){
                System.out.println("primeiro");
            } else if(x < 0 && y > 0) {
                System.out.println("segundo");
            } else if(x < 0 && y < 0){
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}