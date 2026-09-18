package parte3_repeticaoWhile;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número para a tabuada: ");
        int numTabuada = scanner.nextInt();
        int i = 1; 

        while (i <= 10) {
        System.out.println(numTabuada + " X " + i + " = " + (numTabuada * i) );
        i += 1;
        }
        scanner.close();
    }
}
