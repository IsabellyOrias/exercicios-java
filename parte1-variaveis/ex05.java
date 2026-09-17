import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.println("Digite a quantidade de unidades:");
        int unidades = scanner.nextInt();

        double valorTotal = preco * unidades;
        System.out.printf("O valor total da compra: R$ %.2f%n", valorTotal);
        scanner.close();
    }

}
