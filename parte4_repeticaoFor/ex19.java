package parte4_repeticaoFor;
import  java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número para descobrir o resultado da fatorial: ");
        int numero = scanner.nextInt();
        int fatorial = 1;

        for (int i = numero; i >= 1; i --) {
            fatorial = fatorial * i;
        }
          System.out.println("O fatorial de " + numero + " é = " + fatorial);
          scanner.close();
    }
    
}
