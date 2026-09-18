package parte3_repeticaoWhile;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 1;
        int numeroPositivo = 0;
        while (numero != 0) {
            System.out.println("Informe um número (0 para parar)");
            numero = scanner.nextInt();
            if (numero > 0) {
                numeroPositivo++;
            }
        }
        System.out.println("Quantidade de números positivos: " + numeroPositivo);
        scanner.close();
    }
}
