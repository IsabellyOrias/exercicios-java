import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número");
        double num1 = scanner.nextDouble();

        System.out.println("Informe outro número");
        double num2 = scanner.nextDouble();


        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " é maior que " + num1);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
