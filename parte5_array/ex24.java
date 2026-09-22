package parte5_array;

public class ex24 {
    public static void main(String[] args) {
        int[] lista = {5,12,8,20,3,15};
        int maiorQue10 = 0;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > 10) {
                maiorQue10++;
            }
        }
        System.out.println("O número de elementos maiores que 10 é: " + maiorQue10);
    }
}
