package parte5_array;

public class ex22 {
    public static void main(String[] args) {
        int[] lista = {1, 2, 6, 4, 5};
        int soma = 0;

        for (int i = 0; i < lista.length; i++) {
            soma += lista[i];
        }
        System.out.println("A soma dos elementos do array é: " + soma);
    }
    
}
