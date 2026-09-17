import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double number = scanner.nextDouble();

        if (number % 2 == 0) {
            System.out.println("O seu número é par");
        } else {
            System.out.println("O seu número é ímpar");
        }
        scanner.close();
    }
}
