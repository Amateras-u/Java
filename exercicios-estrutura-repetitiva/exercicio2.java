/*
 * faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um individuo. o ultimo dado recebera uma 
 * idade negativa então não será contabilizado. calcular e imprimir a idade média de um grupo de indivíduos. se for entrado um valor
 * negativo na primeira vez será exibido a mensagem que é impossivel calcular.
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int somaIdades = 0;
        int quantidadeDeIndividuos = 0;
        
        while(idade >= 0){
        	somaIdades += idade;
            quantidadeDeIndividuos += 1;
            idade = sc.nextInt();
        }
            
        if(quantidadeDeIndividuos > 0) {
        	double media = (double) somaIdades / quantidadeDeIndividuos;
        	System.out.printf("%.2f", media);
        } else {
          	System.out.println("IMPOSSIVEL CALCULAR");
        }

        sc.close();
    }
}