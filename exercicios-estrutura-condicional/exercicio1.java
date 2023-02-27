/*
 * fazer um programa para ler duas notas de um aluno, em seguida, mostrar a nota final que o aluno obteve no ano juntamente com um texto
 * explicativo. Caso a nota do aluno seja inferior a 60.00, mostrar a mensagem "REPROVADO"
 */
import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double notaFinal = nota1 + nota2;
        
        System.out.println("NOTA FINAL = " + notaFinal);

        if(notaFinal < 60.00){
        	System.out.println("REPROVADO");
        }
        
        sc.close();
    }
}