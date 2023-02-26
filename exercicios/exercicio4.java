/*
 * faça um programa para ler o valor de um circulo, e depois mostrar o valor da área deste circulo com quatro
 * casas decimais.
 */
import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();

        double area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("AREA = %.4f\n", area);
        
        sc.close();
    }
}