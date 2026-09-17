import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double n1 = scanner.nextDouble();

        System.out.println("Digite outro número: ");
        double n2 = scanner.nextDouble();

        double soma = n1 + n2;

        System.out.println("O resultado é: " + soma);
        scanner.close();
    }

}
