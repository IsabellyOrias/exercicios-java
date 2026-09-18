package parte3_repeticaoWhile;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha = "";

        String senhaCorreta = "senai123";

        while (senha != senhaCorreta) {
            System.out.println("Digite a senha: ");
            senha = scanner.nextLine();

            if (senha.equals(senhaCorreta)) {
                System.out.println("Acesso liberado");
                break;
            } else {
                System.out.println("Acesso negado");
            }
        }
        scanner.close();
    }

}
