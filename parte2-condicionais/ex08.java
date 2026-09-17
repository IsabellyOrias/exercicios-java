import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println("O número é positivo");
        } else if (number < 0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é igual a zero");
        }
        
        scanner.close();
    }
}
