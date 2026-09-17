import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o raio do círculo: ");
        double raio = scanner.nextDouble();

        double areaCirculo = 3.14159 * (raio * raio);

        System.out.println("A área do círculo é: " + areaCirculo);
        scanner.close();

    }
}
