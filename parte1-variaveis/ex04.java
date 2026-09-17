import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a temperatura em °C:");
        double grausCelsius = scanner.nextDouble();

        double fahrenheit = grausCelsius * 9 / 5 + 32;

        System.out.println("A temperatura em fahrenheit está em " + String.format("%.2f", fahrenheit) + "F");
        scanner.close();
    }

}