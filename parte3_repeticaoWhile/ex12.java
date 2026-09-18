package parte3_repeticaoWhile;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;
        int soma = 0;

        System.out.println("Digite um número (0 para parar):");
        numero = scanner.nextDouble();

        while (numero != 0) {
          soma += numero;
          System.out.println("Digite um número (0 para parar):");
          numero = scanner.nextDouble();
        }

        System.out.println("A soma total é: " + soma);
        scanner.close();
    }
}
