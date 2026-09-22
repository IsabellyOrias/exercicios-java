package parte5_array;

public class ex23 {
    public static void main(String[] args) {
        int[] lista = {1, 2, 6, 4, 5};
        int maior = lista[0];

        for (int i = 1; i < lista.length; i++) {
            if (lista[i] > maior) {
                maior = lista[i];
            }
        }
        System.out.println("O maior elemento da lista é: " + maior);
    }
    
}
