/*
 * faça um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
 * hora e calcule o salário desse funcionário. A seguir mostre o número e o salário do funcionário, com duas 
 * casas decimais.
 */
import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.printf("NUMERO = %d\n", numero);
        System.out.printf("SALARIO = R$%.2f\n", salario);
        
        sc.close();
    }
}