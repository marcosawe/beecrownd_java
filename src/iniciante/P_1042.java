package iniciante;

public class P_1042 {
    public static void main(String[] args) {
        // Instanciando o Scanner para leitura de entrada
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Leitura dos valores inteiros e atribuição imediata
        int[] valores = new int[3];
        for (int i = 0; i < 3; i++) {
            valores[i] = sc.nextInt();
        }

        // Ordenando os valores
        java.util.Arrays.sort(valores);

        // Imprimindo os valores ordenados
        for (int i = 0; i < 3; i++) {
            System.out.println(valores[i]);
        }

        // Fechando o Scanner para liberar recursos
        sc.close();
    }
}
