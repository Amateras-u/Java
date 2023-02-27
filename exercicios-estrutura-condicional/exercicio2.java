/*
 * leia 3 valores de ponto flutuante e efetue o cálculo da raízes da equação de bhaskara. se não for possivel calcular as raízes
 * mostre a mensagem correspondente "IMPOSSIVEL CALCULAR", caso haja uma divisão por 0 ou raiz de número negativo. 
 */
import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if(a != 0 && delta >= 0){
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        } else {
            System.out.println("IMPOSSIVEL CALCULAR");
        }

        sc.close();
    }
}